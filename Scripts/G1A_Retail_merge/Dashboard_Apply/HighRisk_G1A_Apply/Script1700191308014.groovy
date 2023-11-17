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

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/01_VerifyElementText_Dashboard - Quick Actions'), 
    'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1529843993455093700.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/02_UserTapsOnApply_BottomRight'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/03_VerifyElementText - Apply'), 'Apply')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot100845777137923068.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/04_UserTapsOn - A foreign currencyaccount with a globalmulti-currency card'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/05_VerifyElementText - Global Access Account-i'), 
    'Global Access Account-i')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/06_UserTapsOnApplyButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/07_VerifyElementText- Step 1 of 4'), 'Step 1 of 4')

Mobile.scrollToText('City')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/08_Tap_On_State_Dropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot371017094505135112.png')

Mobile.scrollToText('WP PUTRAJAYA')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7632929747597824732.png')

Mobile.scrollToText('WP KUALA LUMPUR')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2312065294977635351.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/09_UserTapOn_Done'), 0)

Mobile.clearText(findTestObject('Object Repository/HighRisk_G1A/10_ClearCityText- KL'), 0)

Mobile.setText(findTestObject('Object Repository/HighRisk_G1A/11_SetText - e.g Kuala Lumpur'), 'Kuala Lumpur', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4998473542591371986.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/12_TapOn_Next'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/13_VerifyElementText - Step 2 of 4'), 'Step 2 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot212092431376052838.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/14_TapOn_Sector_Dropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6519052071327963835.png')

Mobile.scrollToText('Npo/Ngo')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8144504526202257042.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/15_TapOn - NpoNgo'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2924114432119503039.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/16_TapOn_Next'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/17_VerifyElementText- Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1984154638991418464.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/18_TapOnNextfor_Step_3'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/19_VerifyElementText - Additional information'),
	'Additional information')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2634155669255606247.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/20_TapOnPrimaryIncome_Dropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1482163093077409995.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/21_TapOnDone_For_Allowances'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6507813864009970068.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/22_TapOn_PrimarySourceOfWealth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8878981691093843576.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/23_TapOnDone_for_Company_Sale'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7840650598120344845.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/24_TapOn_i_Icon'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8578704982412756542.png')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/25_VerifyElementText - Primary source of wealth'),
	'Primary source of wealth')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/26_VerifyElementText - Where most of your wealth comes from.For example, you may be earning monthly salary but big portion of your wealth may come from inheritance'),
	'Where most of your wealth comes from.\n\nFor example, you may be earning monthly salary but big portion of your wealth may come from inheritance.')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/27_TapOnCloseIcon'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1475265832030219952.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/28_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/29_VerifyElementText - Step 4 of 4'), 'Step 4 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5810380326661575627.png')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/30_VerifyElementText - Debit Card'), 'Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/31_VerifyElementText - Here is the pre-selected debit card design for you'),
	'Here is the pre-selected debit card design for you')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/32_VerifyElementText - Note You will be charged RM 8.00 upon successful card application'),
	'Note: You will be charged RM 8.00 upon successful card application.')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/33_VerifyElementText - Maybank MasterCard Global Access World Debit Card'),
	'Maybank MasterCard Global Access World Debit Card')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/34_TapOnNext_Step_4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/35_VerifyElementText- Debit Card Delivery Details'),
	'Debit Card Delivery Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2791561349280596365.png')

Mobile.swipe(0, 300, 0, 0)

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/36_Select_Terms_and_Conditions - I have read and agree with the Terms  Conditions'),
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7990517597403531962.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/37_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/38_VerifyElementText - Declaration'), 'Declaration')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2196699677865079937.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/39_SelectYesRadioButton- Yes, I expressly agree to be contacted'),
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4658825773127642431.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/40_TapOnAgree_And_Confirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/41_VerifyElementText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8449705396714406334.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/42_EditPersonalDetail - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/43_VerifyElementText - Address line 3'), 'Address line 3')

Mobile.setText(findTestObject('Object Repository/HighRisk_G1A/44_SetText_Neighbourhood- e.g Neighbourhood name'), 'KL Neighbourhood',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5727050671490821982.png')

Mobile.scrollToText('City')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/45_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/46_UserOnConfirmationScreen - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2739018586000149301.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/47_EditDebitCardDeliveryAddress - Edit'), 0)

Mobile.clearText(findTestObject('Object Repository/HighRisk_G1A/48_CleasrAddressLine_1- JALAN A'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7138075740554003033.png')

Mobile.setText(findTestObject('Object Repository/HighRisk_G1A/49_SetAddress - e.g Unit noFloorBuilding'), 'Test Address 1',
	0)

Mobile.clearText(findTestObject('Object Repository/HighRisk_G1A/50_TextCleared - TAMAN KUALA'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778717936429808251.png')

Mobile.setText(findTestObject(''), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries',
	0)

Mobile.clearText(findTestObject('Object Repository/HighRisk_G1A/52_CleatTextFor_PostCode - 50100'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3220226068024605463.png')

Mobile.setText(findTestObject('Object Repository/HighRisk_G1A/53_SetTextForMoreThan_5_digits - e.g 88888'), '123456789',
	0)

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/54_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/55_VerifyElementText - Confirmation'), 'Confirmation')

Mobile.scrollToText('Additional Income Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3410681441010885329.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/56_TapEditOnEmploymentDetails - Edit'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5704033155887676769.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/57_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/58_AdditionalDetailsOnEmploymentDetails - Additional information'),
	'Additional information')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/59_TapOnAllowancesDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4877191355033530135.png')

Mobile.scrollToText('Pension')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7337905753822350854.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/60_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6474268461213093973.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/61_TapOnSourceOfWealthDropdown'), 0)

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/62_TapOnInheritance - INHERITANCE  GIFT'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6534098505229340342.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/63_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3695066887694729547.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/64_TapOnConfirm'), 0)

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/65_TapOnConfirm'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7494392384334790477.png')

Mobile.verifyElementText(findTestObject('Object Repository/HighRisk_G1A/66_VerifyElementText- One Time Password'), 'One Time Password')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4075729450259762424.png')

Mobile.tap(findTestObject('Object Repository/HighRisk_G1A/67_TapOnConfirmFor_OTP'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1967120115838110837.png')


