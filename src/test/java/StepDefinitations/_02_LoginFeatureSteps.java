package StepDefinitations;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_LoginFeatureSteps {
    DialogContent dc=new DialogContent();

    @When("User sending Keys for Login")
    public void userSendingKeysForLogin() {
        dc.findAndSend(dc.UserLogin, "MECorlu");
        dc.findAndSend(dc.UserPassword, "Corlu860");
        dc.clickFunction(dc.logInBttn);


    }

    @Then("User should Login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(dc.logInsuccesMessge.isDisplayed(),"test fail");

    }

    @And("User Logout")
    public void userLogout() {
        dc.clickFunction(dc.logOutBttn);

    }

    @When("User sending Keys for {string} and {string} click to login")
    public void userSendingKeysForAndClickToLogin(String username, String password) {

        dc.findAndSend(dc.UserLogin,username);
        dc.findAndSend(dc.UserPassword,password);
        dc.clickFunction(dc.logInBttn);

    }

    @Then("Alert massage should be displayed")
    public void alertMassageShouldBeDisplayed() {

        Assert.assertTrue(dc.AlertMessage.isDisplayed(),"TEST FAİL or fail");
    }
}
