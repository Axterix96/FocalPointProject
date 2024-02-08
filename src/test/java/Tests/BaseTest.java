package Tests;

import POM.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    BaseDriver base = new BaseDriver();


    @BeforeMethod
    public void Setup() throws IOException {
        base.initializeDriver();
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
