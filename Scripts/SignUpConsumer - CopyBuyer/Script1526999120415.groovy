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

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Copy_Label'), 'Copy Buyer')

WebUI.verifyTextPresent('Buyer Information', false)

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Name_Label'), 'Name')

WebUI.verifyElementText(findTestObject('LoggedOutPages/CreateAccount/Address_Label'), 'Address')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/FirstName_Input'), 'Consumer')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/LastName_Input'), 'Last')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Address_Input'), 'TestAddress')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/City_Input'), 'Autotest')

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/CreateAccount/State_Dropdown'), 'CA', false)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Zip_Input'), '11111')

WebUI.check(findTestObject('LoggedOutPages/CreateAccount/Copy_Checkbox'))

WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/CreateAccount/BillingFirstName_Input'), 'value', 'Consumer', 
    0)

WebUI.verifyElementHasAttribute(findTestObject('LoggedOutPages/CreateAccount/BillingFirstName_Input'), 'disabled', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/CreateAccount/BillingLastName_Input'), 'value', 'Last', 
    0)

WebUI.verifyElementHasAttribute(findTestObject('LoggedOutPages/CreateAccount/BillingLastName_Input'), 'disabled', 0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/CreateAccount/BillingAddress_Input'), 'value', 'TestAddress', 
    0)

WebUI.verifyElementHasAttribute(findTestObject('LoggedOutPages/CreateAccount/BillingAddress_Input'), 'disabled', 0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/CreateAccount/BillingZip_Input'), 'value', '11111', 
    0)

WebUI.verifyElementHasAttribute(findTestObject('LoggedOutPages/CreateAccount/BillingZip_Input'), 'disabled', 0)

WebUI.closeBrowser()

