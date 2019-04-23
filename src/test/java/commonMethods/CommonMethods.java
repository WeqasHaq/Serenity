package commonMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import basePackage.BaseClass;

public class CommonMethods extends BaseClass {

	public static void selectMethod(WebElement elements, String value) {
		Select sel = new Select(elements);
		sel.selectByValue(value);
	}

	/*********************************************************************************************************
	 * Above is using page factory and allowing selecting a drop down with Using
	 * value
	 *********************************************************************************************************/

	public static void selectMethodIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/*********************************************************************************************************
	 * Above is using page factory and allowing selecting a drop down with Using
	 * Index
	 *********************************************************************************************************/

	public static void selectMethodVisableText(WebElement element, String visableText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visableText);
	}

	/*********************************************************************************************************
	 * Above is using page factory and allowing selecting a drop down with Using
	 * visable text
	 *********************************************************************************************************/

	public static void enterText(WebElement text, String texts) {
		// Thread.sleep(2000);
		// text.wait(3000);
		text.sendKeys(texts);
	}

	/*********************************************************************************************************
	 * Above is using page factory and allowing send text
	 *********************************************************************************************************/

	public static void clickMethod(WebElement element) {
		element.click();
	}

	/*********************************************************************************************************
	 * Above is using page factory and allowing click method
	 *********************************************************************************************************/

	public static void clearMethod(WebElement element) {
		element.clear();
	}

	/*********************************************************************************************************
	 * Above is using page factory and allowing clear a text field method
	 *********************************************************************************************************/

	public static void actionMethodHover(WebElement element) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(element).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using page factory and using Action Class to just hover over element
	 * with no action
	 *********************************************************************************************************/

	public static void actionMethodHoverTwoElements(WebElement InitialElement, WebElement TargetElement) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(InitialElement).moveToElement(TargetElement).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using page factory and using Action Class to just hover over one
	 * element and hover over a second element with no action
	 *********************************************************************************************************/

	public static void actionMethodHoverTwoElementsClick(WebElement InitialElement, WebElement TargetElement) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(InitialElement).moveToElement(TargetElement).click().build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using page factory and using Action Class to just hover over one
	 * element and hover over a second element then adding a click this is mainly
	 * used for a dropdown
	 *********************************************************************************************************/

	public static void actionMethodSendingKeysUsingKeys(WebElement InitialElement, String text) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(InitialElement).sendKeys(text).sendKeys(Keys.ENTER).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using page factory and using Action Class to just hover over one
	 * element and sendkeys and then using the Keys.enter for keyboard action
	 *********************************************************************************************************/

	public static void actionMethodSendingKeysUsing(WebElement InitialElement, String text) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(InitialElement).sendKeys(text).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using page factory and using Action Class to just hover over one
	 * element and sendkeys
	 *********************************************************************************************************/

	public static boolean elementISDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	/*********************************************************************************************************
	 * Above is using page factory and asserting if element is present
	 *********************************************************************************************************/

	public static Object javaScriptExecute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/*********************************************************************************************************
	 * Above is using Page Factory and JavaScriptExecute to scroll into view
	 *********************************************************************************************************/

	public static Object javaScriptExecuteClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].click();", element);
	}

	/*********************************************************************************************************
	 * Above is using Page Factory and JavaScriptExecute to click on element
	 *********************************************************************************************************/

	public static void clickMethodBy(By by) {
		driver.findElement(by).click();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and clicking on element
	 *********************************************************************************************************/

	public static void selectMethodtextByVisableTextBy(By element, String visableText) {
		Select sel = new Select(driver.findElement(element));
		sel.selectByVisibleText(visableText);
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and selecting a element by Visable
	 * Visable Text
	 *********************************************************************************************************/

	public static void selectMethodtextByValueBy(By elements, String Value) {
		Select sel = new Select(driver.findElement(elements));
		sel.selectByValue(Value);
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and selecting a element by value
	 *********************************************************************************************************/

	// ---------^^^^Selecting by Visable Value^^^^----------------
	public static void selectMethodtextByIndexBy(By elements, int index) {
		Select sel = new Select(driver.findElement(elements));
		sel.selectByIndex(index);
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and selecting a element by Index
	 *********************************************************************************************************/

	public static void explicitWaitByClickBy(By xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using Explicit Wait to click
	 *********************************************************************************************************/

	public static void explicitWaitBySendingKeysBy(By xpath, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).sendKeys(text);
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using Explicit Wait to send keys
	 *********************************************************************************************************/

	public static void explicitWaitByNoActionBy(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using Explicit Wait to locate element
	 * without any action
	 *********************************************************************************************************/

	public static void actionMethodByHoverBy(By element) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(element)).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using action class is just using
	 * hover over without any action
	 *********************************************************************************************************/

	public static void actionMethodByHoverTwoElementsBy(By InitialElement, By TargetElement) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement))
				.moveToElement(driver.findElement(TargetElement)).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using action class is just using
	 * hover over to one element to the second element without any action
	 *********************************************************************************************************/

	public static void actionMethodByHoverTwoElementsClickBy(By InitialElement, By TargetElement) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement))
				.moveToElement(driver.findElement(TargetElement)).click().build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using action class is just using
	 * hover over to one element to the second element and click on element
	 *********************************************************************************************************/

	public static void actionMethodBySendKeysUsingKeysBy(By InitialElement, String text) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement)).sendKeys(text).sendKeys(Keys.ENTER).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using action class and hover over to
	 * one element and send keys and send keys and use ENTER keyboard action
	 *********************************************************************************************************/

	public static void actionMethodBySendKeysUsingBy(By InitialElement, String text) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement)).sendKeys(text).build();
		a.perform();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and using action class and hover over to
	 * one element and send keys
	 *********************************************************************************************************/

	public static void enterTextBy(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and send keys
	 *********************************************************************************************************/

	public static boolean elementISDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By asserting if element is present
	 *********************************************************************************************************/

	public static String getTextOfElement(By text) {
		return driver.findElement(text).getText();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and getting text from element
	 *********************************************************************************************************/

	public static String getTitleOfCurrentPage() {
		return driver.getTitle();
	}

	/*********************************************************************************************************
	 * Above is using Page Object Model By and getting title of current page
	 *********************************************************************************************************/

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*********************************************************************************************************
	 * Above is using Implicit Wait
	 *********************************************************************************************************/

	// Notes just in case i mess up on methods
	/*
	 * 
	 * Actions builder = new Actions(driver); Action seriesOfActions = builder
	 * .moveToElement(txtUsername) .click() .keyDown(txtUsername, Keys.SHIFT)
	 * .sendKeys(txtUsername, "hello") .keyUp(txtUsername, Keys.SHIFT)
	 * .doubleClick(txtUsername) .contextClick() .build();
	 * seriesOfActions.perform();
	 */
	// ----------------------------------------------------------------------------------------------------------------
	// These are Helper Methods for me
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].click();", loginButton);
	// js.executeScript("arguments[0].scrollIntoView(true);",
	// ManifestLandingPage.manifestNumber);
	// ----------------------------------------------------------------------------------------------------------------
}