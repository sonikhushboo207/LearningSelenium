import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\ChromeWebDriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.findElement(By.linkText("Images")).click();
        
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("Hello Java");
        searchbox.sendKeys(Keys.ENTER);
        
        driver.manage().window().minimize();
		
		
		
	}
		
		
		
		
		
	

}
