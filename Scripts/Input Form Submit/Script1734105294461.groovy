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

WebUI.navigateToUrl('https://www.lambdatest.com/selenium-playground/')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/a_Input Form Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Name_name'), 'Satpal')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Email_email'), 
    'abc@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Password_password'), 
    'iGDxf8hSRT4=')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Company_company'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Website_website'), 
    'katalon.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/select_Choose an optionAfghanistanAland Isl_fe9708'), 
    'AR', true)

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_City_city'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Address_address_line1'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Address_address_line2'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_State_inputState'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Zip Code_zip'), 
    '123 345')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/p_Thanks for contacting us, we will get bac_e85023'), 
    'Thanks for contacting us, we will get back to you shortly.')

WebUI.closeBrowser()

