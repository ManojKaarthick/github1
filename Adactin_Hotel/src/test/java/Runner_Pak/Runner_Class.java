package Runner_Pak;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Manoj\\Downloads\\Adactin_Hotel\\Adactin_Hotel\\src\\test\\java\\Adactin\\feature",
        glue ={"Step_definition"},dryRun = false,
        plugin = { "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"}
)


public class Runner_Class {

    public static WebDriver driver;


    @BeforeClass
    public static void browser(){

        driver=new ChromeDriver();
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
