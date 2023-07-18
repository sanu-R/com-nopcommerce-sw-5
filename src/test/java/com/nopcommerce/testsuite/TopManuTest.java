package com.nopcommerce.testsuite;


import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopManuTest extends BaseTest {

    TopMenuPage topMenuPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        topMenuPage = new TopMenuPage();
    }

    @Test(groups = {"sanity","regression"})

    public void verifyPageNavigation() {
        //   1.2 This method should click on the menu whatever name is passed as parameter.
        topMenuPage.selectMenu("Computer");
        // 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
        //  select the Menu and click on it and verify the page navigation.
        topMenuPage.clickOnComputer();
        topMenuPage.getUrl();
    }


}
