package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrower2 
{
		 public static void main(String[] args) throws InterruptedException
		 {
				System.setProperty("webdriver.Chromedriver","./drivers/Chromedriver.exe");
				ChromeDriver driver = 
				new ChromeDriver();
				driver.get("https://www.instagram.com");
				Thread.sleep(10000);
				driver.close();

	}

}
