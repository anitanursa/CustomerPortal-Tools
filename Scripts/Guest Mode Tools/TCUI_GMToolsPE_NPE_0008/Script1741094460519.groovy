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

WebUI.click(findTestObject('Object Repository/Page_/span_New Estimate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Anita Test')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'QA')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'anita@divistant.com')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), '123456789012')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'Divistant')

WebUI.click(findTestObject('Object Repository/Page_/span_e.g. 1-50'))

WebUI.click(findTestObject('Object Repository/Page_/li_10-50'))

WebUI.click(findTestObject('Object Repository/Page_/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_/img_Select a category_aspect-square w-full _e0a165'))

WebUI.click(findTestObject('Object Repository/Page_/input_Cloud Provisioning_Consulting Advisory'))

WebUI.click(findTestObject('Object Repository/Page_/input_Manage Service_Onsite'))

WebUI.click(findTestObject('Object Repository/Page_/div_Open user menu_flex h-70vh items-center_a35938'))

WebUI.click(findTestObject('Object Repository/Page_/input_Hybrid_pv_id_1_120'))

WebUI.click(findTestObject('Object Repository/Page_/input_Hybrid_pv_id_1_124'))

WebUI.click(findTestObject('Object Repository/Page_/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_/div_DevOps'))

WebUI.click(findTestObject('Object Repository/Page_/input_Cloud Provisioning_Consulting Advisory'))

WebUI.click(findTestObject('Object Repository/Page_/input_Manage Service_Docker'))

WebUI.click(findTestObject('Object Repository/Page_/input_Kubernetes_pv_id_1_147'))

WebUI.click(findTestObject('Object Repository/Page_/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_/td_19'))

WebUI.click(findTestObject('Object Repository/Page_/span_4'))

WebUI.setText(findTestObject('Object Repository/Page_/textarea_General Note_note'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_/input_Password_rounded-md text-primary'), 'test')

WebUI.click(findTestObject('Object Repository/Page_/span_Submit Quotation'))

WebUI.click(findTestObject('Object Repository/Page_/span_View Estimate Details'))

