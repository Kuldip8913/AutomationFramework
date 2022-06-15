package handlingTheDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers.chromedrivers.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/kuldi/Desktop/Automation/singleselectdropdown.html");
				
				Thread.sleep(4000);
				WebElement dropdownelement=driver.findElement(By.id("menu"));
				Select sel= new Select(dropdownelement);
				sel.selectByValue("V9");

	}

}
