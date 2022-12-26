package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class SignInPage extends PageObject{
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordInput;
	
	@FindBy(xpath = "//button[@id='next']")
	WebElement singInButton;
	
	@Step
	public void validateHomePage(){
		Assert.assertEquals(getDriver().getTitle(), "SMT");
	}
	
	@Step
	public void enterEmail() {
		
		emailInput.sendKeys("coamilind@mailinator.com");
	}
	
	@Step
	public void enterPassword() {
		
		passwordInput.sendKeys("Test@123");
	}
	
	@Step
	public void clickSignInButton() {
		
		singInButton.click();
	}
	
	@Step
	public void signInButtonIsDisplayed() {
		
		Assert.assertTrue(singInButton.isDisplayed());
	}
	
	@Step
	public void enterEmail(String email) {
		
		$("//input[@type='email']").waitUntilVisible().sendKeys(email);
	}
	
	@Step
	public void enterPassword(String password) {
		
		$("//input[@type='password']").sendKeys(password);
	}
}
