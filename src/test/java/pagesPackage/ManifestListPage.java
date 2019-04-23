package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseClass;

public class ManifestListPage extends BaseClass {

	public ManifestListPage() {
		PageFactory.initElements(driver, this);

	}

	// --------This is the tab on global header--------
	@FindBy(xpath = "//a[@href='/manifests']")
	public WebElement ManifestTabPF;
	public static By ManifestTab = (By.xpath("//a[@href='/manifests']"));
	//-----This is the Manifest Tab-------
	
	@FindBy(xpath="//a[@href='/dashboard']")
	public WebElement DashboardTab;
	public static By DashboardTabBy=(By.xpath("//a[@href='/dashboard']"));
	//------This is the Dashboard Tab-------
	
	@FindBy(xpath="//a[@href='/bols']")
	public WebElement BillsOfLadingTab;
	public static By BillsOfLadingTabBy=(By.xpath("//a[@href='/bols']"));
	//------^^^This is the BOL Tab-----
	
	// --------------------------- pop up----------------
	@FindBy(xpath = "//div[contains(text(),'Unable to load User data. Please try again later')]//parent::cbptm-message-dialog/div[3]/button")
	public WebElement UnableToLoadUserDataButton;
	public static By UnableToLoadUserDataButtonBy = (By.xpath("//div[contains(text(),'Unable to load User data. Please try again later')]//parent::cbptm-message-dialog/div[3]/button"));
	// -------This is the pop up button if manifest is unable to load
	@FindBy(xpath="//div[contains(text(),'Unable to load User data. Please try again later')]")
	public WebElement UnableToLoadUserDataText;
	public By UnableToLoadUserDataTextBy=(By.xpath("//div[contains(text(),'Unable to load User data. Please try again later')]"));
///this is the text of Unable To Load User Data Button
	
	@FindBy(xpath = "//div[contains(text(),'Unable to load Manifest. Please try again later')]//parent::cbptm-message-dialog//div[3]/button")
	public  WebElement UnabletoloadManifestButton;
	public static By UnabletoloadManifestButtonBy = (By
			.xpath("//div[contains(text(),'Unable to load Manifest. Please try again later')]//parent::cbptm-message-dialog//div[3]/button"));
	//this is the button for unable to load manifest button
	@FindBy(xpath="//div[contains(text(),'Unable to load Manifest. Please try again later')]")
	public WebElement UnableToLoadManifestText;
	public By UnableToLoadManifestTextBy=(By.xpath("//div[contains(text(),'Unable to load Manifest. Please try again later')]"));
	//this is the text for unable to load manifest text

	@FindBy(xpath="//div[contains(text(),'Unable to load distPortCode data. Please try again later')]//parent::cbptm-message-dialog/div[3]/button")
	public WebElement UnableToLoadDistPortCodeDateButton;
	public By UnableToLoadDistPortCodeDateButtonBy =(By.xpath("//div[contains(text(),'Unable to load distPortCode data. Please try again later')]//parent::cbptm-message-dialog/div[3]/button"));
	//---This is for Unable to load distport code pop up button
	
	@FindBy(xpath="//div[contains(text(),'Unable to get user account metrics. Please try again later')]//parent::cbptm-message-dialog/div[3]/button")
	public WebElement UnableToGetUserAccountButton;
	public By UnableToGetUserAccountButtonBy=(By.xpath("//div[contains(text(),'Unable to get user account metrics. Please try again later')]//parent::cbptm-message-dialog/div[3]/button"));
	//----this is popup for unable to get user account button
	// ------^^^Pop Up Unable to load manifest------
	//--------------POP UPS

	
	//------Search Criteria Elements--------------------
	@FindBy(xpath="//input[@type='search']")
	public WebElement OmniSearchSearchManifestNumberAndMore;
	public By OmniSearchSearchManifestNumberAndMoreBy=(By.xpath("//input[@type='search']"));
	//This is the Search Manifest Text Box Search Manifest Number and more
	@FindBy(xpath="//button[contains(text(),'Add Search Manifest Number and more Filter ')]")
	public WebElement SearchFilterButtonUnderMore;
	public By SearchFilterButtonUnderMoreBy =(By.xpath("//button[contains(text(),'Add Search Manifest Number and more Filter ')]"));
	//---This button is under more for search manifest
	@FindBy(xpath="//*[contains(text(), 'Search Manifest Number and more')]/parent::span/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i")
	public WebElement SearchManifestDeleteButton;
	public By SearchManifestDeleteButtonBy =(By.xpath("//*[contains(text(), 'Search Manifest Number and more')]/parent::span/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i"));
	//----This is the delete button on the filter search for SearchManifest
	
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	public WebElement StartDateTextBox;
	public By StartDateTextBoxBy=(By.xpath("//input[@ng-reflect-placeholder='Start date']"));
	//---This Is the Start Date Text Box to send keys
	@FindBy(xpath="//input[@id='mat-input-1']/parent::div/following-sibling::div/mat-datepicker-toggle/button")
	public WebElement StartDateCalenderIcon;
	public By StartDateCalenderIconBy=(By.xpath("//input[@id='mat-input-1']/parent::div/following-sibling::div/mat-datepicker-toggle/button"));
	//This is for clicking the calender icon to open the calender table
	@FindBy(xpath="//input[@id='mat-input-2']")
	public WebElement EndDateTextBox;
	public By EndDateTextBoxBy=(By.xpath("//input[@id='mat-input-2']"));
	//This is the End Date Text Box
	@FindBy(xpath="//input[@id='mat-input-2']/parent::div/following-sibling::div/mat-datepicker-toggle/button")
	public WebElement EndDateCalenderIcon;
	public By EndDateCalenderIconBy=(By.xpath("//input[@id='mat-input-2']/parent::div/following-sibling::div/mat-datepicker-toggle/button"));
	//This is the End Date Calender Icon to open the calender table
	@FindBy(xpath="//button[contains(text(),'Add Arrival Date Range Filter ')]")
	public WebElement AddDateSearchFilterUnderMore;
	public By  AddDateSearchFilterUnderMoreBy=(By.xpath("//button[contains(text(),'Add Arrival Date Range Filter ')]"));
	//----This is the add date under the more option for search filter
	
	@FindBy(xpath="//input[@ng-reflect-placeholder='Arrival End date']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/parent::cbptm-filter-toolbar-date-range/parent::div/button/i")
	public WebElement DateSearchDeleteButton;
	public By DateSearchDeleteButtonBy =(By.xpath("//input[@ng-reflect-placeholder='Arrival End date']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/parent::cbptm-filter-toolbar-date-range/parent::div/button/i"));
	//---This is the delete button on the filter search for date
	
	@FindBy(xpath="//mat-select[@aria-label='Trip Status']")
	public WebElement TripStatusDropDown;
	public By TripStatusDropDownBy=(By.xpath("//mat-select[@aria-label='Trip Status']"));
	//this is the drop down for Trip Status
	
	@FindBy(xpath="//button[contains(text(),'Add Trip Status Filter ')]")
	public WebElement AddTripStatusFilterUnderMore;
	public By AddTripStatusFilterUnderMoreBy =(By.xpath("//button[contains(text(),'Add Trip Status Filter ')]"));
	//---This is the add trip status button under more
	@FindBy(xpath="//mat-select[@aria-label='Trip Status']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i")
	public WebElement TripStatusSearchFilterDeleteButton;
	public By TripStatusSearchFilterDeleteButtonBy =(By.xpath("//mat-select[@aria-label='Trip Status']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i"));
	//-----This is the delete button on the filter search for date
	
	@FindBy(xpath="//span[contains(text(),'Overdue')]")
	public WebElement OverdueUnderTripStatus;
	public By OverdueUnderTripStatusBy=(By.xpath("//span[contains(text(),'Overdue')]"));
	//this is an overdue that is an option under trip status
	@FindBy(xpath="//mat-option[@id='mat-option-27']//span[contains(.,'Pending')]")
	public WebElement PendingUnderTripStatus;
	public By PendingUnderTripStatusBy=(By.xpath("//mat-option[@id='mat-option-27']//span[contains(.,'Pending')]"));
	//This is pending under Trip status
	@FindBy(xpath="//mat-option[@id='mat-option-28']//span[contains(.,'Unarrived')]")
	public WebElement UnarrivedUnderTripStatus;
	public By UnarrivedUnderTripStatusBy=(By.xpath("//mat-option[@id='mat-option-28']//span[contains(.,'Unarrived')]"));
	//this is Unarrived under Trip Status
	@FindBy(xpath="//mat-option[@id='mat-option-29']//span[contains(.,'Departed')]")
	public WebElement DepartedUnderTripStatus;
	public By DepartedUnderTripStatusBy=(By.xpath("//mat-option[@id='mat-option-29']//span[contains(.,'Departed')]"));
	//this is for departed Under Trip Status
	@FindBy(xpath="//mat-option[@id='mat-option-30']//span[contains(.,'Pending Departure')]")
	public WebElement PendingDepartureUnderTripStatus;
	public By PendingDepartureUnderTripStatusBy=(By.xpath("//mat-option[@id='mat-option-30']//span[contains(.,'Pending Departure')]"));
	//this is pending departure under trip status
	

	
	@FindBy(xpath="//mat-select[@aria-label='Filing Status']")
	public WebElement FilingStatusSelect;
	public By FilingStatusSelectBy=(By.xpath("//mat-select[@aria-label='Filing Status']"));
	//---This is for Filing Status Select
	@FindBy(xpath="//button[contains(text(),'Add Filing Status Filter ')]")
	public WebElement AddFilingButtonUnderMore;
	public By AddFilingButtonUnderMoreBy =(By.xpath("//button[contains(text(),'Add Filing Status Filter ')]"));
	//----This is the add button for Add Filing status under more
	
	@FindBy(xpath="//mat-select[@aria-label='Filing Status']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i")
	public WebElement FilingStatusSearchFilterDeleteButton;
	public By FilingStatusSearchFilterDeleteButtonBy =(By.xpath("//mat-select[@aria-label='Filing Status']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i"));
	//-----This is the delete button on the filter search for Filing Status 
	
	@FindBy(xpath="//span[contains(.,'Fully Closed')]")
	public WebElement FullyClosedUnderFilingStatus;
	public By FullyClosedUderFilingStatus=(By.xpath("//span[contains(.,'Fully Closed')]"));
	//this is fully closed status under filing status
	@FindBy(xpath="//mat-option[@id='mat-option-33']//span[contains(.,'Open')]")
	public WebElement OpenUnderFilingStatus;
	public By OpenUnderFilingStatusBy=(By.xpath("//span[contains(.,'Open')]"));
	//This is Open Status Under Filing Status
	@FindBy(xpath="//span[contains(.,'Partially Closed')]")
	public WebElement PartiallyClosedUnderFilingStatus;
	public By PartiallyClosedUnderFilingStatusBy=(By.xpath("//span[contains(.,'Partially Closed')]"));
	// this is partially closed under filing status
	@FindBy(xpath="//span[contains(.,'Pending')]")
	public WebElement PendingUnderFilingStatus;
	public By PendingUnderFilingStatusBy=(By.xpath("//span[contains(.,'Pending')]"));
	//this is Pending status under filing status
	
	@FindBy(xpath="//button[@class='filter-sub-menu-button mat-flat-button']")
	public WebElement MoreButtonUnderSearchFilter;
	public By MoreButtonUnderSearchFilterBy=(By.xpath("//button[@class='filter-sub-menu-button mat-flat-button']"));
	//---this is for the extra filter that is on manifest page the 3 dot drop
	
	@FindBy(xpath="//button[contains(text(),'Add Arrival Port Filter ')]")
	public WebElement ArrivalPortSearchFilterButtonUnderMore;
	public By ArrivalPortSearchFilterButtonUnderMoreBy=(By.xpath("//button[contains(text(),'Add Arrival Port Filter ')]"));
	//---This is Port Of Arrival Button on More Button on Search Filter
	@FindBy(xpath="//input[@ng-reflect-placeholder='Arrival Port']")
	public WebElement ArrivalPortInputTextBox;
	public By ArrivalPortInputTextBoxBy =(By.xpath("//input[@ng-reflect-placeholder='Arrival Port']"));

	@FindBy(xpath="//input[@ng-reflect-placeholder='Arrival Port']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::cbptm-filter-toolbar-virtual-scroll/parent::div/button/i")
	public WebElement ArrivalPortSearchFilterDeleteButton;
	public By  ArrivalPortSearchFilterDeleteButtonBy=(By.xpath("//input[@ng-reflect-placeholder='Arrival Port']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::cbptm-filter-toolbar-virtual-scroll/parent::div/button/i"));
	//---This is Search filter delete button for arrival port
	
	@FindBy(xpath="//button[contains(text(),'Add Prepared By Filter ')]")
	public WebElement AddPreparedBySearchFilter;
	public By AddPreparedBySearchFilterBy=(By.xpath("//button[contains(text(),'Add Prepared By Filter ')]"));
	//-This is Add Prepared By Filter on More Button on Search Filter
	@FindBy(xpath="//input[@ng-reflect-name='preparerName']")
	public WebElement PreparedByInputTextBox;
	public By  PreparedByInputTextBoxBy=(By.xpath("//input[@ng-reflect-name='preparerName']"));
	//----This is input text box for prepared by
	@FindBy(xpath="//input[@ng-reflect-name='preparerName']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i")
	public WebElement PreparedBySearchFilterDeleteButton;
	public By PreparedBySearchFilterDeleteButtonBy =(By.xpath("//input[@ng-reflect-name='preparerName']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i"));
	//----This is Search filter delete button for PreparedBy
	
	@FindBy(xpath="//button[contains(text(),'Add Prepared For Filter ')]")
	public WebElement AddPreparedForSearchFilter;
	public By AddPreparedForSearchFilterBy =(By.xpath("//button[contains(text(),'Add Prepared For Filter ')]"));
	//-This is Add Prepared For Filter on More Button on Search Filter
	
	@FindBy(xpath="//input[@ng-reflect-name='preparerSCAC']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i")
	public WebElement PreperedForSearchFilterDeleteButton;
	public By PreperedForSearchFilterDeleteButtonBy =(By.xpath("//input[@ng-reflect-name='preparerSCAC']/parent::div/parent::div/parent::div/parent::mat-form-field/parent::div/button/i"));
	//----This is the Search Filter delete button for prepared for
	
	
	//------Search Criteria Elements--------------------
	
}
