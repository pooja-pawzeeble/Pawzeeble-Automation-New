package pooja.cucumber.demo.pageObject.client;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.codeborne.selenide.ElementsCollection;

public class PetProfile {


	public static final String lblHeadingName = "//p[contains(@class,'css-1lc69kt')]";
	public static final String lblAddPet = "//p[contains(@class,'css-6ye8qf')]";
	public static final String lblPriPetParent = "//p[contains(@class,'css-41cdju')]";
	public static final String lblPetName = "//label[contains(@class,'css-uzkr03') and contains(text(),'Pet Name')]";
	public static final String lblPetUserName = "//label[contains(@class,'css-uzkr03') and contains(text(),'Pet Username')]";
	public static final String lblBirthDate = "//label[contains(@class,'css-uzkr03') and contains(text(),'Date of Birth ')]";
	public static final String lblAge = "//label[contains(@class,'css-uzkr03') and contains(text(),'Age ')]";
	public static final String lblAnimalType = "//label[contains(@class,'css-uzkr03') and contains(text(),'Animal ')]";
	public static final String lblGender = "//label[contains(@class,'css-uzkr03') and contains(text(),'Gender')]";
	public static final String lblPriBreed = "//label[contains(@class,'css-uzkr03') and contains(text(),'Primary Breed')]";
	public static final String lblSecBreed = "//label[contains(@class,'css-uzkr03') and contains(text(),'Secondary Breed')]";
	public static final String lblPetBio = "//label[contains(@class,'css-uzkr03') and contains(text(),'pet Bio')]";
	public static final String txtPetName = "//input[@id='name']";
	public static final String txtPetUserName = "//input[@id='username']";
	public static final String txtBirthdate = "//input[@id=':r38:']";
	public static final String txtAnimalType = "//input[@id=':r3a:']";
	public static final String txtPriBreed = "//input[@placeholder='primary breed']";
	public static final String txtSecBreed = "//input[@placeholder='secondary breed']";
	public static final String txtBio = "//textarea[@name='bio']";
	public static final String optFemale="//img[@alt='female']";
	public static final String optmale="//img[@alt='male']";
	public static final String btnCancel="//button[contains(@class,'css-1uod7k3')]";
	public static final String btnNext="	//button[contains(@class,'css-1bti7ya')]";
	public static final String btnSkip="//button[contains(@class,'css-n4taj4')]";
	public static final String SymolUploadImg="//div[@class='MuiBox-root css-t01zbk']//img";
	
	
	
	public void userProfileCreatedSuccessfully() throws InterruptedException
    {
		
		
  	$x(lblHeadingName).shouldBe(visible);
  	Thread.sleep(2000);
     }
	
//Heading 
	public void verifyHeadingText(String heading) {
		Assert.assertEquals($x(lblHeadingName).text().trim(),	heading.trim());
	}

	public void verifyHeadingDisplayed(String text) {
		$x(lblHeadingName).should(exist).shouldBe(visible).shouldHave(partialText(text));
    }


//pet name 
   public void verifyPetNameLabelText(String heading) {
	Assert.assertEquals( $x(lblPetName).text().trim(),	heading.trim());
     }

   public void verifyPetNameLabelDisplayed(String text) {
	$x(lblPetName).should(exist).shouldBe(visible).shouldHave(partialText(text));
    }
   public void setPetnameText(String text) {
		$x(txtPetName).setValue(text);
	}
//   public void verifyPetNameValidationMessage(String msg) {
//		$x(errorPetname).should(exist).shouldBe(visible);
//		Assert.assertEquals("Message-Full Name must be at least 3 characters",
//				$x(errorPetname).text().trim(), msg.trim());
//	}
//	

// Pet user name
   public void verifyPetUserNameLabelText(String heading) {
		Assert.assertEquals( $x(lblPetUserName).text().trim(),	heading.trim());
	     }

	   public void verifyPetUserNameLabelDisplayed(String text) {
		$x(lblPetUserName).should(exist).shouldBe(visible).shouldHave(partialText(text));
	    }
	   public void setUsernameText(String text) {
			$x(txtPetUserName).setValue(text);
		}
//	   public void verifyPetUserNameValidationMessage(String msg) {
//			$x(errorPetUsername).should(exist).shouldBe(visible);
//			Assert.assertEquals("Message-User Name must be at least 3 characters",
//					$x(errorPetUsername).text().trim(), msg.trim());
//		}
//		
 
// Pet Date of birth
	   public void verifyBirthdateLabelText(String heading) {
		   Assert.assertEquals( $x(lblBirthDate).text().trim(),	heading.trim());
		     }

	   public void verifyBirthdateLabelDisplayed(String text) {
			$x(lblBirthDate).should(exist).shouldBe(visible).shouldHave(partialText(text));
		    } 
	   public void setBirthdate(String text) {
			$x(txtBirthdate).setValue(text);
		}
// Age
	   public void verifyAgeLabelText(String heading) {
			Assert.assertEquals( $x(lblAge).text().trim(),	heading.trim());
			     }

	   public void verifyAgeLabelDisplayed(String text) {
				$x(lblAge).should(exist).shouldBe(visible).shouldHave(partialText(text));
			    }    
 //Animal Type
		public void verifyAnimalTypeLabelText(String heading) {
				Assert.assertEquals( $x(lblAnimalType).text().trim(),	heading.trim());
				}

		public void verifyAnimalTypeDisplayed(String text) {
				$x(lblAnimalType).should(exist).shouldBe(visible).shouldHave(partialText(text));
				  }
		public void setAnimalTypeText(String text) {
			$x(txtAnimalType).setValue(text);
		}
//Gender
		public void verifyGenderLabelText(String heading) {
				Assert.assertEquals( $x(lblGender).text().trim(),	heading.trim());
				 }

		public void verifyGenderLabelDisplayed(String text) {
				$x(lblGender).should(exist).shouldBe(visible).shouldHave(partialText(text));
				}
// Primary breed
		 public void verifyPriBreedLabelText(String heading) {
				Assert.assertEquals( $x(lblPriBreed).text().trim(),	heading.trim());
				 }

		 public void verifyPriBreedLabelDisplayed(String text) {
				$x(lblPriBreed).should(exist).shouldBe(visible).shouldHave(partialText(text));
				 }
		 public void setPriBreedText(String text) {
				$x(txtPriBreed).setValue(text);
			}
// Secondary breed
		 public void verifySecBreedLabelText(String heading) {
				Assert.assertEquals( $x(lblSecBreed).text().trim(),	heading.trim());
				 }

		 public void verifySecBreedLabelDisplayed(String text) {
				$x(lblSecBreed).should(exist).shouldBe(visible).shouldHave(partialText(text));
				 }
		 public void setSecBreedText(String text) {
				$x(txtSecBreed).setValue(text);
			}
// Pet Bio
		 public void verifyPetBioLabelText(String heading) {
				Assert.assertEquals( $x(lblPetBio).text().trim(),	heading.trim());
				 }

		 public void verifyPetBioLabelDisplayed(String text) {
				$x(lblPetBio).should(exist).shouldBe(visible).shouldHave(partialText(text));
				 }
		 public void setPetBioText(String text) {
				$x(txtBio).setValue(text);
			}
//button
		 public void clickCancelButton() {
				$x(btnCancel).click();
			}
			public void clickNextButton() {
				$x(btnNext).click();
			}
			
			public void clickSubmitButton() throws InterruptedException {
				$x(btnNext).click();
				 Thread.sleep(2000);
			}
			
			public void verifyNextButton(String buttonText) {
				// Check button icon
				$x(btnNext).should(exist).shouldBe(visible);
				
				// Check button text
				
				Assert.assertEquals($x(btnNext).text().trim(), buttonText.trim());
			}

			public void verifyCancelButton(String buttonText) {
				// Check button icon
				$x(btnCancel).should(exist).shouldBe(visible);
				
				// Check button text
				
				Assert.assertEquals($x(btnCancel).text().trim(), buttonText.trim());
			}
	//Skip		
			public void verifySkipButton(String buttonText) {
				// Check button icon
				$x(btnSkip).should(exist).shouldBe(visible);
			}
			public void clickSkipButton() {
				$x(btnSkip).click();
			}
//select gender randomly
			
			public void userSelectGenderRandomly()
			{
					
		        ElementsCollection coll= $$(By.cssSelector("span:has(div.css-0)"));
		    	
		        Random random = new Random();
				int index = random.nextInt(coll.size());
				coll.get(index).click(); 
				
		
			}
}
