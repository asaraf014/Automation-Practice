import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDwnText 
{

	public static void main(String[] args)
	{
          System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/r.php?locale=EN_US&campaign_id=973072061&extra_1=s%7Cc%7C256741341323%7Ce%7Cfacebook%7C&placement=&creative=256741341323&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9075346%26loc_interest_ms%3D%26feeditemid%3D19894516786%26param1%3D%26param2%3D&gclid=EAIa\"\n" + 
          		"         		+ \"IQobChMI45DQrOO_8AIVFA4rCh2iUwF_EAAYASABEgJ68_D_BwE");
          WebElement day = driver.findElement(By.id("day"));
          WebElement month = driver.findElement(By.id("month"));
          WebElement year = driver.findElement(By.id("year"));
//---------------------------------------------------for Day-----------------------------------------------------------------------          
		/*
		 * Select d=new Select(day); // d.selectByIndex(26); // d.selectByValue("26");
		 * d.selectByVisibleText("26");
		 * 
		 * List<WebElement> dayCount = d.getOptions();
		 * 
		 * System.out.println("Total No of Option present inside the day drpdown ="+dayCount.size()); for(int i=0;i<dayCount.size();i++) {
		 * String text = dayCount.get(i).getText(); System.out.println(text); }
		 */
          
//--------------------------------------------------for Month----------------------------------------------------------------------          
          
		/*
		 * Select m=new Select(month); m.selectByVisibleText("Mar"); List<WebElement>
		 * options = m.getOptions(); System.out.println("Total No of Option present inside the month drpdown ="+options.size());
		 * 
		 * for(int i=0;i<options.size();i++) { String MonthText =
		 * options.get(i).getText(); System.out.println(MonthText); }
		 */
          
//--------------------------------------------------for Year------------------------------------------------------------------------
          
          Select y=new Select(year);
          y.selectByVisibleText("1998"); 
          List<WebElement> options = y.getOptions();
          System.out.println("Total No of Option present inside the year drpdown = " +options.size());
 		 for(int i=0;i<options.size();i++)
 		 {
 			 String MonthText = options.get(i).getText(); 
 			 System.out.println(MonthText); 
 		 }
	}

}
