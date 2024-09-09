//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby {

	public static void main(String[] args) {
		//setting the connection with chromedriver
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		
		//Instantiating the webdriver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 4500)");
		
		
		

	}

}
