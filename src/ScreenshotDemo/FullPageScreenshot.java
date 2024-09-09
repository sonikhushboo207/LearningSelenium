package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullPageScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/policies_center/");
		
		//taking the screenshot
		Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		//create a file to store the image/screenshot
		File imageFullPage= new File("G:\\Eclispse Folder\\Khushboo Eclipse Workspace\\Demo_Test\\AShotImages\\Test.png");
		
		try {
			ImageIO.write(screenshot.getImage(), "png", imageFullPage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ImageIO.write(screenshot.getImage(),"png", image);
	}

}
