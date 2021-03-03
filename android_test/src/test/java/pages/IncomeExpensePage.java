package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.objects.IncomeExpensePageObjects;
import utils.Common;

public class IncomeExpensePage extends Common {

    private IncomeExpensePageObjects incomeExpensePageObjects = new IncomeExpensePageObjects();

    public IncomeExpensePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), incomeExpensePageObjects);
    }

    public void set100Amount(){
        getElement(incomeExpensePageObjects.digitButton1).click();
        incomeExpensePageObjects.digitButton0.click();
        incomeExpensePageObjects.digitButton0.click();
    }

    public void selectFirstCategory(){
        getElement(incomeExpensePageObjects.chooseCategory).click();
        incomeExpensePageObjects.firstCategory.click();
    }



}
