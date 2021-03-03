package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
    private AppiumDriver driver;

    public Common(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private void waitElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected MobileElement getElement(MobileElement element) {
        waitElement(element);
        return element;
    }
}
