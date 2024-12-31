package com.lmsbiomagnetism.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmsbiomagnetism.Base.BaseClass;
import com.lmsbiomagnetism.actiondriver.Action;

public class Sales_Page extends BaseClass{
	@FindBy(xpath="(//a[text()=\"FAQs\" ])[1]]")
	WebElement FaqLink;

	@FindBy(xpath="(//a[text()=\"Testimonials\"])[1]\r\n"
			+ "")
	WebElement testimonialLink ;

	@FindBy(xpath="(//a[text()=\"Program\"])[1]\r\n"
			+ "")
	WebElement programLink;
	
	
	@FindBy(xpath="(//a[text()=\"About\"])[1]\r\n"
			+ "")
	WebElement aboutLink;

	@FindBy(xpath="//span[text()=\"YES! Get Me Started Now\"]")
	WebElement yes_Get_Me_Started_Now;

	
	@FindBy(xpath="(//span[text()=\"GET STARTED TODAY\"])[1]")
	WebElement Get_Me_Started_Today1;

	@FindBy(xpath="(//span[text()=\"GET STARTED TODAY\"])[2]")
	WebElement Get_Me_Started_Today2;
	
	@FindBy(xpath="(//span[text()=\"GET STARTED TODAY\"])[3]")
	WebElement Get_Me_Started_Today3;
	
	@FindBy(xpath="(//span[text() ='Add to cart']/ancestor:: a[@data-amount=\\\"796\\\" and  @data-term=\\\"0\\\"]")
	WebElement Full_Payment$796;
	
	@FindBy(xpath="//span [text() = \\\"Add to cart\\\"]/ancestor::a[@data-amount=\\\"133\\\" and @data-term=\\\"6\\\"]")
	WebElement Split_Payment$133;
	
	
	@FindBy(xpath="//div[text()=\" Is Biomagnetism Therapy safe?\"]\r\n"
			+ "")
	WebElement Faq1;
	@FindBy(xpath="//div[text()=\" Will I receive support during and after the seminar?\"]\r\n"
			+ "")
	WebElement Faq2;
	@FindBy(xpath="//div[text()=\" What conditions can Biomagnetism Therapy address?\"]\r\n"
			+ "")
	WebElement Faq3;
	@FindBy(xpath="//div[text()=\" Does Biomagnetism Therapy require special equipment?\"]\r\n"
			+ "")
	WebElement Faq4;
	@FindBy(xpath="//div[text()=\" Can Biomagnetism be combined with other therapies?\"]\r\n"
			+ "")
	WebElement Faq5;
	@FindBy(xpath="//div[text()=\" Is there a certification upon completing the seminar?\"]\r\n"
			+ "")
	WebElement Faq6;
	@FindBy(xpath="//div[text()=\" Who can take a Biomagnetism Therapy course?\"]\r\n"
			+ "")
	WebElement Faq7;
	@FindBy(xpath="//div[text()=\" Can Biomagnetism Therapy be delivered by remote session?\"]\r\n"
			+ "")
	WebElement Faq8;
	@FindBy(xpath="//div[text()=\" How long does it take to complete a Dr. Garcia Biomagnetism Therapy course?\"]\r\n"
			+ "")
	WebElement Faq9;
	@FindBy(xpath="//div[text()=\" Which healing therapists can practice Biomagnetism Therapy?\"]")
	WebElement Faq10;
	
	@FindBy(xpath="//strong[text()=\"today for just \"]")
	WebElement onClickScrollTo_TodayForJust;
	
	@FindBy(xpath="//div[@class=\"uael-video__play-icon uael-animation-\"]")
	WebElement introVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[1]")
	WebElement monicaShinVideo;
	
	@FindBy(xpath="(//iframe[@class=\"elementor-video\"])[2]")
	WebElement chrisCrawfordVideo;
	
	@FindBy(xpath="(//iframe[@class=\"elementor-video\"])[3]")
	WebElement mimiBakerVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[4]")
	WebElement billBowlingVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[5]")
	WebElement NormaLarnerVideo;
	
	@FindBy(xpath="(//iframe[@class=\"elementor-video\"])[6]")
	WebElement IngridHeitschVideo;
	
	@FindBy(xpath="(//iframe[@class=\"elementor-video\"])[7]")
	WebElement SuzanneKerbyVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[8]")
	WebElement CarltonLewisVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[9]")
	WebElement TerryVinicianiVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[10]")
	WebElement DrMarkBreinerVideo;
	
	@FindBy(xpath=" (//iframe[@class=\"elementor-video\"])[12]\r\n"
			+ "")
	WebElement DrHenryVideo;
	
	
	
	
	
	public Sales_Page()
	{
		PageFactory.initElements(driver,this);
	}

	public void clickOnFaqLink()
	{ Action clickAction = new Action();
	clickAction.click(driver, FaqLink);
	
}
	public void clickOnprogramLink()
	{ Action clickAction = new Action();
	clickAction.click(driver, programLink);
}
	
	public void clickOnyes_Get_Me_Started_Now()
	{
		Action clickAction = new Action();
		clickAction.click(driver, yes_Get_Me_Started_Now);
	}
	public void clickOnFull_Payment$796()
	{
		Action clickAction = new Action();
		clickAction.click(driver, Full_Payment$796);
	}
	
	public void clickOnSplit_Payment$133()
	{
		Action clickAction = new Action();
		clickAction.click(driver, Split_Payment$133);
	}
}
