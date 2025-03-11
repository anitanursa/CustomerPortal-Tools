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

WebUI.click(findTestObject('Object Repository/Register 5/Page_/a_Sign In Now'))

WebUI.click(findTestObject('Object Repository/Register 5/Page_/a_Register Now'))

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_Full Name_fullname'), 'anita test katalon 2')

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_Position_position'), 'qaaaaaa')

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_Email_email'), 'anita@divistant.com')

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_Phone_phone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_Company Name_companyName'), 'Divista')

WebUI.click(findTestObject('Object Repository/Register 5/Page_/input_Company Name_companyName'))

WebUI.click(findTestObject('Object Repository/Register 5/Page_/div_Company Name'))

WebUI.click(findTestObject('Object Repository/Register 5/Page_/input_Company Name_companyName'))

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_Company Name_companyName'), 'Divistat')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register 5/Page_/select_JakartaKota Administrasi Jakarta Bar_13cf19'), 
    'Kota Administrasi Jakarta Barat', true)

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/textarea_Address_address'), 'test')

WebUI.setText(findTestObject('Object Repository/Register 5/Page_/input_ZIP Code_zipCode'), '123456')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register 5/Page_/select_1-1010-5050-100100-500500-10001000'), 
    '10-50', true)

WebUI.click(findTestObject('Object Repository/Register 5/Page_/input_Estimate Number of employees_border-1_733bf2'))

WebUI.click(findTestObject('Object Repository/Register 5/Page_/button_Sign Up Now'))

