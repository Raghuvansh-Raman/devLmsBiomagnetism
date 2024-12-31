package onlinetrainingbiomagnetismExecutionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateToWatchVideoPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//devtestAccount@gmail.com
		// password :- Power@12345
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://lmsreactfrontend.helenzysinc.com/");
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class ='profile']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Raghuvanshraman@vmokshagroup.com");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Power@1234");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='nextBtn']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[@class=\"my_cardHeading\"]")).click();
		//Thread.sleep(5000);
		WebElement targetElementLocator = driver.findElement(By.xpath("//h6[text() =\"Putting it All Together and Getting Started\"]"));
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
		Thread.sleep(5000);
		driver.quit();
		
	}

}
