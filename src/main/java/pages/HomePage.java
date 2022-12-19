package pages;


import Util.Wait;
import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webLocators.homePageElements;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // locators
    //private By connectBtn = By.xpath(homePageElements.connect);
    private By getStartedBtn = By.xpath(homePageElements.getStarted);
    private By importWalletBtn = By.xpath(homePageElements.importWallet);
    private By secretKeyField = By.xpath(homePageElements.secretField);
    private By secretKeyTwo = By.xpath(homePageElements.secretTwo);
    private By secretKeyThree = By.xpath(homePageElements.secretThree);
    private By secretKeyFour = By.xpath(homePageElements.secretFour);
    private By secretKeyFive = By.xpath(homePageElements.secretFive);
    private By secretKeySix = By.xpath(homePageElements.secretSix);

    private By secretKeySeven = By.xpath(homePageElements.secretSeven);
    private By secretKeyEight = By.xpath(homePageElements.secretEight);
    private By secretKeyNine = By.xpath(homePageElements.secretNine);
    private By secretKeyTen = By.xpath(homePageElements.secretTen);
    private By secretKeyEleven = By.xpath(homePageElements.secretEleven);
    private By secretKeyTwelve = By.xpath(homePageElements.secretTwelve);

    private By newPasswordField = By.xpath(homePageElements.newPassword);
    private By conPasswordField = By.xpath(homePageElements.confirmPassword);
    private By agreementcheckBox = By.xpath(homePageElements.agreement);
    private By importBtn = By.xpath(homePageElements.importBtn);

    private By iAgreeBtn = By.xpath((homePageElements.iagreeBtn));

    private By AllDone = By.xpath(homePageElements.alldone);
    private By NextButton = By.xpath(homePageElements.NextBtn);
    private By ConnectButton = By.xpath(homePageElements.ConnectBtn);
    private By CloseButton = By.xpath(homePageElements.CloseBtn);
    private By ETHBtn = By.xpath(homePageElements.ETHMainBtn);
    private By HideShowBtn =By.xpath(homePageElements.HideShowBtn);
    private By EnableButton =By.xpath(homePageElements.EnableBtn);
    private By EthMainBtn =By.xpath(homePageElements.ETHMainBtn);
    private By RinkebyButton = By.xpath(homePageElements.RinkebyBtn);
    private By ConnectWalletBtn = By.xpath(homePageElements.ConnectWallet);
    private By MetamaskBtn = By.xpath(homePageElements.MetamaskBtn);
    private By SignBtn = By.xpath(homePageElements.SignBtn);
    private By CreateTokenBtn = By.cssSelector(homePageElements.CreateTokenBtn);
    private By TokenNameFields = By.xpath(homePageElements.TokenNameField);
    private By TokenSymbolFields = By.xpath(homePageElements.TokenSymbolField);
    private By NextButtons = By.cssSelector(homePageElements.NextButton);
    private By TotalSupply = By.xpath(homePageElements.Totalsupply);
    private By TokenDecimals = By.xpath(homePageElements.TokenDecimal);
    private By NextTokenBtn = By.xpath(homePageElements.NextButtonToken);
    private By MintCapability = By.xpath(homePageElements.MintCapabilities);
    private By TxcFeeCapability = By.xpath(homePageElements.TransactionFee);
    private By BurnCap = By.xpath(homePageElements.BurnCapability);
    private By SnapShotCap = By.xpath(homePageElements.SnapshotCapability);
    private By BlackListingCap = By.xpath(homePageElements.BlackListingCapability);
    private By PausingCap = By.xpath(homePageElements.PausingCapability);
    private By NextBtnThree = By.xpath(homePageElements.NextThree);
    private By HackenSkipBtn = By.xpath(homePageElements.SkipBtnHacken);
    private By ConfirmButton = By.xpath(homePageElements.ConfirmBtn);
    private By MetamaskConfirm = By.xpath(homePageElements.MetaMaskConfirm);
    private By DeployTemplates =By.xpath(homePageElements.DeployTemplate);
    private By ConfirmMetamaskDeployTemoplate = By.xpath(homePageElements.DeployConfirmMetamask);
    private By Paymentdropdowns = By.xpath(homePageElements.Paymentdropdown);
    private By PaymentConfirmButton = By.xpath(homePageElements.PaymentConfirmBtn);
    private By ApprovePaymentButton = By.xpath(homePageElements.PaymentapproveBTN);
    private By MetamaskPaymentBtn = By.xpath(homePageElements.MetamaskPaymentConfirmBtn);

    public void clickOnConnectBtn()  {
        //driver.switchTo().window(DriverFactory.tabs2.get(1));
        //driver.findElement(connectBtn).click();
    }

    public void clickOnGetStarted() throws InterruptedException {
        driver.switchTo().window(DriverFactory.tabs4.get(0));
         Thread.sleep(5000);
        driver.findElement(getStartedBtn).click();
    }

    public void clickOnImportWallet(){
        driver.findElement(importWalletBtn).click();
    }

    public void enterSecertKey(String key){
        driver.findElement(secretKeyField).sendKeys(key);
    }
    public void TwoSecertKey(String two){
        driver.findElement(secretKeyTwo).sendKeys(two);
    }
    public void ThreeSecertKey(String three){
        driver.findElement(secretKeyThree).sendKeys(three);
    }
    public void FourSecertKey(String four){
        driver.findElement(secretKeyFour).sendKeys(four);
    }

    public void FiveSecertKey(String five){
        driver.findElement(secretKeyFive).sendKeys(five);
    }
    public void SixSecertKey(String six){
        driver.findElement(secretKeySix).sendKeys(six);
    }
    public void SevenSecertKey(String seven){
        driver.findElement(secretKeySeven).sendKeys(seven);
    }
    public void EightSecertKey(String Eight){
        driver.findElement(secretKeyEight).sendKeys(Eight);
    }
    public void NineSecertKey(String Nine){
        driver.findElement(secretKeyNine).sendKeys(Nine);
    }
    public void TenSecertKey(String Ten){
        driver.findElement(secretKeyTen).sendKeys(Ten);
    }
    public void ElevenSecertKey(String Eleven){
        driver.findElement(secretKeyEleven).sendKeys(Eleven);
    }
    public void TwelveSecertKey(String Twelve){
        driver.findElement(secretKeyTwelve).sendKeys(Twelve);
    }


    public void enterNewPassword(String pass){
        driver.findElement(newPasswordField).sendKeys(pass);
    }

    public void enterConfirmPassword(String con_pass){
        driver.findElement(conPasswordField).sendKeys(con_pass);
    }

    public void clickOnAgremmentCheckBox(){
        driver.findElement(agreementcheckBox).click();
    }

    public void clickOnImportBtn(){
        driver.findElement(importBtn).click();
    }

    public void clickOnIAgreeBtn(){
        driver.findElement(iAgreeBtn).click();
    }
    public  void clickOnalldone() {
        Wait.waitForElementVisible(AllDone);
        driver.findElement(AllDone).click();
    }
    public void NextBtn() throws InterruptedException {
        Thread.sleep(3000);
        DriverFactory.tabs4 =  new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(DriverFactory.tabs4.get(2));
        Thread.sleep(3000);
        Wait.waitForElementVisible(NextButton);
        driver.findElement(NextButton).click();
    }
    public void ConnectBtn(){
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(DriverFactory.tabs4.get(2));
        Wait.waitForElementVisible(ConnectButton);
        driver.findElement(ConnectButton).click();
    }
    public void CloseBtn(){
        Wait.waitForElementVisible(CloseButton);
        driver.findElement(CloseButton).click();
    }
    public void EthBtn(){
        Wait.waitForElementVisible(ETHBtn);
        driver.findElement(ETHBtn).click();
    }
    public void HideShowBtn(){
        Wait.waitForElementVisible(HideShowBtn);
        driver.findElement(HideShowBtn).click();
    }
    public void EnableDisableBtn(){
        Wait.waitForElementVisible(EnableButton);
        driver.findElement(EnableButton).click();
    }
    public void EthMainBtn(){
        Wait.waitForElementVisible(EthMainBtn);
        driver.findElement(EthMainBtn).click();
    }
    public void RinkebyBtn(){
        Wait.waitForElementVisible(RinkebyButton);
        driver.findElement(RinkebyButton).click();
    }
    public void ConnectWalletBtn(){
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("---------------------"+DriverFactory.tabs4.size());
        driver.switchTo().window(DriverFactory.tabs4.get(1));
        Wait.waitForElementVisible(ConnectWalletBtn);
        driver.findElement(ConnectWalletBtn).click();
    }
    public void MetamaskButton() throws InterruptedException {
        Thread.sleep(4000);
        Wait.waitFor10Second();
        Wait.pageLoadTime();
        Wait.waitForElementVisible(MetamaskBtn);
        driver.findElement(MetamaskBtn).click();
    }
    public void SignButtons() throws InterruptedException {
        Wait.pageLoadTime();
        Thread.sleep(3000);
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(DriverFactory.tabs4.get(2));
        System.out.println("---------------------"+DriverFactory.tabs4.size());
        Wait.waitForElementVisible(SignBtn);
        driver.findElement(SignBtn).click();

    }
    public void CreateTokenButton() throws InterruptedException {
        driver.navigate().refresh();
        Wait.waitFor10Second();
        Thread.sleep(3000);
        System.out.println("---------------------"+DriverFactory.tabs4.size());
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(DriverFactory.tabs4.get(1));
        Wait.waitForElementVisible(CreateTokenBtn);
        driver.findElement(CreateTokenBtn).click();
    }
    public void EnterTokenName(String TName) throws InterruptedException {
        Wait.waitFor10Second();
        Thread.sleep(2000);
        Wait.waitForElementVisible(TokenNameFields);
        driver.findElement(TokenNameFields).sendKeys(TName);
    }
    public void EnterTokenSymbol(String tokensymbol){
        Wait.waitForElementVisible(TokenSymbolFields);
        driver.findElement(TokenSymbolFields).sendKeys(tokensymbol);
    }
    public void ClickOnNextBtns() throws InterruptedException {
        //Thread.sleep(2000);
        waitcondition(NextButtons);
        //Wait.waitForElementVisible(NextButtons);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(NextButtons));
    }
    public void Totaltokensupply(String tokenamount){
        Wait.pageLoadTime();
        Wait.waitForElementVisible(TotalSupply);
        driver.findElement(TotalSupply).sendKeys(tokenamount);

    }
    public void TokenDecimal(String tokendecimal){
        Wait.waitForElementVisible(TokenDecimals);
        driver.findElement(TokenDecimals).sendKeys(tokendecimal);
    }
    public void NextButtonScd(){
        Wait.waitForElementVisible(NextTokenBtn);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(NextTokenBtn));
    }
    public void MintCapabilities() throws InterruptedException {
        Wait.waitForElementVisible(MintCapability);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(TxcFeeCapability));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(MintCapability));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(BurnCap));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(SnapShotCap));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(BlackListingCap));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(PausingCap));

    }
    public void NextButtonThree() throws InterruptedException {
        Wait.waitForElementVisible(NextBtnThree);
        Thread.sleep(7000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(NextBtnThree));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(NextBtnThree));


    }
    public void HackenButtonSkip(){
        Wait.waitForElementVisible(HackenSkipBtn);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,120)");
        js.executeScript("arguments[0].click();",driver.findElement(HackenSkipBtn));

    }
    public void LastConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);
        Wait.waitForElementVisible(ConfirmButton);
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("---------------------"+DriverFactory.tabs4.size());
        driver.switchTo().window(DriverFactory.tabs4.get(1));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement(ConfirmButton));
    }
    public void MetamaskConfirm() throws InterruptedException {
        Thread.sleep(6000);
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("---------------------"+DriverFactory.tabs4.size());
        driver.switchTo().window(DriverFactory.tabs4.get(2));
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement(MetamaskConfirm));
    }
    public void DeployedTemplate() throws InterruptedException {
        Thread.sleep(3000);
        Wait.waitForElementVisible(DeployTemplates);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement(DeployTemplates));

    }
    public void Paymentdropdown(){
        Wait.waitForElementVisible(Paymentdropdowns);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement(Paymentdropdowns));

    }
    public void PaymentConfirmButton(){
        Wait.waitForElementVisible(PaymentConfirmButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement(PaymentConfirmButton));


    }
    public void ApprovePaymentBtn() throws InterruptedException {
        Thread.sleep(2000);
        Wait.waitForElementVisible(ApprovePaymentButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement(ApprovePaymentButton));

    }
    public void MetamaskConfirmButton() throws InterruptedException {
        Thread.sleep(5000);
        DriverFactory.tabs4 =  new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(DriverFactory.tabs4.get(2));
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,220)");
        js.executeScript("arguments[0].click();",driver.findElement( MetamaskPaymentBtn));

    }
    public void DeployConfirnmBtn(){
        waitcondition(ConfirmMetamaskDeployTemoplate);
        //Boolean ConfirmMetamaskBTN = driver.findElement(ConfirmMetamaskDeployTemoplate).isEnabled();
        //if (ConfirmMetamaskBTN==true){
          //  WebElement DeployedConfirnm = driver.findElement(ConfirmMetamaskDeployTemoplate);
            //DeployedConfirnm.click();
        //}
        DriverFactory.tabs4 = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("---------------------"+DriverFactory.tabs4.size());
        driver.switchTo().window(DriverFactory.tabs4.get(2));
        waitcondition(ConfirmMetamaskDeployTemoplate);
        driver.findElement(ConfirmMetamaskDeployTemoplate).click();
        DeployConfirnmBtn();
    }
    public void waitcondition(By locator){
        //WebdriverTest = DriverFactory.getDriver();
        WebDriverWait  wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(60 ));
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }





}
