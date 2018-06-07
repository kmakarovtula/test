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

WebUI.navigateToUrl(GlobalVariable.StagingReact)

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CommonElements/SignIn_Label'), 0)

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/HomeLoggedOut/EnterVIN_input'), 0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/HomeLoggedOut/EnterVIN_input'), 'placeholder', 
    'ENTER VIN NUMBER', 0)

WebUI.setText(findTestObject('LoggedOutPages/HomeLoggedOut/EnterVIN_input'), VIN)

WebUI.click(findTestObject('LoggedOutPages/HomeLoggedOut/SubmitVinArrow_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/instaVINProducts_Label'), 0)

WebUI.verifyElementVisible(findTestObject('LoggedInPages/Order (react)/ChangeVIN_Cross'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('LoggedInPages/Order (react)/SignIn_MenuLabel'), 0)

WebUI.verifyElementVisible(findTestObject('LoggedInPages/Order (react)/RecordsAreAvailable_Alert'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/RecordsAreAvailable_Alert'), 'Records Are Available For Your Vehicle')

WebUI.verifyElementVisible(findTestObject('LoggedInPages/Order (react)/VINdisplayed'))

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VINdisplayed'), VIN)

WebUI.verifyElementPresent(findTestObject('LoggedInPages/Order (react)/OrderNow_OrangeButton'), 0)

WebUI.closeBrowser()

