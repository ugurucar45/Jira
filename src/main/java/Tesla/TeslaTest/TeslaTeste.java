package Tesla.TeslaTest;

import Tesla.TeslaBaseTest;
import Tesla.TeslaPage.TeslaPagee;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TeslaTeste extends TeslaBaseTest {
    TeslaPagee teslaPagee;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        teslaPagee = new TeslaPagee(driver);
        teslaPagee.logInVal(ConfigReader.readProperty("emailTesla"), ConfigReader.readProperty("passwordTesla"));
    }

    @Test(dataProvider = "forLogInVal", dataProviderClass = Data.class)
    public void positiveLogInValidation(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }


    @Test(dataProvider = "forTeslaXVal", dataProviderClass = Data.class)
    public void positiveTeslaXValidation(String url, String title, boolean compM) throws InterruptedException {
        teslaPagee.modelXValid();
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Assert.assertEquals(driver.getTitle(), title);
        Assert.assertEquals(teslaPagee.modelXDisp.isDisplayed(), compM);
    }

    @Test(dataProvider = "forViewSolar", dataProviderClass = Data.class)
    public void positiveviewSolarValidation(String url, String title, boolean cleanP) throws InterruptedException {
        teslaPagee.viewSolarValid();
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Assert.assertEquals(driver.getTitle(), title);
        Assert.assertEquals(teslaPagee.cleanPower.isDisplayed(), cleanP);
    }

    //    @Test(dataProvider = "forTeslaCompare",dataProviderClass = Data.class)
//    public void positiveCompareValid(String url, String title, boolean modX) throws InterruptedException {
//        teslaPagee.modelXValid();
//        BrowserUtils.scrollWithJS(driver,teslaPagee.compare);Thread.sleep(2000);
//        teslaPagee.compareVal();
//        Assert.assertEquals(driver.getCurrentUrl(),url);
//        Assert.assertEquals(driver.getTitle(),title);
//        Assert.assertEquals(teslaPagee.compareModels.isDisplayed(),modX);
//    }


    //**********Ugur's part begin here
    @Test(dataProvider = "ModelSVal", dataProviderClass = Data.class)
    public void positiveModelS(String url, String title) throws InterruptedException {
        teslaPagee.modelSValid();
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Assert.assertEquals(driver.getTitle(), title);
    }
    //**********ugur's part end here
}
