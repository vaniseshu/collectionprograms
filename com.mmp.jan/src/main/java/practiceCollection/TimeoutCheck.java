package practiceCollection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeoutCheck {

@Test(description="implicit wait(6.085s) is taking less time than pageloadtimeout6.899s  and both together 6.932s" )
public void syncWaitingCheck() {
//public static void main(String[] args)
//{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
			driver.get("https://www.selenium.dev");
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String URLhead= driver.findElement(By.xpath("//strong[text()='BLACK LIVES MATTER']")).getText();
			System.out.println(URLhead);
	
 driver.close();
}
	}
