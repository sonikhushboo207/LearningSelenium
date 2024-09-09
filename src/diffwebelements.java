import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class diffwebelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		
		//Instantiating WebDriver object
		WebDriver driver= new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement testdropdown= driver.findElement(By.id("testingDropdown"));
		Select dropdown= new Select(testdropdown);
		
		dropdown.selectByIndex(2);
		String str= dropdown.getFirstSelectedOption().getText();
		System.out.println(str);
		
		dropdown.selectByValue("Performance");
		int n = dropdown.getAllSelectedOptions().size();
		System.out.println(n);
		
		dropdown.selectByVisibleText("Automation Testing");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		/*for(int i=0; i<=n; i++)
		{
			String str1= dropdown.getAllSelectedOptions().get(i).getText();
			System.out.println(str1);
		
		}*/

}
}
