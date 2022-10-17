package tests.day18;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {

    @Test
    public void test01() {

        //https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();
        /*Page class'ındaki locate'lerimize ulaşabilmek için
        Page classımızdan bir objet oluşturarak, oluşturmuş olduğumuz obje ile
        page classımızdaki locate'lerimize ulaşabiliriz
         */
        hmcPage.login.click();
        //test data username: manager ,
        //test data password : Manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("user"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
        Driver.closeDriver();

    }
}