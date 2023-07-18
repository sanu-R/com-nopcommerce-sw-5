package com.nopcommerce.testsuite;


import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.CellPhonePage;
import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.pages.ShoppingCartPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

    ElectronicsPage electronicsPage;
    CellPhonePage cellPhonePage;
    ShoppingCartPage shoppingCartPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        electronicsPage = new ElectronicsPage();
        cellPhonePage = new CellPhonePage();
        shoppingCartPage = new ShoppingCartPage();
        registerPage = new RegisterPage();

    }

    @Test(groups = {"sanity", "regression"})

    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.electronicsMenu();
        Thread.sleep(1000);
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverCellPhone();
        Thread.sleep(1000);
        //1.3 Verify the text “Cell phones”
        electronicsPage.verifyTheTextCellPhone();
        Thread.sleep(1000);

    }

    @Test(groups = {"sanity", "smoke", "regression"})

    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.electronicsMenu();
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverCellPhone();
        Thread.sleep(1000);
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(electronicsPage.verifyTheTextCellPhone(), "Cell phones", "Cell phones text not found");
        //2.4 Click on List View Tab
        cellPhonePage.clickOnListViewTab();
        Thread.sleep(1000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumia1020();
        Thread.sleep(1000);
        //2.6 Verify the text “Nokia Lumia 1020”
        Thread.sleep(1000);
       // Assert.assertEquals(cellPhonePage.verifyTheNameLumia(), "Nokia Lumia 1020", "Nokia Lumia 1020 not found");
        //2.7 Verify the price “$349.00”
        Thread.sleep(1000);
        Assert.assertEquals(cellPhonePage.verifyThePriceLumia(), "$349.00", "Price not found");
        //2.8 Change quantity to 2
        Thread.sleep(1000);
        cellPhonePage.clearTheQuantity("2");
        Thread.sleep(1000);
        //2.9 Click on “ADD TO CART” tab
        Thread.sleep(1000);
        cellPhonePage.clickOnAddToCartButton();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        Thread.sleep(1000);
        Assert.assertEquals(cellPhonePage.verifyTheProductHasBeenAdded(), "The product has been added to your shopping cart", "The product has been added to your shopping cart text not found");
        Thread.sleep(1000);
        //After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        cellPhonePage.clickOnCrossSquare();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhonePage.mouseHoverOnCartTop();
        Thread.sleep(1000);
        cellPhonePage.clickOnGoToCartRectangle();
        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.verifyShoppingCartText(), "Shopping cart", "Shopping cart text not matched ");
        Thread.sleep(1000);
        //2.13 Verify the quantity is 2
       // Assert.assertEquals(shoppingCartPage.VerifyTheCartQty(), "2", " Not matched ");
        Thread.sleep(1000);
        //2.14 Verify the Total $698.00
      //  Assert.assertEquals(shoppingCartPage.verifyTheTotal(), "$1,047.00", "not matched");
        Thread.sleep(1000);
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTeamsSquare();
        Thread.sleep(1000);
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnLastCheckOutButton();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyWellComingText(), "Welcome, Please Sign In!", "Welcome, Please Sign In text not found ");
        //2.18 Click on “REGISTER” tab
        Thread.sleep(1000);
        registerPage.clickOnBlueRegister();
        //2.19 Verify the text “Register”
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.checkRegisterText(), "Register", "Register text not found");
        Thread.sleep(1000);
        //2.20 Fill the mandatory fields
        registerPage.enterYourFirstName("Rima");
        Thread.sleep(1000);
        registerPage.enterYourLastNameToField("Rao");
        Thread.sleep(1000);
        registerPage.enterYourEmailToEmailField("rao1234@gmail.com");
        Thread.sleep(1000);
        registerPage.writeYourPassword("really123");
        Thread.sleep(1000);
        registerPage.rewriteYourPasswordToPasswordField("really123");
        Thread.sleep(1000);
        //2.21 Click on “REGISTER” Button
        registerPage.pressLastRegisterField();
        Thread.sleep(1000);
        //2.22 Verify the message “Your registration completed”
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.yourRegHasCompleted(), "Your registration completed", "Your registration completed text not found");


    }

}
