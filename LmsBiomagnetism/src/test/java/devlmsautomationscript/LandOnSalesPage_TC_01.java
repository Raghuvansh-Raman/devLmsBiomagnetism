package devlmsautomationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandOnSalesPage_TC_01 {

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
		String title1 = driver.getTitle();
		System.out.println("sales Page Title:- "+ title1);
	}

}
