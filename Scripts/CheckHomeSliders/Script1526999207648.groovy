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

if (WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/HomeLoggedOut/PromoSlide_Div'), 'class', 
    'slick-slide slick-active slick-current', 0, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('LoggedOutPages/HomeLoggedOut/SliderRightArrow'))

    WebUI.waitForElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/SecondAppsSlide'), 0)

    WebUI.waitForElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/FactoryOptions_Link'), 0)

    WebUI.click(findTestObject('LoggedOutPages/HomeLoggedOut/SliderLeftArrow'))

    WebUI.waitForElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/Free_Link'), 0)
} else if (WebUI.verifyElementAttributeValue(findTestObject('LoggedOutPages/HomeLoggedOut/AppsSlide_Div'), 
    'class', 'slick-slide slick-active slick-current', 0, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('LoggedOutPages/HomeLoggedOut/SliderLeftArrow'))

    WebUI.waitForElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/FirstPromoSlide'), 0)

    WebUI.waitForElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/Free_Link'), 0)

    WebUI.click(findTestObject('LoggedOutPages/HomeLoggedOut/SliderRightArrow'))

    WebUI.waitForElementVisible(findTestObject('LoggedOutPages/HomeLoggedOut/FactoryOptions_Link'), 0)
}

WebUI.closeBrowser()

