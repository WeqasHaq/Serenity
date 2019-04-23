package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseClass;


public class ManifestCreatePage extends BaseClass{
	
	public ManifestCreatePage() {
		PageFactory.initElements(driver, this);
	}
	
	//----Create Header (Top Header) under Create Header Stepper
	@FindBy(xpath="//span[cont{ains(text(), 'Create Header')]")
	public WebElement CreateHeaderTextUnderCreateHeaderStepper;
	public By CreateHeaderTextUnderCreateHeaderStepperBy=(By.xpath("//span[contains(text(), 'Create Header')]"));
	//----Create Header (Top Header) under Create Header Stepper
	
	// --Manifest Link
	@FindBy(xpath="//div[contains(text(), 'Manifests')]")
	public WebElement ManifestLink;
	public static By ManifestLinkBy=(By.xpath("//div[contains(text(), 'Manifests')]"));
}