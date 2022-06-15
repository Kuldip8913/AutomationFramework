package assertionInTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class assertioninTestNG
{
	private SoftAssert softAssert;

	@Test
	public void testCase()
	{
		Reporter.log("launch the browser",true);
		Reporter.log("launch the web app by using url",true);

		Reporter.log("verify the login page title",true);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(false,true);

		Reporter.log("perform login",true);
		Assert.assertEquals(true,true);
		Reporter.log("verify home page title",true);
		Reporter.log("create user",true);
		Reporter.log("create contact",true);
		softAssert.assertAll();
	}

}
