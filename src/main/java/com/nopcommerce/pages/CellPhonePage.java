package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text()='Nokia Lumia 1020')]")
    WebElement textLumia;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement  priceVerify;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQuan ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement  clickOnCross;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseOnCart ;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement clickGoTo ;





    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }

    public String verifyTheNameLumia() {
        return getTextFromElement(textLumia);


    }

    public String verifyThePriceLumia() {
       return getTextFromElement(priceVerify);

    }

    public void clearTheQuantity(String a ) {
      changeQuan.clear();
     sendTextToElement(changeQuan,a);
    }



    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);

    }

    public String verifyTheProductHasBeenAdded() {
        return getTextFromElement(verifyMessage);

    }

    public void clickOnCrossSquare() {
        clickOnElement(clickOnCross);

    }

    public void mouseHoverOnCartTop() {
        mouseHoverToElement(mouseOnCart);

    }

    public void clickOnGoToCartRectangle() {
        clickOnElement(clickGoTo);


    }


}