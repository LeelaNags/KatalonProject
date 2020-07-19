import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.interactions.Action

WebUI.openBrowser('http://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html')
WebDriver driver = DriverFactory.getWebDriver()


driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

Thread.sleep(3000);
Actions builder = new Actions(driver);
	
WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div[1]/div[1]/div/input"));

// To get pixel count of Slider X axis and Y axis(267,25)

Dimension sliderWidth = draggablePartOfScrollbar.getSize();
System.out.println(sliderWidth);

// We need to give below value in +00 to move slider to 50 and +130 to move slider to 100,-100 to move slider to 12
	
int numberOfRangeToDragTheSlider = +00;
builder.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(numberOfRangeToDragTheSlider, 0).release().perform();
