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


	public final String lblHeading = "//p[contains(@class,'css-ftzbya')]";
	public final String lblFullname ="//label[contains(text(),'First Name')]";
	public final String txtFullname = "//input[@id='fullName']"; 
	public final String errorFullname="//p[contains(text(),'Full Name must be at least 3 characters')]";
	public final String lblEmail ="//label[contains(text(),'Email address')]";
	public final String txtEmailaddress = "//input[@name='email']";
	public final String errorEmailaddress="//p[contains(@class,'css-1yhc7zx')]";
	public final String lblMobilenumber = "//label[contains(text(),'Mobile number')]";
	public final String txtMobilenumber = "//input[contains(@class,'css-4a8g6')]";
	public final String lblUsername = "//label[contains(text(),'username')]";
	public final String txtUsername = "//input[@name='username']";
	public final String errorUsername="//p[contains(text(),'Username must be at least 3 characters')]";
	
	public final String lblUserbio = "//label[contains(text(),'User Bio')]";
	public final String txtUserbio = "//textarea[@name='bio']";
	public final String cancelBtn = "//button[contains(text(),'Cancel')]";
	public final String nextBtn = "//button[contains(text(),'Next')]";
	
	public final String lbltopic = "//p[contains(@class,'css-310v7p')]";
	public final String lblinfo = "//p[contains(@class,'css-18b0rdw')]";
	public final String lblselecttopic ="//label[contains(@class,'css-m94bag')]";
	public final String dropdwnselecttopic = "//div[contains(@class,'css-19bb58m')]";
	public final String lblmessage="//p[contains(text(),'Array must contain at least 3 element(s)')]";
	public final String lblsuggestedtop = "//p[contains(text(),'Suggested Topics')]";
	public final String lblsuggestedtop1 = "//button[contains(text(),'Education')]";
	public final String lblsuggestedtop2= "//button[contains(text(),'Health')]";
	public final String lblsuggestedtop3= "//button[contains(text(),'Environment')]";
	public final String lblsuggestedtop4= "//button[contains(text(),'Animals')]";
	public final String btncancel="//button[contains(@class,'css-6s7pno')]";
	public final String btnnext="//button[contains(@class,'css-1otgy7v')]";
	
	//Headings
	public void verifyPageHeadingText(String heading) {
		Assert.assertEquals("Please fill Personal details", 
				$x(lblHeading).text().trim(),	heading.trim());
	}

	public void verifyPageHeadingDisplayed() {
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
	public void clickNextButton() {
		$x(nextBtn).click();
	}
	
	public void clickSubmitButton() throws InterruptedException {
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
	public void setFirstnameText(String text) {
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
	public void setEmailText(String text) {
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
	public void setUsernameText(String text) {
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

	public void userSelectsSuggestedTopicsRandomly()
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