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

for (def row = 1; row <= findTestData('LoginData').getRowNumbers(); row++) {
    WebUI.openBrowser('https://marsair.thoughtworks-labs.net/leela')

    WebUI.waitForElementPresent(findTestObject(null), 0)

    WebUI.selectOptionByValue(findTestObject('Page_Mars Airlines Home/Departing'), findTestData('MarsAirData').getValue(
            'Departing', 1), false)

    WebUI.selectOptionByValue(findTestObject('Page_Mars Airlines Home/Returning'), findTestData('MarsAirData').getValue(
            'Returning', 1), false)

    WebUI.setText(findTestObject('Page_Mars Airlines Home/Promotional Code'), findTestData('MarsAirData').getValue('Promotional Code', 
            1))

    WebUI.click(findTestObject('Page_Mars Airlines Home/Search'))
}

