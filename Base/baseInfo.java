package Base;


import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class baseInfo {
	public static WebDriver driver;
	public static Properties prop;
	

	
	
	// CALL DIFFERENT BROWSERS
	public static void invokeBrowser() {
		prop = new Properties();

		try {
			prop.load(new FileInputStream(
					"src/Config/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// To Open Chrome Browser
		if (prop.getProperty("browserName").matches("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		// To Open firefox Browser
		if (prop.getProperty("browserName").matches("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// To Open edge Browser
		if (prop.getProperty("browserName").matches("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			}
		// To maximize the Browser Window
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	//  MAIN PAGE URL
	public static void openURL() {
		driver.get(prop.getProperty("websiteURLKey"));
	}
	
	//SLEEP
	 public static void sleep(int milliSeconds) throws InterruptedException {
	        Thread.sleep(milliSeconds);
	    }
	 
	 //IMPLICIT WAIT
	  public static void implicitWait(int seconds) {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	    }
	  
	  //SCROLL1
	 public static void scroll1() {
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     js1.executeScript("window.scrollBy(0,1200)", "");
	 }
	 
	 //SCROLL2
	 public static void scroll2() {
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     js1.executeScript("window.scrollBy(0,300)", "");
	 }

}
