package testAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCode {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-smc8hiai/login.do");
	Thread.sleep(3000);
	}


	@DataProvider(name="testActiTimeData")
	public Object[][] dataprovider()
	{
		Object[][] data=new Object[5][2];

		data[0][0]="admin 1";
		data[0][1]="man ager123";

		data[1][0]="ad min";
		data[1][1]="manager 123";

		data[2][0]="ABC123";
		data[2][1]="$#& 4123";

		data[3][0]="123";
		data[3][1]="admin";

		data[4][0]="123";
		data[4][1]="admin@";



		return data;

	}


	@Test(dataProvider = "testActiTimeData")
	public void loginToActiTime(String username,String password) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}

