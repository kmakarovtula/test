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

OrderURL = WebUI.concatenate((([GlobalVariable.StagingReact, GlobalVariable.SalesmanURL, 'order/']) as String[]))

WebUI.navigateToUrl(OrderURL)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/instaVINProducts_Label'), 0)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice1'), Vtr1)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice10'), Vtr10)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice50'), Vtr50)

WebUI.setText(findTestObject('LoggedInPages/Order (react)/VINCheckForm_EnterVINInput'), VIN)

WebUI.click(findTestObject('LoggedInPages/Order (react)/CheckVin_ArrowButton'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/ChangeVIN_Cross'), 0)

WebUI.verifyElementVisible(findTestObject('LoggedInPages/Order (react)/OrderNow_OrangeButton'))

WebUI.click(findTestObject('LoggedInPages/Order (react)/OrderNow_OrangeButton'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/Purchase_Button'), 0)

now = new Date()

rnd = now.format('yyyyMMddHHmmssSSS').toString()

Email = WebUI.concatenate(((['salesman', rnd, '@mailinator.com']) as String[]))

WebUI.callTestCase(findTestCase('Base Tests/OrderSignUpBase'), [('FirstName') : 'Salesman', ('LastName') : 'Dealer', ('Email') : Email
        , ('Phone') : '8001112233', ('Address') : 'test', ('City') : 'test', ('State') : 'TX', ('Zip') : '11111', ('CcNumber') : CCNumber
        , ('ExpMonth') : '11', ('ExpYear') : '2020', ('Cvv') : '111', ('Type') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('LoggedInPages/Order (react)/CompletePurchase_Button'), 0)

Price = WebUI.concatenate(((['Only ', Vtr1]) as String[]))

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/Confirm_Price'), Price)

WebUI.click(findTestObject('LoggedInPages/Order (react)/CompletePurchase_Button'))

WebUI.waitForElementPresent(findTestObject('LoggedInPages/Order (react)/VINCheckForm_EnterVINInput'), 0)

WebUI.waitForElementClickable(findTestObject('LoggedInPages/Order (react)/ViewReport_Button'), 0)

WebUI.verifyTextPresent('Thank you for using instaVIN!', false)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/ViewReport - Vin'), VIN)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/ViewReport - ReportType'), 'Vehicle History & Title Report')

WebUI.click(findTestObject('LoggedInPages/Order (react)/ViewReport_Button'))

WebUI.waitForElementVisible(findTestObject('LoggedInPages/ReportSummary/ReportHeader'), 0)

WebUI.verifyElementText(findTestObject('LoggedInPages/ReportSummary/VehicleTitle'), CarTitle)

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/ReportSummary/ReportType'), 'class', 'ReportGrade AlertSuccess', 
    0)

WebUI.verifyElementText(findTestObject('LoggedInPages/ReportSummary/ReportType'), 'No Problems')

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/ReportSummary/VehicleSpecsStatus'), 'class', 'SummaryAlertContainer AlertSuccess', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/ReportSummary/JunkSalvageStatus'), 'class', 'SummaryAlertContainer AlertSuccess', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/ReportSummary/TitleStatus'), 'class', 'SummaryAlertContainer AlertSuccess', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/ReportSummary/OtherStatus'), 'class', 'SummaryAlertContainer AlertSuccess', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('LoggedInPages/ReportSummary/VehicleRecallStatus'), 'class', 'SummaryAlertContainer AlertSuccess', 
    0)

WebUI.verifyElementText(findTestObject('LoggedInPages/ReportSummary/OdometerStatus'), '8events')

WebUI.navigateToUrl(OrderURL)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice1'), Vtr1LoggedIn)

WebUI.verifyElementText(findTestObject('LoggedInPages/Order (react)/VtrPrice10'), Vtr2LoggedIn)

WebUI.closeBrowser()

