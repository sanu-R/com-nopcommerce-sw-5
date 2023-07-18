package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement electronics;
    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']" )
    WebElement cellphone ;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement verifyCellphoneText ;


    public void electronicsMenu() {
        mouseHoverToElement(electronics);
    }

    public void mouseHoverCellPhone() {
        mouseHoverToElementAndClick(cellphone);
    }

    public String verifyTheTextCellPhone()
    { return getTextFromElement(verifyCellphoneText);


    }


}
