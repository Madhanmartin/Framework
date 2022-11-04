package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtiles driverutilies = new WebDriverUtiles();
	
	
	@BeforeMethod
	public void opeApp() throws IOException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getdata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
	 	 int status = res.getStatus();
	 	  String name = res.getName();
	 	  
	 	  if(status==2) {
	 		  Photo p = new Photo();
	 		  p.getphoto(driver, name);
	 		  
	 	  }
		driver.quit();
	}

}
