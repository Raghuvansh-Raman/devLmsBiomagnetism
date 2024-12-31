package onlinetrainingbiomagnetismExecutionClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://lmsreactfrontend.helenzysinc.com/");
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		driver1.get("https://lmsreactfrontend.helenzysinc.com/");
		System.out.println(driver1.getCurrentUrl());
		String title1 = driver1.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		 driver.quit();
		 driver1.quit();
	
	}
}
