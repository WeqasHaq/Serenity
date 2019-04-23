package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import basePackage.BaseClass;
import basePackage.BaseClassHtmlHeadless;
import commonMethods.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesPackage.DashboardPage;
import pagesPackage.ManifestCreatePage;

public class ManifestStepDefinations extends BaseClass {
	@Given("^User Navigates to Trade Portal$")
	public void user_navigates_to_trade_portal() {
		BaseClassHtmlHeadless.chromeHeadless();
//		BaseClass.setUp();
	}
	
	ManifestCreatePage manifestCreatePage = new ManifestCreatePage();
	
	@When("^User login as Stitch$")
	public void user_login_as_Stitch() {
		driver.findElement(By.id("mat-radio-2")).click();
	}

	@When("^User will be navigated to Manifest Page$")
	public void User_will_be_navigated_to_Manifest_Pagee() throws InterruptedException {
		DashboardPage dashboardPage=new DashboardPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String dashboard=driver.findElement(DashboardPage.DashboardHeaderTextBy).getText();
		dashboard.equals("Dashboard");
	}

	@When("^User clicks on Manifest Link$")
	public void user_clicks_on_manifest_link() {
		ManifestCreatePage manifestCreatePage=new ManifestCreatePage();
		CommonMethods.clearMethod(manifestCreatePage.ManifestLink);
	}

	@When("^User clicks plus button to creates manifest$")
	public void user_clicks_plus_button_to_creates_manifest() {
		DashboardPage dash=new DashboardPage();
		CommonMethods.clickMethod(dash.PlusIconCreate);
		CommonMethods.clickMethod(dash.NewManifestButtonUnderCreate);
	}

	@When("^Open create a new Manifest page$")
	public void  Open_create_a_new_manifest_page() {
		ManifestCreatePage Manifest=new ManifestCreatePage();
		CommonMethods.explicitWaitByNoActionBy(Manifest.CreateHeaderTextUnderCreateHeaderStepperBy);
		CommonMethods.elementISDisplayed(Manifest.CreateHeaderTextUnderCreateHeaderStepperBy);
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() {
		BaseClass.tearDown();
	}
}
