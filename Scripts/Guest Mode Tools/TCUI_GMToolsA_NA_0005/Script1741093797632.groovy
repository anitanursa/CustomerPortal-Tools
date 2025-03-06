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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://apps.divistant.net/')

WebUI.click(findTestObject('Object Repository/Page_/a_Tools'))

WebUI.click(findTestObject('Object Repository/Page_/a_Appointment'))

WebUI.click(findTestObject('Object Repository/Page_/span_New Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Test Anita')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'anita@divistant.com')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), '1234556789012')

WebUI.click(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Divistant')

WebUI.click(findTestObject('Object Repository/Page_/span_Select a type'))

WebUI.click(findTestObject('Object Repository/Page_/li_POC'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_/textarea__p-textarea p-component p-filled'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_/input__pv_id_1_42'), '03/04/2025 20:10')

WebUI.click(findTestObject('Object Repository/Page_/div_10'))

WebUI.click(findTestObject('Object Repository/Page_/span_4'))

WebUI.click(findTestObject('Object Repository/Page_/button_Today'))

WebUI.click(findTestObject('Object Repository/Page_/span_11'))

WebUI.click(findTestObject('Object Repository/Page_/div_Full Name Email Address Phone Company A_8c8afe'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Bekonang')

WebUI.click(findTestObject('Object Repository/Page_/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_/span_Back to Dashboard'))

