package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("User1")){
            username = ConfigurationReader.getProperty("userName");
            password = ConfigurationReader.getProperty("userPassword");
        }else if(userType.equalsIgnoreCase("Employee1")){
            username = ConfigurationReader.getProperty("employeeName");
            password = ConfigurationReader.getProperty("employeePassword");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }

}
