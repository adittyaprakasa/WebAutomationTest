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

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('Register/btnMyAcount'))

username = 'agustus'

email = 'agustus@gmail.com'

password = 'Password1234567890!'

WebUI.setText(findTestObject('Register/regUsername'), username)

WebUI.setText(findTestObject('Register/regEmail'), email)

WebUI.setText(findTestObject('Register/regPassword'), password)

WebUI.click(findTestObject('Register/btnRegister'))

WebUI.setText(findTestObject('Register/loginUsername'), email)

WebUI.setText(findTestObject('Register/loginPassword'), password)

WebUI.click(findTestObject('Register/btnMasuk'))

WebUI.verifyElementText(findTestObject('Register/fromYourAccount'), 'From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.')

WebUI.closeBrowser()

