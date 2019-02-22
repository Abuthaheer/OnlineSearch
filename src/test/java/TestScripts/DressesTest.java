package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DressPageObjects;
import PageObjects.HomePageObjects;

public class DressesTest {

	DressPageObjects dp;
	HomePageObjects hp;

	public DressesTest() {
		dp = new DressPageObjects();
		hp = new HomePageObjects();
	}

	@Test
	public void verifyProductCount() {
		hp.clickDresses();
		Assert.assertTrue(dp.getCountFromHeader() == dp.getProductCount(), 
				"Failed: Count mismatched");
	//	Assert.assertFalse(dp.getCountFromHeader() == dp.getProductCount(), "Failed");
	//	Assert.assertEquals(dp.getCountFromHeader(), dp.getProductCount());
	}

}
