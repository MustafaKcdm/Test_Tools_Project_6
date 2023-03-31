package StepDefinitations;

import Pages.DialogContent;
import Utilities.GrWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _03_PayBillSteps extends GrWD {
    DialogContent dc = new DialogContent();
    @Then("Navigate to Bill Pay Page")
    public void navigateToBillPayPage() {
        dc.findAndClick(dc.billPayButton);
    }

    @And("User should Pay Bill as Entry info with {string} {string}{string}{string}{string}{string}{string}{string}{string}")
    public void userShouldPayBillAsEntryInfoWith(String payeeName, String address, String city, String state,
                                                 String zipcode, String phone, String account, String verifyAccount, String amount) {
        dc.inputKeys(dc.payeeName,payeeName);
        dc.inputKeys(dc.payeeAddress,address);
        dc.inputKeys(dc.payeeAdressCity,city);
        dc.inputKeys(dc.payeeAdressState,state);
        dc.inputKeys(dc.payeezipcode,zipcode);
        dc.inputKeys(dc.payeePhoneNumber,phone);
        dc.inputKeys(dc.payeeAccountNumber,account);
        dc.inputKeys(dc.payeeVerifyAccount,verifyAccount);
        dc.inputKeys(dc.payeeAmount,amount);
        dc.clickFunction(dc.payeeButton);

    }

    @And("Successful message should be displayed")
    public void successfulMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.payeeSuccessMsg, "Complete");


    }
}
