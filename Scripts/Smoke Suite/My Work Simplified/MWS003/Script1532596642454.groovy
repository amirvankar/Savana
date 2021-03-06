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

//Login into application
CustomKeywords.'actions.Common.login'()

//Click on "My Work Simplified" link
WebUI.click(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/a_My Work Simplified'))
CustomKeywords.'actions.Common.waitForFrameToLoad'(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/iframe_iframe_110'))

//Select Activity 'Closure Action - Activity A' from Drop down
WebUI.waitForElementVisible(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/select_Auto Import Controlled'), GlobalVariable.G_LongTimeout)
WebUI.selectOptionByLabel(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/select_Auto Import Controlled'), 'Closure Action - Activity A', false)
CustomKeywords.'actions.Common.waitForFrameToLoad'(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/iframe_iframe_110'))

//Open Search div
WebUI.waitForElementVisible(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/h3_Search'), GlobalVariable.G_LongTimeout)
WebUI.click(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/h3_Search'))
CustomKeywords.'actions.Common.waitForFrameToLoad'(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/iframe_iframe_110'))

//Enter DocID value to be searched - 106845
String docId_Search = '106845'
WebUI.setText(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_DocID'), docId_Search)

//Enter Process Due Date Start and End
WebUI.setText(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_ProcessDueDate_Start'), '01-01-2018 12:00:00 AM')
WebUI.setText(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_ProcessDueDate_End'), '02-28-2018 12:00:00 AM')

//Click on Reset button
WebUI.click(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_btnReset'))
CustomKeywords.'actions.Common.waitForFrameToLoad'(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/iframe_iframe_110'))

//Validate values in filter fields are reset to blank
WebUI.verifyElementAttributeValue(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_DocID'), 'value', "", GlobalVariable.G_LongTimeout)
WebUI.verifyElementAttributeValue(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_ProcessDueDate_Start'), 'value', "", GlobalVariable.G_LongTimeout)
WebUI.verifyElementAttributeValue(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/input_Search_ProcessDueDate_End'), 'value', "", GlobalVariable.G_LongTimeout)

//Verify search section is hidden
WebUI.verifyElementNotVisible(findTestObject('Page_nGage_Dashboard/My_Work_Simplified/table_search_section'))