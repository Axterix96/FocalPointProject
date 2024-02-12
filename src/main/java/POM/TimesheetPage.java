package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class TimesheetPage extends BasePage {

    By aventivTask = By.id("aventivdbasecurustechnologiesllcHeading");

    By aventivTaskItem = By.xpath("//p[@title='[Test Execution] QA - IT - P1820354 - TeleCore Capital Development 2022 Q']");

    By taskMoveDate = By.xpath("//td[@class='fc-widget-content']//span[contains(text(),'8am')]//..//following-sibling::td");

    By clearTimesheet = By.id("clearButton");

    public void clickAventivTask()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(aventivTask));
        driver.findElement(aventivTask).click();
    }

    public void clickAventivTaskItem()
    {
        Actions action = new Actions(driver);
        WebElement wb1 = driver.findElement(aventivTaskItem);
        WebElement wb2 = driver.findElement(taskMoveDate);
        action.moveToElement(wb1).pause(Duration.ofSeconds(1)).clickAndHold(wb1).pause(Duration.ofSeconds(1))
                .moveByOffset(1,1).moveToElement(wb2).pause(Duration.ofSeconds(1)).release(wb2).build().perform();

    }
    public void clickClearTimesheet()
    {
        driver.findElement(clearTimesheet).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

}
