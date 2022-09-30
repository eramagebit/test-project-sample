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

WebUI.click(findTestObject('Object Repository/test/Page_MDARA Organic Skincare/button_Ataut visas skdatnes'))

WebUI.click(findTestObject('Object Repository/test/Page_MDARA Organic Skincare/div_VEIKALS_menu-dropdownTrigger-1-s'))

WebUI.click(findTestObject('Object Repository/test/Page_Oficilais e-veikals  MDARA Cosmetics/img_FACTORY OUTLET_productCard-image-Wn5 pr_78b824'))

WebUI.click(findTestObject('Object Repository/test/Page_City CC Anti-Pollution toni korijos kr_17d7d7/button_Pievienot grozam'))

WebUI.click(findTestObject('Object Repository/test/Page_City CC Anti-Pollution toni korijos kr_17d7d7/svg_Blogs_iconHover'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpint'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/button_Turpiniet k viesis'))

WebUI.setText(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/input__shipping_postcode'), 
    '1010')

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/label_DPD Kurjers0,49Est. delivery on Oct 0_9a16ee'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/label_Latvijas Pasta PakomtsBezmaksasEst. d_c92a61'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/label_Express Pasts kurjersBezmaksasEst. de_e3ce5f'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/label_DPD Kurjers0,49Est. delivery on Oct 0_9a16ee'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/circle'))

WebUI.click(findTestObject('Object Repository/test/Page_Iepirkumu grozs - MDARA Organic Skincare/svg_Est. delivery on Oct 04, 2022_icon-icon-2oA'))

