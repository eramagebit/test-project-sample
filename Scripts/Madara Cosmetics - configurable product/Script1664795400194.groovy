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

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_MDARA Organic Skincare/button_Ataut visas skdatnes'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_MDARA Organic Skincare/span_Latvieu'))

WebUI.click(findTestObject('madaracosmeticsconfigurableproduct/li_valsts'))

WebUI.click(findTestObject('madaracosmeticsconfigurableproduct/OptionLatvija'))

WebUI.click(findTestObject('madaracosmeticsconfigurableproduct/li_valoda'))

WebUI.click(findTestObject('madaracosmeticsconfigurableproduct/OptionLatviesu'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_MDARA Organic Skincare/button_Apstiprint'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_MDARA Organic Skincare/div_MAKE-UP_menu-dropdownTrigger-1-s'))

WebUI.mouseOver(findTestObject('madaracosmeticsconfigurableproduct/Page_MDARA Organic Skincare/span_Latvieu'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Dekoratv kosmtika  MDARA Cosmetics/img__productCard-image-Wn5 productCard-loaded-3jY'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Izgaismojos korektors - THE CONCEALER/button__text-primary visualSwatch-tile-TlL'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Izgaismojos korektors - THE CONCEALER/button_Pievienot grozam'))

WebUI.delay(3)

not_run: WebUI.mouseOver(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Izgaismojos korektors - THE CONCEALER/span_1'))

WebUI.mouseOver(findTestObject('Object Repository/madaracosmetics2/Page_Velvet Wear Matta krmveida lpu krsa/span_1'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Velvet Wear Matta krmveida lpu krsa/button_Atvrt grozu'))

WebUI.takeScreenshotAsCheckpoint('ss1')

WebUI.click(findTestObject('Object Repository/madaracosmetics2/Page_Velvet Wear Matta krmveida lpu krsa/button_Atvrt grozu'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/span_Turpiniet k viesis'))

WebUI.takeScreenshotAsCheckpoint('ss2')

WebUI.click(findTestObject('thrthrth/li_country'))

WebUI.click(findTestObject('thrthrth/OptionLatvia'))

WebUI.click(findTestObject('thrthrth/li_country'))

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_postcode'), 
    '1010')

WebUI.takeScreenshotAsCheckpoint('ss3')

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/label_Express Pasts kurjersBezmaksasEst. de_1e1712'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('ss4')

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Apstiprini piegdes veidu'))

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Tavs e-pasts_email'), 
    'test@test.lv')

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Piegdes dati_shipping_addressfirstname'), 
    'John')

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_addresslastname'), 
    'Doe')

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_addressstreet0'), 
    'Adrese 2')

WebUI.click(findTestObject('madaracosmetics2/Page_Iepirkumu grozs - MDARA Organic Skincare/li_dau novads'))

WebUI.click(findTestObject('madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/li_Aizputes novads'))

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Phone_form-control'), 
    '226 785 43')

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint_1'))

WebUI.setText(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/input_Adrese 2_shipping_addresscity'), 
    'Jelgava')

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint_1'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/label_PayPal'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/label_PayPal'))

WebUI.click(findTestObject('Object Repository/madaracosmeticsconfigurableproduct/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Trustly_icon-icon-2oA_1'))

