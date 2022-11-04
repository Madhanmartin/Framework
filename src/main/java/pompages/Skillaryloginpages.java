package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillaryloginpages {
	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[@target=\"_blank\"])[16]")
	private WebElement demobtn;
	@FindBy(name="q")
	private WebElement searchtb;
	@FindBy(xpath="//input[@type =\"submit\"]")
	private WebElement searchbtn;
	
	
	public Skillaryloginpages(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}

	public void gearsbuttton() {
		gearsbtn.click();
		
	}
	public void demobutton() {
		demobtn.click();
	}
	public void searchtextbox(String coursename) {
		searchtb.sendKeys(coursename);
	}
	public void searchbutton() {
		searchbtn.click();
	}

}
