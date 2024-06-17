package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.ProductPage.*;

public class ProductPage {
    String name;
    @When("User clicks the add basket button")
    public void userClicksTheAddBasketButton() throws InterruptedException {
        click_addBasket();
    }

    @When("User clicks the basket")
    public void userClicksTheBasket() throws InterruptedException {
        click_basket();
    }
}
