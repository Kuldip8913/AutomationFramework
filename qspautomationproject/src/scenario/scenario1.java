package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenario1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("dhorekuldip1122@gmail.com");
	driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	}
}