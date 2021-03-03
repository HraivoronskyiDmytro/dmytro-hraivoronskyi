package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class IncomeExpensePageObjects {

    @AndroidFindBy(id = "com.monefy.app.lite:id/keyboard_action_button")
    public MobileElement chooseCategory;

    @AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard0")
    public MobileElement digitButton0;

    @AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard1")
    public MobileElement digitButton1;

    @AndroidFindBy(xpath = "(//*[@resource-id=com.monefy.app.lite:id/imageView])[1]")
    public MobileElement firstCategory;

}
