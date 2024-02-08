package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TimesheetPage extends BasePage {

    By aventivTask = By.id("aventivdbasecurustechnologiesllcHeading");

    By aventivTaskItem = By.xpath("//p[@title='[Test Execution] QA - IT - P1820354 - TeleCore Capital Development 2022 Q']");

    By taskMoveDate = By.xpath("//div[@class='fc-row fc-widget-header']//th[contains(text(),'Mon')]");
////div[@class='fc-row fc-widget-header']//th[contains(text(),'Mon')]/../../../../../../../..//td[@class='fc-widget-content']
    By taskMoveHour = By.xpath("//div[@class='fc-time-grid-container fc-scroller']//span[text()='8am']");
    public void clickAventivTask()
    {
        driver.findElement(aventivTask).click();
    }

    public void clickAventivTaskItem()
    {
        Actions action = new Actions(driver);
        WebElement wb1 = driver.findElement(aventivTaskItem);
        WebElement wb2 = driver.findElement(taskMoveDate);
        WebElement wb3 = driver.findElement(taskMoveHour);
        action.dragAndDrop(wb1,wb2).build().perform();
        action.dragAndDrop(wb1,wb3).build().perform();

    }

}
