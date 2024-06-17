package stepDefinitions;

import io.cucumber.java.en.Then;

import static pages.MyCardPage.*;

public class MyCardPage {
    @Then("User should be able to view product in basket")
    public void userShouldBeAbleToViewProductInBasket() throws InterruptedException {
        visibilityOfProduct();
    }
}
