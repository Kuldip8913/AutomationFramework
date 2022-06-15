package takesScreenShotDynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

   @Listeners(CustomListner.class)

	public class TestCase  extends BaseTest {
		@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

		@BeforeMethod
		public void setUp()
		{
			initialization();
		}

		@Test
		public void validLogin() throws InterruptedException 
		{
			SoftAssert softAssert = new SoftAssert();
			String actualLoginPageTitle = driver.getTitle();
			AssertJUnit.assertEquals(actualLoginPageTitle,"OrangeHRM");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("suraj");
			driver.findElement(By.id("btnLogin")).click();

			WebElement dashBoard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
			boolean statusOfDashBoard = dashBoard.isDisplayed();
			AssertJUnit.assertEquals(statusOfDashBoard, true);
			Thread.sleep(4000);

		}

		@Test
		public void testCase2()
		{
			AssertJUnit.fail();
		}

		@Test
		public void testCase3()
		{
			AssertJUnit.fail();
		}

		@Test
		public void testCase4()
		{
			AssertJUnit.fail();
		}


		@Test
		public void testCase5()
		{
			Assert.fail();
		}

		public void tearDown()
		{
			driver.quit();
		}

}
	