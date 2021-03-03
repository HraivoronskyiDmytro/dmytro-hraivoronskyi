package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class IncomeExpenseTest extends BaseTest {

    @Test
    public void addIncome() {
        mainPage.clickIncome();
        incomeExpensePage.set100Amount();
        incomeExpensePage.selectFirstCategory();
        Assert.assertEquals(mainPage.getIncome().replaceAll("",""), "100");
    }

    @Test
    public void addExpence() {
        mainPage.clickExpence();
        incomeExpensePage.set100Amount();
        incomeExpensePage.selectFirstCategory();
        Assert.assertEquals(mainPage.getExpences().replaceAll("",""), "100");


    }


}
