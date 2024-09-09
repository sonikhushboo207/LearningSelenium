import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class third {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\\\ChromeWebDriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,4500)");
	}

}
