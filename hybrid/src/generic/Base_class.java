package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements framework_constants{
	public static WebDriver driver;
@BeforeMethod 
public void open()
{
	System.setProperty(Gecko_key,Gecko_value);
	 driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(URL);
	}
@AfterMethod
public void close(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		generic_takesscreenshot.getdata(driver);
		
	}
	driver.close();
}
}
