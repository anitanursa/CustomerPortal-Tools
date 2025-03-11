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

WebUI.click(findTestObject('Object Repository/Register/Page_/a_Sign In Now'))

WebUI.click(findTestObject('Object Repository/Register/Page_/a_Register Now'))

WebUI.click(findTestObject('Object Repository/Register/Page_/div_Sign In Now_mr- flex h-5 w-5 items-cent_b36b6e'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input_Full Name_fullname'), 'anita')

WebUI.setText(findTestObject('Object Repository/Register/Page_/input_Position_position'), 'QA')

WebUI.setText(findTestObject('Object Repository/Register/Page_/input_Email_email'), 'anita@divistant.com')

WebUI.setText(findTestObject('Object Repository/Register/Page_/input_Phone_phone'), '123456789012')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_/select_AcehBaliBangka BelitungBantenBengkul_eec570'), 
    '621', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_/select_ArjawinangunAstanajapuraBandungBanja_42c8d7'), 
    'Banjar', true)

WebUI.setText(findTestObject('Object Repository/Register/Page_/input_ZIP Code_zipCode'), '123456')

WebUI.setText(findTestObject('Object Repository/Register/Page_/textarea_Address_address'), 'test')

WebUI.click(findTestObject('Object Repository/Register/Page_/button_Sign Up Now'))

