package stepDefinitions;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User logs in")
    public void userLogsIn() {
        login();
    }
}
