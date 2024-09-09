import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logintest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr544446");
		driver.findElement(By.name("password")).sendKeys("nutymem");
		driver.findElement(By.name("btnLogin")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.urlToBe("https://www.demo.guru99.com/V4/manager/Managerhomepage.php"));
		
		
		
		
		
		
		
		
		}
		
		

	}
