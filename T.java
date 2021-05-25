import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T {
	WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://yumbox.in/web/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterClass
	public void postCondtion() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {

		driver.findElement(By.id("fname")).sendKeys("asaraf@dexconsulting.com");
		driver.findElement(By.id("pass")).sendKeys("asaraf014");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

	@Test(priority = 2)
	public void addNewOutlet() 
	{

		driver.findElement(By.xpath("//span[text()='Manage Outlet']")).click();
		/*
		 * WebElement OutletLocation = driver.findElement(By.id("locationId")); Select
		 * sel2=new Select(OutletLocation);
		 * sel2.selectByVisibleText("Sector 153,Noida");
		 */

		driver.findElement(By.xpath("//button[contains(text(),'ADD NEW OUTLET')]")).click();

		
		 WebElement uploadImg = driver.findElement(By.id("imageOnePriview")); 
		 uploadImg.sendKeys("//home//akhter//A.jpeg");
		 

		driver.findElement(By.id("displayName")).sendKeys("Yum Dim Sum");
		driver.findElement(By.id("legalName")).sendKeys("Yum Dim Sum");

		WebElement OutletLocation = driver.findElement(By.id("location"));
		Select sel2 = new Select(OutletLocation);
		sel2.selectByVisibleText("Sector 153,Noida");

		WebElement outletType = driver.findElement(By.id("outletType"));
		Select sel3 = new Select(outletType);
		sel3.selectByVisibleText("Restaurants");

		driver.findElement(By.id("minimumOrderAmount")).sendKeys("169");

		WebElement riderType = driver.findElement(By.id("riderType"));
		Select sel4 = new Select(riderType);
		sel4.selectByVisibleText("Outlet Rider");

		// driver.findElement(By.xpath("//span[text()='SAVE']")).click();

	}
}