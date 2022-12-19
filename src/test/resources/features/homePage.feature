Feature: Login Page Test Case

  Scenario Outline: GO to home page
    Given user is on home page of site
    Then click on get started button
    Then click on import wallet button
    Then click on i agree button
    Then enter secret keys "<key>"
    Then enter twosecret keys "<two>"
    Then enter Threesecret keys "<three>"
    Then enter Foursecret keys "<four>"
    Then enter Fivesecret keys "<five>"
    Then enter Sixsecret keys "<six>"
    Then enter Sevensecret keys "<Seven>"
    Then enter Eightsecret keys "<Eight>"
    Then enter Ninesecret keys "<Nine>"
    Then enter Tensecret keys "<Ten>"
    Then enter Elevensecret keys "<Eleven>"
    Then enter Twelvesecret keys "<Twelve>"
    Then enter new password "<password>"
    Then enter confirm password "<confirmPassword>"
    Then click on agreement
    Then click on import button
    Then click on the Done Btn
    Then click on the Close Btn
    Then click on the Eth Btn
    Then click on the HideShowBtn
    Then click on the Enable Disable Btn
    Then click on the Eth Main Btn
    Then click on the Rinkeby Btn
    Then click on the Connect Wallet Btn
    Then click on the Metamask Button
    Then click on the Next Btn
    Then click on the Connect Btn
    Then click on the Sign Button
    Then click on the Create Token Btn
    Then enter the token name "<TokenName>"
    Then enter the Token Symbol "<TokenSymbol>"
    Then click on the fist next button
    Then enter the token supply "<TokenSupply>"
    Then enter the token decimal "<TokenDecimal>"
    Then click on the Next Btn Second
    Then click on the Mint Capability
    Then click on the Next Three Btn
    Then click on the Hacken Skip Button
    Then Click on the payment dropdown
    Then click on the PaymentConfirm Button
    Then clcik on the Approve payment button
    Then click on the Confirm Metamaskbutton
    Then click on the Confirm Button
    Then click on the MetaMask Confirm Button
    Examples:
    |key|password|confirmPassword|two|three|four|five|six|Seven|Eight|Nine|Ten|Eleven|Twelve|TokenName|TokenSymbol|TokenSupply|TokenDecimal|
    | subway | faisal123@$&       |     faisal123@$&          |  uncover |vacant|undo|public|theory|device|wrist|key|quote|car|odor|Faisal|SSP|100000|18|