package pooja.cucumber.demo.pageObject.client;
import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Login {
	
	public JSONObject LoginConfig = new JSONObject();
	
	@SuppressWarnings("unchecked")
	public
	Login()
	{
		LoginConfig.put("lblHeading","//p[contains(@class,'css-ohf6vn')]");
		LoginConfig.put("lblSubHeading","//p[contains(@class,'css-pe526h')]");
		LoginConfig.put("lblPhoneNumber","//label[contains(text(),'Mobile Number')]");
		LoginConfig.put("txtCountrycode","//input[@value='+91']");
		LoginConfig.put("txtMobile","//input[@name='mobile']");
		LoginConfig.put("btnSendOTP","//button[contains(@class,'css-1dbujw9')]");
		LoginConfig.put("lblErrorMessage","//div[@class='MuiBox-root css-m1ws16']//p");
		LoginConfig.put("lblHeadingOtp","//p[contains(@class,'css-1q0squ4')]");
		LoginConfig.put("lblSubHeadingOtp","//p[contains(@class,'css-1ovz3f9')]");
		LoginConfig.put("lblOtp","//label[contains(@class,'css-qhtyrs')]");
		LoginConfig.put("btnVerifyOtp","//button[contains(@class,'css-6h1xax' ) and contains(text(),'Verify OTP')]");
		System.out.print(LoginConfig);
	}
//	public final String lblHeading = "//p[contains(@class,'css-ohf6vn')]";
//	public final String lblSubHeading = "//p[contains(@class,'css-pe526h')]";
//
//	public final String lblPhoneNumber = "//label[contains(text(),'Mobile Number')]"; 
//	public final String txtCountrycode = "//input[@value='+91']";
//	public final String txtMobile = "//input[@name='mobile']";
//	//public final String ckbRememberMe = "//div[@class='MuiBox-root css-1elmi5e']//input[@id='rememberMe']";
//	//public final String lblRememberMe = "//div[@class='MuiBox-root css-1elmi5e']//p[contains(@class,'css-1sh9bn9')]";
//	public final String btnSendOTP = "//button[contains(@class,'css-1dbujw9')]";
//	public final String lblErrorMessage = "//div[@class='MuiBox-root css-m1ws16']//p";
//	
//	public final String lblHeadingOtp = "//p[contains(@class,'css-1q0squ4')]";
//	public final String lblSubHeadingOtp = "//p[contains(@class,'css-1ovz3f9')]";
//	public final String lblOtp= "//label[contains(@class,'css-qhtyrs')]";
//	public final String btnVerifyOtp= "//button[contains(@class,'css-6h1xax' ) and contains(text(),'Verify OTP')]";
	
	//Headings
		public void verifyHeadingText(String heading) {
			Assert.assertEquals("Welcome to Pawzeeble[ 👋🏼]", 
					$x(LoginConfig.get("lblHeading").toString()).text().trim(),	heading.trim());
		}

		public void verifyHeadingDisplayed(String text) {
			$x(LoginConfig.get("lblHeading").toString()).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		public void verifyOTPHeadingText(String heading) {
			Assert.assertEquals("Please provide the OTP", 
					$x(LoginConfig.get("lblHeadingOtp").toString()).text().trim(),	heading.trim());
		}

		public void verifyOTPHeadingDisplayed(String text) {
			$x(LoginConfig.get("lblHeadingOtp").toString()).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
	//Subheading
		public void verifySubHeadingText(String heading) {
			Assert.assertEquals("Please provide the following details to login", 
					$x(LoginConfig.get("lblSubHeading").toString()).text().trim(),	heading.trim());
		}

		public void verifySubHeadingDisplayed(String text) {
			$x(LoginConfig.get("lblSubHeading").toString()).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		
		public void verifySubOTPHeadingText(String heading) {
			Assert.assertEquals("An OTP has been sent to", 
					$x(LoginConfig.get("lblSubHeadingOtp").toString()).text().trim(),	heading.trim());
		}

		public void verifySubOTPHeadingDisplayed(String text) {
			$x(LoginConfig.get("lblSubHeadingOtp").toString()).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
	//Mobile number label
		public void verifyMobilenumberLabelText(String heading) {
			Assert.assertEquals("Mobile Number", 
					$x(LoginConfig.get("lblPhoneNumber").toString()).text().trim(),	heading.trim());
		}

		public void verifyMobilenumberLabelDisplayed(String text) {
			$x(LoginConfig.get("lblPhoneNumber").toString()).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		
		public void setMobileNumberText(String text) { //static number passed in feature file
			$x(LoginConfig.get("txtMobile").toString()).setValue(text);
		}
		
		public void setMobileNumbers(String mobilenumber) { // number in examples
			$x(LoginConfig.get("txtMobile").toString()).setValue(mobilenumber).val(mobilenumber.trim());
		}
		public void clickMobileNoTextBox() {
			$x(LoginConfig.get("txtMobile").toString()).click();
		}
		public void clickMobileNoLabel() {
			$x(LoginConfig.get("lblPhoneNumber").toString()).click();
		}
		
//Send OTP button
		
		public void verifySendOTPButtonDisplayed(String text) {
			$x(LoginConfig.get("btnSendOTP").toString()).should(exist).shouldBe(visible).shouldHave(text(text));
		}
		
		public void verifySendOTPBtnDisabled()
		{
			$x(LoginConfig.get("btnSendOTP").toString()).shouldBe(disabled);
		}
		
		public void verifySendOTPBtnEnabled()
		{
			$x(LoginConfig.get("btnSendOTP").toString()).shouldBe(enabled);
		}
		public void clickSendOtpButton() {
			$x(LoginConfig.get("btnSendOTP").toString()).click();
		}
		public void checkVerifyOTPBtnEnabled()
		{
			$x(LoginConfig.get("btnVerifyOtp").toString()).shouldBe(enabled);
		}
		
		public void verifyOTPLabelDisplayed(String text) {
			$x(LoginConfig.get("lblOtp").toString()).should(exist).shouldBe(visible).shouldHave(partialText(text));
		}
		
		public void enterOTP()
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
		
		public void clickVerifyOtpButton() {
			$x(LoginConfig.get("btnVerifyOtp").toString()).click();
		}
		
		
}


