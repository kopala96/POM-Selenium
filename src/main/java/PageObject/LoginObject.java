package PageObject;

import org.openqa.selenium.By;

public class LoginObject {
    protected By
            emailField = By.id("input-email"),
            passwordField = By.id("input-password"),
            confirmPasswordField = By.id("input-confirm"),
            continiueButton = By.className("btn-primary"),
            phonenumber = By.id("input-telephone"),
            myAccaunt = By.className("caret"),
            register = By.linkText("Register"),
            firstName = By.id("input-firstname"),
            lastName = By.id("input-lastname");


}


