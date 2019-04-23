package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class DashboardPage extends BaseClass {

	public DashboardPage() {
		PageFactory.initElements(driver, this);

	}

	// --------This is the tab on Transaction header--------
	@FindBy(xpath = "//a[@href='/manifests']")
	public WebElement ManifestTabPF;
	public static By ManifestTab = (By.xpath("//a[@href='/manifests']"));
	// -----This is the Manifest Tab-------

	@FindBy(xpath = "//a[@href='/dashboard']")
	public WebElement DashboardTab;
	public static By DashboardTabBy = (By.xpath("//a[@href='/dashboard']"));
	// ------This is the Dashboard Tab-------

	@FindBy(xpath = "//a[@href='/bols']")
	public WebElement BillsOfLadingTab;
	public static By BillsOfLadingTabBy = (By.xpath("//a[@href='/bols']"));
	// ------^^^This is the BOL Tab-----
	// -----^^^^^This is the tab on Transaction header^^^---------

	// --------------------------- pop up----------------
	@FindBy(xpath = "//div[contains(text(),'Unable to load User data. Please try again later')]//parent::cbptm-message-dialog/div[3]/button")
	public WebElement UnableToLoadUserDataButton;
	public By UnableToLoadUserDataButtonBy = (By.xpath(
			"//div[contains(text(),'Unable to load User data. Please try again later')]//parent::cbptm-message-dialog/div[3]/button"));
	// -------This is the pop up button if manifest is unable to load
	@FindBy(xpath = "//div[contains(text(),'Unable to load User data. Please try again later')]")
	public WebElement UnableToLoadUserDataText;
	public By UnableToLoadUserDataTextBy = (By
			.xpath("//div[contains(text(),'Unable to load User data. Please try again later')]"));
	/// this is the text of Unable To Load User Data Button

	@FindBy(xpath = "//div[contains(text(),'Unable to load Manifest. Please try again later')]//parent::cbptm-message-dialog//div[3]/button")
	public WebElement UnabletoloadManifestButton;
	public static By UnabletoloadManifestButtonBy = (By.xpath(
			"//div[contains(text(),'Unable to load Manifest. Please try again later')]//parent::cbptm-message-dialog//div[3]/button"));
	// this is the button for unable to load manifest button
	@FindBy(xpath = "//div[contains(text(),'Unable to load Manifest. Please try again later')]")
	public WebElement UnableToLoadManifestText;
	public By UnableToLoadManifestTextBy = (By
			.xpath("//div[contains(text(),'Unable to load Manifest. Please try again later')]"));
	// this is the text for unable to load manifest text

	@FindBy(xpath = "//div[contains(text(),'Unable to get user account metrics. Please try again later')]//parent::cbptm-message-dialog/div[3]/button")
	public WebElement UnableToGetUserAccountButton;
	public By UnableToGetUserAccountButtonBy = (By.xpath(
			"//div[contains(text(),'Unable to get user account metrics. Please try again later')]//parent::cbptm-message-dialog/div[3]/button"));
	// ----this is popup for unable to get user account button
	
	@FindBy(xpath="//button[contains(., 'OK')]")
	public WebElement PopUpButtonOk;
	public static By PopUpButtonOkBy=(By.xpath("//button[contains(., 'OK')]"));
	// ------^^^Pop Up Unable to load manifest------



	// --------------Pie Chart--------------------------
	@FindBy(xpath = "//div[@class='dataCardTitle' and contains(.,'Manifest')]")
	public WebElement ManifestBlockHeader;
	public static By ManifestBlockHeaderby = (By.xpath("//div[@class='dataCardTitle' and contains(.,'Manifest')]"));
	// -------This is for manifest that is on pie chart header--------

	@FindBy(xpath = "//div[@class='dataCardTitle' and contains(.,'Bills of Lading')]")
	public WebElement BillsofLadingBlockHeader;
	public static By BillsofLadingBlockHeaderby = (By
			.xpath("//div[@class='dataCardTitle' and contains(.,'Bills of Lading')]"));
	// -------This is for Bills of lading that is on pie chart header--------
	// ---------------Pie Chart----------------------
	
	//---Login-----------------
	//---Stitch
	@FindBy(xpath="//mat-radio-button[@id='mat-radio-2']")
	public WebElement StitchLogin;
	public static By StitchLoginBy=(By.xpath("//mat-radio-button[@id='mat-radio-2']"));
	@FindBy(id="mat-radio-2")
	public WebElement StitchLoginId;
	
	//---Stitch
	
	//---Login^^^^^-----------------.
	
	//----Dashboard Header-----.
	//----Dashboard Header Text-----
	@FindBy(xpath="//div[@fxlayoutalign='space-between center']/div[contains(text(), ' Dashboard ')]")
	public WebElement DashboardHeaderText;
	public static By DashboardHeaderTextBy=(By.xpath("//div[@fxlayoutalign='space-between center']/div[contains(text(), ' Dashboard ')]"));
	//----Dashboard Header Text-----
	
	// --Plus icon next to create
	@FindBy(xpath="//button[@id='add-new-item']")
	public WebElement PlusIconCreate;
	public static By PlusIconCreateBy=(By.xpath("//button[@id='add-new-item']"));
	// --Plus icon next to create
	
	//-------Create Button
	@FindBy(xpath="//button[@aria-label='Create Menu']")
	public WebElement CreateButtonOnHeader;
	public static By CreateButtonOnHeaderBy=(By.xpath("//button[@aria-label='Create Menu']"));
	//-------Create Button^^^^
	
	//New Manifest under Create
	@FindBy(xpath="//a[@href='/manifest/create']")
	public WebElement NewManifestButtonUnderCreate;
	public static By NewManifestButtonUnderCreateBy=(By.xpath("//a[@href='/manifest/create']"));
	//New Manifest under Create
	//----Dashboard Header^^^^^-----

}
