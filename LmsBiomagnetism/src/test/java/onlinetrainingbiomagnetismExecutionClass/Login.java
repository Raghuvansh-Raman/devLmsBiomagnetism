package onlinetrainingbiomagnetismExecutionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
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
		Thread.sleep(5000);
		 driver.quit();

	}

}
