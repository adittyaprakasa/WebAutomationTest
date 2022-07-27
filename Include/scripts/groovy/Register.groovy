import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.github.javafaker.Faker as Faker




class Register {
	
	Faker faker = new Faker()
	String name = faker.name().firstName()
	String email = name + "@gmail.com"
	
	@Given ("User open browser")
	def User_open_browser() {
		Util.openBrowser()
	}
	
	@When ("User click menu my account")
	def User_click_menu_my_account() {
		WebUI.click(findTestObject('Register/btnMyAcount'))
	}
	
	@And ("User input form register")
	def User_input_form_register() {
		WebUI.setText(findTestObject('Register/regUsername'), name)
		WebUI.setText(findTestObject('Register/regEmail'), email)
		WebUI.setText(findTestObject('Register/regPassword'), 'Password1234567890!')
	}
	
	@And ("User click register")
	def User_click_register() {
		WebUI.click(findTestObject('Register/btnRegister'))
	}
	
	@And ("User login using new user account")
	def User_login_using_new_user_account() {
		WebUI.setText(findTestObject('Register/loginUsername'), email)
		
		WebUI.setText(findTestObject('Register/loginPassword'), 'Password1234567890!')
	}
	
	@And ("User click button login")
	def User_click_button_login() {
		WebUI.click(findTestObject('Register/btnMasuk'))
	}
	
	@Then ("User verify create account and login success")
	def User_verify_create_account_and_login_success() {
		WebUI.verifyElementText(findTestObject('Register/fromYourAccount'), 'From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.')
	}
}