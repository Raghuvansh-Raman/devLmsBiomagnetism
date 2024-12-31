package devlmsautomationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkYESGetMeStartedNowButton_TC_03 {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement getMeStartedNow=driver.findElement(By.xpath("//span[text()=\"YES! Get Me Started Now\"]"));
		System.out.println(getMeStartedNow.isDisplayed()) ;
		System.out.println(getMeStartedNow.getText());
		 getMeStartedNow.click();
		Thread.sleep(5000);
		
		
		
		
		WebElement targetElementLocator = driver.findElement(By.xpath("//span[text() ='Add to cart']/ancestor:: a[@data-amount=\"796\" and  @data-term=\"0\"]"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
            try {
                 targetElementLocator = wait.until(ExpectedConditions.elementToBeClickable(targetElementLocator));
                
                // If the element is found and clickable, break the loop
                if (targetElementLocator.isDisplayed()) {
                	targetElementLocator.click(); // Click on the element
                	//js.executeScript("arguments[0].click()",targetElementLocator);
                    System.out.println("Element found and clicked!");
                    break;
                }
            } catch (Exception e) {
                // Scroll down by 1000 pixels
                js.executeScript("window.scrollBy(0, 1000);");
            }
           
	
	}
	}

}
