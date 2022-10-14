package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    @Test(priority = 8)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test (priority = -2)
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
