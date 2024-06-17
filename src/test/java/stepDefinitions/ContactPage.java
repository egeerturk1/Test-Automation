package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.ContactPage.*;

public class ContactPage {
    @When("User fills contact form")
    public void userFillsContactForm() {
        fillForm();
    }

    @When("User clicks send button")
    public void userClicksSendButton() throws InterruptedException {
        Thread.sleep(800);
        click_send_button();
    }

    @Then("User checks that form is sent successfully")
    public void userChecksThatFormIsSentSuccessfully() throws InterruptedException {
        checkSendingForm();
    }

    @When("User fills contact form with invalid email")
    public void userFillsContactFormWithInvalidEmail() {
        fillFormWithInvalidEmail();
    }

    @When("User fills contact form with invalid phone")
    public void userFillsContactFormWithInvalidPhone() {
        fillFormWithInvalidPhone();
    }

    @Then("User checks that form is not sent successfully")
    public void userChecksThatFormIsNotSentSuccessfully() throws InterruptedException {
        checkSendingFormInvalid();
    }
}
