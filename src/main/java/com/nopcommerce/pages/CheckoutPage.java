package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']")
    WebElement deliveryRound;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement enterCon;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement payCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement selectMasterCard;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardHolderNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement cardExpire;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expireYear;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']//button[text()='Continue']")
    WebElement continueNext;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPayment;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[@class='value']")
    WebElement shipping;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[text()='$2,950.00']")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement clickOnCon;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYou;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifySuccessfulOder;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement pressCon;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement ourStore;


    public void clickOnRadioButtonNextDay() {
        clickOnElement(deliveryRound);
    }

    public void enterOnContinue() {
        clickOnElement(enterCon);
    }

    public void selectCardRadioButton() {
        clickOnElement(payCard);
    }

    public void selectMasterCardOption(String card) {
        selectByVisibleTextFromDropDown(selectMasterCard, card);


    }

    public void enterCardHolderNameIn(String name) {

        sendTextToElement(cardHolderName, name);
    }

    public void enterCardHolderNumber(String number) {

        sendTextToElement(cardHolderNumber, number);
    }

    public void enterCardExpireMonth(String value) {
        selectByValueFromDropDown(cardExpire, value);

    }


    public void enterCardExpireYear(String year) {
        selectByValueFromDropDown(expireYear, year);

    }

    public void clickContinueForGoing() {
        clickOnElement(continueNext);
    }

    public String verifyPaymentMethod() {
        return getTextFromElement(verifyPayment);


    }

    public String verifyShippingMethod() {

       return getTextFromElement(shipping);

    }

    public String verifyTotalCost() {
        return getTextFromElement(verifyTotal);

    }

    public void clickOnConfirmOder() {
        clickOnElement(clickOnCon);
    }

    public String verifyThankYouText() {
        return getTextFromElement(thankYou);

    }


    public String verifyOderIsSuccessfullyProcessed() {
        return getTextFromElement(verifySuccessfulOder);
    }

    public void pressOnCon() {
        clickOnElement(pressCon);
    }

    public String verifyWelcomeToOurStore() {
        return getTextFromElement(ourStore);
    }


}
