package pooja.cucumber.demo.tests.stepDefinations.user;

import io.cucumber.java.en.*;
import pooja.cucumber.demo.pageObject.client.HomePage;
import pooja.cucumber.demo.pageObject.client.Location;

public class LocationTests {
	
	Location lo= new Location();
	HomePage hp = new HomePage();
	
	@When("^User clicks on Location button$")
    public void user_clicks_on_location_button() throws Throwable {
      lo.clickLocationBtn();
    }

    @Then("^User can see heading message \"([^\"]*)\" on location screen$")
    public void user_can_see_heading_message_something_on_location_screen(String strArg1) throws Throwable {
     lo.verifyHeadingDisplayed(strArg1);
     lo.verifyHeadingMsg(strArg1);
    }

    @And("^User can see input location textbox$")
    public void user_can_see_input_location_textbox() throws Throwable {
     lo.verifyIpLocationTxtboxDisplayed();
    }

    @And("^User can see Locate me button$")
    public void user_can_see_locate_me_button() throws Throwable {
       lo.verifyLocateMeBtn();
    }
    
    @Then("^User can see location is set successfully on homepage$")
    public void user_can_see_location_is_set_successfully_on_homepage() throws Throwable {
      hp.verifyJoinPawzeebleButton();
      Thread.sleep(2000);
    }

    @And("^User enter location as (.+) on location screen$")
    public void user_enter_location_as_on_location_screen(String location) throws Throwable {
       lo.setIpLocation(location);
     
    }

    @And("^User selects location from dropdown listz$")
    public void user_selects_location_from_dropdown_listz() throws Throwable {
      lo.SelectLocation();
     
    }
}
