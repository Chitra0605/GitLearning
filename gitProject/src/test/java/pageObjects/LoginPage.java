package pageObjects;

import browserControl.WebConnector;

public class LoginPage extends WebConnector {

    /**
     * Locators
     */

    private String usernamefieldXpath = "//input[@id='user-name']";

    private String passwordfieldXpath = "//input[@id='password']";

    private String loginbuttonXpath = "//*[@id=\"login-button\"]";


    /******* Getters and Setters *******/

    /**
     *
     * @param username
     */
    public void setUserName(String username) {
        BasePage.findElementByXpath(10, usernamefieldXpath).sendKeys(username);

    }

    /**
     * Set password field
     *
     * @param password
     */
    public void setPassword(String password) {
        BasePage.findElementByXpath(10, passwordfieldXpath).sendKeys(password);
    }

    /**
     * Click on Login button
     */
    public void clickLogin(){
        BasePage.findElementByXpath(10, loginbuttonXpath).click();

    }
}

