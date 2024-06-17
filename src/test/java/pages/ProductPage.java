package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductPage extends BrowserDriver {
    public static String add_basket_button_xpath = "//button[normalize-space()='Sepete Ekle']";
    public static String basket_button = "/html/body/header/div[2]/div/div[3]/div/div/a";
    public static String product_name = "//*[@id=\"productDetail\"]/div/div[3]/h1";
    public static String nameMonitor;
    public static void click_addBasket() throws InterruptedException {
        nameMonitor=driver.findElement(By.xpath(product_name)).getText();
        Thread.sleep(1000);
        driver.findElement(By.xpath(add_basket_button_xpath)).click();
    }
    public static void click_basket() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(basket_button)).click();
    }
}
