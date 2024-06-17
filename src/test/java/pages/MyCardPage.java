package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pages.ProductPage.click_addBasket;
import static pages.ProductPage.nameMonitor;

public class MyCardPage extends BrowserDriver {

    public static String nameOfProduct = "/html/body/section[2]/div[2]/div[1]/div/div[1]/div[1]/div/strong[1]";
    public static String priceOfProduct = "/html/body/section[2]/div[2]/div[1]/div/div[1]/span/strong";
    public static boolean checkVisibility(){
        String price = driver.findElement(By.xpath(priceOfProduct)).getText();
        String value = driver.findElement(By.xpath(nameOfProduct)).getText();
        String[] words = price.split(",");
        String realPrice = words[0].replaceAll("\\.","");
        int priceMonitor = Integer.parseInt(realPrice);
        if (priceMonitor>=10000 && priceMonitor<=20000 && Objects.equals(value, nameMonitor)){
            return true;
        }else return false;
    }
    public static void visibilityOfProduct() throws InterruptedException {
        Thread.sleep(2500);
        assertTrue(checkVisibility());
    }
}
