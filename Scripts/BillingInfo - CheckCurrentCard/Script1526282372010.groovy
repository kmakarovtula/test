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

WebUI.callTestCase(findTestCase('Base Tests/LoginBaseTest'), [('PassBase') : Pass, ('EmailBase') : Email], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('LoggedInPages/MyAccount/Account_Header'))

HeaderText = WebUI.concatenate(((['For ', FirstName, ' ', LastName]) as String[]), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('LoggedInPages/MyAccount/Account_Header'), HeaderText)

WebUI.click(findTestObject('LoggedInPages/BillingInfo/BillingInfoSideMenu_Link'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/MyAccount/BillingInfoSideMenu_Tab'), 0)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/BillingInfo/VisaImage'), 0)

WebUI.verifyTextPresent('•••• •••• •••• 2224', false)

WebUI.closeBrowser()

