package Tesla.TeslaTest;

import Tesla.TeslaBaseTest;
import Tesla.TeslaPage.TeslaPagee;
import Utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTestsTesla extends TeslaBaseTest {

    TeslaPagee teslaPagee;

    @BeforeMethod
    public void setUp() throws InterruptedException {

        teslaPagee = new TeslaPagee(driver);
        teslaPagee.logInVal(ConfigReader.readProperty("emailTesla"), ConfigReader.readProperty("passwordTesla"));
    }

    @Test(dataProvider = "negForLogInVal", dataProviderClass = Data.class)
    public void negativeLogInValidation(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    @Test(dataProvider = "negForViewSola", dataProviderClass = Data.class)
    public void negViewSolarValidation(String url, String title, boolean cleanP) throws InterruptedException {
        teslaPagee.viewSolarValid();
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Assert.assertEquals(driver.getTitle(), title);
        Assert.assertEquals(teslaPagee.cleanPower.isDisplayed(), cleanP);
    }

    //        @Test(dataProvider = "negForTeslaXVal", dataProviderClass = Data.class)
//    public void negativeTeslaXValidation(String url, String title, boolean modX) throws InterruptedException {
//        teslaPagee.modelXValid();
//        Assert.assertEquals(driver.getCurrentUrl(),url);
//        Assert.assertEquals(driver.getTitle(),title);
//        Assert.assertEquals(teslaPagee.modelXDisp.isDisplayed(),modX);
//    }


    //**********ugur's part begin here
    @Test(dataProvider = "ModelSNegVal", dataProviderClass = Data.class)
    public void positiveModelS(String url, String title) throws InterruptedException {
        teslaPagee.modelSValid();
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Assert.assertEquals(driver.getTitle(), title);
    }
    //**********ugur's part end here


}
