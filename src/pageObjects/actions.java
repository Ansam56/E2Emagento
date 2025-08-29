package pageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import support.constants;

public class actions implements constants {
	public void openMaginto() {
		driver.get("https://magento.softwaretestingboard.com/");

		
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();

		
	}
	
	public void typeInSearchInputField(String productName) throws InterruptedException {
		driver.findElement(By.id("search")).sendKeys(productName+Keys.ENTER);
		Thread.sleep(1000);
	
	}
	
	public void clickOnShirt(String shirtName) throws InterruptedException {
		driver.findElement(By.linkText(shirtName)).click();
		Thread.sleep(3000);
	
	
	}
	public void clickOnMSize() throws InterruptedException {
		driver.findElement(By.cssSelector("div.swatch-option.text[option-label='M']")).click();
		Thread.sleep(1000);
	
	
	}
	public void clickOnOrangeColor() throws InterruptedException {
		driver.findElement(By.cssSelector("div.swatch-option.color[option-label='Orange']")).click();
		Thread.sleep(2000);
	
	
	}
	
	public void clickOnAddToCartButton() throws InterruptedException {
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(4000);
	
	
	}
	
	public void clickOnCartIcon() throws InterruptedException {
		driver.findElement(By.className("showcart")).click();
		Thread.sleep(1000);
	
	
	}
	
	public void clickOnProceedToCheckoutButton() throws InterruptedException {
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(4000);
	
	
	}
	
	public void clickOnSummary() throws InterruptedException {
		driver.findElement(By.className("items-in-cart")).click();
		Thread.sleep(1000);
	
	
	}
	
	
	
	
	public void typeOnEmailInputField() throws InterruptedException {
		  Random randomNumber = new Random();
		  int number = randomNumber.nextInt(1000);
		  String email = "ansam" + number + "@gmail.com";
		  driver.findElement(By.id("customer-email")).sendKeys(email);
		  Thread.sleep(500);

	
	}
	
	public void typeOnFirtNameInputField() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Ansam");
		Thread.sleep(500);

	
	}
	
	public void typeOnLastNameInputField() throws InterruptedException {
		driver.findElement(By.name("lastname")).sendKeys("Janajreh");
		Thread.sleep(500);

	
	}
	
	public void typeOnCompanyInputField() throws InterruptedException {
		driver.findElement(By.name("company")).sendKeys("Nokia");
		Thread.sleep(500);

	
	}
	
	public void typeOnStreetAddressFirstInputField() throws InterruptedException {
		driver.findElement(By.name("street[0]")).sendKeys("Nablus");
		Thread.sleep(500);

	
	}
	public void typeOnStreetAddressSecondInputField() throws InterruptedException {
		driver.findElement(By.name("street[1]")).sendKeys("Talluza");
		Thread.sleep(500);

	
	}
	
	public void typeOnStreetAddressThirdInputField() throws InterruptedException {
		driver.findElement(By.name("street[2]")).sendKeys("90");
		Thread.sleep(500);

	
	}
	public void typeCityInputField() throws InterruptedException  {
		driver.findElement(By.name("city")).sendKeys("Nablus");
		Thread.sleep(500);


		
	
	}
	public void selectStateByValue(String val) throws InterruptedException  {
		WebElement dropdown = driver.findElement(By.name("region_id"));
		Select dropdownElements = new Select(dropdown);
		dropdownElements.selectByValue(val);
		Thread.sleep(500);


		
	
	}
	public void typePostCodeInputField() throws InterruptedException  {
		driver.findElement(By.name("postcode")).sendKeys("144");
		Thread.sleep(500);
		
	
	}
	
	
	public void selectProductByValue(String val) throws InterruptedException {
		WebElement dropdown = driver.findElement(By.name("country_id"));
		Select dropdownElements = new Select(dropdown);
		dropdownElements.selectByValue(val);
		Thread.sleep(500);

		
	
	
	}
	
	public void typePhoneNumberInputField() throws InterruptedException {
		driver.findElement(By.name("telephone")).sendKeys("0599999999");
		Thread.sleep(3000);

	
	}
	
	public void clickOnNextButton() throws InterruptedException {
		driver.findElement(By.className("continue")).click();
		Thread.sleep(3000);
	
	
	}
	
	public void clickOnPlaceOrderButton() throws InterruptedException {
		driver.findElement(By.className("checkout")).click();
		Thread.sleep(3000);
	
	
	}
	
	public void printOrderNumber() throws InterruptedException {
		WebElement element = driver.findElement(By.cssSelector(".checkout-success p"));
		System.out.println(element.getText());
		Thread.sleep(3000);

	
	}	
	
	public void closeBrowser() {
		driver.close();
	
	}

}
