package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.objects.MainPageObjects;
import utils.Common;

public class MainPage extends Common {

    private MainPageObjects mainPageObjects = new MainPageObjects();

    public MainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), mainPageObjects);
    }

    public void clickExpence() {
        getElement(mainPageObjects.expenceButton).click();
    }

    public void clickIncome() {
        getElement(mainPageObjects.incomeButton).click();
    }

    public String getIncome() {
        return getElement(mainPageObjects.incomeValue).getText();
    }

    public String getExpences() {
        return getElement(mainPageObjects.expenceValue).getText();
    }

}
