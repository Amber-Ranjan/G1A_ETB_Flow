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

'Wait for Element Visible "Touch Me"'
Mobile.waitForElementPresent(findTestObject('003_Create_G1A/001_Apply_For_G1A/01_GetElementText_Dashboard- Quick Actions'), 
    30)

'Verify Element Visible "Touch Me"'
Mobile.verifyElementVisible(findTestObject('003_Create_G1A/001_Apply_For_G1A/01_GetElementText_Dashboard- Quick Actions'), 
    30)

'Initializing Katalon Mobile Driver to Appium Driver'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

'Get Device Height and store to "device_Height" variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and store to "device_Width" variable'
device_Width = Mobile.getDeviceWidth()

'Get X1 coordinate of touchpoint 1 (Top Left Side)'
int X1 = device_Width * 0.20

'Get Y1 coordinate of touch action 1 (Top Left Side)'
int Y1 = device_Height * 0.20

'Get X2 coordinate of touchpoint 2 (Top Right Side)'
int X2 = device_Width * 0.80

'Get Y2 coordinate of touchpoint 2 (Top Right Side)'
int Y2 = device_Height * 0.20

'Get X3 coordinate of touchpoint 3 (Bottom Left Side)'
int X3 = device_Width * 0.20

'Get Y3 coordinate of touchpoint 3 (Bottom Left Side)'
int Y3 = device_Height * 0.80

'Get X4 coordinate of touchpoint 4 (Bottom Right Side)'
int X4 = device_Width * 0.80

'Get Y4 coordinate of touchpoint 4 (Bottom Right Side)'
int Y4 = device_Height * 0.80

'Create object to "MultiTouchAction" class '
MultiTouchAction multiTouch = new MultiTouchAction(driver)

'Create First action Object to "TouchAction" class'
TouchAction action1 = new TouchAction(driver)

'Create Second action Object to "TouchAction" class'
TouchAction action2 = new TouchAction(driver)

'Create Third action Object to "TouchAction" class'
TouchAction action3 = new TouchAction(driver)

'Create Fourth action Object to "TouchAction" class'
TouchAction action4 = new TouchAction(driver)

'Press First action with x y coordinates wait 5 Seconds then release'
action1.press(PointOption.point(X1, Y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Press Second action with x y coordinates wait 5 Seconds then release'
action2.press(PointOption.point(X2, Y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Press Third action with x y coordinates wait 5 Seconds then release'
action3.press(PointOption.point(X3, Y3)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Press Fourth action with x y coordinates wait 5 Seconds then release'
action4.press(PointOption.point(X4, Y4)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Multi Touch Object to add Multiple touch actions as per you need'
multiTouch.add(action1).add(action2).add(action3).add(action4).perform()

