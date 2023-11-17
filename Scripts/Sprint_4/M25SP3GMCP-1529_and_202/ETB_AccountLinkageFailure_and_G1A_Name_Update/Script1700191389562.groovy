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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/01_VerifyElementText - Quick Actions'), 
    'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot541691586479841402.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/02_UserTapsOnApplyButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/03_VerifyElementText - Apply'), 'Apply')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3998564160408235589.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/04_UserTapsOnG1A_Tile - A foreign currencyaccount with a globalmulti-currency card'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/05_VerifyElementText - Global Access Account-i'), 
    'Global Access Account-i')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8650297366191659169.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/06_UserTapsOnApplyNow'), 0)

//--------------------------------------------------------------------------------------------------------------------------------------------------------
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/07_VerifyElementText_UserIsOn_Enter your password_Screen'), 
    'Enter your password', FailureHandling.CONTINUE_ON_FAILURE)

'Screenshot for Password Screen is taken\r\n'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/04_EnterPasswordScreen')

Mobile.takeScreenshot()

'Keyboard hidden'
Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

'Password is provided in the password field'
Mobile.setText(findTestObject('003_Create_G1A/Steps/08_SetText_PasswordEntered'), 'Pass@135', 0, FailureHandling.CONTINUE_ON_FAILURE)

'Screenshot aftre entering the password is taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/05_PasswordEntered')

Mobile.takeScreenshot()

'User clicks on the continue button after entering the password'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/09_Tap_OnContinueButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

//--------------------------------------------------------------------------------------------------------------------------------------------------------
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/07_VerifyElementText - Step 1 of 4'), 
    'Step 1 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5380456162373830124.png')

Mobile.scrollToText('City')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1182718899075220675.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/08_UserTapsOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/09_VerifyElementText- Step 2 of 4'), 
    'Step 2 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1688505907129063459.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/10_ClearText_EmployersName'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6671959168188091366.png')

Mobile.setText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/11_SetText - e.g Maybank'), 'Maybank', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5203820804093625922.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/12_UserTapsOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/13_VerifyElementText - Step 3 of 4'), 
    'Step 3 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot9134990351836618044.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/14_TapOnStateDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8253789617509606281.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/15_TapDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4681836134792522000.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/16_TapOnDistrictDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7487361408403663166.png')

Mobile.scrollToText('Kuala Lumpur')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4229436373271908375.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/17_UserTapsOnDone'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/18_UserTapsOnBranchDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5952416013075772657.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/19_UserTapsOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2883252086277524145.png')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/20_UserTapsOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/21_VerifyElementText - Step 4 of 4'),
	'Step 4 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4000965545057679680.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/22_Step4_HeaderText - Debit Card'),
	'Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/23_Step4_BoldHeaderText - Here is the pre-selected debit card design for you'),
	'Here is the pre-selected debit card design for you')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/24_Step4_ChargesText - Note You will be charged RM 8.00 upon successful card application'),
	'Note: You will be charged RM 8.00 upon successful card application.')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/25_Step4_TypeOfCreditCard - Maybank MasterCard Global Access World Debit Card'),
	'Maybank MasterCard Global Access World Debit Card')

Mobile.tap(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/26_UserTapsOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_4/M25SP3GMCP-1529/27_DebitCardDeliveryDetails- Debit Card Delivery Details'),
	'Debit Card Delivery Details')






'Screenshot after navigating to the debit card delivery details screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/15_UserIsOn_DebitCardDeliveryScreen')

Mobile.takeScreenshot()

'User scrolls the screen down to get to the terms and conditions'
Mobile.swipe(0, 300, 0, 0)

Mobile.delay(4)

'Screenshot after scrolling down on the terms and conditions'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/16_ScrollTo_Terms_and_Conditions')

Mobile.takeScreenshot()

'User selects the radio button as an acceptance to terms and conditions'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/37.1_RadioButton'), 0)

Mobile.delay(2)

'Screenshot of the screen before proceeding to the declaration screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/17_AgreeTo_Terms_and_Conditions')

Mobile.takeScreenshot()

'User taps on next button to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/38_ClickNextOnDeliveryScreen'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/39_UserNavigatedTo - Declaration - Screen'),
	'Declaration')

'Screenshot after navigating to the declarations creen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/18_User_On_Declaration_Screen')

Mobile.takeScreenshot()

'User taps on the agree radio button in the declaration screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/40_TapOn - Yes, I expressly agree to be contacted'), 0)

Mobile.delay(2)

'Screenshot of declaration screen before navigating to the details confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/19_Selected_Yes_InDeclarationScreen')

Mobile.takeScreenshot()

'User taps on Agree and Continue button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/41_TapOn_AgreeAndConfirm'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/42_UserNavigatesTo_DetailsConfirmationScreen - Please confirm the details below'),
	'Please confirm the details below')

'Screenshot after User gets navigated to the details confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/20_UserRedirectedToFinalConfirmationScreen')

Mobile.takeScreenshot()

'User Swipe screen to Aditional Details screen'
Mobile.swipe(0, 400, 0, 0)

Mobile.delay(2)

'Screenshot after the sceen is scrolled'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/20_UserRedirectedToFinalConfirmationScreen')

Mobile.takeScreenshot()




'user taps on final confirmation button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/81_ClickOnFinalConfirmationPage'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/android.widget.TextView - Transfer from'),
	'Transfer from')

'Screenshot after user navigated to amount Screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/43_UserNavigatedToAmountTransferScreen')

Mobile.takeScreenshot()



'user taps on final confirmation button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/81_ClickOnFinalConfirmationPage'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/android.widget.TextView - Transfer from'),
	'Transfer from')

'Screenshot after user navigated to amount Screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/43_UserNavigatedToAmountTransferScreen')

Mobile.takeScreenshot()

