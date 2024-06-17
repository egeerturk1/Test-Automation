package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.SearchFindPage.*;

public class SearchFindPage {
    @When("User chooses the price interval of product")
    public void userChoosesThePriceIntervalOfProduct() throws InterruptedException {
        filterPrice();
    }

    @When("User click filter button")
    public void userClickFilterButton() throws InterruptedException {
        click_price_filter();
    }

    @When("User clicks the first product")
    public void userClicksTheFirstProduct() throws InterruptedException {
        click_first_product();
    }

    @Then("User should be able to view product in right interval")
    public void userShouldBeAbleToViewProductInRightInterval() throws InterruptedException {
        checkingPrices();
    }

    @When("User clicks only stocks button")
    public void userClicksOnlyStocksButton() throws InterruptedException {
        click_stocks();
    }
}
