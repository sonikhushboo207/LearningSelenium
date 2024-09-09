import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioncheckbox {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\ChromeWebDriver\\\\chromedriver-win64\\\\chromedriver.exe");
		
		//Creating an instance of webdriver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement we= driver.findElement(By.linkText("Senior Citizen"));
		we.click();
		
		}
		//driver.switchTo().alert().dismiss();
		//driver.findElement(null);
		
	}


