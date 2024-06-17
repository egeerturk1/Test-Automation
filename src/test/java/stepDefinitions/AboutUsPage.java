package stepDefinitions;

import io.cucumber.java.en.When;

import static pages.AboutUsPage.*;

public class AboutUsPage {
    @When("User scrolls down in about us page")
    public void userScrollsDownInAboutUsPage() {
        scrollDownInAboutUsPage();
    }

    @When("User clicks contact us button")
    public void userClicksContactUsButton() throws InterruptedException {
        clickContactUs();
    }
}
