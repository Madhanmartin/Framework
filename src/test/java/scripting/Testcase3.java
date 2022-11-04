package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pompages.Corejavapage;
import pompages.Skillaryloginpages;
import pompages.Wishlistpage;

public class Testcase3 extends Baseclass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		
	
	Skillaryloginpages sl = new Skillaryloginpages(driver);
	sl.searchtextbox(pdata.getdata("coursename"));
	sl.searchbutton();
	
	
	
	Corejavapage cj = new Corejavapage(driver);
	cj.java();
	
	Wishlistpage wl = new Wishlistpage(driver);
	driverutilies.swutchFrame(driver);
	wl.playbutton();
	Thread.sleep(30000);
	wl.pausebutton();
	driverutilies.switchbackFrame(driver);
	wl.addtowish();
	
	}
	
	

}
