package main;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.actions;
import pageObjects.assertions;
import support.constants;

public class testCases implements constants{
	actions action  = new actions() ;
	assertions assertion = new assertions();
	
	
	@BeforeSuite
	public void setUp() {
		action.maximizeBrowser();
		action.openMaginto();

	}
	
	@Test(description = "Verify end-to-end checkout flow")
	public void checkoutEndToEndScenario() throws InterruptedException {
		action.typeInSearchInputField("Shirt");	
		assertion.checkPageTitleIsContain("Search results for: 'Shirt'");
		action.clickOnShirt("Radiant Tee");	
		action.clickOnMSize();
		action.clickOnOrangeColor();
		action.clickOnAddToCartButton();
		assertion.checkAlertIsContain("You added Radiant Tee to your shopping cart.");
		assertion.checkCartQtyIsContain("1");
		action.clickOnCartIcon();
		assertion.checkCartContainsShirt("Radiant Tee");
		action.clickOnProceedToCheckoutButton();
		assertion.checkOrderSummaryContainsShirt("Radiant Tee");
		action.typeOnEmailInputField();
		action.typeOnFirtNameInputField();
		action.typeOnLastNameInputField();
		action.typeOnCompanyInputField();
		action.typeOnStreetAddressFirstInputField();
		action.typeOnStreetAddressSecondInputField();
		action.typeOnStreetAddressThirdInputField();
		action.typeCityInputField();
		action.selectStateByValue("48");
		action.typePostCodeInputField();
		action.selectProductByValue("PS");
		action.typePhoneNumberInputField();
		action.clickOnNextButton();
		assertion.checkReviewAndPaymentsPageContainsCorrectInfo("Ansam Janajreh\nNablus, Talluza, 90\nNablus, 144\nPalestinian Territories\n0599999999");
		assertion.verifyOrderSummary("22", "5", "27", "Radiant Tee");
		action.clickOnPlaceOrderButton();
		action.printOrderNumber();
		assertion.checkQtyIsHidden();
		assertion.checkCartIsEmpty("You have no items in your shopping cart.");

		
	}
		
	
	@AfterSuite
	public void afterTest() {
		action.closeBrowser();
	}
			

}
