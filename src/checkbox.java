import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		
		//Instantiating WebDriver object
		WebDriver driver= new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 1000)");
		
		driver.findElement(By.xpath("//input[@value='Automation']")).click();
        Boolean b= driver.findElement(By.id("female")).isSelected();
        
        if(b.equals(false))
        {
        	driver.findElement(By.id("female")).click();
        
	}
	}
}
