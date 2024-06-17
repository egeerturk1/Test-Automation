package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utility.BrowserDriver;

import static java.awt.SystemColor.window;

public class AboutUsPage extends BrowserDriver {
    public static String contactUsButton_path = "//*[@id=\"u_content_button_1\"]/div/a";
    public static void scrollDownInAboutUsPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5110)", "");
    }
    public static void clickContactUs() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(contactUsButton_path)).click();
    }
}
