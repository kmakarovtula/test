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

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Password_Input'), '11')

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Email_Input'))

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 'Must be at least 6 characters')

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_ErrorMessage'), 0)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Password_Input'), Pass)

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Email_Input'))

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 0)

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_ErrorMessage'), 0)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_Input'), '11')

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Email_Input'))

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 0)

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_ErrorMessage'), 'Does not match the Account Password')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_Input'), Pass)

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Email_Input'))

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/Password_ErrorMessage'), 0)

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_ErrorMessage'), 0)

WebUI.closeBrowser()

