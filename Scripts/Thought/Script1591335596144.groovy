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
import org.openqa.selenium.Keys as Keys


WebUI.navigateToUrl('https://marsair.thoughtworks-labs.net/leela')

WebUI.selectOptionByValue(findTestObject('Object Repository/Thought/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Thought/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac_1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Thought/Page_Mars Airlines Home/input_Promotional Code_promotional_code'), 
    '64373737347')

WebUI.click(findTestObject('Object Repository/Thought/Page_Mars Airlines Home/input'))

WebUI.closeBrowser()

