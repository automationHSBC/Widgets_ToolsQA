package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Slawek on 2019-11-24.
 */
public class TestBase {

    public static WebDriver driver = null;
    String URL = "https://demoqa.com/";

    @BeforeSuite
    public void initialize() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @AfterSuite
    public void Teardown(){
        driver.quit();
    }

}
