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

now = new Date()

rnd = now.format('yyyyMMddHHmmssSSS').toString()

email = WebUI.concatenate((([rnd, '@mailinator.com']) as String[]))

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Email_Input'), rnd)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_Input'), 'test')

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Password_Input'))

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/Email_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Email_ErrorMessage'), 'Invalid email address')

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_ErrorMessage'), 'Does not match the Email Address')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Email_Input'), email)

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Password_Input'))

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/Email_ErrorMessage'), 0)

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_ErrorMessage'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_ErrorMessage'), 'Does not match the Email Address')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_Input'), email)

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Password_Input'))

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/Email_ErrorMessage'), 0)

WebUI.verifyElementNotPresent(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_ErrorMessage'), 0)

WebUI.closeBrowser()

