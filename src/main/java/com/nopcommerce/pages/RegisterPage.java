package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Checkout as Guest')]")
    WebElement guest;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath ="//select[@id='BillingNewAddress_CountryId']" )
    WebElement countryDropdown;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_City")
    WebElement cityBox ;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_Address1")
    WebElement address1Box ;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_ZipPostalCode")
    WebElement postalCodeBox ;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_PhoneNumber")
    WebElement phoneNumberBox;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']//button[text()='Continue']")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnReg ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement checkRegister ;

    @CacheLookup
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement fName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='LastName']")
    WebElement  lName ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='Email']")
    WebElement  mail ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='Password']")
    WebElement rPassword ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    WebElement cPassword;
    @CacheLookup
    @FindBy(xpath ="//button[@id='register-button']")
    WebElement pressRegButton;
    @CacheLookup
    @FindBy(xpath ="//div[contains(text(),'Your registration completed')]")
    WebElement regComplete;




    public String verifyWelcomeMessage() {
        return getTextFromElement(verifyWelcomeText);
    }

    public void checkOutAsGuestClick() {
        clickOnElement(guest);
    }

    public void enterTheFirstName(String fN) {

       sendTextToElement(firstName,fN);
    }

    public void enterTheLastName(String lN) {
        sendTextToElement(lastName,lN);
    }

    public void enterTheEmail(String eMail) {
        sendTextToElement(email,eMail);
    }

    public void countryDropdownSelect(String text) {
       selectByVisibleTextFromDropDown(countryDropdown,text);
    }

    public void enterTheCityName(String city) {
        sendTextToElement(cityBox,city);
    }

    public void enterTheAddressFirstLine(String address) {
        sendTextToElement(address1Box,address);
    }

    public void enterPostalCode(String code) {
        sendTextToElement(postalCodeBox,code);
    }

    public void enterThePhoneNumber(String phone) {
        sendTextToElement(phoneNumberBox,phone);
    }

    public void clickOnContinueBlueBox() {
        clickOnElement(continueButton);
    }

    public void clickOnBlueRegister() {
        clickOnElement(clickOnReg);
    }

    public String checkRegisterText() {
        return getTextFromElement(checkRegister);

    }

    public void enterYourFirstName(String firstName) {
        sendTextToElement(fName,firstName);
    }

    public void enterYourLastNameToField(String lastName) {
        sendTextToElement(lName,lastName);
    }

    public void enterYourEmailToEmailField(String email) {
        sendTextToElement(mail,email);
    }

    public void writeYourPassword(String password) {
        sendTextToElement(rPassword,password);
    }

    public void rewriteYourPasswordToPasswordField(String passwordC) {
        sendTextToElement(cPassword,passwordC);
    }

    public void pressLastRegisterField() {
        clickOnElement(pressRegButton);
    }

    public String yourRegHasCompleted() {
        return getTextFromElement(regComplete);

    }

}
