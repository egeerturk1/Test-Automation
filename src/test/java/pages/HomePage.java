package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    // I added shopping card button path
    public static String shoppingCard_hopepage_path = "/html/body/header/div[2]/div/div[3]/div/div/a/span";
    public static String searchBar_xpath = "//input[@id='searchBar']";
    public static String searchButton_xpath = "//button[@onclick='AramaYap();']";
    public static String aboutUsButton_xpath = "/html/body/header/div[2]/div/div[2]/div[2]/a[4]";
    public static String login_button_path = "//*[@id=\"unLoggedUserContent\"]";
    public static String user_profile_button_path = "//*[@id=\"dropdownMenu2\"]"; // Homepage, username path
    public static String my_address_information_path = "//*[@id=\"loggedUserContent\"]/ul/li[4]/a"; // Visible after you click on "user_profile_button_path"

    public static void click_searchBar() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(searchBar_xpath)).click();
    }
    public static void write_product() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(searchBar_xpath)).sendKeys("monitör");
        driver.findElement(By.xpath(searchButton_xpath)).click();
    }
    public static void click_aboutUs() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(aboutUsButton_xpath)).click();
    }
    public static void  click_login_button() throws InterruptedException {
        Thread.sleep(800);
        driver.findElement(By.xpath(login_button_path)).click();
    }
    public static void click_shopping_card_button() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(shoppingCard_hopepage_path)).click();
    }
    public static void click_HOMEPAGE_my_profile() throws InterruptedException { // Homepage, clicking on username
        Thread.sleep(1000);
        driver.findElement(By.xpath(user_profile_button_path)).click();
    }
    public static void click_HOMEPAGE_my_address_information() throws InterruptedException{ // Homepage, after you clicking on username you can click this
        Thread.sleep(1000);
        driver.findElement(By.xpath(my_address_information_path)).click();
    }
}
