package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String loginEmailPath = "//*[@id=\"EPosta\"]";
    public static String loginPasswordPath = "//*[@id=\"Sifre\"]";
    public static String login_buttonPath = "//*[@id=\"LoginForm\"]/button";
    public static void login(){
        driver.findElement(By.xpath(loginEmailPath)).click();
        driver.findElement(By.xpath(loginEmailPath)).sendKeys("enesaegean.10@outlook.com");

        driver.findElement(By.xpath(loginPasswordPath)).click();
        driver.findElement(By.xpath(loginPasswordPath)).sendKeys("123456789egE");

        driver.findElement(By.xpath(login_buttonPath)).click();
    }
}
