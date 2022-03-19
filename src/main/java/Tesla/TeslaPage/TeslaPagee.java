package Tesla.TeslaPage;

import Utils.BrowserUtils;
import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeslaPagee {
    /*
    As I explained in the class, you code should go ultil the last step that real such as
Navigate to tesla
Click on login
Enter credit
Click on features
Slect Madel X
     */
    public TeslaPagee(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Account']")
    WebElement account;
    @FindBy(xpath = "//input[@id='form-input-identity']")
    WebElement eMail;
    @FindBy(id = "form-submit-continue")
    WebElement nextBut;
    @FindBy(id = "form-input-credential")
    WebElement password;
    @FindBy(id = "form-submit-continue")
    WebElement nextButContin;
    @FindBy(xpath = "//span[.='Model X']")
    WebElement modelX;
    @FindBy(xpath = "//h1[contains(text(),'Model X')]")
    public WebElement modelXDisp;
    @FindBy(xpath = "//a[@title='Compare']")
    public WebElement compare;
    @FindBy(xpath = "//h1[contains(text(),'Model X')]")
    public WebElement compareModels;
    @FindBy(xpath = "//a[.='View Solar']")
    public WebElement viewSolar;
    @FindBy(xpath = "//h2[@id='landingPageHeader']")
    public WebElement cleanPower;

    //ugurs xpath begin
    @FindBy(xpath = "//*[contains(text(),'Model S')]")
    public WebElement modelS;
    //ugurs xpath ended


    public void logInVal(String emailTesla, String passwordTesla) throws InterruptedException {
        this.account.click();
        Thread.sleep(1000);
        this.eMail.sendKeys(emailTesla);
        this.nextBut.click();
        Thread.sleep(200);
        this.password.sendKeys(passwordTesla);
        this.nextButContin.click();
        Thread.sleep(500);
    }

    public void modelXValid() throws InterruptedException {
        this.modelX.click();
        Thread.sleep(5000);
    }

    public void compareVal() throws InterruptedException {
        //  this.modelX.click();Thread.sleep(3000);
        compare.click();
        Thread.sleep(1000);
    }

    public void viewSolarValid() throws InterruptedException {
        viewSolar.click();
        Thread.sleep(1000);

    }


    //**********ugurs code begin
    public void modelSValid() throws InterruptedException {
        modelS.click();
        Thread.sleep(1000);
    }
    //**********ugurs code end
}