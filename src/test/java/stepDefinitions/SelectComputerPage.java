package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.SelectComputerPage.*;
public class SelectComputerPage {

    @Given("User clicks the select computer button")
    public void userClicksTheSelectComputerButton() throws InterruptedException{
        clickSelectComputer();

    }
    @When("User selects montage and configuration service")
    public void userSelectsMontageAndConfigurationService() throws InterruptedException{
        clickMontageAndConfiguration();
        addedPartsCount++;

    }
    @When("User selects processor")
    public void userSelectsProcessor() throws InterruptedException{
        clickProcessor();
        addedPartsCount++;

    }
    @When("User selects motherboard")
    public void userSelectsMotherboard() throws InterruptedException {
        clickMotherboard();
        addedPartsCount++;
    }
    @When("User removes motherboard")
    public void userRemovesMotherboard() throws InterruptedException {
        removeMotherboardFromBasket();
    }
    @When("User selects RAM")
    public void userSelectsRAM() throws InterruptedException{
        clickRAM();
        addedPartsCount++;
    }
    @When("User tries to select RAM")
    public void userTrySelectingRAM() throws InterruptedException{
        toggleMotherboardTab();
        tryOpeningRAMtab();
    }
    @When("User selects Graphics Unit")
    public void userSelectsGPU() throws InterruptedException{
        clickGPU();
        addedPartsCount++;
    }
    @When("User selects computer case")
    public void userSelectsComputerCase() throws InterruptedException{
        clickComputerCase();
        addedPartsCount++;

    }
    @When("User selects ssd")
    public void userSelectsSSD() throws InterruptedException{
        toggleCPUCoolerTab();
        toggleSSDTab();
        clickSSD();
        addedPartsCount++;

    }
    @Then("User adds computer into basket")
    public void userAddsComputerIntoBasket() throws InterruptedException {
        clickAddBasket();

    }
    @Then("User should be able to view selected computer in basket")
    public void userChecksVisibilityOfPC() throws InterruptedException{
        clickGoToBasket();
        clickConfirmPopup();
        checkPartCount();
    }

    @Then("User informed to select motherboard before selecting any other essential parts")
    public void userInformedOfEssentialParts() throws InterruptedException{
        checkEssentialPartSelection();
    }
    @Then("User informed buying only montage and configuration service is invalid")
    public void userInformedOfOnlyMontageException() throws InterruptedException {
        checkIfOnlyMontageServiceInBasket();
    }

    @When("User goes to basket")
    public void userGoesToBasket() throws InterruptedException {
        goToBasket();
    }
}

