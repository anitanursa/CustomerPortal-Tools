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

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/a_Sign In Now'))

WebUI.setText(findTestObject('Object Repository/Shop 6/Page_/input_Email Address_email'), 'customerfinal@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop 6/Page_/input_Password_password'), 'oMZDtYNEoXcflHIxcbpdbSPCmOqiSK0E')

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/a_Shop'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/a_Solution'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/img_Select a tab_absolute inset-0 h-full w-_ef6078'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/span_Select a value'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/li_Describe'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/input_Consulting Advisory_Services'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/label_Remote'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/div_Hybrid_h-8 w-8 cursor-pointer rounded-f_e6ed01'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/input_Hybrid_Platform'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/input_Docker_Platform'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/input_Kubernetes_pv_id_2_27'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/input_Kubernetes_pv_id_2_31'))

WebUI.setText(findTestObject('Object Repository/Shop 6/Page_/textarea_Kubernetes_note'), 'uji coba')

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop 6/Page_/a_Go to cart'))

