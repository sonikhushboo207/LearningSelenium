
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// maximizing the browser window
	driver.manage().window().maximize();
	//Using get() method to open a webpage
    driver.get("https://artoftesting.com");
    
    //Closing the browser
    driver.quit();
	

	}

}
