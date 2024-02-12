package Tests;

import POM.PomManager;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    PomManager pomManager = new PomManager();

    @Test
    public void testCase1()
    {
        pomManager.homePage.loginCredentials();
        pomManager.homePage.validateLogin();
        pomManager.homePage.getCurrentUrl();
        pomManager.homePage.getTitle();
        pomManager.homePage.createNewTabFocalPoint();
        pomManager.homePage.validateFocalPointLoginPageInNewTab();
        pomManager.homePage.goToTimesheetsPage();
        pomManager.homePage.clickTimesheetNextWeek();
        pomManager.timesheetPage.clickAventivTask();
        pomManager.timesheetPage.clickAventivTaskItem();
        pomManager.timesheetPage.clickClearTimesheet();


    }
}
