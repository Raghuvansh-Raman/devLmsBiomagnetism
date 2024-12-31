package devlmsautomationscript;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_TC_06 {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Application
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
		driver.findElement(By.xpath("(//a[text()=\"Enroll Now\"])[1]")).click();
		Thread.sleep(5000);
		
		
		
		String originalWindow = driver.getWindowHandle();
		System.out.println("Original Window Handle: " + originalWindow);
		
		WebElement targetElementLocator = driver.findElement(By.xpath("//span[text() ='Add to cart']/ancestor:: a[@data-amount=\"796\" and  @data-term=\"0\"]"));
		
		//WebElement targetElementLocator = driver.findElement(By.xpath("//div[text() = \" Is Biomagnetism Therapy safe?\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
            try {
                // Wait until the element is clickable
                 targetElementLocator = wait.until(ExpectedConditions.elementToBeClickable(targetElementLocator));
                
                // If the element is found and clickable, break the loop
                if (targetElementLocator.isDisplayed()) {
                	System.out.println("Text: " + targetElementLocator.getText());
            		System.out.println("Displayed: " + targetElementLocator.isDisplayed());
            		System.out.println("Enabled: " + targetElementLocator.isEnabled());
                	targetElementLocator.click(); // Click on the element
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
	            
//	            driver.switchTo().window(originalWindow );
	          
	            driver.findElement(By.id("InputFirstName")).sendKeys("ramanaa Testting");
	            driver.findElement(By.id("InputLastName")).sendKeys("Account");
	            driver.findElement(By.id("InputEmail")).sendKeys("testingraghu10@gmail.com");
	           
	            driver.findElement(By.xpath("//input[@class=\"form-control InputPhone\"]")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//input[@class=\"form-control InputPhone\"]")).sendKeys("9875326589");
	            driver.findElement(By.xpath("//input[@class=\"form-control Dob \"]")).sendKeys("06082004");
	            driver.findElement(By.xpath("//input[@ placeholder=\"Enter Address details\"]")).sendKeys("church street");
	            WebElement countryDropdown  = driver.findElement(By.id("InputCountry"));
	    		Select select = new Select(countryDropdown);
	    		select.selectByValue("IN");
	    		 WebElement stateDropdown  = driver.findElement(By.id("InputState"));	
		    		Select selectstate = new Select(stateDropdown);
		    		selectstate.selectByValue("KA");
	            driver.findElement(By.id("InputCity")).sendKeys("BANGALORE");
	            driver.findElement(By.id("InputPincode")).sendKeys("6589-5689");
	            
	            WebElement targetElementLocator4 = driver.findElement(By.name("biomagnetism_interest"));
	            WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    		JavascriptExecutor js4 = (JavascriptExecutor) driver;
	    		while (true) {
	                try {
	                    // Wait until the element is clickable
	                     targetElementLocator4 = wait4.until(ExpectedConditions.elementToBeClickable(targetElementLocator4));
	                    
	                    // If the element is found and clickable, break the loop
	                    if (targetElementLocator4.isDisplayed()) {
	                    	//System.out.println("Text: " + targetElementLocator2.getText());
	                		//System.out.println("Displayed: " + targetElementLocator2.isDisplayed());
	                	//	System.out.println("Enabled: " + targetElementLocator2.isEnabled());
	                    	targetElementLocator4.click(); // Click on the element
	                    	//js2.executeScript("arguments[0].click()",targetElementLocator2);
	                        System.out.println("Element found and clicked!");
	                        break;
	                    }
	                } catch (Exception e) {
	                    // Scroll down by 500 pixels
	                    js4.executeScript("window.scrollBy(0, 200);");
	                }
	               
	    	
	    	}

	            driver.findElement(By.id("hdyhauemail")).click();
	            driver.findElement(By.id("hdyhaufacebook")).click();
	            driver.findElement(By.id("hdyhaugoogle")).click();
	            driver.findElement(By.id("hdyhaufriend")).click();
	            driver.findElement(By.id("hdyhaueyoutube")).click();
	            driver.findElement(By.id("hdyhauindustry")).click();
	            driver.findElement(By.id("hdyhauusbiomag")).click();	     
	            driver.findElement(By.id("hdyhauTwitter")).click();

	            driver.findElement(By.id("hdyhautherapy")).click();
	            driver.findElement(By.id("hdyhauemailother")).click();
	            driver.findElement(By.name("biomagnetism_interest")).sendKeys("Testing $995Payment with discount");
	            
	            WebElement targetElementLocator2 = driver.findElement(By.id("Check1"));

	           // (//label[contains(text(),'I Agree with The')])[1]
	    		
	    		
	    		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
	    		while (true) {
	                try {
	                    // Wait until the element is clickable
	                     targetElementLocator2 = wait2.until(ExpectedConditions.elementToBeClickable(targetElementLocator2));
	                    
	                    // If the element is found and clickable, break the loop
	                    if (targetElementLocator2.isDisplayed()) {
	                    	//System.out.println("Text: " + targetElementLocator2.getText());
	                		////System.out.println("Displayed: " + targetElementLocator2.isDisplayed());
	                		System.out.println("Enabled: " + targetElementLocator2.isEnabled());
	                    	targetElementLocator2.click(); // Click on the element
	                    	//js2.executeScript("arguments[0].click()",targetElementLocator2);
	                        System.out.println("Element found and clicked!");
	                        break;
	                    }
	                } catch (Exception e) {
	                    // Scroll down by 500 pixels
	                    jse3.executeScript("window.scrollBy(0, 200);");
	                }
	               
	    	
	    	}
	            
	           System.out.println("User Registered Successfully");
	           Thread.sleep(2000);
	           
	           String expectedText ="Registration successful! We emailed your credentials. Please check.";
	           System.out.println(expectedText);
	    String actualText   =    driver.findElement(By.xpath("//strong[text() = \"Registration successful! We emailed your credentials. Please check.\"]")).getText();
	           
	            if (expectedText.equals( actualText)== true)
	            { 
	            	System.out.println("The Expected notification matches the Actual Notification");

	            }

	            
	      WebElement closeNotificationPopup = driver.findElement(By.xpath("//button[@class=\"close\"]"));
	      
	      closeNotificationPopup.click();
	      
  		WebElement targetElementLocator3 = driver.findElement(By.id("cardholderName"));

          WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
  		JavascriptExecutor js3 = (JavascriptExecutor) driver;
  		while (true) {
              try {
                  // Wait until the element is clickable
                   targetElementLocator3 = wait3.until(ExpectedConditions.elementToBeClickable(targetElementLocator3));
                  
                  // If the element is found and clickable, break the loop
                   
                  if (targetElementLocator3.isDisplayed()) {
                  	//System.out.println("Text: " + targetElementLocator.getText());
              		//System.out.println("Displayed: " + targetElementLocator.isDisplayed());
              		//System.out.println("Enabled: " + targetElementLocator.isEnabled());
                	  
                  	targetElementLocator3.click(); // Click on the element
                  	
                  	//js.executeScript("arguments[0].click()",targetElementLocator);
                  	
                      System.out.println("Element found and clicked!");
                      break;
                  }
              } catch (Exception e) {
                  // Scroll down by 500 pixels
                  js3.executeScript("window.scrollBy(0, 500);");
              }
             
  	
  	}
          
  		targetElementLocator3.sendKeys("RaghubTest Account");
          driver.findElement(By.id("cvv")).sendKeys("123");
          driver.findElement(By.id("cardNumber")).sendKeys("4111111111111111");
          
          WebElement monthDropdown  = driver.findElement(By.id("expiration-month"));
  		Select selectmonth = new Select(monthDropdown);
  		selectmonth.selectByValue("04");
  		
  	  WebElement yearDropdown  = driver.findElement(By.id("expiration-year"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByValue("2030");
  		
		WebElement targetElementLocator5 = driver.findElement(By.id("InputPromocode"));

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		while (true) {
            try {
                targetElementLocator5 = wait5.until(ExpectedConditions.elementToBeClickable(targetElementLocator5));
                if (targetElementLocator5.isDisplayed()) {
                	targetElementLocator5.click();
                	 System.out.println("Element found and clicked!");
                     break;
                }
            } catch (Exception e) {
                // Scroll down by 500 pixels
                js5.executeScript("window.scrollBy(0, 500);");
            }
           
	
	}
        	
		//targetElementLocator5.sendKeys("BIOMAG10OFF")  ;
		//driver.findElement(By.id("InputApplypromocode")).click();
		
		  new WebDriverWait(driver, Duration.ofMinutes(1)).until(
      	    webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete")
      		);
		  
		  WebElement targetElementLocator6 = driver.findElement(By.xpath("//span[text()=\"SUBMIT PAYMENT\"]/parent::button"));

	        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			while (true) {
	            try {
	                targetElementLocator6 = wait6.until(ExpectedConditions.elementToBeClickable(targetElementLocator6));
	                if (targetElementLocator6.isDisplayed()) {
	                	targetElementLocator6.click();
	                	 //System.out.println("Element found and clicked!");
	                     break;
	                }
	            } catch (Exception e) {
	                // Scroll down by 500 pixels
	                js6.executeScript("window.scrollBy(0, 500);");
	            }
	           
		
		}

	}

}
