package com.magento.steps;

import com.magento.factory.LoginFactory;
import com.magento.pages.LoginPage;
import com.magento.utils.Base;
import com.magento.utils.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class LoginSteps extends Base {

    //LoginPage loginPage = new LoginPage(); POM
    LoginFactory loginFactory = new LoginFactory(driver);
    private Hooks hooks;

    public LoginSteps(Hooks hooks){
        this.hooks= hooks;
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String user, String pass) {
        //loginPage.fillLoginForm(user,pass); // POM
        loginFactory.doLoginWithPageFactory(user, pass); //PF
    }

    @When("user enters and password")
    public void user_enters_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> loginData = dataTable.asLists();
        for (List<String> list: loginData) {
            driver.findElement(By.name("login[username]")).sendKeys(list.get(0));
            driver.findElement(By.name("login[password]")).sendKeys(list.get(1));
        }

    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        //loginPage.clickOnLogin(); POM
        loginFactory.clickLoginPF(); // PF
    }

    @Then("message displayed {string}")
    public void message_displayed(String msg) {
        //assertion
    }

}
