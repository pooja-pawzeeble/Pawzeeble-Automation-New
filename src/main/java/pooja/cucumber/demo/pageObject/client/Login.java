//author pooja
package pooja.cucumber.demo.pageObject.client;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import com.codeborne.selenide.ElementsCollection;


public class Login {
	
	
	public static final String lblHeading = "//div[@id='form_h1']";
	public static final String lblSubHeading = "//div[contains(text(),'login/signup')]";

	public static final String lblPhoneNumber = "//div[@id='mobileNumberLabel']"; 
	//public static final String txtCountrycode = "//div[@test-id='mobile-number-country-code']";
	public static final String txtMobile = "//input[@id='PhoneInput']";
	

	public static final String btnContinue = "//button[@id='continueBtn']";
	public static final String pwdErrorMessage = "//p[@test-id='phone-number-error']";
	
	public static final String lblPassword = "//div[@id='passwordLabel']";
	public static final String txtPassword  = "//input[@id='userPassword']";
	public static final String btnForgotPassword  = "div span#forgotPasswordBtn";
	
	public static final String lblOTP = "//span[@id='generateOTPHandlerBtn']";
	
	public static final String lblHeadingOtp = "//div[contains(text(),'Please provide the OTP')]";
	public static final String lblSubHeadingOtp = "//div[contains(text(),'An OTP has')]";
	public static final String lblOtp= "//input[@id='otp']";
	public static final String otpErrorMessage ="//p[@test-id='otp-error']";
	
	public static final String btnVerifyOtp= "//button[contains(text(),'Verify OTP')]";
	public static final String btnResendOtp= "//button[contains(text(),'Resend OTP')]";
	
	public static final String changeNumber="//div[contains(text(),'Change number')]";
	
	//forgot password form
	public static final String forgotPwdHeader= "//h3[@id='forgotPswdHeader']";
	public static final String txtOtpForgotPwd  = "//input[@inputmode='text']";
	public static final String lblforgotPwd = "//label[contains(text(),'New Password')]";
	public static final String lblconfirmPwd = "//label[contains(text(),'Confirm Password')]";
	public static final String txtNewPwd = "input#newPassword";
	public static final String txtConfirmPwd = "input#confirmNewPassword";
	public static final String btnFogotPwdResendOtp= "button#resendOTP";
	public static final String btnFogotPwdReset= "//button[@id='resetPassword']";
	
	//Headings
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
		
		public void setPassword(String password) { // static password passed from feature file for login
			$x(txtPassword).setValue(password);
		}
		
		
		public void clickMobileNoTextBox() {
			$x(txtMobile).click();
		}
		public void clickMobileNoLabel() {
			$x(lblPhoneNumber).click();
		}
		
//Continue button	
		public void clickContinueButton() {
			$x(btnContinue).click();
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
		
		public static void enterOTP(String str)
		{
			ElementsCollection coll= $$(By.cssSelector("input#otp"));
	    	
	    	//String s = "0 9 8 7 6 5";
			String[] str1 = str.split(" ");
			
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
		
		public void verifyInvalidOtp(String message )
		{
			if($x(otpErrorMessage).exists()) {
		
			Assert.assertEquals("Incorrect OTP provided", 
					$x(otpErrorMessage).text().trim(),	message.trim());
		}
			else {
				Assert.assertEquals("", 
						$x(pwdErrorMessage).text().trim(),	message.trim());
				}
			}
		
	// Resend button 
		
		public void resendBtnEnabled()
		{
			
			$x(btnResendOtp).shouldBe(enabled);
		}
		
// change number 
		
		public void changeNumberClicked() throws InterruptedException
		{
			
			$x(changeNumber).click();
			Thread.sleep(2000);
			$x(lblHeading).should(exist).shouldBe(visible);
			//$x(txtMobile).click();
			$x(txtMobile).setValue("8806617718");
		
			Thread.sleep(2000);
			
		}
	//forgot password	
		public void ForgotPasswdBtn() throws InterruptedException
		{
			Thread.sleep(2000);
		$(btnForgotPassword).click();
		}
		
		public void verifyForgotPwdHeaderDisplayed() throws Throwable {
			Thread.sleep(2000);

			$x(forgotPwdHeader).should(exist).shouldBe(visible);
		}
		
		public void setForgotPassword(String newPassword,String confirmPassword) { 
			$(txtNewPwd).setValue(newPassword);
	        
	        $(txtConfirmPwd).setValue(confirmPassword); 
		}
		
		public void enterForgotPwdOTP(String str)
		{
			ElementsCollection coll= $$(By.xpath(txtOtpForgotPwd));
	    	
	    	//String s = "0 9 8 7 6 5";
			String[] str1 = str.split(" ");
	    	for(SelenideElement e:coll)
	    	{
	    		e.sendKeys(str1);	
	    	}	
		}
		
		 public void clickResetBtn() throws Throwable {
			 //Thread.sleep(2000);
        // $(btnFogotPwdResendOtp).scrollIntoView(true).click();
			 //JavascriptExecutor js = (JavascriptExecutor) driver;
			// $(btnFogotPwdResendOtp).shouldBe(Condition.visible);
			 //executeJavaScript("arguments[0].scrollIntoView(true);", btnFogotPwdResendOtp);
			 //executeJavaScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top + window.pageYOffset - 100);", btnFogotPwdResendOtp);
			// $(btnFogotPwdResendOtp).click(); 
			 try {
			 Actions actions = new Actions(WebDriverRunner.getWebDriver());
			 actions.moveToElement($(btnFogotPwdReset)).perform();
			 $(btnFogotPwdReset).click(); 
			 } catch (Exception e) {
				    e.printStackTrace(); 
		 }
}

}
