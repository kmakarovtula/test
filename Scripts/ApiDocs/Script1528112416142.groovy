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

ApiDocURL = WebUI.concatenate((([GlobalVariable.StagingReact, 'api-doc/']) as String[]))

WebUI.navigateToUrl(ApiDocURL)

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/FirstSection'), 'Account Api')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/SecondSection'), 'Order Api')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/ThirdSection'), 'Report Api')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/FirstRowFirstSection'), '/api/v3/{smimetype}/account/user')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/SecondRowFirstSection'), '/api/v3/{smimetype}/account/reports')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/ThirdRowFirstSection'), '/api/v3/{smimetype}/account/report_accessibility')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/FourthRowFirstSection'), '/api/v3/{smimetype}/account/access_token')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/FirstRowSecondSection'), '/api/v3/{smimetype}/order/{type}')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/SecondRowSecondSection'), '/api/v3/{smimetype}/order/{type}/{orderId}')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/FirstRowThirdSection'), '/api/v3/{smimetype}/report/{linkCode}')

WebUI.verifyElementText(findTestObject('LoggedOutPages/ApiDoc/SecondRowThirdSection'), '/api/v3/{smimetype}/report/{type}/availability')

WebUI.closeBrowser()

