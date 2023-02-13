package jupiter_Quote;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.user.jupiterAlpaca.*;
import reportConfig.ExtentTestManager;
import testData.UserDataMapper;
import utilities.DataHelper;

import java.lang.reflect.Method;

public class Create_Quote_D04_N extends BaseTest {

    @Parameters({"browser", "envName", "serverName", "ipAddress", "portNumber", "osName", "osName"})
    @BeforeClass(description = "Create new common User for all Classed test")
    public void BeforeClass(String browserName, String envName, String serverName, @Optional("localhost") String ipAddress, @Optional("4444") String portNumber, @Optional("Windows") String osName, @Optional("10") String osVersion) throws Exception {
        driver = getBrowserDriver(envName, serverName, browserName, ipAddress, portNumber, osName, osName);
        loginPage = PageGeneratorManager.getUserLoginPage(driver);
        dataFaker = DataHelper.getDataHelper();
        userData = UserDataMapper.getUserData();
        excel = new commons.helpers.ExcelHelpers();
        excel.setExcelFile("src/test/resources/Book1.xlsx", "Sheet1");

        firstName = "alpacatest001";
        password = "Alpaca#2022";
        fullName = "Curry test";
        birth = "02/02/2000";
        sex = "Nam";
        endDate = "14/02/2023 23:59";
//        identifierNumber = String.valueOf(generateFakeNumber());
        levelOfResponsibility = "20000000";

        log.info("Pre-Condition_Login - Step 01: Enter to  First name textbox with value is '" + excel.getCellData("username", 1) + "'");
        loginPage.inputToEmailTextbox(excel.getCellData("username", 1));

        log.info("Pre-Condition_Login - Step 02: Enter to Password textbox with value is '" + excel.getCellData("password", 1) + "'");
        loginPage.inputToPasswordTextbox(excel.getCellData("password", 1));

        log.info("Pre-Condition_Login - Step 03: Click to Login button");
        loginPage.clickToLoginButton();
        homePage = PageGeneratorManager.getUserHomePage(driver);
        showBrowserConsoleLogs(driver);

        log.info("Pre-Condition_Login - Step 04: Verify login success mesage is displayed");
        Assert.assertEquals(homePage.getSuccessLogin(), "Nhiệm vụ");
        quotePage = homePage.clickToQuote(driver);

        log.info("Create_Quote - Step 02: Click to View List Quote button");
        quotePage.clickToViewListQuote();

        log.info("Create_Quote - Step 03: Click to Create button");
        quotePage.clickToCreateButton();

        log.info("Create_Quote - Step 04: Select to dropdown major");
        quotePage.selectToDropdownMajor(driver, "Con người");

        log.info("Create_Quote - Step 05: Select to dropdown name product");
        quotePage.selectToDropdownNameProduct(driver, "D04 - Bảo hiểm du lịch quốc tế");

        log.info("Create_Quote - Step 06: Select to dropdown type quote");
        quotePage.selectToDropdownTypeQuote(driver, "Nhóm");

        log.info("Create_Quote - Step 07: Select to dropdown distribution chanel");
        quotePage.selectToDropdownDistributionChannel(driver);

        log.info("Create_Quote - Step 08: Select to dropdown contract holder name");
        quotePage.selectToDropdownContractHolderName(driver);

        log.info("Create_Quote - Step 09: Click to insured person");
        quotePage.clickToInsuredPerson();

        log.info("Create_Quote - Step 10: Click to create new insured person");
        quotePage.clickToCreateNewInsuredPersonGroup();
    }

    @Test
    public void TC_01_Chuyen_PT_DNA(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "TC_01_Chuyen_PT_DNA");
        ExtentTestManager.getTest().log(Status.INFO, "TC_01_Chuyen_PT_DNA");

        excel.setExcelFile("src/test/resources/D04_N.xlsx", "Chuyen_PT_DNA");

        log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", 1));
        quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", 1));

        log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", 1));
        quotePage.inputStartDateGroup(driver, excel.getCellData("Ngày bắt đầu", 1));

        log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", 1));
        quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", 1));

        log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", 1));
        numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", 1));

        log.info("Step: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", 1));
        quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", excel.getCellData("Chương Trình BH", 1));

        log.info("Hành trình: " + excel.getCellData("Hành trình", 1));
        quotePage.selectedDropdownByText(driver, "Hành trình", excel.getCellData("Hành trình", 1));

        log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", 1));
        programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", 1));

        log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", 1));
        standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", 1));

        log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", 1));
        paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", 1));

        if (numberOfDay && programLimits && standardFees && paymentFees)
        {
            excel.setCellData("PASS", 1, 9);
        } else {
            excel.setCellData("FAIL", 1, 9);
        }

        quotePage.backToMainInformation();

        sleepInSecond(1);

        for (int i = 0; i < 179; i++) {
            log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", i + 2));

            log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", i + 2));

            log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", i + 2));
            quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", i + 2));

            log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", i + 2));
            numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 2));

            quotePage.clickToMoveInsuranceBenefits();

            log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", i + 2));

            log.info("Hành trình: " + excel.getCellData("Hành trình", i + 2));

            log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", i + 2));
            programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 2));

            log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", i + 2));
            standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 2));

            log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", i + 2));
            paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", i + 2));

            if (numberOfDay && programLimits && standardFees && paymentFees)
            {
                excel.setCellData("PASS", i + 2, 9);
            } else {
                excel.setCellData("FAIL", i + 2, 9);
            }

            quotePage.backToMainInformation();

            sleepInSecond(1);
        }
    }

    @Test
    public void TC_02_Chuyen_CC_DNA(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "TC_02_Chuyen_CC_DNA");
        ExtentTestManager.getTest().log(Status.INFO, "TC_02_Chuyen_CC_DNA");

        excel.setExcelFile("src/test/resources/D04_N.xlsx", "Chuyen_CC_DNA");

        log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", 1));
        quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", 1));

        log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", 1));
        quotePage.inputStartDate(driver, excel.getCellData("Ngày bắt đầu", 1));

        log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", 1));
        quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", 1));

        log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", 1));
        numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", 1));

        log.info("Create_Quote - Step: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", 1));
        quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", excel.getCellData("Chương Trình BH", 1));

        log.info("Hành trình: " + excel.getCellData("Hành trình", 1));
        quotePage.selectedDropdownByText(driver, "Hành trình", excel.getCellData("Hành trình", 1));

        log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", 1));
        programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", 1));

        log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", 1));
        standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", 1));

        log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", 1));
        paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", 1));

        if (numberOfDay && programLimits && standardFees && paymentFees)
        {
            excel.setCellData("PASS", 1, 9);
        } else {
            excel.setCellData("FAIL", 1, 9);
        }

        quotePage.backToMainInformation();

        sleepInSecond(1);

        for (int i = 0; i < 179; i++) {
            log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", i + 2));

            log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", i + 2));

            log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", i + 2));
            quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", i + 2));

            log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", i + 2));
            numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 2));

            quotePage.clickToMoveInsuranceBenefits();

            log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", i + 2));

            log.info("Hành trình: " + excel.getCellData("Hành trình", i + 2));

            log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", i + 2));
            programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 2));

            log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", i + 2));
            standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 2));

            log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", i + 2));
            paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", i + 2));

            if (numberOfDay && programLimits && standardFees && paymentFees)
            {
                excel.setCellData("PASS", i + 2, 9);
            } else {
                excel.setCellData("FAIL", i + 2, 9);
            }

            quotePage.backToMainInformation();

            sleepInSecond(1);
        }
    }

    @Test
    public void TC_03_Chuyen_PT_CA(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "TC_03_Chuyen_PT_CA");
        ExtentTestManager.getTest().log(Status.INFO, "TC_03_Chuyen_PT_CA");

        excel.setExcelFile("src/test/resources/D04_N.xlsx", "Chuyen_PT_CA");

        log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", 1));
        quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", 1));

        log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", 1));
        quotePage.inputStartDate(driver, excel.getCellData("Ngày bắt đầu", 1));

        log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", 1));
        quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", 1));

        log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", 1));
        numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", 1));

        log.info("Create_Quote - Step: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", 1));
        quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", excel.getCellData("Chương Trình BH", 1));

        log.info("Hành trình: " + excel.getCellData("Hành trình", 1));
        quotePage.selectedDropdownByText(driver, "Hành trình", excel.getCellData("Hành trình", 1));

        log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", 1));
        programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", 1));

        log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", 1));
        standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", 1));

        log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", 1));
        paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", 1));

        if (numberOfDay && programLimits && standardFees && paymentFees)
        {
            excel.setCellData("PASS", 1, 9);
        } else {
            excel.setCellData("FAIL", 1, 9);
        }

        quotePage.backToMainInformation();

        sleepInSecond(1);

        for (int i = 0; i < 179; i++) {
            log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", i + 2));

            log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", i + 2));

            log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", i + 2));
            quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", i + 2));

            log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", i + 2));
            numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 2));

            quotePage.clickToMoveInsuranceBenefits();

            log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", i + 2));

            log.info("Hành trình: " + excel.getCellData("Hành trình", i + 2));

            log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", i + 2));
            programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 2));

            log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", i + 2));
            standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 2));

            log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", i + 2));
            paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", i + 2));

            if (numberOfDay && programLimits && standardFees && paymentFees)
            {
                excel.setCellData("PASS", i + 2, 9);
            } else {
                excel.setCellData("FAIL", i + 2, 9);
            }

            quotePage.backToMainInformation();

            sleepInSecond(1);
        }
    }

    @Test
    public void TC_04_Chuyen_CC_CA(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "TC_04_Chuyen_CC_CA");
        ExtentTestManager.getTest().log(Status.INFO, "TC_04_Chuyen_CC_CA");

        excel.setExcelFile("src/test/resources/D04_N.xlsx", "Chuyen_CC_CA");

        log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", 1));
        quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", 1));

        log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", 1));
        quotePage.inputStartDate(driver, excel.getCellData("Ngày bắt đầu", 1));

        log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", 1));
        quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", 1));

        log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", 1));
        numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", 1));

        log.info("Create_Quote - Step: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", 1));
        quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", excel.getCellData("Chương Trình BH", 1));

        log.info("Hành trình: " + excel.getCellData("Hành trình", 1));
        quotePage.selectedDropdownByText(driver, "Hành trình", excel.getCellData("Hành trình", 1));

        log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", 1));
        programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", 1));

        log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", 1));
        standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", 1));

        log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", 1));
        paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", 1));

        if (numberOfDay && programLimits && standardFees && paymentFees)
        {
            excel.setCellData("PASS", 1, 9);
        } else {
            excel.setCellData("FAIL", 1, 9);
        }

        quotePage.backToMainInformation();

        sleepInSecond(1);

        for (int i = 0; i < 179; i++) {
            log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", i + 2));

            log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", i + 2));

            log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", i + 2));
            quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", i + 2));

            log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", i + 2));
            numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 2));

            quotePage.clickToMoveInsuranceBenefits();

            log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", i + 2));

            log.info("Hành trình: " + excel.getCellData("Hành trình", i + 2));

            log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", i + 2));
            programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 2));

            log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", i + 2));
            standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 2));

            log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", i + 2));
            paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", i + 2));

            if (numberOfDay && programLimits && standardFees && paymentFees)
            {
                excel.setCellData("PASS", i + 2, 9);
            } else {
                excel.setCellData("FAIL", i + 2, 9);
            }

            quotePage.backToMainInformation();

            sleepInSecond(1);
        }
    }

    @Test
    public void TC_05_Chuyen_PT_TC(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "TC_05_Chuyen_PT_TC");
        ExtentTestManager.getTest().log(Status.INFO, "TC_05_Chuyen_PT_TC");

        excel.setExcelFile("src/test/resources/D04_N.xlsx", "Chuyen_PT_TC");

        log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", 1));
        quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", 1));

        log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", 1));
        quotePage.inputStartDate(driver, excel.getCellData("Ngày bắt đầu", 1));

        log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", 1));
        quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", 1));

        log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", 1));
        numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", 1));

        log.info("Create_Quote - Step: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", 1));
        quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", excel.getCellData("Chương Trình BH", 1));

        log.info("Hành trình: " + excel.getCellData("Hành trình", 1));
        quotePage.selectedDropdownByText(driver, "Hành trình", excel.getCellData("Hành trình", 1));

        log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", 1));
        programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", 1));

        log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", 1));
        standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", 1));

        log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", 1));
        paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", 1));

        if (numberOfDay && programLimits && standardFees && paymentFees)
        {
            excel.setCellData("PASS", 1, 9);
        } else {
            excel.setCellData("FAIL", 1, 9);
        }

        quotePage.backToMainInformation();

        sleepInSecond(1);

        for (int i = 0; i < 179; i++) {
            log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", i + 2));

            log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", i + 2));

            log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", i + 2));
            quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", i + 2));

            log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", i + 2));
            numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 2));

            quotePage.clickToMoveInsuranceBenefits();

            log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", i + 2));

            log.info("Hành trình: " + excel.getCellData("Hành trình", i + 2));

            log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", i + 2));
            programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 2));

            log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", i + 2));
            standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 2));

            log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", i + 2));
            paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", i + 2));

            if (numberOfDay && programLimits && standardFees && paymentFees)
            {
                excel.setCellData("PASS", i + 2, 9);
            } else {
                excel.setCellData("FAIL", i + 2, 9);
            }

            quotePage.backToMainInformation();

            sleepInSecond(1);
        }
    }

    @Test
    public void TC_06_Chuyen_CC_TC(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "TC_06_Chuyen_CC_TC");
        ExtentTestManager.getTest().log(Status.INFO, "TC_06_Chuyen_CC_TC");

        excel.setExcelFile("src/test/resources/D04_N.xlsx", "Chuyen_CC_TC");

        log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", 1));
        quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", 1));

        log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", 1));
        quotePage.inputStartDate(driver, excel.getCellData("Ngày bắt đầu", 1));

        log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", 1));
        quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", 1));

        log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", 1));
        numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", 1));

        log.info("Create_Quote - Step: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", 1));
        quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", excel.getCellData("Chương Trình BH", 1));

        log.info("Hành trình: " + excel.getCellData("Hành trình", 1));
        quotePage.selectedDropdownByText(driver, "Hành trình", excel.getCellData("Hành trình", 1));

        log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", 1));
        programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", 1));

        log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", 1));
        standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", 1));

        log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", 1));
        paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", 1));

        if (numberOfDay && programLimits && standardFees && paymentFees)
        {
            excel.setCellData("PASS", 1, 9);
        } else {
            excel.setCellData("FAIL", 1, 9);
        }

        quotePage.backToMainInformation();

        sleepInSecond(1);

        for (int i = 0; i < 179; i++) {
            log.info("Loại chuyến: " + excel.getCellData("Loại chuyến", i + 2));

            log.info("Ngày bắt đầu: " + excel.getCellData("Ngày bắt đầu", i + 2));

            log.info("Ngày kết thúc: " + excel.getCellData("Ngày kết thúc", i + 2));
            quotePage.inputEndDateGroup(driver, excel.getCellData("Ngày kết thúc", i + 2));

            log.info("Thời hạn BH (ngày): " + excel.getCellData("Thời hạn BH (ngày)", i + 2));
            numberOfDay = verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 2));

            quotePage.clickToMoveInsuranceBenefits();

            log.info("Chương trình bảo hiểm: " + excel.getCellData("Chương Trình BH", i + 2));

            log.info("Hành trình: " + excel.getCellData("Hành trình", i + 2));

            log.info("Hạn Mức CT: " + excel.getCellData("Hạn Mức CT", i + 2));
            programLimits = verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 2));

            log.info("Phí Chuẩn: " + excel.getCellData("Phí Chuẩn", i + 2));
            standardFees = verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 2));

            log.info("Phí Thanh toán: " + excel.getCellData("Phí Thanh toán", i + 2));
            paymentFees = verifyEquals(quotePage.verifyPaymentFeesIndividualGroup(driver), excel.getCellData("Phí Thanh toán", i + 2));

            if (numberOfDay && programLimits && standardFees && paymentFees)
            {
                excel.setCellData("PASS", i + 2, 9);
            } else {
                excel.setCellData("FAIL", i + 2, 9);
            }

            quotePage.backToMainInformation();

            sleepInSecond(1);
        }
    }

//    @Test
//    public void User_02_Four_To_Six_Day(Method method) throws Exception {
//        ExtentTestManager.startTest(method.getName(), "User_01_Create_Quote");
//        ExtentTestManager.getTest().log(Status.INFO, "Create_Quote - Step 01: Navigate to 'Quote'");
//
//            log.info("Create_Quote - Step 21: Click to save insurent Person");
//        quotePage.clickToSaveInsurentPerson();
//
//        log.info("Create_Quote - Step 36: Click to create quote button");
//        quotePage.clickToCreateQuote();

//        for (int i = 0; i < 3; i++) {
//            log.info("Input birth");
//            quotePage.checkToTripTypeCheckBox(driver, excel.getCellData("Loại chuyến", i + 4));
//
//            quotePage.inputStartDate(driver, excel.getCellData("Ngày bắt đầu", i + 4));
//
//            quotePage.inputEndDate(driver, excel.getCellData("Ngày kết thúc", i + 4));
//
//            verifyEquals(quotePage.verifyNumberOfDays(driver), excel.getCellData("Thời hạn BH (ngày)", i + 4));
//
//            log.info("Create_Quote - Step: Click to move insurance benefits");
//            quotePage.clickToMoveInsuranceBenefits();
//
//            quotePage.selectedDropdownByText(driver, "Chương trình bảo hiểm", "Phổ thông");
//
//            quotePage.selectedDropdownByText(driver, "Hành trình", "Đông Nam Á");
//
//            verifyEquals(quotePage.verifyProgramLimits(driver), excel.getCellData("Hạn Mức CT", i + 4));
//
//            verifyEquals(quotePage.verifyStandardFees(driver), excel.getCellData("Phí Chuẩn", i + 4));
//
//            verifyEquals(quotePage.verifyPaymentFees(driver), excel.getCellData("Phí Thanh toán", i + 4));
//
//            quotePage.backToMainInformation();
//
//            sleepInSecond(1);
//        }
//
//    }

//
//    @Test
//    public void User_02_Review_Quote(Method method) throws Exception {
//        ExtentTestManager.startTest(method.getName(), "User_02_Review_Quote");
//        ExtentTestManager.getTest().log(Status.INFO, "Review_Quote - Step 01: Review 'Quote'");


//
//        quotePage.clickToReviewQuote();
//
//        quotePage.clickToSubmitReviewQuote();
//
//        Assert.assertEquals(quotePage.verifyReviewQuoteSuccess(), "Đã duyệt");
//    }


    @AfterClass(alwaysRun = true)
    public void afterClass() {
        closeBrowserDriver();
    }

    private commons.helpers.ExcelHelpers excel;
    private WebDriver driver;
    private boolean date, programLimits, standardFees, paymentFees, numberOfDay;
    private String firstName, fullName, password, birth, sex, levelOfResponsibility, endDate;
    private String identifierNumber;
    private UserHomePageObject homePage;
    private UserDataMapper userData;
    private UserRegisterPageObject registerPage;
    private DataHelper dataFaker;
    private QuotePageObject quotePage;
    private UserLoginPageObject loginPage;
    private UserCustomerInforPageObject customerInforPage;

}
