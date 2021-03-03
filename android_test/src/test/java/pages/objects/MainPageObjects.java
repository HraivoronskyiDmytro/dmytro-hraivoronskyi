package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPageObjects {

    @AndroidFindBy(id = "com.monefy.app.lite:id/income_button")
    public MobileElement incomeButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/expense_button")
    public MobileElement expenceButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/expense_amount_text")
    public MobileElement expenceValue;

    @AndroidFindBy(id = "com.monefy.app.lite:id/income_amount_text")
    public MobileElement incomeValue;

}
