package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementTest {
	static WebDriver driver; 
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shreejith\\workspace\\learn\\browserdrivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		
		driver.get("https://gir.qedata.io/#!/login");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("bbd_id")).clear();
		driver.findElement(By.id("bbd_id")).sendKeys("4506449490038840");
		driver.findElement(By.cssSelector("#main-content > div > div.col-sm-4.col-sm-push-4.login-form > form > div > button > span")).click();
				
		//Select Searchby = new Select(driver.findElement(By.className("md-select-value")));
		//Searchby.selectByVisibleText("User Group");
		
		driver.findElement(By.id("ems-activity-inputField-SearchCriteria")).sendKeys("12332155");
		driver.quit();
	}

}
