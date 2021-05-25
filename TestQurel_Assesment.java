package Selenium;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestQurel_Assesment
{

	WebDriver driver;
	@Before
	public void setUp()
	{
	    // CREATE AN ACCOUNT 
        
		/*       driver.findElement(By.linkText("Create an account")).click();
		         Thread.sleep(4000);
		         driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Asaraf Ali");  
		         Thread.sleep(4000);

		         driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Ansari");
		         Thread.sleep(4000);

		         driver.findElement(By.cssSelector("input[name='company_name']")).sendKeys("Dex It Consulting Pvt");
		         Thread.sleep(4000);

		         driver.findElement(By.cssSelector("input[id='email']")).sendKeys("asaraf014@gmail.com");
		         Thread.sleep(4000);
		        
		         driver.findElement(By.cssSelector("input[name='telephone']")).sendKeys("9453615708");
		         Thread.sleep(4000);
		        
		         driver.findElement(By.cssSelector("input[name='password']")).sendKeys("asaraf1234");
		         Thread.sleep(4000);
		        
		         driver.findElement(By.cssSelector("input[type='submit']")).click();
		         Thread.sleep(10000);
		         
		         driver.findElement(By.xpath("(//i[@class='fa fa-sign-out'])[1]")).click();
		*/	

        System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://crm.reallysimplesystems.com/login");
	}
	
    @Test
	public void show()
	{
       
  
         driver.findElement(By.id("username")).sendKeys("Dex It Consulting Pvt");
         driver.findElement(By.id("email")).sendKeys("asaraf014@gmail.com");
         driver.findElement(By.id("password")).sendKeys("asaraf1234");
         driver.findElement(By.id("login_submit")).click();
         
         
         driver.findElement(By.xpath("//a[@id='priority_tasks']//div[2]")).click();
         driver.findElement(By.xpath("//span[text()=' Add']")).click();
         driver.findElement(By.xpath("//span[text()='Search for an Account']")).click();
         driver.findElement(By.xpath("//li[text()='1 - Brigadier Software']")).click();
         driver.findElement(By.xpath("//select[@name='Priority']")).click();
         driver.findElement(By.xpath("//option[text()='High']")).click();
         driver.findElement(By.id("add_account")).click();
         driver.findElement(By.id("form_input_name")).sendKeys("Asaraf");
         driver.findElement(By.xpath("(//a[contains(text(),'Save')])[1]")).click();
         driver.findElement(By.id("header_save")).click();
         
         
         driver.findElement(By.xpath("(//span[text()='Dashboard'])[1]")).click();
         
         
         String priority = driver.findElement(By.xpath("(//a[@id='priority_tasks']/div)[2]")).getText().trim();
         System.out.println("Priority is = "+priority);
         String NoOfAccounts = driver.findElement(By.xpath("((//a[contains(@href,'accounts')])[2]//span)[2]")).getText();
         System.out.println(NoOfAccounts);       
         assertTrue(NoOfAccounts.contains("10"));
         
         
       
	}


}
