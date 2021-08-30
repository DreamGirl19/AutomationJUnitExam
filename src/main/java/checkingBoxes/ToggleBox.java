package checkingBoxes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToggleBox {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://techfios.com/test/101/");
	}

	@Test
	public void toggleBoxCheckTest() {
		driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click(); 
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
