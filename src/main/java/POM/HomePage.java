package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;


public class HomePage extends BasePage{

private String usernameLogin= "nicolas.sogbi@blueriver.com";

private String passwordLogin = "Uady*010396";

By usernameIdInput = By.id("username");

By passwordIdInput = By.id("password");

By loginSubmit = By.xpath("//button[@class='btn btn-sm btn-primary']");

By titleLogin = By.xpath("//h2");

By focalpointMessage = By.xpath("//h3");

By timesheetLink = By.xpath("//a[@href='/timesheets']");

By timesheetDropdown = By.xpath("//button[@class='btn btn-sm btn-primary dropdown-toggle']");

By timesheetNextWeek = By.xpath("//button[@value='one']");

public void loginCredentials()
{
    driver.findElement(usernameIdInput).sendKeys(usernameLogin);
    driver.findElement(passwordIdInput).sendKeys(passwordLogin);
    driver.findElement(loginSubmit).click();
}

public void validateLogin()
{
    Assert.assertEquals("My Timesheets",driver.findElement(titleLogin).getText());
}

public void getCurrentUrl()
{

    String url = driver.getCurrentUrl();
    System.out.println(url);
}


public void getTitle()
{
    String title = driver.getTitle();
    System.out.println(title);
}

public void createNewTabFocalPoint()
{
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://focalpoint.nearshoretechnology.com/login");
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(0));
    driver.close();
    driver.switchTo().window(tabs.get(1));
}

public void clickTimesheetNextWeek()
{
driver.findElement(timesheetDropdown).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(timesheetNextWeek));
driver.findElement(timesheetNextWeek).click();
}

public void goToTimesheetsPage()
{
    driver.findElement(timesheetLink).click();
}

public void validateFocalPointLoginPageInNewTab()
{
    wait.until(ExpectedConditions.visibilityOfElementLocated(focalpointMessage));
    Assert.assertEquals("You Are Already Logged In, Please Log Out First",driver.findElement(focalpointMessage).getText(),"No message found");
}



}
