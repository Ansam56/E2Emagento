package pageObjects;


import org.openqa.selenium.By;
import org.testng.Assert;

import support.constants;

public class assertions implements constants {
	actions action  = new actions() ;
	
	public void checkPageTitleIsContain(String title) {
		Assert.assertEquals(driver.findElement(By.className("base")).getText(),title );
		
	}
	
	public void checkAlertIsContain(String alert) throws InterruptedException {
		Assert.assertEquals(driver.findElement(By.cssSelector("div.message-success")).getText(),alert );
		Thread.sleep(3000);
		
		
	}
	
	public void checkCartQtyIsContain(String qty) throws InterruptedException {
		Assert.assertEquals(driver.findElement(By.className("counter-number")).getText(),qty );
		Thread.sleep(3000);
		
		
	}
	
	public void checkCartContainsShirt(String shirtName) throws InterruptedException {
		Assert.assertEquals(driver.findElement(By.className("product-item-name")).getText(),shirtName );
		Thread.sleep(3000);
		
		
	}
	
	public void checkOrderSummaryContainsShirt(String shirtName) throws InterruptedException {
		action.clickOnSummary();
		Assert.assertEquals(driver.findElement(By.className("product-item-name")).getText(),shirtName );
		Thread.sleep(3000);
		
		
	}
	
	public void checkReviewAndPaymentsPageContainsCorrectInfo(String info) throws InterruptedException {
		String str = driver.findElement(By.className("billing-address-details")).getText();
		//Assert.assertTrue(str.contains(info),"not exist");
		Assert.assertEquals(str,info );

		Thread.sleep(1000);
		
		
	}
	
	public void verifyOrderSummary(String subtotal, String shipping, String total, String shirtName) throws InterruptedException {
	    Assert.assertTrue(driver.findElement(By.className("sub")).getText().contains(subtotal));
	
	    Assert.assertTrue(driver.findElement(By.className("excl")).getText().contains( shipping));
	
	    Assert.assertTrue(driver.findElement(By.className("grand")).getText().contains(total));
	    
	    action.clickOnSummary();
		Assert.assertEquals(driver.findElement(By.className("product-item-name")).getText(),shirtName );

	    

	}
	
	public void checkQtyIsHidden() throws InterruptedException {
		Assert.assertFalse(driver.findElement(By.className("counter-number")).isDisplayed());
		Thread.sleep(2000);
		   
	}
	
	
	
	public void checkCartIsEmpty(String emptyCart) throws InterruptedException {
		action.clickOnCartIcon();
		Assert.assertEquals(driver.findElement(By.className("subtitle")).getText(),emptyCart );
		Thread.sleep(2000);
		
		
	}
	



}
