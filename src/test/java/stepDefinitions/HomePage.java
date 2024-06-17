package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.*;

public class HomePage {
    @Given("User clicks the search bar")
    public void userClicksTheSearchBar() throws InterruptedException {
        click_searchBar();
    }
    @When("User writes name of product and clicks search button")
    public void userWritesNameOfProductAndClicksSearchButton() throws InterruptedException {
        write_product();
    }

    @When("User clicks the about us button")
    public void userClicksTheAboutUsButton() throws InterruptedException {
        click_aboutUs();
    }

    @Given("User clicks logs in button")
    public void userClicksLogsInButton() throws InterruptedException {
        click_login_button();
    }
}
