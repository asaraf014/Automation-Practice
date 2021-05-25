import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{
		

		public static WebDriver launchbrowser(String browserName)
		{
	     WebDriver driver = null;
	     if(browserName.equalsIgnoreCase("chrome"))
	     {
		 System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 System.out.println("Chrome is Launched");
		}
	     if(browserName.equalsIgnoreCase("firefox"))
	     {
	    	 System.setProperty("webdriver.gecko.driver","./Java Program/exefiles/geckodriver");
	    	 driver=new FirefoxDriver();
	    	 driver.manage().window().maximize();
	    	 System.out.println("Firefox is Launched");
	     }
		return driver;
		
		}
		
}

