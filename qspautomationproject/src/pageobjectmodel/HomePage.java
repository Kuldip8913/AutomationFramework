package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement createNewTask;
    @FindBy(linkText="setting") private WebElement setting;
     
    //initialization
    public HomePage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
		
    
   //utilization
	public WebElement getLogoutLink() {
		return logoutLink;

	}
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSetting() {
		return setting;
	}
    
}
