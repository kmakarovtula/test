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

now = new Date()

rnd = now.format('yyyyMMddHHmmssSSS').toString()

Email = WebUI.concatenate(((['buyer', rnd, '@mailinator.com']) as String[]))

WebUI.callTestCase(findTestCase('Base Tests/SignUpConsumerBase'), [('EmailBase') : Email, ('CCNumberBase') : CCNumber, ('PassBase') : Pass], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/MyAccount/Account_Header'), 0)

WebUI.verifyElementText(findTestObject('LoggedInPages/MyAccount/Account_Header'), 'For Consumer Test')

OrderURL = WebUI.concatenate((([GlobalVariable.StagingReact, 'order/']) as String[]))

WebUI.navigateToUrl(OrderURL)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/instaVINProducts_Label'), 0)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/VINCheckForm_EnterVINInput'), 0)

WebUI.setText(findTestObject('LoggedInPages/Order (react)/VINCheckForm_EnterVINInput'), VIN)

WebUI.click(findTestObject('LoggedInPages/Order (react)/CheckVin_ArrowButton'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/OrderNow_OrangeButton'), 0)

WebUI.click(findTestObject('LoggedInPages/Order (react)/SeventhPricePoint'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('LoggedInPages/Order (react)/OrderNow_OrangeButton'))

WebUI.click(findTestObject('LoggedInPages/Order (react)/OrderNow_OrangeButton'))

WebUI.scrollToElement(findTestObject('LoggedInPages/Order (react)/CompletePurchase_Button'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('LoggedInPages/Order (react)/CompletePurchase_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/DataError_Message'), 0)

MyAccountURL = WebUI.concatenate((([GlobalVariable.StagingReact, 'my-account']) as String[]))

WebUI.navigateToUrl(MyAccountURL)

WebUI.verifyElementText(findTestObject('LoggedInPages/MyAccount/CreditsNumber'), '0')

WebUI.click(findTestObject('LoggedInPages/MyAccount/BillingHistorySideMenu_Tab'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/BillingHistory/GridHeader'), 0)

WebUI.verifyElementNotPresent(findTestObject('LoggedInPages/BillingHistory/FirstRow_Description'), 0)

WebUI.closeBrowser()

