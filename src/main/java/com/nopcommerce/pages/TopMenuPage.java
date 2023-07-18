package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TopMenuPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile'] //a[text()='Computers ']")
    WebElement computer;

    public void selectMenu(String menu) {
    }
    public void clickOnComputer() {
        clickOnElement(computer);
    }
    public void getUrl() {
        String expectedPage = "https://demo.nopcommerce.com/computers";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage, expectedPage, "Page not found");
    }

}
