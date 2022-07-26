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

WebUI.click(findTestObject('Checkout/btnCart'))

WebUI.click(findTestObject('Checkout/btnCheckout'))

WebUI.setText(findTestObject('Checkout/txtFirstName'), 'Aditya')

WebUI.setText(findTestObject('Checkout/txtLastName'), 'Prakasa')

WebUI.setText(findTestObject('Checkout/txtCompany'), 'Tokopedia')

WebUI.click(findTestObject('Checkout/dropdownCountry'))

WebUI.setText(findTestObject('Checkout/txtDropdownCountry'), 'Indonesia')

WebUI.sendKeys(findTestObject('Checkout/txtDropdownCountry'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Checkout/txtStreet'), 'Pesanggrahan')

WebUI.setText(findTestObject('Checkout/txtApartment'), 'SPV')

WebUI.setText(findTestObject('Checkout/txtCity'), 'Jakarta')

WebUI.click(findTestObject('Checkout/dropdownProvince'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/txtDropDownProvince'), 'DKI Jakarta')

WebUI.sendKeys(findTestObject('Checkout/txtDropDownProvince'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Checkout/txtPostcode'), '11840')

WebUI.setText(findTestObject('Checkout/txtPhone'), '625611829011')

WebUI.setText(findTestObject('Checkout/txtEmail'), 'juni@gmail.com')

WebUI.click(findTestObject('Checkout/checkboxTerm'))

WebUI.click(findTestObject('Checkout/btnPlaceOrder'))

thanks = WebUI.getText(findTestObject('Checkout/thankYouLetter'))

WebUI.verifyElementText(findTestObject('Checkout/thankYouLetter'), thanks)

