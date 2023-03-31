package Pages;

import Utilities.GrWD;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GrWD.getDriver(), this);
    }

        @FindBy(xpath ="//a[text()='Register']" )
        public WebElement registerBtn;

        @FindBy(css = "[id='customer.firstName']")
        public   WebElement FirstName;

        @FindBy(css = "[id='customer.lastName']")
        public WebElement LastName;

        @FindBy(css = "[id='customer.address.street']")
        public WebElement Address;

        @FindBy(css = "[id='customer.address.city']")
        public WebElement City;

        @FindBy(id = "customer.address.state")
        public WebElement State;

        @FindBy(css = "[id='customer.address.zipCode']")
        public WebElement ZipCode;

        @FindBy(css = "[id='customer.phoneNumber']")
        public WebElement Phone;

        @FindBy(css = "[id='customer.ssn']")
        public WebElement SSN;

        @FindBy(css = "[id='customer.username']")
        public WebElement Username;

        @FindBy(css = "[id='customer.password']")
        public WebElement Password;

        @FindBy(css = "[id='repeatedPassword']")
        public WebElement repeatPassword;

        @FindBy(xpath = "(//input[@class='button'])[2]")
        public WebElement Confirm;

        @FindBy(xpath = "//p[contains(text(), 'successfully')]")
        public  WebElement successMessage;

        @FindBy(xpath = "(//*[@type='text'])[1]")
        public WebElement UserLogin;

        @FindBy(xpath = "//*[@type='password']")
        public WebElement UserPassword;

        @FindBy(xpath = "//input[@type='submit']")
        public WebElement logInBttn;

        @FindBy(css = "[class='smallText']>b")
        public WebElement logInsuccesMessge;

        @FindBy(xpath = "//a[text()='Log Out']")
        public WebElement logOutBttn;

        @FindBy(xpath = "//*[text()='Error!']")
        public WebElement AlertMessage;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[4]/a")
    public WebElement billPayButton;


    @FindBy(css = "[name='payee.name']")
    public WebElement payeeName;

    @FindBy(css = " [name='payee.address.street']")
    public WebElement payeeAddress;

    @FindBy(css = "[name='payee.address.city']")
    public WebElement payeeAdressCity;

    @FindBy(css = "[name='payee.address.state']")
    public WebElement payeeAdressState;

    @FindBy(css = " [name='payee.address.zipCode']")
    public WebElement payeezipcode;

    @FindBy(css = " [name='payee.phoneNumber']")
    public WebElement payeePhoneNumber;

    @FindBy(css = "[name='payee.accountNumber']")
    public WebElement payeeAccountNumber;

    @FindBy(css = "[name='verifyAccount']")
    public WebElement payeeVerifyAccount;

    @FindBy(css = " [name='amount']")
    public WebElement payeeAmount;

    @FindBy(xpath = "(//h1[@class='title'])[2]")
    public WebElement payeeSuccessMsg;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement payeeButton;


        public void findAndSend(WebElement element,String text){

            inputKeys(element, text);
        }
        public void findAndClick(WebElement element){

            clickFunction(element);
        }



    }

