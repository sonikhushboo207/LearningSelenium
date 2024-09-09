import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class movetoiframe {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		
		//Instantiating WebDriver object
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");

		//moving to the required iframe by index value
	    driver.switchTo().frame(0);
	    Thread.sleep(5000);
	    WebElement btn1= driver.findElement(By.xpath("//button[@data-dismiss='n']"));
		btn1.click();
		
	}

}
