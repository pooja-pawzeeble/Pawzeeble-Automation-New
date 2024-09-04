package pooja.cucumber.demo.pageObject.client;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Location {
	public static final String locBtn = "//button[contains(@class,'css-17ej51l')]";
	public static final String lblocation ="//p[contains(@class,'css-klozxl')]";
	public static final String locInput = "//input[@id=':r0:']";
	public static final String BtnLocateme ="//button[contains(@class,'css-1k9z99v')]";
	
	public void clickLocationBtn() {
		$x(locBtn).click();
	}
	
	public void clickLocateMeBtn() {
		$x(BtnLocateme).click();
	}
	
	public void clickIpLocationTxtbox() {
		$x(locInput).click();
	}
	
//heading label	
	public void verifyHeadingMsg(String heading) {
		Assert.assertEquals("Heading message is incorrect", 
				$x(lblocation).text().trim(),	heading.trim());
	}

	public void verifyHeadingDisplayed(String text) {
		$x(lblocation).should(exist).shouldBe(visible).shouldHave(partialText(text));
	}
	
	public void verifyIpLocationTxtboxDisplayed() {
		$x(locInput).should(exist).shouldBe(visible);
	}
	
	public void verifyLocateMeBtn() {
		$x(BtnLocateme).should(exist).shouldBe(visible);
	}
	
	public void setIpLocation(String loc) { // number in examples
		$x(locInput).setValue(loc).val(loc.trim());
	}
	
	public void SelectLocation()
	{
		ElementsCollection coll= $$(By.cssSelector("input[id=':r0:']"));
    	
    	for(SelenideElement e:coll)
    	{
    		String text= e.getText();
    		if(text.equals("Pune, Maharashtra, India"))
    		{
    		e.click();
    		break;
    		}
    		
    	}	
	}
	
}
