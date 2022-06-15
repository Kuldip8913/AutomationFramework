package pageobjectmodel;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name="username") Private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoginInCheckBox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink")private WebElement licenseLink;
	
	
	//initialization
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
	
	//utilization
	public Private getWebElement() {
		return WebElement;
	
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepLoginInCheckBox() {
		return keepLoginInCheckBox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	public void actiTimeInvalidLogin(String invalidUsername, String invalidPassword) {
		// TODO Auto-generated method stub
		
	}
	
	
//generic reusabale method
	
	
	
	
	//
