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

WebUI.click(findTestObject('Object Repository/thrthrth/Page_MDARA Organic Skincare/button_Ataut visas skdatnes'))

WebUI.click(findTestObject('Object Repository/thrthrth/Page_MDARA Organic Skincare/div_TAVA VAJADZBA_menu-dropdownTrigger-1-s'))

WebUI.mouseOver(findTestObject('madaracosmetics/Page_Oficilais e-veikals  MDARA Cosmetics/img_Pielaiko tous virtuli_productCard-image_3588ae'))

WebUI.click(findTestObject('madaracosmetics/Page_Oficilais e-veikals  MDARA Cosmetics/img_Pielaiko tous virtuli_productCard-image_3588ae'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Fake It patonjos serums sejas dai  MDA_f24777/button_Pievienot grozam'))

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Fake It patonjos serums sejas dai  MDA_f24777/span_1'))

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint'))

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/span_Turpiniet k viesis'))

WebUI.click(findTestObject('thrthrth/li_country'))

WebUI.click(findTestObject('thrthrth/OptionLatvia'))

WebUI.click(findTestObject('thrthrth/li_country'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/li_Libya'))

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/li_Latvia'))

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/h3_Apstiprini piegdes veidu'))

WebUI.setText(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_postcode'), 
    '6666')

WebUI.click(findTestObject('Object Repository/thrthrth/Page_Iepirkumu grozs - MDARA Organic Skincare/div_DPD Kurjers0,49Est. delivery on Oct 05,_bbe9db'))

