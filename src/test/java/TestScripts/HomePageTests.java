package TestScripts;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePageObjects;

public class HomePageTests {

	HomePageObjects hp;

	int value = new Random().nextInt(50000);
	String email = "TestAutomationAbu" + value + "@yahoo.com";

	public HomePageTests() {
		hp = new HomePageObjects();
	}

	@Test
	public void verifyTabNavigation() {
		int name = value;
		hp.clickWomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"), "Failed:  Navigation failed for women");
		hp.navigateBack();
		hp.clickDresses();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"), "Failed:  Navigation failed for dresses");
		hp.navigateBack();
		hp.clickTshirts();
		Assert.assertTrue(hp.getTitlte().contains("T-shirts"), "Failed:  Navigation failed for tshirts");
	}

	@Test
	public void verifyNewsLetter() {
		hp.setTxtNewsLetter(email);
		Assert.assertTrue(hp.getSubscribedText().contains("successfully"), "Failed: Nlot Subscribed");
	}

	@Test
	public void verifyAddToCart() {
		List<WebElement> products = hp.getProducts();
		for (WebElement element : products) {
			hp.mouseHove(element);
			Assert.assertTrue(hp.verifyAddToCart(element), "Failed: Add to cart is not displayed");
		}
	}

}
