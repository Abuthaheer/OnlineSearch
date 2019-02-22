package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends BasePage {

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtProductHeader;

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> lstProducts;

	public DressPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public int getCountFromHeader() {
		// String txt = txtProductHeader.getText();
		// String[] arr = txt.split(" ");
		// txt = arr[2];
		// int number = Integer.parseInt(txt);
		// return number;

		return Integer.parseInt(txtProductHeader.getText().split(" ")[2]);
	}
	
	public int getProductCount(){
		return lstProducts.size();
	}
}
