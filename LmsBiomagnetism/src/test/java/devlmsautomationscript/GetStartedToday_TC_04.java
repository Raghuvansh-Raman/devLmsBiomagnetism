package devlmsautomationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetStartedToday_TC_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://dev.drgarciabiomagnetism.com/");
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		
		// hover the cursor on training drop down
		
		driver.findElement(By.xpath("//span[text() =\"Training\"]")).click();
		driver.findElement(By.xpath("//span[text() =\"Biomagnetism and Beyond Online Training\"]")).click();
		WebElement getMeStartedNow=driver.findElement(By.xpath("(//span[text()=\"GET STARTED TODAY\"])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			while (true) {
	            try {
	                // Wait until the element is clickable
	            	getMeStartedNow = wait.until(ExpectedConditions.elementToBeClickable(getMeStartedNow));
	                
	                // If the element is found and clickable, break the loop
	                if (getMeStartedNow.isDisplayed()) {
	                	System.out.println("Text: " + getMeStartedNow.getText());
	            		System.out.println("Displayed: " + getMeStartedNow.isDisplayed());
	            		System.out.println("Enabled: " + getMeStartedNow.isEnabled());
	            		getMeStartedNow.click(); // Click on the element
	                	//js.executeScript("arguments[0].click()",targetElementLocator);
	                    System.out.println("Element found and clicked!");
	                    break;
	                }
	            } catch (Exception e) {
	                // Scroll down by 500 pixels
	                js.executeScript("window.scrollBy(0, 500);");
	            }
	           
		
		}
		}
		
		Thread.sleep(5000);
		
		WebElement blackFriday =driver.findElement(By.xpath("//img[@alt=\"Black Friday\"]"));
		blackFriday.isDisplayed();
		blackFriday.getText();
		
WebElement targetElementLocator = driver.findElement(By.xpath("//span[text() ='Add to cart']/ancestor:: a[@data-amount=\"796\" and  @data-term=\"0\"]"));
		
		//WebElement targetElementLocator = driver.findElement(By.xpath("//div[text() = \" Is Biomagnetism Therapy safe?\"]"));
		
		
		}

	}


