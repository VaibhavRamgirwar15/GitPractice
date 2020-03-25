package practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectLinks {

	public static void main(String[] args) {
		
		/*1. Creating webdriver instance*/
		System.setProperty("webdriver.chrome.driver", "/home/vaibhav/Browser_Driver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		System.out.println("Maximize the window..!!");
		
		/*2. Navigate to the url*/
		try {
		driver.get("http://www.google.com");
		System.out.println("Open Google page Succesfully");
		
		/*3. Applying implicit wait on webpage*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println("Totol links on Page:"+allLinks.size());
		}
		catch (Exception e) {
			System.out.println("Getting an Exeption"+e.getMessage());
		}
		/* 4. Closing Driver Instance. */
		driver.close();
	}

}
