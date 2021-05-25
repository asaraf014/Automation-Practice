package Selenium;

import org.testng.annotations.Test;

public class TestNg_Priority
{
	@Test(priority = 1)
	public void show()
	{
		System.out.println("Hello");
	}
	@Test(priority = 2)
	public void display()
	{
		System.out.println("Dezr");
	}
	@Test(priority = 3)
	public void action()
	{
		System.out.println("dfbjj");
	}
	@Test(priority = 4)
	public void post()
	{
		System.out.println("jkhfjk");
	}

}
