package pooja.cucumber.demo.pageObject.client;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

//import org.junit.Assert;

public class HomePage {
	//public final String menuLogin = "//div[@class='MuiBox-root css-1t7ej7c']//*[@data-testid='LoginIcon']";
	public static final String menuLogin = "//img[@alt='avatar']";// login icon on top right 
	
	public static void clickJoinPawzeebleButton() {
		$x(menuLogin).click();
	}
	
	public void verifyJoinPawzeebleButton() {
		// Check button icon
		$x(menuLogin).should(exist).shouldBe(visible);
		
		// Check button text
		
//		Assert.assertEquals("Join Pawzeeble", 
//				$x(menuLogin).text().trim(), buttonText.trim());
	}
}
