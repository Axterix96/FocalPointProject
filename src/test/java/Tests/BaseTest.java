package Tests;

import POM.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class BaseTest {

    BaseDriver base = new BaseDriver();


    @BeforeMethod
    @Parameters("browser")
    public void Setup(String browser) throws IOException {
        base.initializeDriver(browser);
        base.driver.manage().window().maximize();
        base.driver.get("https://focalpoint.nearshoretechnology.com/login");
        BasePage.wait = base.wait;
        BasePage.driver = base.driver;

    }




    @AfterMethod
    public void cleanup()
    {
        base.driver.quit();
    }
    //multibrowser que se ejecute primero en interfaz y despues por linea de comandos
    // el alert cuando se mande el approval de un timesheet

}
