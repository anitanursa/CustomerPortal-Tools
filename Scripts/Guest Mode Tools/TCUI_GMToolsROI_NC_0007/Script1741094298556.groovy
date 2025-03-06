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

WebUI.click(findTestObject('Object Repository/Page_/a_ROI Calculator'))

WebUI.click(findTestObject('Object Repository/Page_/span_Guest Mode_absolute -inset-1.5'))

WebUI.click(findTestObject('Object Repository/Page_/svg_Password_h-5 w-5 text-gray-400'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Anita Tes')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'QA')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'anita@divistant.com')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), '123456789012')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Divistant')

WebUI.click(findTestObject('Object Repository/Page_/span_e.g. 1-50'))

WebUI.click(findTestObject('Object Repository/Page_/span_10-50'))

WebUI.click(findTestObject('Object Repository/Page_/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Deployment Frequency_deploymentFrequency'), '2')

WebUI.setText(findTestObject('Object Repository/Page_/input_Lead Time_leadTime'), '2')

WebUI.setText(findTestObject('Object Repository/Page_/input_Change Failure Rate_changeFailureRate'), '2')

WebUI.setText(findTestObject('Object Repository/Page_/input_Mean Time to Recover_meantimeToRecover'), '2')

WebUI.setText(findTestObject('Object Repository/Page_/input_Rp_averageSalary'), '120.000.000')

WebUI.setText(findTestObject('Object Repository/Page_/input_Team Size_teamSize'), '10')

WebUI.setText(findTestObject('Object Repository/Page_/input_Rp_infrastructureCost'), '')

WebUI.click(findTestObject('Object Repository/Page_/input_Rp_infrastructureCost'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Rp_infrastructureCost'), '120.000.000')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

