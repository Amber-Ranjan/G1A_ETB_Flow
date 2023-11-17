import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.Duration as Duration
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption

'Start the application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/01_VerifyElementText - Quick Actions'),
	'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7331876752136828789.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/02_UserTapsOnApplyIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/03_VerifyElementText - Apply'), 'Apply')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8463234106935881759.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/04_UserTapsOn_G1A_Tile - A foreign currencyaccount with a globalmulti-currency card'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/05_VerifyElementText - Global Access Account-i'),
	'Global Access Account-i')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1374729306638575767.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/06_UserTapsOnApplyNow'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/07_VerifyElementText - Please fill in your MyKad number'),
	'Please fill in your MyKad number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8238067929754168200.png')

Mobile.setText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/08_MyKadID_Entered - Enter Your MyKad Number'),
	'980112105212', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4613376958141318233.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/09_UserTapsOnNext'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-153/11_UserTapsOnNetworkLogs - NETWORK LOGS'), 0)



