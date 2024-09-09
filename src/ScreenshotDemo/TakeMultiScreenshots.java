package ScreenshotDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeMultiScreenshots {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		//Take Screenshot of Login Screen initially
		captureScreenshot(driver, "loginpage");
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Take Screenshot
		captureScreenshot(driver, "username");
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Take Screenshot
		captureScreenshot(driver, "password");
		
		//Click Login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Enter HomePage, then take screenshot
		captureScreenshot(driver, "homepage");
		
	}
	
	public static void captureScreenshot(WebDriver driver, String filename)
	{
		//Instantiating the object of TakesScreenshot class
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		
		//taking screenshot and save it as a file at default location
		File image= screenshot.getScreenshotAs(OutputType.FILE);
		
		//creating a new target file
		File myFile= new File("G:\\Eclispse Folder\\Khushboo Eclipse Workspace\\Demo_Test\\Screenshots\\"+filename+".png");
		
		//moving the file to the target location
		try {
			FileUtils.copyFile(image, myFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
