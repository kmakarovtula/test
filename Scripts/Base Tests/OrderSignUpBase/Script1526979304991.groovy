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

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/FirstName_Input'), FirstName)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/LastName_Input'), LastName)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/Address_Input'), Address)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/City_Input'), City)

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/OrderLoggedOut/State_Dropdown'), State, false)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/Zip_Input'), Zip)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/Phone_Input'), Phone)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/Email_Input'), Email)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/CcNumber_Input'), CcNumber)

WebUI.setText(findTestObject('LoggedOutPages/OrderLoggedOut/CVV_Input'), Cvv)

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/OrderLoggedOut/ExpirationMonth_Dropdown'), ExpMonth, false)

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/OrderLoggedOut/ExpirationYear_Dropdown'), ExpYear, false)

WebUI.selectOptionByValue(findTestObject('LoggedOutPages/OrderLoggedOut/UserType_Dropdown'), Type, false)

WebUI.check(findTestObject('LoggedOutPages/OrderLoggedOut/Terms_Checkbox'))

WebUI.click(findTestObject('LoggedInPages/Order (react)/Purchase_Button'))

