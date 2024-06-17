package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BrowserDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchFindPage extends BrowserDriver{
    public static String minPrice = "//input[@id='minFiyatManuel']";
    public static String maxPrice = "//input[@id='maxFiyatManuel']";
    public static String priceFilterButton = "//div[@id='btn_filtrele_tutar_0']//input[@value='Filtrele']";
    public static String first_product_xpath = "//*[@id=\"productList\"]/div[1]/div[1]/a";
    public static String pricesOfProduct_path = "//*[@id=\"productList\"]/div/div[4]/div[2]";
    public static String firstPrice = "//*[@id=\"productList\"]/div/div[4]/div[2]/strong[1]";
    public static String secondPrice = "//*[@id=\"productList\"]/div/div[4]/div[2]/strong[2]";
    public static String stock_path = "//input[@id='stokCheck']";
    public static String page_number = "/html/body/section[2]/div/div[2]/div[1]/div[2]/span/strong";
    public static String next_page = "/html/body/section[2]/div/div[2]/div[3]/div/div/button[2]";
    public static String numberOfProduct_path = "/html/body/section[2]/div/div[2]/div[1]/div[1]/span";
    public static void filterPrice() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(minPrice)).click();
        driver.findElement(By.xpath(minPrice)).sendKeys("10000");
        driver.findElement(By.xpath(maxPrice)).click();
        driver.findElement(By.xpath(maxPrice)).sendKeys("20000");
    }
    public static void click_price_filter() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(priceFilterButton)).click();
    }
    public static void click_first_product() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(first_product_xpath)).click();
    }
    public static void click_stocks() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(stock_path)).click();
    }
    public static boolean checkPrices() throws InterruptedException {
        Thread.sleep(700);
        String[] productNumber = driver.findElement(By.xpath(numberOfProduct_path)).getText().split(" ");
        int numberProduct = Integer.parseInt(productNumber[0]);
        Thread.sleep(500);
        String[] pageNumber = driver.findElement(By.xpath(page_number)).getText().split("/");
        int page = Integer.parseInt(pageNumber[1]);
        int[] prices = new int[numberProduct];
        Thread.sleep(200);
        int k=0;
        for (int a = 0; a < page; a++) {
            int i=1;
            List<WebElement> elements = driver.findElements(By.xpath(pricesOfProduct_path));
            Actions actions = new Actions(driver);
            for (WebElement element : elements) {
                actions.moveToElement(element).perform();
                Thread.sleep(500);
                String[] text1 = element.findElement(By.xpath("//*[@id=\"productList\"]/div"+"["+i+"]"+"/div[4]/div[2]/strong")).getText().split(",");
                String text = text1[0].replaceAll("\\.","");
                int price = Integer.parseInt(text);
                if (price<=20000&&price>=10000){
                    prices[k]=price;
                    i++;
                    k++;
                }else{
                    String[] text2= element.findElement(By.xpath("//*[@id=\"productList\"]/div"+"["+i+"]"+"/div[4]/div[2]/strong[2]")).getText().split(",");
                    text2[0] = text2[0].substring(8,14);
                    int price2 = Integer.parseInt(text2[0].replaceAll("\\.",""));
                    prices[k]=price2;
                    i++;
                    k++;
                }
            }
            Thread.sleep(500);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,150)", "");
            driver.findElement(By.xpath(next_page)).click();
            if (a==page-1){
                break;
            }
        }

        boolean check = false;
        for (int price : prices) {
            if (price<=20000 && price>=10000){
                check=true;
            }
        }
        return check;
    }
    public static void checkingPrices() throws InterruptedException {
        Thread.sleep(1500);
        assertTrue(checkPrices());
    }
}
