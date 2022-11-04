package scripting;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pompages.Addtocartpage;
import pompages.Skillarydemopage;
import pompages.Skillaryloginpages;

public class Testcase1 extends Baseclass {
	@Test
	
	public void tc1() {
		Skillaryloginpages sl = new Skillaryloginpages(driver);
		sl.gearsbuttton();
		sl.demobutton();
		
		
		driverutilies.switchtabs(driver);
		
		Skillarydemopage sd = new Skillarydemopage(driver);
		driverutilies.mouseHover(driver,sd.getCoursetab());
		sd.Seleniumtraingtn();
		
		
		Addtocartpage ad = new Addtocartpage(driver);
		driverutilies.doubleclick(driver, ad.getPlus());
		ad.cartbutton();
		driverutilies.alertpopup(driver);

	
	}

}
