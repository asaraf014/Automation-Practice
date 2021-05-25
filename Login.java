package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(3000);
   //     driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("9453615708");
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//span[text()='Enter Password']")).sendKeys("asaraf");

       


		

	}

}
