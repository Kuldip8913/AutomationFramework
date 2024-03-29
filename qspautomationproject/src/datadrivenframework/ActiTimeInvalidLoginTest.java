package datadrivenframework;

	import java.io.IOException;

	import org.openqa.selenium.By;

import KeywordDriverframework.BaseTest;

	public class ActiTimeInvalidLoginTest  extends BaseTest{

		private static final String EXCEL_PATH = null;

		public static void main(String[] args) throws IOException, InterruptedException {

			BaseTest bt = new BaseTest();
			bt.openBrowser();
			Thread.sleep(3000);
			
			Flib flib = new Flib();Object ;
			
			int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");

			for(int i=1;i<=rc;i++)
			{
				String username = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 0);
				String password = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 1);
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				try {

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}


			bt.closeBrowser();
		}


	}

}
