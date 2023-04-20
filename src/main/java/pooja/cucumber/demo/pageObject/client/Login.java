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
	
	
	public static final String lblHeading = "//p[contains(@class,'css-ohf6vn')]";
	public static final String lblSubHeading = "//p[contains(@class,'css-pe526h')]";

	public static final String lblPhoneNumber = "//label[contains(text(),'Mobile Number')]"; 
	public static final String txtCountrycode = "//input[@value='+91']";
	public static final String txtMobile = "//input[@name='mobile']";
	//public final String ckbRememberMe = "//div[@class='MuiBox-root css-1elmi5e']//input[@id='rememberMe']";
	//public final String lblRememberMe = "//div[@class='MuiBox-root css-1elmi5e']//p[contains(@class,'css-1sh9bn9')]";
	public static final String btnSendOTP = "//button[contains(@class,'css-1rbkd69')]";
	public static final String lblErrorMessage = "//div[@class='MuiBox-root css-m1ws16']//p";
	
	public static final String lblHeadingOtp = "//p[contains(@class,'css-1q0squ4')]";
	public static final String lblSubHeadingOtp = "//p[contains(@class,'css-1ovz3f9')]";
	public static final String lblOtp= "//label[contains(@class,'css-qhtyrs')]";
	public static final String btnVerifyOtp= "//button[contains(@class,'css-1cma124' ) and contains(text(),'Verify OTP')]";
	
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
			Assert.assertEquals("Please provide the following details to login", 
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
			Assert.assertEquals("Mobile Number", 
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
			$x(btnSendOTP).should(exist).shouldBe(visible).shouldHave(text(text));
		}
		
		public void verifySendOTPBtnDisabled()
		{
			$x(btnSendOTP).shouldBe(disabled);
		}
		
		public void verifySendOTPBtnEnabled()
		{
			$x(btnSendOTP).shouldBe(enabled);
		}
		public static void clickSendOtpButton() {
			$x(btnSendOTP).click();
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
			ElementsCollection coll= $$(By.cssSelector("input.css-xuc6iw"));
	    	
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


