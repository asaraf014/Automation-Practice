import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IVM 
{

	public static void main(String[] args) 
	{
         WebDriver driver = BrowserFactory.launchbrowser("chrome");
         driver.get("http://ifm360.in/ivm360_QA/Login.aspx");
         driver.findElement(By.id("email")).sendKeys("slv44@gmail.com");
         driver.findElement(By.id("pass")).sendKeys("Admin@123");
         driver.findElement(By.id("BtnLogin")).click();
	}

}
