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

WebUI.setViewPortSize(1100, 800)

WebUI.navigateToUrl('https://www.madaracosmetics.com/lv')

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_MDARA Organic Skincare/button_Ataut visas skdatnes'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_MDARA Organic Skincare/div_TAVA VAJADZBA_menu-dropdownTrigger-1-s'))

WebUI.mouseOver(findTestObject('Object Repository/madaracosmetics2/Page_Oficilais e-veikals  MDARA Cosmetics/img_Pielaiko tous virtuli_productCard-image_3588ae'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Oficilais e-veikals  MDARA Cosmetics/img_Pielaiko tous virtuli_productCard-image_3588ae'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Velvet Wear Matta krmveida lpu krsa/button_Pievienot grozam'))

WebUI.mouseOver(findTestObject('Object Repository/madaracosmetics2/Page_Velvet Wear Matta krmveida lpu krsa/span_1'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Velvet Wear Matta krmveida lpu krsa/button_Atvrt grozu'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/span_Turpiniet k viesis'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_postcode'), 
    '1010')

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('test/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Est. delivery on Oct 04, 2022_icon-icon-2oA'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Apstiprini piegdes veidu'))

WebUI.setText(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Tavs e-pasts_email'), 
    'test@test.lv')

WebUI.setText(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Piegdes dati_shipping_addressfirstname'), 
    'John')

WebUI.setText(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_addresslastname'), 
    'Doe')

WebUI.setText(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_addressstreet0'), 
    'Adrese 1')

WebUI.setText(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Adrese 2_shipping_addresscity'), 
    'Riga')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/li_dau novads'))

WebUI.click(findTestObject('madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/OptionAdazu'))

WebUI.click(findTestObject('madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Piegdes dati_shipping_addressfirstname'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Phone_form-control'), 
    '22222463')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Maksjuma detaas_icon-icon-2oA'))

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Trustly_icon-icon-2oA'))

