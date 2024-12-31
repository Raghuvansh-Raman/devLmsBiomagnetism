package onlinetrainingbiomagnetismExecutionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://lmsreactfrontend.helenzysinc.com/");
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class ='profile']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"registerHere\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DevTestAccount");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("002");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("devtestAccount002@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"contact_number\"]")).sendKeys("1235658790");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("26081991");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Power@12345");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"confirm_password\"]")).sendKeys("Power@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"d-flex justify-content-end mt-3\"]/button[contains(text(),\"Next\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"address\"]")).sendKeys("Btm 2nd Stage");
		WebElement countryDropdown  = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select select = new Select(countryDropdown);
		select.selectByValue("IN");
		//Thread.sleep(2000);
		
		WebElement stateDropdown=driver.findElement(By.xpath("//select[@name=\"state\"]"));
		Select select1 = new Select(stateDropdown);
		select1.selectByValue("KA");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Bangalore");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("560076");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"d-flex justify-content-end mt-3\"]/button[@class=\"nextBtn btn btn-primary\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"twitter\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id=\"biomagnetism_interest\"]")).sendKeys("testing the application");
		//Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 100)"); 
	
		
		driver.findElement(By.xpath("//form[@id=\"registerForm\"]/div[@class=\"d-flex justify-content-end mt-3\"]/button[@class=\"nextBtn btn btn-primary\"]")).click();
	
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("devtestAccount002@gmail.com");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Power@12345");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='nextBtn']")).click();
		
		//driver.quit();
	}

}
