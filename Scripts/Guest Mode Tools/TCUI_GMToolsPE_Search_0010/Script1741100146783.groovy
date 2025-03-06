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

WebUI.click(findTestObject('Object Repository/Page_/a_Project Estimate'))

WebUI.click(findTestObject('Object Repository/Page_/button_New Estimate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'budi')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'qa')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'budi@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), '12345689012')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'pt jaya')

WebUI.click(findTestObject('Object Repository/Page_/span_e.g. 1-50'))

WebUI.click(findTestObject('Object Repository/Page_/li_51-100'))

WebUI.click(findTestObject('Object Repository/Page_/span_Next'))

