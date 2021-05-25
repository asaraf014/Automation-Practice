import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();

       JavascriptExecutor js = (JavascriptExecutor) driver;

       driver.get("http://demo.guru99.com/test/guru99home/");
     		
		
		  js.executeScript("window.scrollBy(0,1000)"); 
		  Thread.sleep(4000);
		 //js.executeScript("window.scrollBy(1000,1500)");
		 
       
          js.executeScript("window.scrollBy(1000,0)");
       
	}

}
