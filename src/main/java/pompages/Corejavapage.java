package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corejavapage {
	@FindBy(xpath ="//a[text()=\" Core Java For Selenium Trainin\"]")
			private WebElement corejava;
	public Corejavapage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	public void java() {
		corejava.click();
	}
	

}
