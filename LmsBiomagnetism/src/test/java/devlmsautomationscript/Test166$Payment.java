package devlmsautomationscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test166$Payment {

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
		String originalWindow = driver.getWindowHandle();
		System.out.println("Original Window Handle: " + originalWindow);
		driver.findElement(By.xpath("(//a[text()=\"Enroll Now\"])[1]")).click();
		Thread.sleep(5000);
		
		
		

		
		WebElement targetElementLocator1 = driver.findElement(By.xpath("//span [text() = \"Add to cart\"]/ancestor::a[@data-amount=\"133\" and @data-term=\"6\"]"));
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
            try {
                // Wait until the element is clickable
                 targetElementLocator1 = wait.until(ExpectedConditions.elementToBeClickable(targetElementLocator1));
                
                // If the element is found and clickable, break the loop
                if (targetElementLocator1.isDisplayed()) {
                	System.out.println("Text: " + targetElementLocator1.getText());
            		System.out.println("Displayed: " + targetElementLocator1.isDisplayed());
            		System.out.println("Enabled: " + targetElementLocator1.isEnabled());
                	targetElementLocator1.click(); // Click on the element
                	//js.executeScript("arguments[0].click()",targetElementLocator);
                    System.out.println("Element found and clicked!");
                    break;
                }
            } catch (Exception e) {
                // Scroll down by 500 pixels
                js.executeScript("window.scrollBy(0, 500);");
            }
           
	
	}
		
		 Set<String> allWindowHandles = driver.getWindowHandles();
         for (String windowHandle : allWindowHandles) {
             if (!windowHandle.equals(originalWindow)) {
                 driver.switchTo().window(windowHandle);
                 System.out.println("Switched to new tab: " + windowHandle);
	          break;
            }
            }
	                Thread.sleep(3000)   ; 
                
	                
	                    WebElement acceptButton = driver.findElement(By.xpath("//button[@class=\"btn__accept accept__btn__styles\"]"));
	                    acceptButton.click();
	               driver.findElement(By.xpath("//span[@style=\"color:white; font-size:22px; cursor:pointer\"]")).click();
	            
	            
	            // Perform actions on the new tab
	            System.out.println("New tab title: " + driver.getTitle());           
	          
	            

	}

}
