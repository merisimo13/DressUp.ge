package DressUpOnlineShop.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LogInLogOutPage {
    public SelenideElement

            loginButton_2 = $(".login"),
            checkText_2 = $("h3"),
            emailInput_2 = $(byName("email")),
            passwordInput_2 = $(byName("passwd")),
            authorizationButton = $(byName("SubmitLogin")),
            checkHelloText = $(".header_user_info").$(byText("გამარჯობა ვახტანგ")),
            logOutButton = $(".logout");


}
