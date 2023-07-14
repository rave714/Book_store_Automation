package utilS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helperfile {
   
    protected WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {

		String os = System.getProperty("os.name").toLowerCase();
		File driverFile;

		if (os.contains("win")) {
			driverFile = new File("libraries" + File.separator + "C:\\Users\\DELL\\Desktop\\QA\\setup\\14 chorme\\114.0.5735.90/chromedriver.exe");
		} else if (os.contains("mac")) {
			driverFile = new File("libraries" + File.separator + "chromedriver");
		} else {
			throw new Exception("Operating system not yet supported");
		}

		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}