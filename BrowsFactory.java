import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsFactory 
{
	
	public static WebDriver launchbrowser(String browserName)
	{
	WebDriver driver;
	
//================================================================for Chrome========================================================	
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome Launched");
		
	}
	
	
//=============================================================== for Firefox=========================================================	
	
	else
	{
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox Launched");
	}
	return driver;
	}

}
