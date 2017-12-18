package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\Shreejith\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://ems4.qedata.io/login");
		System.out.println("Webpage was succesfully opened");
		
		
		driver.findElement(By.id("username")).sendKeys("test1@test.com");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div/button")).click();
		String textgot = driver.getTitle();
		System.out.println(textgot);

		driver.quit();
	}

}

