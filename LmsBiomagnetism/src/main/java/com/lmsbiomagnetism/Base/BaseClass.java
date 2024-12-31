package com.lmsbiomagnetism.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.lmsbiomagnetism.utility.ExtentManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * BaseClass is used to load the config file and Initialize WebDriver
 */
public class BaseClass {
    public static Properties prop;
    public static WebDriver driver;
   

   

    // Load configuration
    @BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
    public void loadConfig() throws IOException {
        ExtentManager.setExtent();
        //DOMConfigurator.configure("log4j2.xml"); // Ensure log4j2.xml is configured

        try (FileInputStream ip = new FileInputStream(
                System.getProperty("user.dir") + "/Configuration/config.properties")) {
            prop = new Properties();
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    public void launchApp(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "ie":
                driver = new InternetExplorerDriver();
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }

        // Maximize the screen
        driver.manage().window().maximize();
        // Delete all cookies
        driver.manage().deleteAllCookies();
        // Implicit Timeouts
        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(Long.parseLong(prop.getProperty("implicitWait"))));
        // Page Load Timeouts
        driver.manage().timeouts().pageLoadTimeout(
                Duration.ofSeconds(Long.parseLong(prop.getProperty("pageLoadTimeOut"))));
        // Launching the URL
        driver.get(prop.getProperty("url"));
    }

    @AfterSuite(groups = { "Smoke", "Regression", "Sanity" })
    public void afterSuite() {
        ExtentManager.endReport();
        // Quit the driver to close all sessions
        if (driver != null) {
        	driver.quit();
        }
    }
}
