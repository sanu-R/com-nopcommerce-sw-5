package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Picture for category Desktops']")
    WebElement desktop;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortZToA;
    @CacheLookup
    @FindBy(xpath ="//option[contains(text(),'Name: Z to A')]" )
    WebElement verifySort;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectAto;
    @CacheLookup
    @FindBy(xpath ="//div[@class='buttons']//button[text()='Add to cart']" )
    WebElement addTo ;



    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public void sortPosition(String sort) {
        selectByVisibleTextFromDropDown(sortZToA,sort);
    }

    public void verifySortIsArrangeInDescendingOrder() {
        getTextFromElement(verifySort);
    }

    public void selectSortByAToZ(String text) {
        selectByVisibleTextFromDropDown(selectAto,text);
    }

    public void clickOnAddToCart() {
        clickOnElement(addTo);
    }


}
