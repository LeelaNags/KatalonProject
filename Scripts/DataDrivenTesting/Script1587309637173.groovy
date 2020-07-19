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
    WebUI.openBrowser('https://www.phptravels.net/login')

    WebUI.setText(findTestObject('LoginPage/Page_Login/Page_Login/Login_username'), findTestData('LoginData').getValue('username', 
            row))

    WebUI.setText(findTestObject('LoginPage/Page_Login/Page_Login/Email_password'), findTestData('LoginData').getValue('password', 
            row))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('LoginPage/Page_Login/Page_Login/Login'))
}

