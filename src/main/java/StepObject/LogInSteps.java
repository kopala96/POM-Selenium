package StepObject;

import PageObject.LoginObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LoginObject {
    WebDriver driver;
    public LogInSteps (WebDriver driver1){
        driver = driver1;

    }
    @Step("ჩემს ეკაუნტზე დაკლიკვა და რეგისტრაციის გვერძე გადასვლა")
    public  void MyAccount() throws InterruptedException {
        driver.findElement(myAccaunt).click();
        Thread.sleep(4000);
        driver.findElement(register).click();
    }
    @Step("სახელის ველში სახელის ჩაწერა")
    public  void FirstNameAction(String name){
        driver.findElement(firstName).sendKeys(name);

    }
    @Step("გვარის ველში გვარის ჩაწერა")
    public  void LastNameAction(String lastNam){
        driver.findElement(lastName).sendKeys(lastNam);

    }
    @Step("იმეილის ველში ფეიკ იმეილის  ჩაწერა")
    public  void EmailFieldAction(String email){
        driver.findElement(emailField).sendKeys(email);

    }
    @Step("პაროლის ველში პაროლის ჩაწერა")
    public void PasswordAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    @Step("გაიმეორე პაროლის ველში პაროლის ჩაწერა")
    public void ConfirmPasswordAction(String password){
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    @Step("ნომერის ველში ნომერის ჩაწერა")
    public  void PhoneNumber(String phone){
        driver.findElement(phonenumber).sendKeys(phone);

    }
    @Step("გაგრძელება ღილაკზე დაკლიკვა ")
    public void ButtonAction(){
        driver.findElement(continiueButton).click();
    }



}
