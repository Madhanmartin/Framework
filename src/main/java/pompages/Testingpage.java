package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;

	@FindBy(id="mycart")
	private WebElement cart;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	

	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath="(//i[@class=\"fa fa-twitter\"])[2]")
	private WebElement twitter;

	public WebElement getTwitter() {
		return twitter;
	}


public Testingpage(WebDriver driver) {
	PageFactory.initElements( driver,this);
	
}
public void twitterlog() {
	twitter.click();
}
	
	

}
