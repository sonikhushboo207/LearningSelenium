package ScreenshotDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		
		//taking screenshot
		File file= screenshot.getScreenshotAs(OutputType.FILE);
		
		//creating a new reference variable of File type for storing screenshot file 
		File image=new File("G:\\Eclispse Folder\\Khushboo Eclipse Workspace\\Demo_Test\\Screenshots\\Image1.png");
		
		//copy screenshot from source to the target file
		FileUtils.copyFile(file, image);
		
	}

}
