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

Email = WebUI.concatenate(((['cadealer', rnd, '@mailinator.com']) as String[]))

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/BusinessName_Input'), 'Test')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/AccessID_Input'), AccessId)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/FirstName_Input'), 'CaDealer')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/LastName_Input'), 'Test')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Address_Input'), 'test')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/City_Input'), 'test')

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/CreateAccount/State_Dropdown'), 'CA', false)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Zip_Input'), '11111')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Phone_Input'), '8001112233')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/BillingFirstName_Input'), 'CaDealer')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/BillingLastName_Input'), 'Test')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/BillingAddress_Input'), 'test')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/BillingZip_Input'), '11111')

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/CcNumber_Input'), CCNumber)

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/CreateAccount/ExpirationMonth_Dropdown'), '6', false)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/CVV_Input'), '111')

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/CreateAccount/ExpirationYear_Dropdown'), '2020', false)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Email_Input'), Email)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/ConfirmEmail_Input'), Email)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/Password_Input'), Pass)

WebUI.setText(findTestObject('LoggedOutPages/CreateAccount/ConfirmPassword_Input'), Pass)

WebUI.check(findTestObject('LoggedOutPages/CreateAccount/AcceptTos_Checkbox'))

WebUI.click(findTestObject('LoggedOutPages/CreateAccount/Submit_button'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/MyAccount/Account_Header'), 0)

WebUI.verifyElementText(findTestObject('LoggedInPages/MyAccount/Account_Header'), 'For CaDealer Test')

OrderURL = WebUI.concatenate((([GlobalVariable.StagingReact, 'order']) as String[]))

WebUI.navigateToUrl(OrderURL)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/instaVINProducts_Label'), 0)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice1'), Vtr1)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice10'), Vtr10)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice50'), Vtr50)

WebUI.closeBrowser()

