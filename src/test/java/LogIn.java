import StepObject.LogInSteps;
import Utills.BrowserActions;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;

public class LogIn  extends BrowserActions {


    @Test
    @Description("იუზერის რეგისტრაცია Java Faker-ის გამოყენებით")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://tutorialsninja.com/demo/") // აქ შეგვიძლია ჯირას ტესტქეისების ლინკი დავურთოთ ყველა ტესტს სათითაოდ უფრო მარტივი რომ იყოს აღსაქმელად
    public void userRegistration() throws InterruptedException {
        LogInSteps steps1 = new LogInSteps(driver);
        steps1.MyAccount();
        steps1.FirstNameAction(firstname2);
        steps1.LastNameAction(lastname);
        steps1.EmailFieldAction(email1);
        steps1.PhoneNumber(phone1);
        steps1.PasswordAction(pwd12);
        steps1.ConfirmPasswordAction(confirmPwd);
        Thread.sleep(5000);
        steps1.ButtonAction();
    }
}
