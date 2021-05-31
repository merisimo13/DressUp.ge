package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.LogInLogOutPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;


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
        Assert.assertEquals(checkHelloText.is(Condition.visible), helloText);
        return this;
    }

    @Step("click log out button")
    public LogInLogOutStep logOutButton() {
        logOutButton.click();
        return this;
    }

    @Step("click wish list button")
    public LogInLogOutStep wishListButton() {
        wishListButton.click();
        return this;
    }

    @Step("write wish list name")
    public LogInLogOutStep wishListName(String nameForWishList) {
        wishListName.setValue(nameForWishList);
        return this;
    }

    @Step("write wish list name")
    public LogInLogOutStep submitWishlist() {
        submitWishlist.click();
        Assert.assertEquals(wishListBlock.is(Condition.visible), true);
        return this;
    }

    @Step("write wish list name")
    public LogInLogOutStep removeWishList() throws AWTException {
        removeWishlist.click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        Assert.assertEquals(wishListBlock.is(Condition.visible),false);
        return this;
    }
}