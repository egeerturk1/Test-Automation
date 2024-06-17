package pages;

import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class ContactPage extends BrowserDriver {
    public static String name_path = "//*[@id=\"name\"]";
    public static String email_path = "//*[@id=\"email\"]";
    public static String phone_path = "//*[@id=\"phone\"]";
    public static String message_path = "//*[@id=\"message\"]";
    public static String send_button_path = "//*[@id=\"btnSend\"]";
    public static String okay_button_path = "/html/body/div[5]/div/div[6]/button[1]";
    public static String successful_message = "//h2[@id='swal2-title']";


    public static void fillForm(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");

        driver.findElement(By.xpath(name_path)).click();
        driver.findElement(By.xpath(name_path)).sendKeys("Ege Ertürk");

        driver.findElement(By.xpath(email_path)).click();
        driver.findElement(By.xpath(email_path)).sendKeys("egeerturk1@outlook.com");

        driver.findElement(By.xpath(phone_path)).click();
        driver.findElement(By.xpath(phone_path)).sendKeys("5308200343");

        driver.findElement(By.xpath(message_path)).click();
        driver.findElement(By.xpath(message_path)).sendKeys("skxmskxnsjxjsnxjs");
    }
    public static void click_send_button(){
        driver.findElement(By.xpath(send_button_path)).click();
    }

    public static void checkSendingForm() throws InterruptedException {
        Thread.sleep(6500);
        String message = driver.findElement(By.xpath(successful_message)).getText();
        assertEquals("Başarılı",message);
    }

    //https://gist.github.com/cjaoude/fd9910626629b53c4d25 YOU CAN LOOK INVALID EMAILS FROM THIS SITE
    //https://www.emailverification.com/?utm_source=emailregex.com&utm_medium=website&utm_term=sidenav CHECK EMAIL THAT INVALID OR VALID
    public static void fillFormWithInvalidEmail(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");

        driver.findElement(By.xpath(name_path)).click();
        driver.findElement(By.xpath(name_path)).sendKeys("Ege Ertürk");

        driver.findElement(By.xpath(email_path)).click();
        driver.findElement(By.xpath(email_path)).sendKeys("email@example-one.com");

        driver.findElement(By.xpath(phone_path)).click();
        driver.findElement(By.xpath(phone_path)).sendKeys("5308200343");

        driver.findElement(By.xpath(message_path)).click();
        driver.findElement(By.xpath(message_path)).sendKeys("skxmskxnsjxjsnxjs");
    }

    public static void fillFormWithInvalidPhone(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");

        driver.findElement(By.xpath(name_path)).click();
        driver.findElement(By.xpath(name_path)).sendKeys("Ege Ertürk");

        driver.findElement(By.xpath(email_path)).click();
        driver.findElement(By.xpath(email_path)).sendKeys("egeerturk1@outlook.com");

        driver.findElement(By.xpath(phone_path)).click();
        driver.findElement(By.xpath(phone_path)).sendKeys("0000000000");

        driver.findElement(By.xpath(message_path)).click();
        driver.findElement(By.xpath(message_path)).sendKeys("skxmskxnsjxjsnxjs");
    }
    public static void checkSendingFormInvalid() throws InterruptedException {
        Thread.sleep(6500);
        String message = driver.findElement(By.xpath(successful_message)).getText();
        assertEquals("Hata",message);
    }

}
