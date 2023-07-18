package com.nopcommerce.testsuite;


import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {

    HomePage homePage;
    DesktopPage desktopPage;
    BuildYourComputerPage buildYourComputerPage;
    ShoppingCartPage shoppingCartPage;
    RegisterPage registerPage;
    CheckoutPage checkoutPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        buildYourComputerPage = new BuildYourComputerPage();
        desktopPage = new DesktopPage();
        shoppingCartPage = new ShoppingCartPage();
        registerPage = new RegisterPage();
        checkoutPage = new CheckoutPage();
    }

    @Test(groups = {"sanity","regression"})

    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        Thread.sleep(1000);
        //1.2 Click on Desktop
        desktopPage.clickOnDesktop();
        Thread.sleep(1000);
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.sortPosition("Name: Z to A");
        Thread.sleep(1000);
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.verifySortIsArrangeInDescendingOrder();

    }

    @Test(groups = {"sanity", "smoke","regression"})

    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        Thread.sleep(1000);
        //2.2 Click on Desktop
        desktopPage.clickOnDesktop();
        Thread.sleep(1000);
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.selectSortByAToZ("Name: A to Z");
        Thread.sleep(1000);
        //2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCart();
        Thread.sleep(1000);
        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(buildYourComputerPage.verifyTheTextBuildYourOwnComputer(), "Build your own computer", "Build your own computer text not found");

        Thread.sleep(1000);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourComputerPage.selectDualCorePentiumE();
        //2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000);
        buildYourComputerPage.selectGbFromEight("8GB [+$60.00]");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourComputerPage.clickHhdRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(1000);
        buildYourComputerPage.clickOsRadio();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        buildYourComputerPage.clickOnTotalCommander();
        Thread.sleep(500);
        //2.11 Verify the price "$1,475.00"
        Assert.assertEquals(buildYourComputerPage.verifyThePriceForBuildYour(), "$1,475.00", "Price not found");

        //2.12 Click on "ADD TO CARD" Button.
        Thread.sleep(1000);
        buildYourComputerPage.addToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        buildYourComputerPage.verifyTheProductHasBeenAddedToYourCart();
        //After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        buildYourComputerPage.closeTheSquareButtonOnRight();
        Thread.sleep(1000);
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourComputerPage.mouseHoverOnShoppingCart();
        buildYourComputerPage.goToCartButtonClick();
        Thread.sleep(1000);
        //2.15 Verify the message "Shopping cart"
        Assert.assertEquals(buildYourComputerPage.verifyTheMessageShoppingCartOne(), "Shopping cart", "Shopping cart text not found");

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(1000);
        shoppingCartPage.ClearTheQtyFromTheBox("2");

        shoppingCartPage.updateShoppingCart();
        Thread.sleep(1000);
        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.verifyTotalPriceForPc(),"$2,950.00","price not matched");

        Thread.sleep(1000);
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermAndConditionCheckbox();
        //2.19 Click on “CHECKOUT”
        Thread.sleep(1000);
        shoppingCartPage.clickOnCheckOutButtonOnce();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.verifyWelcomeMessage(),"Welcome, Please Sign In!","Welcome, Please Sign In! text not found");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        Thread.sleep(1000);
        registerPage.checkOutAsGuestClick();
        Thread.sleep(1000);
        //2.22 Fill the all mandatory field
        registerPage.enterTheFirstName("Rita");
        Thread.sleep(1000);
        registerPage.enterTheLastName("Raja");
        Thread.sleep(1000);
        registerPage.enterTheEmail("rajar123@gmail.com");
        Thread.sleep(1000);
        registerPage.countryDropdownSelect("United Kingdom");
        Thread.sleep(1000);
        registerPage.enterTheCityName("London");
        Thread.sleep(1000);
        registerPage.enterTheAddressFirstLine("10 downing street");
        Thread.sleep(1000);
        registerPage.enterPostalCode("SW1A 2AA");
        Thread.sleep(1000);
        registerPage.enterThePhoneNumber("09876543212");
        Thread.sleep(1000);
        //2.23 Click on “CONTINUE”
        registerPage.clickOnContinueBlueBox();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        Thread.sleep(1000);
        checkoutPage.clickOnRadioButtonNextDay();
        //2.25 Click on “CONTINUE”
        checkoutPage.enterOnContinue();
        Thread.sleep(1000);
        //2.26 Select Radio Button “Credit Card”
        checkoutPage.selectCardRadioButton();
        Thread.sleep(1000);
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.selectMasterCardOption("Master card");
        Thread.sleep(1000);
        //2.28 Fill all the details
        checkoutPage.enterCardHolderNameIn("Rita");
        Thread.sleep(1000);
        checkoutPage.enterCardHolderNumber("5425233430109903");
        Thread.sleep(1000);
        checkoutPage.enterCardExpireMonth("11");
        Thread.sleep(1000);
        checkoutPage.enterCardExpireYear("2025");
        Thread.sleep(1000);
        //2.29 Click on “CONTINUE”
        checkoutPage.clickContinueForGoing();
        Thread.sleep(1000);
        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkoutPage.verifyPaymentMethod(), "Credit Card", "card text not found");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkoutPage.verifyShippingMethod(), "Next Day Air", "Next Day Air text not found");
        Thread.sleep(1000);
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(checkoutPage.verifyTotalCost(), "$2,950.00", "Price not found");
        Thread.sleep(1000);
        //2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirmOder();
        Thread.sleep(1000);
        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(checkoutPage.verifyThankYouText(), "Thank You", "Thank You text not found");
        Thread.sleep(1000);
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkoutPage.verifyOderIsSuccessfullyProcessed(), "Your order has been successfully processed!", "Oder is not successful");
        Thread.sleep(1000);
        //2.37 Click on “CONTINUE”
        checkoutPage.pressOnCon();
        Thread.sleep(1000);
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(checkoutPage.verifyWelcomeToOurStore(), "Welcome to our store", "Welcome to our store text not found");


    }


}
