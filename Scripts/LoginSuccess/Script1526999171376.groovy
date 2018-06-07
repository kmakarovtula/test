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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(StartURL)

WebUI.verifyElementPresent(findTestObject('LoggedOutPages/CommonElements/SignIn_Label'), 0)

WebUI.mouseOver(findTestObject('LoggedOutPages/CommonElements/SignIn_Label'))

WebUI.verifyElementVisible(findTestObject('LoggedOutPages/CommonElements/SignIn_Label'))

WebUI.verifyElementVisible(findTestObject('LoggedOutPages/CommonElements/ForgotPassword_Link'))

WebUI.setText(findTestObject('LoggedOutPages/CommonElements/Email_input'), Email)

WebUI.setText(findTestObject('LoggedOutPages/CommonElements/Password_input'), Pass)

WebUI.click(findTestObject('LoggedOutPages/CommonElements/SignIn_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Dashboard/Dashboard_Header'), 0)

LoginRedirect = WebUI.getUrl()

ExpectedLoginRedirect = WebUI.concatenate((([GlobalVariable.StagingReact, 'my-account']) as String[]))

WebUI.verifyMatch(LoginRedirect, ExpectedLoginRedirect, false)

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/MyAccount/DashboardSideMenu_Tab'), 'class', 
    'SideMenuTab ActiveSideMenu', 0)

WebUI.mouseOver(findTestObject('LoggedInPages/MyAccount/MyAccount_Label'))

WebUI.verifyElementPresent(findTestObject('LoggedInPages/MyAccount/DropdownLogout'), 3)

WebUI.closeBrowser()

