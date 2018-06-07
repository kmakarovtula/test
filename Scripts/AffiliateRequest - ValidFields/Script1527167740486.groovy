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

WebUI.click(findTestObject('LoggedOutPages/CommonElements/Affiliate_Link'))

WebUI.waitForElementClickable(findTestObject('LoggedOutPages/Affiliate/SignUpTop_Button'), 0)

WebUI.verifyTextPresent('Put your website to work for you! Earn extra revenue with instaVIN® vehicle history reports.', 
    false)

WebUI.click(findTestObject('LoggedOutPages/Affiliate/SignUpTop_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedOutPages/Affiliate/AffiliateSignUp_Header'), 0)

now = new Date()

rnd = now.format('yyyyMMddHHmmssSSS').toString()

Email = WebUI.concatenate(((['affiliate', rnd, '@mailinator.com']) as String[]))

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/CompanyName_Input'), '111111')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/CompanyWebsite_Input'), 'www.test.co')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/Address_Input'), 'test')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/City_Input'), 'test')

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/Affiliate/Country_Dropdown'), 'US', false)

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/Affiliate/State_Dropdown'), 'TX', false)

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/Zip_Input'), '11111')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/FirstName_Input'), 'Affiliate')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/LastName_Input'), 'Autotest')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/Email_Input'), Email)

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/Phone_Input'), '8001112233')

WebUI.setText(findTestObject('LoggedOutPages/Affiliate/Message_InputArea'), 'Test message text')

WebUI.check(findTestObject('LoggedOutPages/Affiliate/Tos_Checkbox'))

WebUI.click(findTestObject('LoggedOutPages/Affiliate/Submit_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedOutPages/Affiliate/TopNotification'), 0)

WebUI.verifyElementText(findTestObject('LoggedOutPages/Affiliate/TopNotification'), 'Message has been sent. An instaVIN team member will contact you shortly.')

WebUI.closeBrowser()

