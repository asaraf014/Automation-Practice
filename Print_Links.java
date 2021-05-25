import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Links {

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
           ChromeDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.flipkart.com/");
           driver.findElement(By.xpath("//button[text()='✕']")).click();
           List<WebElement> allTags = driver.findElements(By.tagName("a"));
           System.out.println("All tags are : "+allTags.size());
           for(int i=1;i<allTags.size();i++)
           {
          	 System.out.println("Links on page are: "+allTags.get(i).getAttribute("href"));  
        	 System.out.println("Links on page are: "+allTags.get(i).getText());  
  

           }
           
           
	}

}
