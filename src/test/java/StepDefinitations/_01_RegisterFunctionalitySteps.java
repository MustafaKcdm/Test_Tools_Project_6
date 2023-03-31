package StepDefinitations;

import Pages.DialogContent;
import Utilities.GrWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_RegisterFunctionalitySteps extends GrWD {

    DialogContent dc=new DialogContent();
    @Given("Navigate to site")
    public void navigateToSite() {
        GrWD.getDriver().get(" https://parabank.parasoft.com/parabank/index.htm");



    }

    @When("User sending Keys for Register")
    public void userSendingKeysForRegister() {
        dc.clickFunction(dc.registerBtn);
        dc.findAndSend(dc.FirstName,"Muhammed Enes");
        dc.findAndSend(dc.LastName,"Erol");
        dc.findAndSend(dc.Address,"Fevzipaşa Mah.Dizdar Geçidi No:17");
        dc.findAndSend(dc.City,"Çanakkale");
        dc.findAndSend(dc.State,"Marmara");
        dc.findAndSend(dc.ZipCode,"59860");
        dc.findAndSend(dc.Phone,"02821159860");
        dc.findAndSend(dc.SSN,"99881212112");
        dc.findAndSend(dc.Username,"MECorlu");
        dc.findAndSend(dc.Password,"Corlu860");
        dc.findAndSend(dc.repeatPassword,"Corlu860");
        dc.clickFunction(dc.Confirm);


    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {

        Assert.assertTrue(dc.successMessage.isDisplayed(),"test failed");

    }
}
