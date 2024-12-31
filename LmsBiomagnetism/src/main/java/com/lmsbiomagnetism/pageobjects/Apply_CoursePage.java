package com.lmsbiomagnetism.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmsbiomagnetism.Base.BaseClass;
import com.lmsbiomagnetism.actiondriver.Action;

public class Apply_CoursePage extends BaseClass {
	@FindBy(id="InputFirstName")
	WebElement firstName;
	
	@FindBy(id="InputLastName")
	WebElement lastName;
	
	@FindBy(id="InputEmail")
	WebElement email;
	
	@FindBy(xpath="//input[@class=\\\"form-control InputPhone\\\"]")
	WebElement contactNumber;
	
	@FindBy(xpath="//input[@class=\\\"form-control Dob \\\"]")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//input[@ placeholder=\\\"Enter Address details\\\"]")
	WebElement address;
	
	@FindBy(id="InputCountry")
	WebElement country;
	
	@FindBy(id="InputState")
	WebElement state;
	
	@FindBy(id="InputCity")
	WebElement city;
	
	@FindBy(id="InputPincode")
	WebElement pincode;
	
	@FindBy(name="biomagnetism_interest")
	WebElement biomagnetismInterest;
	
	@FindBy(id="hdyhauemail")
	WebElement email_checkBox;
	
	@FindBy(id="hdyhaufacebook")
	WebElement facebook_CheckBox;
	
	@FindBy(id="hdyhaugoogle")
	WebElement google_CheckBox;
	
	@FindBy(id="hdyhaufriend")
	WebElement friend_CheckBox;
	
	@FindBy(id="hdyhaueyoutube")
	WebElement youtube_CheckBox;
	
	@FindBy(id="hdyhauindustry")
	WebElement Industry_CheckBox;
	
	@FindBy(id="hdyhauusbiomag")
	WebElement drgaciabiomagnetism_CheckBox;
	
	@FindBy(id="hdyhauTwitter")
	WebElement twitter_CheckBox;
	
	@FindBy(id="hdyhautherapy")
	WebElement therapy_CheckBox;
	
	@FindBy(id="hdyhauemailother")
	WebElement other_CheckBox;
	
	@FindBy(id="Check1")
	WebElement i_Agree_CheckBox;
	
	@FindBy(xpath="//button[@class=\\\"close\\\"]")
	WebElement close_NotificationPopup;
	
	@FindBy(id="cardholderName")
	WebElement Owner_TextField;
	
	@FindBy(id="cvv")
	WebElement cvv_Textfield;
	
	@FindBy(id="cardNumber")
	WebElement cardNumber_TextField;
	
	@FindBy(id="expiration-month")
	WebElement expirationDate_Month_Dropdown;
	
	@FindBy(id="expiration-year")
	WebElement expirationDate_Year_Dropdown;
	
	@FindBy(xpath="//span[text()=\\\"SUBMIT PAYMENT\\\"]/parent::button")
	WebElement submitPayment_Button;
	
	@FindBy(id="InputPromocode")
	WebElement promoCode_TextField;
	
	
	public Apply_CoursePage()
	{
		PageFactory.initElements(driver,this);
	}

	public void enterFirstName()
	{ Action enterName = new  Action();
	enterName.selectBySendkeys("Raghuvansh",firstName);	
}

	public void enterLastName()
	{ Action enterName = new  Action();
	enterName.selectBySendkeys("Raman",lastName);	

}
	
	public void enterEmail()
	{ Action enterEmail = new  Action();
	enterEmail.selectBySendkeys("raghu22raman91@gmail.com",email);	
}
	
	public void click_EnterContactNumber()
	{ Action enterContactNumber = new  Action();
	enterContactNumber.click(driver, contactNumber);
	
	enterContactNumber.selectBySendkeys("8010519694",contactNumber);	
}
	
	public void select_DateofBirth()
	{ Action select_Dob = new  Action();
	select_Dob.selectBySendkeys("22081991",dateOfBirth);	
}
	
	public void enterAddress()
	{ Action enterAddress = new  Action();
	enterAddress.selectBySendkeys("Hsr Layout, near agara Temple",address);	
}
	
	public void select_Country()
	{ Action selectCountry = new  Action();
	selectCountry.selectByValue(country,"IN");	
}
	
	public void select_State()
	{ Action selectState = new  Action();
	selectState.selectByValue(state,"KA");	
}
	
	public void enter_City()
	{ Action enterCity = new  Action();
	enterCity.selectBySendkeys("Bangalore",city);	
}
	
	public void enter_pincode()
	{ Action enterpincode= new  Action();
	enterpincode.selectBySendkeys("560102",pincode);	
}
	
	public void clickOnfacebook_CheckBox()
	{ Action facebookCheckBox = new  Action();
	facebookCheckBox.click(driver,facebook_CheckBox);
	}
	
	public void clickOngoogle_CheckBox()
	{ Action googleCheckBox = new  Action();
	googleCheckBox.click(driver,google_CheckBox);
	}
	
	public void clickOnemail_checkBox()
	{ Action emailCheckBox = new  Action();
	emailCheckBox.click(driver,email_checkBox);
	}
	public void clickOnfriend_CheckBox()
	{ Action friendCheckBox = new  Action();
	friendCheckBox.click(driver,friend_CheckBox);
	}
	
	public void clickOnyoutube_CheckBox()
	{ Action youtubeCheckBox = new  Action();
	youtubeCheckBox.click(driver,youtube_CheckBox);
	}
	
	public void clickOnIndustry_CheckBox()
	{ Action IndustryCheckBox = new  Action();
	IndustryCheckBox.click(driver,Industry_CheckBox);
	}
	
	public void clickOndrgaciabiomagnetism_CheckBox()
	{ Action drgaciabiomagnetismCheckBox = new  Action();
	drgaciabiomagnetismCheckBox.click(driver,drgaciabiomagnetism_CheckBox);
	}
	
	public void clickOntwitter_CheckBox()
	{ Action twitterCheckBox = new  Action();
	twitterCheckBox.click(driver,twitter_CheckBox);
	}
	
	public void clickOntherapy_CheckBox()
	{ Action therapyCheckBox = new  Action();
	therapyCheckBox.click(driver,therapy_CheckBox);
	}
	
	public void clickOnother_CheckBox()
	{ Action otherCheckBox = new  Action();
	otherCheckBox.click(driver,other_CheckBox);
	}
	
	public void clickOni_Agree_CheckBox()
	{ Action iAgreeCheckBox = new  Action();
	iAgreeCheckBox.click(driver,i_Agree_CheckBox);
	}
}
