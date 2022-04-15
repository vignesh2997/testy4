package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends basepage {
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dress;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;

	@FindBy(id = "newsletter-input")
	private WebElement txtBoxNewsLetter;

	@FindBy(name = "submitNewsletter")
	private WebElement txtBoxSubmitButton;

	@FindBy(xpath = "//*[@id=\"columns\"]/p")
	private WebElement msgSuccess;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomen() {
		return women;
	}

	public WebElement getdress() {
		return dress;

	}

	public WebElement gettshirt() {
		return tshirt;
	}

	public void setEnterEmail(String argu) {
		setText(txtBoxNewsLetter, argu);
		txtBoxSubmitButton.click();
	}

	public WebElement verifyMessage() {
		return msgSuccess;
	}

}
