package checkingBoxes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckBoxesRemeved {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
	}

	@Test
	public void AllCheckBoxesRemovedTest() {

		driver.findElement(By.name("allbox")).click();
		driver.findElement(By.cssSelector("body > div.controls > input[type=submit]:nth-child(1)")).click();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
