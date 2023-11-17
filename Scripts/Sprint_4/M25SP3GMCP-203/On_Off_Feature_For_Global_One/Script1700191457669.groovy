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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/01_UserIsOnDashboard - Quick Actions'),
	'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4066789733016101100.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/02_UserTapsOnApplyButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/03_UserIsOnApplyScreen - Apply'), 'Apply')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6727899205165811739.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/04_UserTapsOnG1ATile - A foreign currencyaccount with a globalmulti-currency card'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/05_VerifyElementText - Global Access Account-i'),
	'Global Access Account-i')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3537518575728752529.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/06_UserTapsOnApply'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/07_VerifyElementText - Please fill in your MyKad number'),
	'Please fill in your MyKad number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7442002493229844871.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/08_UserTapsOnCloseIcon'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2877631183734907928.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/09_UserTapsOnHomeIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-203/10_VerifyElementText_UserOnDashboard - Quick Actions'),
	'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3032519982625845650.png')


/*


Mobile.verifyElementText(findTestObject('null'),
	'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6382936876208788576.png')

Mobile.tap(findTestObject('null'), 0)

Mobile.verifyElementText(findTestObject('null'),
	'6-digit PIN')

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('004_Login/15_Create_Pin_Get_Text - Your PIN no. is 111111'), 0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your PIN no. is ', '')

def otpArr = otpText.toCharArray()

'Pin is entered to login'
for (def i = 0; i < otpArr.length; i++) {
	if ((otpArr[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

//Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7186285078779083070.png')
Mobile.verifyElementText(findTestObject('null'), 'Logout')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot359086767914084065.png')

Mobile.tap(findTestObject('null'), 0)

Mobile.verifyElementText(findTestObject('null'), 'Apply')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3462841016511737506.png')

Mobile.tap(findTestObject('null'),
	0)

Mobile.delay(2)

if (Mobile.verifyElementText(findTestObject('null'),
	'Global Access Account-i') == true) {
	Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot770706229420467187.png')

	Mobile.tap(findTestObject('null'), 0)

	Mobile.verifyElementText(findTestObject('null'),
		'Apply')

	Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5085663742423347971.png')
} else {
	Mobile.delay(2)

	Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5085663742423347971.png')
}
*/
