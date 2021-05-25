import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		Set<String> sessions = driver.getWindowHandles();
		System.out.println(sessions);
		System.out.println(sessions.size());
		Iterator<String> itr = sessions.iterator();
		String parentId = itr.next();
		System.out.println(parentId);
		String childId1 = itr.next();
		System.out.println(childId1);
		String childId2 = itr.next();
		System.out.println(childId2);
		String childId3 = itr.next();
		System.out.println(childId3);
		Thread.sleep(4000);
		driver.switchTo().window(childId1);
		Thread.sleep(4000);

		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(childId2);
		Thread.sleep(4000);

		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(childId3);
		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(5000);
		driver.findElement(By.id("block")).click();

		
		  WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
		  Actions act=new Actions(driver); act.moveToElement(job).perform();
		  
		  driver.findElement(By.xpath("(//a[contains(text(),'Search Jobs')])[1]")).click();
		

	}

}
