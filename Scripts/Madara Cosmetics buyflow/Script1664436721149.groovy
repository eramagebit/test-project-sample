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

WebUI.navigateToUrl('https://www.madaracosmetics.com/lv')

WebUI.verifyElementVisible(findTestObject('Object Repository/madaracosmetics/Page_MDARA Organic Skincare/button_Ataut visas skdatnes'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_MDARA Organic Skincare/button_Ataut visas skdatnes'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_MDARA Organic Skincare/div_TAVA VAJADZBA_menu-dropdownTrigger-1-s'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Oficilais e-veikals  MDARA Cosmetics/img_Pielaiko tous virtuli_productCard-image_3588ae'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Velvet Wear Matta krmveida lpu krsa/button_Pievienot grozam'))

WebUI.click(findTestObject('Object Repository/Page_MDARA Organic Skincare/svg_Blogs_iconHover'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/span_Turpiniet k viesis'))

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_postcode'), 
    '1010')

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Est. delivery on Oct 03, 2022_icon-icon-2oA'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Apstiprini piegdes veidu'))

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Tavs e-pasts_email'), 
    'elvijs.raudis@magebit.com')

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Piegdes dati_shipping_addressfirstname'), 
    'John')

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_addresslastname'), 
    'Doe')

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_addressstreet0'), 
    'Adrese 1')

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Adrese 2_shipping_addresscity'), 
    'Riga')

WebUI.setText(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Phone_form-control'), 
    '+371 225 462 67')

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint_1'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/li_dau novads'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint_1'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Maksjuma detaas_icon-icon-2oA'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/div_Es piekrtu Mjaslapas noteikumiem'))

WebUI.click(findTestObject('Object Repository/madaracosmetics/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Trustly_icon-icon-2oA'))

