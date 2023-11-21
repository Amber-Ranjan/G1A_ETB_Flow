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
'Application Launched\r\n'
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/01_VerifyElementText-UserIsOnDashboard- Quick Actions'),
	'Quick Actions')

'Dashboard Screenshot Taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/01_UserIsOnDashboard')

Mobile.takeScreenshot()

'Clicked on Apply button present on the footer right corner'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/02_Tap_On_ApplyButton_FooterRightCorner'), 0)

Mobile.delay(2)

'Verify Element Text when user reaches Step 1 of Step 4 of G1A application form\r\n'
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/03_VerifyElementText-UserIsOnApplyScreen'),
	'Apply')

'Screenshot for the Apply Page is taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/02_UserIsOnApplyScreen')

'User taps on the Global 1 account'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/04_ClickOn_GlobalAccessAccount-i'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/05_VerifyElementText_UserIsOnGlobalAccessAccount-i'),
	'Global Access Account-i')

'Screenshot for the G1A Apply Now page is taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/03_UserInside_GlobalOneAccount')

Mobile.takeScreenshot()

'User Clicked on Apply Now'
Mobile.tap(findTestObject('003_Create_G1A/Steps/06_TapOnApplyNowButton'), 0)

Mobile.delay(5)

/*
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
*/
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/10_UserNavigatedTo - Step 1 of 4'), 'Step 1 of 4')

'Screenshot for the Step 1 of Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/06_UserOnStep_1of4')

Mobile.takeScreenshot()

/*
'User scrolls to the city field'
Mobile.scrollToText('City')

Mobile.delay(2)

'City is set to Kuala Lumpur'
Mobile.setText(findTestObject('003_Create_G1A/Steps/11_SetText_City_KualaLumpur'), 'Kuala Lumpur', 0)

'Screenshot of Step 1 before navigating to Step 2'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/07_Step1_ScreenShot')

Mobile.takeScreenshot()
*/

'User taps on Step 1 Next button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/12_ClickStep1_Next'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/13_UserNavigatedTo - Step 2 of 4'), 'Step 2 of 4')

'Screenshot upon navigating to Step 2 of Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/08_UserNavigatedToStep2')

Mobile.takeScreenshot()



'User CLicks on Next button on Step 2 '
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/14_ClickStep2_Next'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/15_UserNavigatedTo - Step 3 of 4'), 'Step 3 of 4')

'Screenshot upon navigating to Step 3 of Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/08.1_UserNavigatedToStep2')

Mobile.takeScreenshot()

'User taps on state dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/16_StateDropdown'), 0)

Mobile.delay(2)

'Screenshot is taken for state dropdown'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/09_StateDropdown')

Mobile.takeScreenshot()

'User taps on done after selecting the state'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/17_StateSelection- Done'), 0)

Mobile.delay(2)

'user taps on district dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/18_DistrictDropdown'), 0)

Mobile.delay(2)

'Screenshot for the district dropdown elements'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/10_DistrictDropdown')

Mobile.takeScreenshot()

//Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/19_TapOn - Kuala Lumpur - fromDropdown'), 0)
'User selects Kuala Lumpur as district from the dropdown'
Mobile.scrollToText('Kuala Lumpur')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/19.1_SelectKualaLumpur - Kuala Lumpur'), 0)

Mobile.delay(2)

'Screenshot for selecting Kuala Lumpur as district from the dropdown'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/11_SelectKualaLumpurFromDistrictDropdown')

Mobile.takeScreenshot()

'User taps on done after seleting the district from the dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/20_DistrictSelection - Done'), 0)

Mobile.delay(2)

'User taps on the branch dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/21_BranchDropdown'), 0)

Mobile.delay(2)

'screenshot for the branch dropdown value is captured'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/12_BranchDropdown')

Mobile.takeScreenshot()

'User taps on Done button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/22_BranchSelection - Done'), 0)

Mobile.delay(2)

'Screenshot for Step 3 before navigating to Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/13_Step3Screenshot')

Mobile.takeScreenshot()

'User taps on Next to navigate to the Step 4 of the application'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/23_ClickStep3_Next'), 0)

Mobile.delay(5)


Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/34_UserNavigatedTo- Step 4 of 4'), 'Step 4 of 4')

'Screenshot of the screen upon navigating to Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/14_UserIsOn_Step_4')

Mobile.takeScreenshot()

'User taps on Next to navigate to the debit card delivery details'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/35_ClickStep4_Next'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/36_UserNavigatedTo- Debit Card Delivery Details'),
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

'user taps on final confirmation button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/81_ClickOnFinalConfirmationPage'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/android.widget.TextView - Transfer from'),
	'Transfer from')

'Screenshot after user navigated to amount Screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/43_UserNavigatedToAmountTransferScreen')

Mobile.takeScreenshot()

Mobile.delay(5)

'Screenshot when amount to be paid is displayed as RM 50'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/10_Displayed_Amount_Is_RM_50')

Mobile.takeScreenshot()

'User taps on Pay Now button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/15_Tap_On_PayNowButton'), 0)

Mobile.delay(5)



