package screenshots;

public class screenshot1 {

	public static void main(String[] args) {
		package locators;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class screenshot1 {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://op");
				driver.findElement(By.partialLinkText("forgot")).click();
				
			}

		}


	}

}
