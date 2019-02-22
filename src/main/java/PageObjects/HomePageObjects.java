package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "(//*[text()='Women'])[1]")
	WebElement tabWomen;

	@FindBy(xpath = "(//*[text()='Dresses'])[2]")
	WebElement tabDresses;

	@FindBy(xpath = "(//*[text()='T-shirts'])[2]")
	WebElement tabTshirts;
	
	@FindBy(id="newsletter-input")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement txtSubscription;
	
	@FindBys(@FindBy(xpath = "//*[@id='homefeatured']/li"))
	private List<WebElement> lstProducts;

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void clickDresses() {
		tabDresses.click();
	}

	public void clickWomen() {
		clickElement(tabWomen);
	}

	public void clickTshirts() {
		tabTshirts.click();
	}
	
	public void setTxtNewsLetter(String email){
		setText(txtBoxNewsLetter, email);
	}
	
	public String getSubscribedText(){
		return txtSubscription.getText();
	}
	
	public List<WebElement> getProducts(){
		return lstProducts;
	}
	
	public boolean verifyAddToCart(WebElement parent){
		return elementFound(parent.findElement(By.xpath(".//*[text()='Add to cart']")));
	}

}
