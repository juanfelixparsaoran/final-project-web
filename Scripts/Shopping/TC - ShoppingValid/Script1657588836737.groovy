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

WebUI.click(findTestObject('On Sale/span_Shop'))

WebUI.click(findTestObject('Shopping/img_album'))

WebUI.click(findTestObject('Object Repository/Shopping/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shopping/a_View cart'))

WebUI.click(findTestObject('Object Repository/Shopping/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_first_name'), 'Juan')

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_last_name'), 'Felix')

WebUI.setText(findTestObject('Object Repository/Shopping/input_(optional)_billing_company'), 'BFI')

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_address_1'), 'Cidadap')

WebUI.setText(findTestObject('Object Repository/Shopping/input_(optional)_billing_address_2'), 'Blok G')

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_city'), 'Bandung')

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_postcode'), '21141')

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_phone'), '08939482932')

WebUI.setText(findTestObject('Object Repository/Shopping/input__billing_email'), 'poiopoi12@gmail.com')

WebUI.setText(findTestObject('Object Repository/Shopping/textarea_(optional)_order_comments'), 'tambahin ikannya')

WebUI.click(findTestObject('Object Repository/Shopping/input_TEST MODE_payment_method'))

WebUI.click(findTestObject('Object Repository/Shopping/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping/div_IDR 15.000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping/div_Virtual Account'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping/div_Nama Virtual Account'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping/li_Atm'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping/li_Ibanking'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping/li_Mbanking'), 0)

WebUI.closeBrowser()

