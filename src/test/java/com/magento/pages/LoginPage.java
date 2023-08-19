package com.magento.pages;

import com.magento.utils.Base;
import org.openqa.selenium.By;

public class LoginPage extends Base {

    /*
    WebElements
    * */
    protected By inputuser = By.name("login[username]");
    protected By inputpass = By.name("login[password]");
    protected By bntlogin = By.id("send2");

    /*
    Constructor
    * */

    /*
    Methods / functions
    * */
    public  void fillLoginForm(String user, String pass){
        driver.findElement(inputuser).sendKeys(user);
        driver.findElement(inputpass).sendKeys(pass);
    }

    public void clickOnLogin(){
        driver.findElement(bntlogin).submit();
    }
}

