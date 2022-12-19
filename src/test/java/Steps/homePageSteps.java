package Steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

import java.util.ArrayList;

public class homePageSteps {
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("user is on home page of site")
    public void openWebPage(){

    }

    //@Then("click on connect button")
    //public void clickOnConnectButton()  {
      //  homePage.clickOnConnectBtn();
    //}

    @Then("click on import wallet button")
    public void clickOnImportWalletButton() {
        homePage.clickOnImportWallet();
    }

    @Then("click on get started button")
    public void clickOnGetStartedButton() throws InterruptedException {
        homePage.clickOnGetStarted();
    }

    @Then("enter secret keys {string}")
    public void enterSecretKeys(String keyValue) {
        homePage.enterSecertKey(keyValue);
    }
    @Then("enter twosecret keys {string}")
    public void TwoSecretKeys(String Twovalue){homePage.TwoSecertKey(Twovalue);}
    @Then("enter Threesecret keys {string}")
    public void ThreeSecretKeys(String Threevalue){homePage.ThreeSecertKey(Threevalue);}
    @Then("enter Foursecret keys {string}")
    public void FourSecretKeys(String FourValue){homePage.FourSecertKey(FourValue);}
    @Then("enter Fivesecret keys {string}")
    public void FiveSecretKeys(String Fivevalue){homePage.FiveSecertKey(Fivevalue);}
    @Then("enter Sixsecret keys {string}")
    public void SixSecretKeys(String Sixvalue){homePage.SixSecertKey(Sixvalue);}
    @Then("enter Sevensecret keys {string}")
    public void SevenSecretKeys(String Sevenvalue){homePage.SevenSecertKey(Sevenvalue);}
    @Then("enter Eightsecret keys {string}")
    public void EightSecretKeys(String Eightvalue){homePage.EightSecertKey(Eightvalue);}
    @Then("enter Ninesecret keys {string}")
    public void NineSecretKeys(String Ninevalue){homePage.NineSecertKey(Ninevalue);}
    @Then("enter Tensecret keys {string}")
    public void TenSecretKeys(String Tenvalue){homePage.TenSecertKey(Tenvalue);}
    @Then("enter Elevensecret keys {string}")
    public void ElevenSecretKeys(String Elevenvalue){homePage.ElevenSecertKey(Elevenvalue);}
    @Then("enter Twelvesecret keys {string}")
    public void TwelveSecretKeys(String Twelvevalue){homePage.TwelveSecertKey(Twelvevalue);}


    @Then("enter new password {string}")
    public void enterNewPassword(String password) {
        homePage.enterNewPassword(password);
    }

    @Then("enter confirm password {string}")
    public void enterConfirmPassword(String conPass) {
        homePage.enterConfirmPassword(conPass);
    }

    @Then("click on agreement")
    public void clickOnAgreement() {
        homePage.clickOnAgremmentCheckBox();
    }

    @Then("click on import button")
    public void clickOnImportButton() {
        homePage.clickOnImportBtn();
    }

    @Then("click on i agree button")
    public void clickOnIAgreeButton() {
        homePage.clickOnIAgreeBtn();
    }
    @Then("click on the Done Btn")
    public void clickOnDoneBtn(){
        homePage.clickOnalldone();
    }
    @Then("click on the Next Btn")
    public void clickOnNextBtn() throws InterruptedException {
        homePage.NextBtn();
    }
    @Then("click on the Connect Btn")
    public void clickOnConnectBtn(){
        homePage.ConnectBtn();
    }
    @Then("click on the Close Btn")
    public void clickOnCloseBtn(){
        homePage.CloseBtn();
    }
    @Then("click on the Eth Btn")
    public void clickOnEthBtn(){
        homePage.EthBtn();
    }
    @Then("click on the HideShowBtn")
        public void clickOnHideShowBtn(){
        homePage.HideShowBtn();
    }
    @Then("click on the Enable Disable Btn")
    public void clickOnEnableBtn(){
        homePage.EnableDisableBtn();
    }
    @Then("click on the Eth Main Btn")
    public void clickOnEthMainBtn(){
        homePage.EthMainBtn();
    }
    @Then("click on the Rinkeby Btn")
    public void clickOnRinkebyBtn(){
        homePage.RinkebyBtn();
    }
    @Then("click on the Connect Wallet Btn")
    public void clickOnConnectWallet(){
        homePage.ConnectWalletBtn();
    }
    @Then("click on the Metamask Button")
    public void clickOnMetamask() throws InterruptedException {
        homePage.MetamaskButton();
    }
     @Then("click on the Sign Button")
        public void clickOnSignBtn() throws InterruptedException {
        homePage.SignButtons();
        }
        @Then("enter the token name {string}")
        public void entertokenname(String TokenName) throws InterruptedException {
        homePage.EnterTokenName(TokenName);

        }

        @Then("click on the Create Token Btn")
    public void clickOnCreateToken() throws InterruptedException {
        homePage.CreateTokenButton();
        }
        @Then("enter the Token Symbol {string}")
    public void entertokensymbol(String tokensymbol){
        homePage.EnterTokenSymbol(tokensymbol);
        }

        @Then("click on the fist next button")
    public void clickOnNextButtons() throws InterruptedException {
        homePage.ClickOnNextBtns();
        }
        @Then("enter the token supply {string}")
    public void entertokensupply(String TotalToken){
        homePage.Totaltokensupply(TotalToken);
        }
        @Then("enter the token decimal {string}")
    public void entertokendecimal(String tokendecimal){
        homePage.TokenDecimal(tokendecimal);
        }
        @Then("click on the Next Btn Second")
    public void ClickOnNextBtn(){
        homePage.NextButtonScd();
        }
        @Then("click on the Mint Capability")
    public void clickOnMintCap() throws InterruptedException {
        homePage.MintCapabilities();
        }
        @Then("click on the Next Three Btn")
    public void clickOnNextThree() throws InterruptedException {
        homePage.NextButtonThree();
        }
        @Then("click on the Hacken Skip Button")
    public void clickOnSkipBtn(){
        homePage.HackenButtonSkip();
        }
        @Then("click on the Confirm Button")
    public void clickConfirmBtn() throws InterruptedException {
        homePage.LastConfirmBtn();
        }
        @Then("click on the MetaMask Confirm Button")
    public void clickOnMetamaskBtn() throws InterruptedException {
        homePage.MetamaskConfirm();
        }
        @Then("click on the Deploy Template Button")
    public void Deploytemplate() throws InterruptedException {
        homePage.DeployedTemplate();

        }
        @Then("click on the Confirm Metamask deploy Btn")
    public void DeployMetamask(){
        homePage.DeployConfirnmBtn();
        }

        @Then("Click on the payment dropdown")
    public void Paymentdropclick(){
        homePage.Paymentdropdown();
        }
        @Then("click on the PaymentConfirm Button")
    public void PaymentconfirmBtn(){
        homePage.PaymentConfirmButton();
        }
        @Then("clcik on the Approve payment button")
    public void approvepaymentBtn() throws InterruptedException {
        homePage.ApprovePaymentBtn();
        }
        @Then("click on the Confirm Metamaskbutton")
    public void MetamaskConfirmBtn() throws InterruptedException {
        homePage.MetamaskConfirmButton();
        }

}
   // Then click on the Deploy Template Button
     //   Then click on the Confirm Metamask deploy Btn
