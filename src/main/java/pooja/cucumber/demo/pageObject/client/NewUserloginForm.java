package pooja.cucumber.demo.pageObject.client;


import org.junit.Assert;
import org.openqa.selenium.By;
//import java.util.List;
//import com.codeborne.selenide.ElementsCollection;
//import java.util.Random;

import com.codeborne.selenide.ElementsCollection;

//import pooja.cucumber.demo.tests.stepDefinations.user.List;
//import pooja.cucumber.demo.tests.stepDefinations.user.Random;
//import pooja.cucumber.demo.tests.stepDefinations.user.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import java.util.Random;

public class NewUserloginForm {


	public static final String lblHeading = "//p[contains(@class,'css-ftzbya')]";
	public static final String lblFullname ="//label[@test-id='profile-full-name-label']";
	public static final String txtFullname = "//input[@id='name']"; 
	public static final String errorFullname="//p[@test-id='profile-full-name-error']";
	public static final String lblEmail ="//label[@test-id='profile-email-label']";
	public static final String txtEmailaddress = "//input[@test-id='profile-email']";
	public static final String errorEmailaddress="//p[@test-id='profile-email-error']";
	public static final String lblMobilenumber = "//label[@test-id='profile-mobile-number-label']";
	public static final String txtMobilenumber = "//input[contains(@class,'css-4a8g6')]";
	public static final String lblUsername = "//label[@test-id='profile-username-label']";
	public static final String txtUsername = "//input[@test-id='profile-user-name']";
	public static final String errorUsername="//p[@test-id='profile-username-error']";
	
	public static final String lblUserbio = "//label[contains(text(),'User Bio')]";
	public static final String txtUserbio = "//textarea[@name='bio']";
	public static final String cancelBtn = "//button[contains(text(),'Cancel')]";
	public static final String nextBtn = "//button[contains(text(),'Next')]";
	
	public static final String lbltopic = "//p[contains(@class,'css-310v7p')]";
	public static final String lblinfo = "//p[contains(@class,'css-18b0rdw')]";
	public static final String lblselecttopic ="//label[@test-id='profile-interests-label']";
	public static final String dropdwnselecttopic = "//div[contains(@class,'css-19bb58m')]";
	public static final String lblmessage="//p[@test-id='profile-interests-error']";
	public static final String lblsuggestedtop = "//p[contains(text(),'Suggested Topics')]";
	public static final String lblsuggestedtop1 = "//button[contains(text(),'Education')]";
	public static final String lblsuggestedtop2= "//button[contains(text(),'Health')]";
	public static final String lblsuggestedtop3= "//button[contains(text(),'Environment')]";
	public static final String lblsuggestedtop4= "//button[contains(text(),'Animals')]";
	public static final String btncancel="//button[contains(@class,'css-6s7pno')]";
	public static final String btnnext="//button[contains(@class,'css-1otgy7v')]";
	
	//Headings
	public void verifyPageHeadingText(String heading) {
		Assert.assertEquals("Please fill Personal details", 
				$x(lblHeading).text().trim(),	heading.trim());
	}

	public static void verifyPageHeadingDisplayed() {
		$x(lblHeading).should(exist).shouldBe(visible);
	}
	public void verifyTopicPageHeadingText(String heading) {
		Assert.assertEquals("Select topics of your interests", 
				$x(lbltopic).text().trim(),	heading.trim());
	}

	public void verifyTopicPageHeadingDisplayed() {
		$x(lbltopic).should(exist).shouldBe(visible);
	}


	public void clickCancelButton() {
		$x(cancelBtn).click();
	}
	public static void clickNextButton() {
		$x(nextBtn).click();
	}
	
	public static void clickSubmitButton() throws InterruptedException {
		$x(btnnext).click();
		 Thread.sleep(2000);
	}
	
	public void verifyNextButton(String buttonText) {
		// Check button icon
		$x(nextBtn).should(exist).shouldBe(visible);
		
		// Check button text
		
		Assert.assertEquals("Next", 
				$x(nextBtn).text().trim(), buttonText.trim());
	}

	public void verifyCancelButton(String buttonText) {
		// Check button icon
		$x(cancelBtn).should(exist).shouldBe(visible);
		
		// Check button text
		
		Assert.assertEquals("Back", 
				$x(cancelBtn).text().trim(), buttonText.trim());
	}
	
	//first name 
	
	public void verifyFirstnameLabel() {
		$x(lblFullname).should(exist).shouldBe(visible);
	}

	public void verifyFirstnameLabelText(String firstname) {
		Assert.assertTrue("First Name",
				$x(lblFullname).text().trim().contains(firstname.trim()));
	}
	public void verifyFirstnameTextbox() {
		$x(txtFullname).should(exist).shouldBe(visible);
	}
	public static void setFirstnameText(String text) {
		$x(txtFullname).setValue(text);
	}

	public void verifyFirstnameValidationMessage(String msg) {
		$x(errorFullname).should(exist).shouldBe(visible);
		Assert.assertEquals("Full Name must be at least 3 characters",
				$x(errorFullname).text().trim(), msg.trim());
	}
	
	//Email Address
	
	public void verifyEmailLabel() {
		$x(lblEmail).should(exist).shouldBe(visible);
	}

	public void verifyEmailLabelText(String firstname) {
		Assert.assertTrue("Email address",
				$x(lblEmail).text().trim().contains(firstname.trim()));
	}
	public void verifyEmailTextbox() {
		$x(txtEmailaddress).should(exist).shouldBe(visible);
	}
	public static void setEmailText(String text) {
		$x(txtEmailaddress).setValue(text);
	}

	public void verifyEmailValidationMessage(String msg) {
		$x(errorEmailaddress).should(exist).shouldBe(visible);
		Assert.assertEquals("Please enter a valid email address",
				$x(errorEmailaddress).text().trim(), msg.trim());
	}
	
	//User name 
	
	public void verifyUsernameLabel() {
		$x(lblUsername).should(exist).shouldBe(visible);
	}

	public void verifyUsernameLabelText(String firstname) {
		Assert.assertTrue("Username",
				$x(lblUsername).text().trim().contains(firstname.trim()));
	}
	public void verifyUsernameTextbox() {
		$x(txtUsername).should(exist).shouldBe(visible);
	}
	public static void setUsernameText(String text) {
		$x(txtUsername).setValue(text);
	}

	public void verifyUsernameValidationMessage(String msg) {
		$x(errorEmailaddress).should(exist).shouldBe(visible);
		Assert.assertEquals("Username must be at least 3 characters",
				$x(errorUsername).text().trim(), msg.trim());
	}
	
	//mobile number
	
	public void verifyMobNoLabel() {
		$x(lblMobilenumber).should(exist).shouldBe(visible);
	}

	public void verifyMobNoLabelText(String firstname) {
		Assert.assertTrue("Mobile number",
				$x(lblMobilenumber).text().trim().contains(firstname.trim()));
	}
	public void verifyMobNoTextbox() {
		$x(txtMobilenumber).should(exist).shouldBe(visible);
	}
	
	public void verifyMobNoTextboxdisabled()
	{
		$x(txtMobilenumber).should(exist).shouldBe(disabled);
	}
	
	//User Bio
	
	public void verifyUserbioLabel() {
		$x(lblUserbio).should(exist).shouldBe(visible);
	}

	public void verifyUserbioLabelText(String firstname) {
		Assert.assertTrue("User Bio",
				$x(lblUserbio).text().trim().contains(firstname.trim()));
	}
	public void verifyUserbioTextbox() {
		$x(txtUserbio).should(exist).shouldBe(visible);
	}

	public static void userSelectsSuggestedTopicsRandomly()
	{
		int i;		
        ElementsCollection coll= $$(By.cssSelector("button.css-1qq5qpu"));
    	
		for(i=1;i<4;i++)
		{
        Random random = new Random();
		int index = random.nextInt(coll.size());
		coll.get(index).click(); 
		//ll.get(index).click(); 
		}

}

}