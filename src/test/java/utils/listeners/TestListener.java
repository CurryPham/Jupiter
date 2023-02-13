package utils.listeners;

import static utils.extentreports.ExtentManager.getExtentReports;
import static utils.extentreports.ExtentTestManager.getTest;
import static utils.extentreports.ExtentTestManager.startTest;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import io.qameta.allure.Attachment;
import java.util.Objects;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.excelutils.ExcelUtil;

public class TestListener  implements ITestListener {
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    //Text attachments for Allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    //Text attachments for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    //HTML attachments for Allure
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method " + iTestContext.getName());
        //Do tier down operations for ExtentReports reporting!
        getExtentReports().flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
//        System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
//
//        //Get driver from BaseTest and assign to local webdriver variable.
//        Object testClass = iTestResult.getInstance();
//        WebDriver driver = ((BaseTest) testClass).getDriver();
//
//        //Allure ScreenShotRobot and SaveTestLog
//        if (driver != null) {
//            System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
//            saveScreenshotPNG(driver);
//        }
//
//        //Save a log on allure.
//        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");
//
//        //Take base64Screenshot screenshot for extent reports
//        String base64Screenshot =
//                "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
//
//        //ExtentReports log and screenshot operations for failed tests.
//        getTest().log(Status.FAIL, "Test Failed",
//                getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
}