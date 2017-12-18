package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonTest {
	WebDriver driver = new FirefoxDriver();
	String baseURL = "https://www.amazon.ca/";
  @BeforeTest
  public void beforetest(){
	driver.get(baseURL);
  }
  @AfterTest
  public void aftertest(){
	driver.quit();
  }
  @Test
  public void SearchItem() {
	AmazonMethods item = new AmazonMethods();
	item.Searchbyname("iphone 5s");
  }
  public class AmazonMethods {
		String Searchbyname(String item){
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
			driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
			return item;
		}
  @Test
  public void Dealscheck() throws InterruptedException{
	  driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();
	  Thread.sleep(30);
	  driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).clear();
	  driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("iphone 6");
	  
	  
  }
  }
}
