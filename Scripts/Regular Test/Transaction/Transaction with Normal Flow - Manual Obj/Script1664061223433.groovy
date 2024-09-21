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

WebUI.callTestCase(findTestCase('Regular Test/Blocks/Block-Login valid - Manual Obj'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectWebSpy/02-Product Page/btn_Add to cart Backpack'))

WebUI.click(findTestObject('ObjectWebSpy/02-Product Page/btn_Add to cart Bike Light'))

WebUI.click(findTestObject('ObjectWebSpy/02-Product Page/btn_shopping cart link'))

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/03-Cart Page/txt_Your Cart'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/03-Cart Page/txt_Sauce Labs Backpack'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/03-Cart Page/txt_Sauce Labs Backpack 29.99'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/03-Cart Page/txt_Sauce Labs Bike Light'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/03-Cart Page/txt_Sauce Labs Bike Light 9.99'), 0)

WebUI.click(findTestObject('ObjectWebSpy/03-Cart Page/btn_Checkout'))

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/04-Checkout Information Page/txt_Checkout Your Information'), 0)

WebUI.setText(findTestObject('ObjectWebSpy/04-Checkout Information Page/txtField_firstName'), FirstName)

WebUI.setText(findTestObject('ObjectWebSpy/04-Checkout Information Page/txtField_lastName'), LastName)

WebUI.setText(findTestObject('ObjectWebSpy/04-Checkout Information Page/txtField_postalCode'), ZipPostalCode)

WebUI.click(findTestObject('ObjectWebSpy/04-Checkout Information Page/btn_continue'))

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Checkout Overview'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Sauce Labs Backpack'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Sauce Labs Backpack price_29.99'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Sauce Labs Bike Light'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Sauce Labs Bike Light price_9.99'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Shipping Information'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_FREE PONY EXPRESS DELIVERY'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Tax 3.20'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/05-Confirmation Page/txt_Total 43.18'), 0)

WebUI.click(findTestObject('ObjectWebSpy/05-Confirmation Page/btn_Finish'))

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/06-Thank you Page/img_Your order has been dispatched'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/06-Thank you Page/txt_Checkout Complete'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/06-Thank you Page/txt_h2_THANK YOU FOR YOUR ORDER'), 0)

WebUI.verifyElementPresent(findTestObject('ObjectWebSpy/06-Thank you Page/txt_Your order has been dispatched'), 0)

WebUI.click(findTestObject('ObjectWebSpy/06-Thank you Page/btn_Back Home'))

WebUI.waitForElementPresent(findTestObject('ObjectWebSpy/02-Product Page/txt_Products Page'), 0)

WebUI.closeBrowser()

