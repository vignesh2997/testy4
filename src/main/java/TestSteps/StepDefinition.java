package TestSteps;

import java.util.Random;

import org.junit.Assert;

import cucumber.api.java.en.*;

import pageObject.Homepage;
import pageObject.basepage;

public class StepDefinition {
	Homepage hp;
	basepage bp;
	int random = new Random().nextInt(50000);
	String tab = null;

	public StepDefinition() {
		hp = new Homepage();
		bp = new basepage();
		
	}

	@Given("User launch the application")
	public void user_launch_the_application() {
		hp = new Homepage();

	}

	@When("User enter email {string} in the subscription text box")
	public void user_enter_email_in_the_subscription_text_box(String argu) {
		String[] arr = argu.split("@");
		argu = arr[0] + random + "@" + arr[1];
		hp.setEnterEmail(argu);
	}

	@Then("User should see subscription Message")
	public void user_should_see_subscription_Message() {
		String verify = hp.verifyMessage().getText();
		Assert.assertTrue(verify.contains("successfully"));
	}

	@When("User Click on the tab {string}")
	public void user_Click_on_the_tab(String tab) {
		this.tab = tab;

		if (tab.equals("Dresses")) {
			hp.getdress().click();
		} else if (tab.equals("Women")) {
			hp.getwomen().click();
		} else {
			hp.gettshirt().click();
		}

	}

	@Then("User should see the respective details page")
	public void user_should_see_the_respective_details_page() {
		//Assert.assertTrue("failed", hp.getTitlte().toUpperCase().contains(tab));
	}

}
