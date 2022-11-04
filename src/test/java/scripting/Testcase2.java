package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pompages.Skillarydemopage;
import pompages.Skillaryloginpages;
import pompages.Testingpage;

public class Testcase2 extends Baseclass{
	@Test
	public void tc2() throws IOException {
		Skillaryloginpages sl = new Skillaryloginpages(driver);
		sl.gearsbuttton();
		sl.demobutton();
		driverutilies.switchtabs(driver);
		
		Skillarydemopage sd = new Skillarydemopage(driver);
		driverutilies.dropdown(sd.getCoursedd(),pdata.getdata("dropdownopt"));	
		Testingpage tp = new Testingpage(driver);
		driverutilies.draganddrop(driver,tp.getSeleniumtraining(),tp.getCart());
		

		Point loc = tp.getTwitter().getLocation();
		int x = loc.getX();
		int y=loc.getY();
		driverutilies.scrollBar(driver,x,y);
		
		tp.twitterlog();
		
		
		
		
	}
	
	

}
