package SeleniumGridpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws MalformedURLException {
	  System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
	 DesiredCapabilities capability = DesiredCapabilities.firefox();
      
	  
      //capability.setBrowserName("Firefox");
    
capability.setPlatform(Platform.WINDOWS);
URL url=new URL("http://localhost:4444/wd/hub");
   
WebDriver driver= new RemoteWebDriver(url,capability);
driver.get("http://www.google.com");
//closing browerser
driver.quit();
  }
}
