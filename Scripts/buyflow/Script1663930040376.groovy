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

WebUI.navigateToUrl('https://www.idryneedle.com/')

WebUI.click(findTestObject('Object Repository/Page_iDryNeedle  Better Tools Better Outcomes/a_Shop'))

WebUI.click(findTestObject('Object Repository/Page_Shop All Products/a_iDryNeedle Starter Kit - The Dry Needle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/select_-- Please Select --SMALLMEDIUMLARGEE_be54f8'), 
    '33', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/select_-- Please Select --WHITE'), 
    '37', true)

WebUI.click(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/a_My Cart11items'))

WebUI.click(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/button_Proceed to Checkout'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/input_Password_loginpassword'), 
    'qP27s7IhH/3RoER5QrSq7A==')

WebUI.setText(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/input_Email_loginusername'), 
    'gitog89935@bongcs.com')

WebUI.click(findTestObject('Object Repository/Page_Dry Needle Starter Kit featuring The D_1e28dd/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_Shipping Address                       _3b2853'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 1_street0'), 'Test Street')

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 2_street1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 1_street0'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_City_city'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_city'), 'Montreal')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_United StatesAustraliaCanadaU.S. Out_a796f6'), 
    'AU', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_United StatesAustraliaCanadaU.S. Out_a796f6'), 
    'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_237ad9'), 
    '74', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'), '33332')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Phone Number_telephone'), '2131231231')

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Payment Method_paymentmethod'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Credit Card Number_paymentcc_number'), '65753634')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Month01 - January02 - February03 - M_2fae30'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Year20222023202420252026202720282029_dc5189'), 
    '2027', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Card Verification Number_paymentcc_cid'), '212')

