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

WebUI.navigateToUrl(StartURL)

WebUI.mouseOver(findTestObject('LoggedOutPages/HomeLoggedOut/Dealers_Label'))

WebUI.verifyElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/CaliforniaDealers_Link'))

WebUI.click(findTestObject('LoggedOutPages/HomeLoggedOut/CaliforniaDealers_Link'))

WebUI.waitForElementVisible(findTestObject('LoggedOutPages/Dealers/SignUpTop_Button'), 0)

WebUI.verifyTextPresent('instaVIN Reports complies with the California Assembly Bill 1215 salvage sticker law', false)

WebUI.verifyTextPresent('CA Law AB1215 Overview', false)

WebUI.click(findTestObject('LoggedOutPages/Dealers/SignUpTop_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedOutPages/Dealers/DealerSignUp_Header'), 0)

now = new Date()

rnd = now.format('yyyyMMddHHmmssSSS').toString()

Email = WebUI.concatenate(((['dealer', rnd, '@mailinator.com']) as String[]))

WebUI.setText(findTestObject('LoggedOutPages/Dealers/DealerName_Input'), 'Test Dealer')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/AccessID_Input'), '111111')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/Website_Input'), 'www.test.co')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/Address_Input'), 'test')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/City_Input'), 'test')

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/CreateAccount/State_Dropdown'), 'CA', false)

WebUI.setText(findTestObject('LoggedOutPages/Dealers/Zip_Input'), '11111')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/FirstName_Input'), 'Dealer')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/LastName_Input'), 'Autotest')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/Email_Input'), Email)

WebUI.setText(findTestObject('LoggedOutPages/Dealers/Phone_Input'), '8001112233')

WebUI.setText(findTestObject('LoggedOutPages/Dealers/Message_InputArea'), 'Test message text')

WebUI.click(findTestObject('LoggedOutPages/Dealers/DealerSubmit_Button'))

WebUI.waitForElementPresent(findTestObject('LoggedOutPages/Dealers/Confirmation_Modal'), 0)

WebUI.verifyTextPresent('Click OK to be redirected to instaVIN® Dealer pricing. Dealers - Buy in Bundles and Save!', false)

WebUI.click(findTestObject('LoggedOutPages/Dealers/OkConfirmation_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedOutPages/DealersOrder/EnterVin_Field'), 0)

RedirectURL = WebUI.getUrl()

ExpectedURL = WebUI.concatenate((([StartURL, '_O/CA-Dealer-Specials/order']) as String[]))

WebUI.verifyEqual(RedirectURL, ExpectedURL)

WebUI.closeBrowser()

