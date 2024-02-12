package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseDriver {
    public WebDriver driver;

    public WebDriverWait wait;


    public void initializeDriver(String browser) throws IOException {
        //properties class



        //checar los logs
        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();


        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();


        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(15)); //El implicit es el wait que cuya espera es predeterminada
        //Explicit es cuando la espera se va realizar cuando ocurra una condicion.



    }
}
