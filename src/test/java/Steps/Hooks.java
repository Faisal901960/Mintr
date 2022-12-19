package Steps;

import Util.ConfigReader;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

public class Hooks {
    private DriverFactory driverFactory;
    private WebDriver driver;
    private Properties properties;
    private ConfigReader configReader;


    @Before(order = 0)
    public void getProperty(){
        configReader = new ConfigReader();
        properties = configReader.setProperties();
        //add some string
        //zeeshan
    }

    @Before(order = 1)
    public void launchBrowser(){
        driverFactory = new DriverFactory();
        driver = driverFactory.setDriver(properties.getProperty("browser"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https:Lokrqa:dJ1fH4mR6qT8yJ4gX3@mintr-qa.lokr.io#/");
        DriverFactory.tabs4 =  new ArrayList<String>(driver.getWindowHandles());


    }


    @After(order = 0)
    public void closeBrowser(){
        // driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }

}
