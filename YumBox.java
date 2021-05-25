import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class YumBox {

	// public static void main(String[] args)
	WebDriver driver=null;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://yumbox.in/web/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}

//------------------------------------------- Create Account in Yumbox------------------------------------------------------------

	/*
	 * @Test(priority = 1) public void createAccount() {
	 * 
	 * 
	 * driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	 * driver.findElement(By.id("fname")).sendKeys("Asaraf");
	 * driver.findElement(By.id("lname")).sendKeys("Ansari"); Thread.sleep(3000);
	 * WebElement Contry = driver.findElement(By.id("country"));
	 * 
	 * Select sel=new Select(Contry); sel.selectByVisibleText("India");
	 * 
	 * driver.findElement(By.id("mobile")).sendKeys("9999888800");
	 * driver.findElement(By.id("email")).sendKeys("asaraf@dexconsulting.com");
	 * Thread.sleep(3000);
	 * 
	 * driver.findElement(By.id("cmpny")).sendKeys("Dex Retail Private Limited");
	 * driver.findElement(By.id("password")).sendKeys("asaraf014");
	 * driver.findElement(By.id("confirmPassword")).sendKeys("asaraf014");
	 * driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	 * 
	 * }
	 */

//--------------------------------------------------Login-------------------------------------------------------------------------

	@Test(priority = 1)
	public void login()
	{

		driver.findElement(By.id("fname")).sendKeys("asaraf@dexconsulting.com");
		driver.findElement(By.id("pass")).sendKeys("asaraf014");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

//--------------------------------------------Add Location Feature----------------------------------------------------------------

	/*
	 * @Test(priority = 3) public void addLocation() {
	 * 
	 * 
	 * driver.findElement(By.xpath("//span[text()='Manage Location']")).click();
	 * Thread.sleep(3000); //
	 * driver.findElement(By.xpath("//button[contains(text(),'ADD NEW')]")).click();
	 * 
	 * driver.findElement(By.id("name")).sendKeys("Sector 153,Noida");
	 * Thread.sleep(3000); WebElement AddContry =
	 * driver.findElement(By.id("country")); Select sel1=new Select(AddContry);
	 * sel1.selectByVisibleText("India");
	 * driver.findElement(By.xpath("//span[text()='ADD LOCATION']")).click();
	 * 
	 * 
	 * 
	 * driver.findElement(By.id("name")).sendKeys("Lajpat Nagar,New Delhi");
	 * Thread.sleep(3000); WebElement AddContry =
	 * driver.findElement(By.id("country")); Select sel1=new Select(AddContry);
	 * sel1.selectByVisibleText("India");
	 * driver.findElement(By.xpath("//span[text()='ADD LOCATION']")).click();
	 * 
	 * 
	 * }
	 */
	
	
//----------------------------------------------Add New Outlet------------------------------------------------------------------

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
		uploadImg.click();
		uploadImg.sendKeys("//home//akhter//Downloads//pic2.jpg");
		// Thread.sleep(4000);

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
