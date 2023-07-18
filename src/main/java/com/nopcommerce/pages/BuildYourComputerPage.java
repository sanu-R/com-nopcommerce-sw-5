package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement verifyBuildYourOwn;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectDualCore;
    @CacheLookup
    @FindBy(xpath ="//select[@id='product_attribute_2']" )
    WebElement  gbSelect ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_3_7']" )
    WebElement  hhdRadio ;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement osRadio ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-1']" )
    WebElement addCart;
    @CacheLookup
    @FindBy(xpath ="//body/div[@id='bar-notification']/div[1]/p[1]" )
    WebElement  verifyProductAdded;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement  closeTheSquare;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseOnShopping ;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Go to cart']")
    WebElement goToCart ;
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Shopping cart')]")
    WebElement verifyTheMessage ;



    public  String verifyTheTextBuildYourOwnComputer() {
        return getTextFromElement(verifyBuildYourOwn) ;

    }

    public void selectDualCorePentiumE() {
        selectByVisibleTextFromDropDown(selectDualCore, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectGbFromEight(String text) {
       selectByVisibleTextFromDropDown(gbSelect,text);
    }

    public void clickHhdRadio() {
        clickOnElement(hhdRadio);
    }

    public void clickOsRadio() {
        clickOnElement(osRadio);
    }

    public void clickOnTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String verifyThePriceForBuildYour() {
        return getTextFromElement(verifyPrice);

    }

    public void addToCartButton() {
        clickOnElement(addCart);
    }

    public void verifyTheProductHasBeenAddedToYourCart() {
        getTextFromElement(verifyProductAdded);
    }

    public void closeTheSquareButtonOnRight() {
        clickOnElement(closeTheSquare);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseOnShopping);
    }

    public void goToCartButtonClick() {
        clickOnElement(goToCart);
    }

    public String verifyTheMessageShoppingCartOne() {
        return getTextFromElement(verifyTheMessage);

    }


}
