package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dressPage1 extends basepage {

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement headerProductCount;

	@FindBys(@FindBy(xpath = "//a[@class='product_img_link']"))
	private List<WebElement> listOfProductImage;

	@FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[5]")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement btnProceedToCheckout;
	
	@FindBy(xpath="//span[@title='Close window']")
	private WebElement btnCloseWindow;
	

	public dressPage1() {
		PageFactory.initElements(driver, this);
	}

	public int getProductCountFromHeader() {
		return Integer.parseInt(headerProductCount.getText().split(" ")[2]);
	}

	public int getlistOFProductCount() {
		return listOfProductImage.size();
	}

	public void clickFirstAddToCart() {
		mouseOver(listOfProductImage.get(4));
		// isElementVisible(btnAddToCart);
		btnAddToCart.click();
	}

	public boolean verifyCheckoutButton() {
		isElementVisible(btnProceedToCheckout);
		return elementFound(btnProceedToCheckout);
	}
	
	public void clickCloseButton() {
		btnCloseWindow.click();
	}

}
