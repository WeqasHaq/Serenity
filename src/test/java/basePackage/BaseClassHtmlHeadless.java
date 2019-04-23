package basePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BaseClassHtmlHeadless extends BaseClass {

	public static void setUp() {
		driver = new HtmlUnitDriver();
		driver.get("http://35.172.0.90:4200/login");
	}
	
	public static void chromeHeadless() {
		//"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"
		//"src/test/resources/Google/Chrome/Application/chrome.exe"
		//src\test\resources\LinixDriver\chromedriver ---linux chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/LinuxDriver/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		driver = new ChromeDriver(option.setHeadless(true));
		driver.get("http://35.172.0.90:4200/login");
	}

}
