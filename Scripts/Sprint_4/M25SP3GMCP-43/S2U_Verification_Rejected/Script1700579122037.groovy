import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Verify Element Text user is on Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/12_VerifyElementText_S2uScreen - Secure2u authorisation'), 
    'Secure2u authorisation')

'User Taps on Reject Button'
Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/01_UserTapsOn_Reject_Button'), 0)

Mobile.delay(4)

'VerifyElement Text for Authorisation Failed'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/02_VerifyElementText - Authorisation failed'), 
    'Authorisation failed')

Mobile.delay(2)

'VerifyElement Text for Your Secure Verification authorisation was rejected.'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/03_VerifyElementText - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

Mobile.delay(2)

'VerifyElement Text for Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/04_VerifyElementText- Reference ID'), 
    'Reference ID')

Mobile.delay(2)

'VerifyElement Text for Date Time'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/05_VerifyElementText - Date  time'), 'Date & time')

Mobile.delay(2)

'VerifyElement Text for Transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/06_VerifyElementText - Transaction type'), 
    'Transaction type')

Mobile.delay(2)

'VerifyElement Text for Apply Account'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/07_VerifyElementText - Apply Account'), 
    'Apply Account')

Mobile.delay(2)

//Mobile.verifyElementText(findTestObject('Sprint_4/M25SP3GMCP-40/08_VerifyElementText - 20 Nov 2023, 0307 PM'), '20 Nov 2023, 03:07 PM')
'VerifyElement Text for Current Date and Time'
Mobile.delay(2)

//Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/09_VerifyElementText - 192704798M'), '192704798M')
'VerifyElement Text for Transaction ID'
Mobile.delay(2)

'Take screenshot for failed verification screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5898603403332883952.png')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/10_UserTapsOnDone'), 0)

Mobile.delay(4)

'VerifyElement Text when user navigates to Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/11_VerifyElementText - Apply'), 'Apply')

Mobile.delay(2)

'Take screenshot when user is on Apply screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot9161235303176223012.png')

Mobile.takeScreenshot()

'User Taps on Home button'
Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-40/12_UserTapsOnHomeButton'), 0)

Mobile.delay(2)

'Take screenshot once user navigates to homescreen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot682140506697060157.png')

Mobile.takeScreenshot()

