package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.LogInLogOutPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class LogInLogOutStep extends LogInLogOutPage {
    @Step("click login button two")
    public LogInLogOutStep Login_2() {
        loginButton_2.click();
        return this;
    }

    @Step("set email veliu - {emaile_2}")
    public LogInLogOutStep emileInput_2(String emaile_2) {
        emailInput_2.setValue(emaile_2);
        return this;
    }

    @Step("set password veliu - {pass}")
    public LogInLogOutStep passwordInput_2(String pass) {
        passwordInput_2.setValue(pass);
        return this;
    }

    @Step("click authorization Button ")
    public LogInLogOutStep authorizationButton() {
        authorizationButton.click();

        return this;
    }

    @Step("check hello text")
    public LogInLogOutStep checkHelloText(boolean helloText) {
        Assert.assertEquals(checkHelloText.is(Condition.visible),helloText);
        return this;
    }

    @Step("click log out button")
    public LogInLogOutStep logOutButton() {
        logOutButton.click();
        return this;
    }

}