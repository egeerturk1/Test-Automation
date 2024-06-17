package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SelectComputerPage extends BrowserDriver {

    public static int addedPartsCount=0;

    // Paths of a pc part in each tab
    public static String selectComputerButton_path = "/html/body/header/div[2]/div/div[2]/div[2]/a[2]";
    public static String selectMontageAndConfiguration_path = "//*[@id=\"urunCard_7581\"]/div[2]";
    public static String selectProcessor_path = "//*[@id=\"urunCard_25729\"]/div[2]";
    public static String selectMotherboard_path = "//*[@id=\"urunCard_25329\"]/div[2]";
    public static String selectRAM_path = "//*[@id=\"urunCard_25742\"]/div[2]";
    public static String selectGPU_path = "//*[@id=\"urunCard_25728\"]/div[2]";
    public static String selectComputerCase_path = "//*[@id=\"urunCard_25741\"]/div[2]";
    public static String selectSSD_path = "//*[@id=\"urunCard_25612\"]/div[2]";


    public static String addBasket_path = "//*[@id=\"priceContainer\"]/button";
    public static String goToBasket_path = "/html/body/header/div[2]/div/div[3]/div/div/a";

    //Pop-up message when entered basket
    public static String confirmPopUp_path = "/html/body/div[4]/div/div[6]/button[1]";

    //Error pop-up message saying to add all essential parts one by one
    public static String errorPopUp_path = "/html/body/div[9]/div/div[2]";


    //Paths of pc part's tabs
    public static String tabMotherboard_path = "//*[@id=\"title_9\"]";
    public static String tabRAM_path = "//*[@id=\"title_10\"]";
    public static String tabCPUCooler_path = "//*[@id=\"title_78\"]";
    public static String tabSSD_path = "//*[@id=\"title_20\"]";


    //Text that says how many pc parts have been added
    public static String totalPartsText_path = "/html/body/section[2]/div[2]/div[2]/div/span[1]";
    public static String deleteButtonOfMotherboardInBasket_path = "//*[@id=\"divSummary\"]/div[3]/div/div[4]/a";


    public static void clickSelectComputer() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectComputerButton_path)).click();
    }
    public static void clickMontageAndConfiguration() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectMontageAndConfiguration_path)).click();
    }

    public static void clickProcessor() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectProcessor_path)).click();
    }

    public static void clickMotherboard() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectMotherboard_path)).click();
    }
    public static void clickRAM() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectRAM_path)).click();
    }

    public static void tryOpeningRAMtab() throws InterruptedException{
        Thread.sleep(1000);
        WebElement ramTab = driver.findElement(By.xpath(tabRAM_path));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",ramTab);
    }

    public static void clickGPU() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectGPU_path)).click();
    }
    public static void clickComputerCase() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectComputerCase_path)).click();
    }
    public static void clickSSD() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(selectSSD_path)).click();
    }
    public static void clickAddBasket() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(addBasket_path)).click();
    }

    public static void clickGoToBasket() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(goToBasket_path)).click();
    }
    public static void clickConfirmPopup() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirmPopUp_path)).click();
    }

    //Switches between Collapse or show pc part's tabs

    public static void toggleCPUCoolerTab() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(tabCPUCooler_path)).click();
    }

    public static void toggleMotherboardTab() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(tabMotherboard_path)).click();
    }

    public static void toggleRAMTab() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(tabRAM_path)).click();
    }

    public static void toggleSSDTab() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(tabSSD_path)).click();
    }

    public static void removeMotherboardFromBasket() throws InterruptedException{
        Thread.sleep(2500);
        driver.findElement(By.xpath(deleteButtonOfMotherboardInBasket_path)).click();
    }

    private static int getPartCount() throws InterruptedException{
        Thread.sleep(1000);
        String totalParts = driver.findElement(By.xpath(totalPartsText_path)).getText();
        String onlyNumbers = totalParts.replaceAll("\\D+","");
        int totalPartsRead = Integer.parseInt(onlyNumbers);
        return totalPartsRead;
    }

    public static void checkPartCount() throws InterruptedException{
        int totalPartsRead = getPartCount();
        assertEquals(totalPartsRead,addedPartsCount);
    }

    public static void checkEssentialPartSelection() {
        String actualMessage="";
        String expectedMessage="Lütfen Önce Anakart Kategorisinden Ürün Seçiniz";
        try {
            WebElement popup = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errorPopUp_path)));
            // If the popup is visible, check its message
            actualMessage = popup.getText();
            assertEquals(expectedMessage, actualMessage);

        } catch (org.openqa.selenium.TimeoutException e) {
            // Handle the case where the popup does not appear
            assertEquals(expectedMessage, actualMessage);
            System.out.println("Popup did not appear within the timeout period.");
        }

    }

    public static void checkIfOnlyMontageServiceInBasket() throws InterruptedException{
        int partCount = getPartCount();
        assertNotEquals(1,partCount);
        //Since adding first after first essential part(montage service) is forbidden it is not checked
        //So if only one type of item is in basket it is montage but should be blocked so test should fail

    }
    public static void goToBasket() throws InterruptedException {
        Thread.sleep(500);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)");
        driver.findElement(By.xpath(goToBasket_path)).click();
    }
}
