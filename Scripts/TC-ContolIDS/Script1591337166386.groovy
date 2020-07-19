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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://marsair.thoughtworks-labs.net/leela')

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/label_Departing'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/label_Returning'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/label_Promotional Code'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/input_Promotional Code_promotional_code'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/h3_Book a ticket to the red planet now'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Home/input'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Search Results/h2_Search Results'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Search Results/p_Sorry there are no more seats available'))

WebUI.click(findTestObject('Object Repository/ContolIDs/Page_Mars Airlines Search Results/a_Back'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://marsair.thoughtworks-labs.net/leela')

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/label_Departing'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/label_Returning'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/label_Promotional Code'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/input_Promotional Code_promotional_code'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/h3_Book a ticket to the red planet now'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/input'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Search Results/h2_Search Results'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Search Results/p_Sorry there are no more seats available'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Search Results/a_Back'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://marsair.thoughtworks-labs.net/leela')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mars Airlines Home/select_SelectJulyDecemberJuly (next year)De_b525ac_1'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Home/input'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Search Results/p_Seats available'))

WebUI.click(findTestObject('Object Repository/Page_Mars Airlines Search Results/p_Call now on 0800 MARSAIR to book'))

WebUI.closeBrowser()

