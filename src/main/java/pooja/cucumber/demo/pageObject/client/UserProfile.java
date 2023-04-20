package pooja.cucumber.demo.pageObject.client;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class UserProfile {
	
	public static final String lblUserName = "//p[contains(@class,'css-1or58sj')]";
	public static final String BtnAddPet = "//img[@alt='add pet']";
//	public final String lblFullname = "//p[contains(@class,'css-1ffir3u')]";
//	
//	public final String lblUserBio ="//p[contains(@class,'css-8rgzhr')]//b[@class='MuiBox-root css-0']";
//	
	public void userLoginSuccessfully() 
	{
		$x(lblUserName).shouldBe(visible);
	}
}
