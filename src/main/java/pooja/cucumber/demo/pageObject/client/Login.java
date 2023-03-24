package pooja.cucumber.demo.pageObject.client;

public class Login {
	public final String lblHeading = "//p[contains(@class,'css-ohf6vn')]";
	public final String lblSubHeading = "//p[contains(@class,'css-pe526h')]";

	public final String lblPhoneNumber = "//label[contains(text(),'Mobile Number')]"; 
	public final String txtCountrycode = "//input[@value='+91']";
	public final String txtMobile = "//input[@name='mobile']";
	//public final String ckbRememberMe = "//div[@class='MuiBox-root css-1elmi5e']//input[@id='rememberMe']";
	//public final String lblRememberMe = "//div[@class='MuiBox-root css-1elmi5e']//p[contains(@class,'css-1sh9bn9')]";
	public final String btnSendOTP = "//button[contains(@class,'css-1dbujw9')]";
	public final String lblErrorMessage = "//div[@class='MuiBox-root css-m1ws16']//p";
	
	public final String lblHeadingOtp = "//p[contains(@class,'css-1q0squ4')]";
	public final String lblSubHeadingOtp = "//p[contains(@class,'css-1ovz3f9')]";
	public final String lblOtp= "//label[contains(@class,'css-qhtyrs')]";
	public final String btnVerifyOtp= "//button[contains(@class,'css-6h1xax' ) and contains(text(),'Verify OTP')]";
	
}

