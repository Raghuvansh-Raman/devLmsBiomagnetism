package com.lmsbiomagnetism.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmsbiomagnetism.Base.BaseClass;
import com.lmsbiomagnetism.actiondriver.Action;

public class Welcome_Page extends BaseClass {
	
@FindBy(xpath="//span[text() =\"Training\"]")
WebElement TrainingDropDownLink;

@FindBy(xpath="//span[text() =\\\"Biomagnetism and Beyond Online Training\\\"]")
WebElement OnlineTrainingLink ;

@FindBy(xpath="(//span[text()=\"Login\"])[2]")
WebElement LoginButton;

public Welcome_Page()
{
	PageFactory.initElements(driver,this);
}

public void clickOntrainingDropDown()
{ Action clickAction = new Action();
clickAction.click(driver, TrainingDropDownLink);
}
public void clickOn_OnlineTrainingLink()
{
	Action clickAction = new Action();
	clickAction.click(driver, OnlineTrainingLink );
}
}