package practiceCollection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(practiceCollection.ListenerClass.class) 

public class testclassforListener {

	@Test//passing test
	public void login() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String actual=driver.getTitle();
		String expected="Google";
		Assert.assertEquals(actual, expected, "test pass");
		driver.close();
	}

	@Test  //Failing Test
	public void sampleTest2() throws InterruptedException
	{
		System.out.println("Forcely Failed Test Method");
		Assert.assertTrue(false);
	}
	
	@Test  //Skipping Test
	public void sampleTest4()
	{
		throw new SkipException("Forcely skipping the sampleTest4");
	}

}

