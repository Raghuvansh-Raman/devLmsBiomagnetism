package onlinetrainingbiomagnetismExecutionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisteredUserCoursePurchased {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://lmsreactfrontend.helenzysinc.com/");
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class ='profile']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("devtestAccount@gmail.com");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Power@12345");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='nextBtn']")).click();
		
		WebElement targetElementLocator = driver.findElement(By.xpath ("//button[text() =\"Buy for $\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
            try {
                // Wait until the element is clickable
                 targetElementLocator = wait.until(ExpectedConditions.elementToBeClickable(targetElementLocator));
                
                // If the element is found and clickable, break the loop
                if (targetElementLocator.isDisplayed()) {
                	targetElementLocator.click(); // Click on the element
                    System.out.println("Element found and clicked!");
                    break;
                }
            } catch (Exception e) {
                // Scroll down by 500 pixels
                js.executeScript("window.scrollBy(0, 500);");
            }
           
	
	}
		
		WebElement targetElementLocator2 = driver.findElement(By.xpath ("//input[@name=\"agree\" ]"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		while (true) {
            try {
                // Wait until the element is clickable
                 targetElementLocator2 = wait2.until(ExpectedConditions.elementToBeClickable(targetElementLocator2));
                
                // If the element is found and clickable, break the loop
                if (targetElementLocator2.isDisplayed()) {
                	targetElementLocator2.click(); // Click on the element
                    System.out.println("Element found and clicked!");
                    break;
                }
            } catch (Exception e) {
                // Scroll down by 500 pixels
                jse.executeScript("window.scrollBy(0, 500);");
            }
           
	
	}
		//Thread.sleep(2000);
		WebElement targetElementLocator3 = driver.findElement(By.xpath ("//button[@id=\"purchaseSubmit\"]"));	
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		while (true) {
            try {
                // Wait until the element is clickable
                 targetElementLocator3 = wait3.until(ExpectedConditions.elementToBeClickable(targetElementLocator3));
                
                // If the element is found and clickable, break the loop
                if (targetElementLocator3.isDisplayed()) {
                	targetElementLocator3.click(); // Click on the element
                    System.out.println("Element found and clicked!");
                    break;
                }
            } catch (Exception e) {
                // Scroll down by 500 pixels
                jse1.executeScript("window.scrollBy(0, 100);");
            }
           
	
	}
		driver.findElement(By.xpath ("//input[@id=\"cardNumber\"]")).sendKeys("4242424242424242");	
		driver.findElement(By.xpath ("//input[@id=\"cvv\"]")).sendKeys("123");	
		
		  WebElement monthDropdown = driver.findElement(By.id("expirationMonth")); 
          Select selectMonth = new Select(monthDropdown);
          selectMonth.selectByVisibleText("Mar");  

          // Locate the year drop down by its element
          
          WebElement yearDropdown = driver.findElement(By.id("expirationYear"));  
          Select selectYear = new Select(yearDropdown);
          selectYear.selectByVisibleText("2030");  

          // Print selected values to verify
          
          System.out.println("Selected Month: " + selectMonth.getFirstSelectedOption().getText());
          System.out.println("Selected Year: " + selectYear.getFirstSelectedOption().getText());
          new WebDriverWait(driver, Duration.ofMinutes(1)).until(
        		    webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete")
        		);
          //Thread.sleep(10000);
          
         // driver.findElement(By.xpath ("//div[@class=\"recaptcha-checkbox-border\"]")).click();	
          
          driver.findElement(By.xpath ("//button[text() = \"Confirm Payment\"]")).click();	
          Thread.sleep(5000);
          
		driver.quit();
	}

}
