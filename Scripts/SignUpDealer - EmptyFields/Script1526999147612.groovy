import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

StartURL = WebUI.concatenate((([GlobalVariable.StagingReact, 'create-account']) as String[]))

WebUI.navigateToUrl(StartURL)

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Dealer_Button'))

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Copy_Label'), 'Copy Dealer')

WebUI.verifyTextPresent('Dealer Information', false)

WebUI.verifyTextPresent('AuctionACCESS ID Number', false)

WebUI.verifyTextPresent('Business Name', false)

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Submit_button'))

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BusinessFirstName_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BusinessFirstName_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BusinessLastName_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BusinessLastName_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BusinessAddress_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BusinessAddress_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BusinessCity_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BusinessCity_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/State_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/State_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/Zip_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Zip_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BusinessPhone_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BusinessPhone_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BillingFirstName_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BillingFirstName_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BillingLastName_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BillingLastName_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BillingAddress_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BillingAddress_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/BillingZip_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/BillingZip_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/CC_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/CC_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/ExpirationMonth_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/ExpirationMonth_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/CVV_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/CVV_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/ExpirationYear_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/ExpirationYear_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/Email_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Email_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 'Required')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/AcceptTOS_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/AcceptTOS_ErrorMessage'), 'Please Read and Agree to the Terms of Service to Proceed')

WebUI.closeBrowser()

