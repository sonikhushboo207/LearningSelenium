package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.util.ImageTool;

public class AshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/policies_center/");
		
		//taking the screenshot
		Screenshot screenshot= new AShot().takeScreenshot(driver);
		
		
		//create a file to store the image/screenshot
		File image= new File("G:\\Eclispse Folder\\Khushboo Eclipse Workspace\\Demo_Test\\AShotImages\\Test.png");
		
		ImageIO.write(screenshot.getImage(), "png", image);
		//ImageIO.write(screenshot.getImage(),"png", image);
		
	}

}
