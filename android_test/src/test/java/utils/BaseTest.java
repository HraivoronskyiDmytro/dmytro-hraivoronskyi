package utils;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.IncomeExpensePage;
import pages.MainPage;

import java.lang.reflect.Method;

public class BaseTest {

    private Logger logger = Logger.getLogger(BaseTest.class);
    private AppiumDriver driver;
    protected MainPage mainPage;
    protected IncomeExpensePage incomeExpensePage;
    @BeforeSuite
    public void connect() throws Exception {
        this.driver = new Appium().init();
    }

    @BeforeMethod
    public void beforeMethod(Method testMethod, ITestContext testContext) {
        String className = testMethod.getDeclaringClass().getSimpleName();
        String methodName = testMethod.getName();
        String testName = testContext.getName();
        logger.info("\n\n:::\nStarting test: " + testName + "." + className + "." + methodName);
    }

    @AfterMethod
    public void shutDown() {
        logger.info("\n\n:::\nTest End");
        driver.resetApp();
    }

}
