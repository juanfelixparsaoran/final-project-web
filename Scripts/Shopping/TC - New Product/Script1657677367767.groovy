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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('New Product/span_Shop'))

WebUI.click(findTestObject('New Product/a_New Products'))

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_New_woocommerce-placeholder wp-post-image'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_Frozen Tempe Furai Original 400 g'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/bdi_Rp56.200'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_New_attachment-woocommerce_thumbnail si_3f99c3'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_External Product'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/bdi_Rp11.000'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_New_attachment-woocommerce_thumbnail si_3f99c3_1'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_Beanie with Logo'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/bdi_Rp20.000'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_New_attachment-woocommerce_thumbnail si_3f99c3_1_2'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_T-Shirt with Logo'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/bdi_Rp18.000'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_Sale'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_Sale_attachment-woocommerce_thumbnail s_432ea2'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_Single'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_Rp3 Rp2'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_New_attachment-woocommerce_thumbnail si_3f99c3_1'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_Album'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_Rp15.000'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/span_New'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_Polo'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/bdi_Rp20.000'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/img_New_attachment-woocommerce_thumbnail si_3f99c3_1'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/h2_Sunglasses'), 0)

WebUI.verifyElementPresent(findTestObject('New Product/bdi_Rp90.000'), 0)

WebUI.closeBrowser()

