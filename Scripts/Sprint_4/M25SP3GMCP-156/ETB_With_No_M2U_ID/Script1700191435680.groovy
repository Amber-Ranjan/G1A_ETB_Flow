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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0101_UserTapsOnApplyButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0102_VerifyElementText - Apply'), 'Apply')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6456848409182062547.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0103_UserTapsOnG1A_Tile - A foreign currencyaccount with a globalmulti-currency card'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0104_VerifyElementText - Global Access Account-i'), 
    'Global Access Account-i')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7668033841911330295.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0105_UserTapsOnApplyNow'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0106_VerifyElementText- Please fill in your MyKad number'), 
    'Please fill in your MyKad number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4788870103533017366.png')

Mobile.setText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0107_UserEnters_MyKad_ID - Enter Your MyKad Number'), 
    '040201092126', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2532968933326850831.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0108_UserTapOnNext'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot9194193189503084153.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0109_VerifyElementText_Pop-Up_Header - Register Maybank2u to continue your application'), 
    'Register Maybank2u to continue your application.')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0110_VerifyElementText_Body - We noticed that youre an existing Maybank customer. Kindly register for Maybank2u online banking access to continue this application'), 
    'We noticed that you\'re an existing Maybank customer. \n\nKindly register for Maybank2u online banking access to continue this application.')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0111_UserTapsOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0112_VerifyElementText_WhenUserNavigatedBack - Please fill in your MyKad number'), 
    'Please fill in your MyKad number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5710956829955170212.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0113_UserTapsOn_Next'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2807513458478470033.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0114_UserTapsOn_ActivateSecure2U'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-156/0115_VerifyElementText - Verify your access number and pin'), 
    'Verify your access number and pin.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot256656598675528732.png')

