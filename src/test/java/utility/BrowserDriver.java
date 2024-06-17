package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserDriver {
    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    @Before
    public static void initial(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.itopya.com/");
        driver.manage().window().maximize();

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(1));
    }
    @After
    public static void quit(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
