package utilities;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBaseBeforeClassAfterClass {
    protected WebDriver driver;;
    //@beforeclass ve @after class notasnyonlarını testNg de kullanırken JUnit te ki gibi static yapmaya gerek yoktur.


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterMethod
    public void tearDown(){
        //  driver.close();
    }
}