package DresspageSteps;

import java.sql.Driver;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pageObject.Homepage;
import pageObject.basepage;
import pageObject.dressPage1;

public class StepDefenitiondress {
	basepage bp;
	Homepage hp;

	dressPage1 dresspage;

	public StepDefenitiondress() {
		bp = new basepage();
		hp = new Homepage();
		dresspage = new dressPage1();

	}

	@Given("User lanuch the application")
	public void user_lanuch_the_application() {
		bp = new basepage();

	}

	@When("User Click on the tab {string}")
	public void user_Click_on_the_tab(String tab) {
		if (tab.equals("Dresses")) {
			hp.getdress().click();
		} else if (tab.equals("Women")) {
			hp.getwomen().click();
		} else {
			hp.gettshirt().click();
		}

	}

	@Then("User should see the same number of products count matching with the product header count displayed")
	public void user_should_see_the_same_number_of_products_count_matching_with_the_product_header_count_displayed() {
		System.out.println(dresspage.getProductCountFromHeader());
		System.out.println(dresspage.getlistOFProductCount());
		Assert.assertTrue(dresspage.getProductCountFromHeader() == dresspage.getlistOFProductCount());
	}

	@When("the click on Add to cart button for the product {string}")
	public void the_click_on_Add_to_cart_button_for_the_product(String string) {
		dresspage.clickFirstAddToCart();
	}

	@Then("verify the product should added to cart page")
	public void the_product_should_added_to_cart_page() {
		Assert.assertTrue("Failed", dresspage.verifyCheckoutButton());
	}

	@Then("close the cart window")
	public void close_the_cart_window() {
		dresspage.clickCloseButton();
		basepage.driver.close();
	}

}
