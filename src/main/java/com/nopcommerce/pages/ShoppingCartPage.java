package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyClearFirst;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-2 update-cart-button']")
    WebElement updateTheCart ;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement verifyTotalPrice ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='termsofservice']" )
    WebElement agreeTermAndCondition;
    @CacheLookup
    @FindBy(xpath ="//button[@id='checkout']" )
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath ="//h1[normalize-space()='Shopping cart']" )
    WebElement verifyShoppingMessage ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='itemquantity11244']")
    WebElement  verifyQuantity ;
    @CacheLookup
    @FindBy(xpath ="//tbody/tr[4]/td[2]/span[1]/strong[1]")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath ="//input[@id='termsofservice']")
    WebElement clickOnBox ;
    @CacheLookup
    @FindBy(xpath ="//button[@id='checkout']")
    WebElement lastCheckout ;
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage ;



    public void ClearTheQtyFromTheBox(String qty) {
       qtyClearFirst.clear();
       sendTextToElement(qtyClearFirst,qty);
    }



    public void updateShoppingCart() {
        clickOnElement(updateTheCart);
    }

    public String verifyTotalPriceForPc() {
        return getTextFromElement(verifyTotalPrice);

    }

    public void clickOnTermAndConditionCheckbox() {
        clickOnElement(agreeTermAndCondition);
    }

    public void clickOnCheckOutButtonOnce() {
        clickOnElement(checkOut);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(verifyShoppingMessage);

    }

    public String VerifyTheCartQty() {
        return getTextFromElement(verifyQuantity);

    }

    public String verifyTheTotal() {
        return getTextFromElement(verifyTotal);

    }

    public void clickOnTeamsSquare() {
        clickOnElement(clickOnBox);
    }

    public void clickOnLastCheckOutButton() {
        clickOnElement(lastCheckout);
    }

    public String verifyWellComingText() {
        return getTextFromElement(welcomeMessage);
    }


}
