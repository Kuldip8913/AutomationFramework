package pageobjectmodel;

import java.io.IOException;

import KeywordDriverframework.BaseTest;
import datadrivenframework.Flib;

public class TestActiTimeInvalidLogin extends BaseTest{
	private static final String EXCEL_PATH = null;

	public static void main(String[]args) throws IOException {
		BaseTest bt= new BaseTest();
		bt.setup();
		//open the browser and launch the app
		Flib flib=new BaseTest();
		LoginPage lp = new LoginPage(driver);
		//get the row count to itterate the for loop
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreads");
		 
		for (int i=1;i<=rc;i++)
	
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH,"invalidcreads",i,0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH,"invalidcreads",i,1);
			//perform invalid login
			lp.actiTimeInvalidLogin(invalidUsername,invalidPassword);
		}
		//close the browser
	   bt.tearDown();
	
	}
}
