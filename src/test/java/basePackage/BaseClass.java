package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydides.core.annotations.Managed;

public class BaseClass {

	@Managed
	public static WebDriver driver;

	/*************************************************************************************************************
	 * Below method setUp will close the current browser instance
	 **************************************************************************************************************/

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://35.172.0.90:4200/login");
	}

	/*************************************************************************************************************
	 * Below method tearDown will close the current browser instance
	 * 
	 *
	 **************************************************************************************************************/
	public static void tearDown() {
		driver.quit();
	}

	/*************************************************************************************************************
	 * Below method propValue will return the property file along with the query
	 * attached to it
	 *
	 **************************************************************************************************************/

	static FileInputStream fis;
	static Properties prop;// =prop.load(fis);;

	public static String propValue(String Variable) {
		try {
			fis = new FileInputStream("src/test/resources/QueryPropertyFile/QueryPropertyFile.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException excep) {
			System.out.println(excep.getMessage());
			excep.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return prop.getProperty(Variable);
	}
}
