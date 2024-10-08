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

WebUI.callTestCase(findTestCase('Visual Testing/Block-TC/block-Open Browser with config'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ObjectWebSpy/01-Homepage-Login/img_LogoLogin'), 0)

WebUI.takeScreenshotAsCheckpoint('img_login_page')

WebUI.setText(findTestObject('ObjectWebSpy/01-Homepage-Login/txtField_username'), GlobalVariable.username)

WebUI.setText(findTestObject('ObjectWebSpy/01-Homepage-Login/txtField_password'), GlobalVariable.password)

WebUI.click(findTestObject('ObjectWebSpy/01-Homepage-Login/btn_login'))

WebUI.verifyElementNotPresent(findTestObject('ObjectWebSpy/01-Homepage-Login/txt_error'), 0)

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/02-Product Page/txt_Products Page'), 0)

WebUI.takeScreenshotAsCheckpoint('img_listing_product_page')

WebUI.click(findTestObject('ObjectWebSpy/02-Product Page/hamburger_Menu'))

WebUI.click(findTestObject('ObjectWebSpy/02-Product Page/btn_Logout'))

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/01-Homepage-Login/img_LogoLogin'), 0)

WebUI.takeScreenshotAsCheckpoint('img_after_logout_page')

WebUI.closeBrowser()

