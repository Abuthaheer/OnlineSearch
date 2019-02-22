package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects extends BasePage {

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement btnLogin;	
	
	public LoginObjects(){
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String name) {
		setText(user, name);
	}

	public String getEnteredValue(String attName) {
		return getTxtAttribute(user, attName);
	}

	public void signIn(String userName, String passWord) {
		setText(user, userName);
		setText(pass, passWord);
		btnLogin.click();
	}

}
