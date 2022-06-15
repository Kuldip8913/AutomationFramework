package testFlags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class ActitimeLogin {
	WebDriver driver;

  @Test
  @Parameters({"browser","username","password","url"})
  
  public void validLogin(String browserValue,String username,String password,String url) throws InterruptedException {
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exxe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.get(url);
		  Thread.sleep(3000);
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		  
		   }
	  else
		  Reporter.log("Enter valid input",true);
  }
}	  
  

