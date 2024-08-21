package pooja.cucumber.demo.pageObject.client;
import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Login {
	
	
	public static final String lblHeading = "//div[@id='form_h1']";
	public static final String lblSubHeading = "//div[contains(text(),'login/signup')]";

	public static final String lblPhoneNumber = "//div[@id='mobileNumberLabel']"; 
	//public static final String txtCountrycode = "//div[@test-id='mobile-number-country-code']";
	public static final String txtMobile = "//input[@id='PhoneInput']";
	

	public static final String btnContinue = "//button[@id='continueBtn']";
	public static final String lblErrorMessage = "//p[@test-id='phone-number-error']";
	
	public static final String lblPassword = "//div[@id='passwordLabel']";
	public static final String txtPassword  = "//input[@id='userPassword']";
	public static final String btnForgotPassword  = "//span[@id='forgotPasswordBtn']";
	
	public static final String lblOTP = "//span[@id='generateOTPHandlerBtn']";
	
	public static final String lblHeadingOtp = "//div[contains(text(),'Please provide the OTP')]";
	public static final String lblSubHeadingOtp = "//div[contains(text(),'An OTP has')]";
	public static final String lblOtp= "//input[@id='otp']";
	
	public static final String btnVerifyOtp= "//button[contains(text(),'Verify OTP')]";
	public static final String btnResendOtp= "//button[contains(text(),'Resend OTP')]";
	//Headings1234S
		public void verifyHeadingText(String heading) {
			Assert.assertEquals("Welcome to Pawzeeble[ 👋🏼]", 
					$x(lblHeading).text().trim(),	heading.trim());
		}

		public void verifyHeadingDisplayed(String text) {
			$x(lblHeading).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		public void verifyOTPHeadingText(String heading) {
			Assert.assertEquals("Please provide the OTP", 
					$x(lblHeadingOtp).text().trim(),	heading.trim());
		}

		public void verifyOTPHeadingDisplayed(String text) {
			$x(lblHeadingOtp).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
	//Subheading
		public void verifySubHeadingText(String heading) {
			Assert.assertEquals("Please provide the following details to login/signup", 
					$x(lblSubHeading).text().trim(),	heading.trim());
		}

		public void verifySubHeadingDisplayed(String text) {
			$x(lblSubHeading).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		
		public void verifySubOTPHeadingText(String heading) {
			Assert.assertEquals("An OTP has been sent to", 
					$x(lblSubHeadingOtp).text().trim(),	heading.trim());
		}

		public void verifySubOTPHeadingDisplayed(String text) {
			$x(lblSubHeadingOtp).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
	//Mobile number label
		public void verifyMobilenumberLabelText(String heading) {
			Assert.assertEquals("Mobile Number (required)", 
					$x(lblPhoneNumber).text().trim(),	heading.trim());
		}

		public void verifyMobilenumberLabelDisplayed(String text) {
			$x(lblPhoneNumber).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		
		public void setMobileNumberText(String text) { //static number passed in feature file
			$x(txtMobile).setValue(text);
		}
		
		public static void setMobileNumbers(String mobilenumber) { // number in examples
			$x(txtMobile).setValue(mobilenumber).val(mobilenumber.trim());
		}
		public void clickMobileNoTextBox() {
			$x(txtMobile).click();
		}
		public void clickMobileNoLabel() {
			$x(lblPhoneNumber).click();
		}
		
//Send OTP button
		
		public void verifySendOTPButtonDisplayed(String text) {
			$x(btnContinue).should(exist).shouldBe(visible).shouldHave(text(text));
		}
		
		public void verifySendOTPBtnDisabled()
		{
			$x(btnContinue).shouldBe(disabled);
		}
		
		public void verifySendOTPBtnEnabled()
		{
			$x(btnContinue).shouldBe(enabled);
		}
		public static void clickSendOtpButton() {
			$x(lblOTP).click();// label otp
		}
		public void checkVerifyOTPBtnEnabled()
		{
			$x(btnVerifyOtp).shouldBe(enabled);
		}
		
		public void verifyOTPLabelDisplayed(String text) {
			$x(lblOtp).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		
		public static void enterOTP()
		{
			ElementsCollection coll= $$(By.cssSelector("input#otp"));
	    	
	    	String s = "0 9 8 7 6 5";
			String[] str1 = s.split(" ");
			
			//for (int i = 0; i < str1.length; i++)
			//{
			
	    	for(SelenideElement e:coll)
	    	{
	    		e.sendKeys(str1);	
	    	}	
		}
		
		public static void clickVerifyOtpButton() {
			$x(btnVerifyOtp).click();
		}
		
		
}


