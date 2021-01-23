package practiceCollection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSandXPATHcheck {

@Test
public void cssexectiontimecheck() throws InterruptedException {
//xpath execution time 6.651s and CSS execution time 6.58s->CSS taking less time than xpath
	
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//driver.findElement(By.cssSelector("#email")).sendKeys("vani");

driver.findElement(By.xpath("//input[@id='emal']")).sendKeys("vani");

System.out.println("enter string in email id text box ...finish work");
driver.close();
	}

}
