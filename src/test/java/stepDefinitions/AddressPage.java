package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static pages.HomePage.*;
import static pages.AddressPage.*;
import static pages.SearchFindPage.*;
public class AddressPage {
    // lfg
    @When("User clicks the add address")
    public void userClicksAddAddress()throws InterruptedException{
        click_add_new_address();
    }
    @When("User clicks on address selection")
    public void userClicksAddressSelection() throws InterruptedException{
        click_address_selection();
    }
    @When("User fills the necessary valid address information")
    public void userFillsAddressForm() throws InterruptedException{
        fill_address_title();
        fill_name_surname();
        fill_TC_number();
        fill_email();
        fill_phone_number();
        select_city();
        select_town();
        fill_address();
    }
    @When("User clicks the save")
    public void userClicksSave() throws InterruptedException{
        click_save();
    }
    @When("User clicks save edited address")
    public void userClicksSaveEditedAddress() throws InterruptedException{
        click_save_edited_address();
    }
    @When("User clicks the edit address")
    public void userClicksEditAddress() throws InterruptedException{
        click_edit_existed_address();
    }
    @When("User changes the valid TC number and fills with an invalid TC number instead")
    public void userChangesTCnumberWithAnInvalidTCnumber() throws InterruptedException{
        change_TC_number_with_invalid_TC_number();
    }
    @When("User fills the necessary address information but with using invalid email")
    public void userFillsAddressFormWithInvalidEmail() throws InterruptedException{
        fill_address_title();
        fill_name_surname();
        fill_TC_number();
        fill_Invalid_email();
        fill_phone_number();
        select_city();
        select_town();
        fill_address();
    }
    @When("User fills the necessary address information but with using invalid TC number")
    public void userFillsAddressFormWithInvalidTCnumber() throws InterruptedException{
        fill_address_title();
        fill_name_surname();
        fill_invalid_TC_number();
        fill_email();
        fill_phone_number();
        select_city();
        select_town();
        fill_address();
    }
    @When("User fills the necessary address information but with using invalid email and invalid TC number")
    public void userFillsAddressFormWithInvalidEmailAndInvalidTCnumber() throws InterruptedException{
        fill_address_title();
        fill_name_surname();
        fill_invalid_TC_number();
        fill_Invalid_email();
        fill_phone_number();
        select_city();
        select_town();
        fill_address();
    }
    @Then("User should be able to see the delivery address added successfully")
    public void userShouldBeAbleToSeeDeliveryAddress() throws InterruptedException{
        Thread.sleep(1000);
        String message = "Sepetinizdeki Ürünlerde Fiyat veya Stok Değişikliği Olmuştur";
        String popup_message = driver.findElement(By.xpath(success_message_path_FOR_DELIVERY_ADDRESS)).getText();
        Assert.assertEquals(message,popup_message);
        // If this passes this shows that address is added successfully.
    }
    @Then("User should NOT be able to see the delivery address added successfully")
    public void userShouldNOTableToSeeSuccessfulDeliveryAddress() throws InterruptedException{
        Thread.sleep(1000);
        String successMessage = "Sepetinizdeki Ürünlerde Fiyat veya Stok Değişikliği Olmuştur";
        String popup_message = driver.findElement(By.xpath(success_message_path_FOR_DELIVERY_ADDRESS)).getText();
        Assert.assertNotEquals(successMessage,popup_message);
        // If this passes this shows that address is NOT added successfully.
    }
    @When("User clicks the user profile button")
    public void userClicksProfileButtonHOMEPAGE() throws InterruptedException{
        click_HOMEPAGE_my_profile();
    }
    @When("User clicks the my address information")
    public void userClicksMyAddressInformationHOMEPAGE() throws InterruptedException{
        click_HOMEPAGE_my_address_information();
    }
    @When("User clicks the add address from MyAddresses")
    public void userClicksAddAddressButtonFromHOMEPAGE() throws InterruptedException{
        click_add_address_from_MyAddresses();
    }
    @Then("User should NOT be able to see the address added successfully from HOMEPAGE with that email")
    public void userShouldNOTableToSeeAddedSuccessfulAddressHOMEPAGEinvalidEmail() throws InterruptedException{
        Thread.sleep(1000);
        String actualMessage= "";
        String expectedMessage= "Lütfen";
        try { // If it gives the error (error path)
            WebElement popup = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HOMEPAGE_invalid_email_message_path)));
            // If the popup is visible, check its message
            actualMessage = popup.getText();
        } catch (org.openqa.selenium.TimeoutException e) {
            // Handle the case where the popup does not appear
            System.out.println("Popup not visible. Address is not added");
        }
        finally{
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        }
    }
    @Then("User should NOT be able to see the address added successfully from HOMEPAGE with that TC number")
    public void userShouldNOTableToSeeAddedSuccessfulAddressHOMEPAGEinvalidTCnumber() throws InterruptedException{
        Thread.sleep(1000);
        String actualMessage= "";
        String expectedMessage= "Lütfen";
        try { // If it gives the error (error path)
            WebElement popup = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HOMEPAGE_invalid_TC_number_message_path)));
            // If the popup is visible, check its message
            actualMessage = popup.getText();
        } catch (org.openqa.selenium.TimeoutException e) {
            // Handle the case where the popup does not appear
            System.out.println("Popup not visible. Address is not added");
        }
        finally{
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        }
    }
    @When("User clicks shopping card from Homepage")
    public void userClicksShoppingCard() throws InterruptedException{
        // 28.05.2024
        String actualMessage= "";
        String expectedMessage= "i\nÜrün Stoğu Bitmiştir Ya da Maksimum Sepette Yararlanılabilecek Miktarı Aştınız\nTamam";
        try { // If the product has problems with stock or not, popup checker!
            WebElement popup = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(urun_Stock_bitmistir_message_path)));
            // If the popup is visible, check its message
            actualMessage = popup.getText();
            driver.findElement(By.xpath(tamam_urun_stock_bitmistir_message_path)).click();
        } catch (org.openqa.selenium.TimeoutException e) {
            // Handle the case where the popup does not appear
            System.out.println("Popup not visible. Address is not added");
        }
        finally{
            Thread.sleep(1000);
            driver.findElement(By.xpath(shoppingCard_hopepage_path)).click();
        }

    }
}