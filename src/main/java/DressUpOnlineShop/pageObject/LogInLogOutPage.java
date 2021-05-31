package DressUpOnlineShop.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LogInLogOutPage {
    public SelenideElement

            loginButton_2 = $(".login"),
            emailInput_2 = $(byName("email")),
            passwordInput_2 = $(byName("passwd")),
            authorizationButton = $(byName("SubmitLogin")),
            checkHelloText = $(".header_user_info").$(byText("გამარჯობა ვახტანგ")),
            logOutButton = $(".logout"),
            wishListButton = $(".icon-heart-o"),
            wishListName = $(".inputTxt"),
            submitWishlist = $(byName("submitWishlist")),
            wishListBlock = $("#block-history").$(byText("Meri's wish list")),
            removeWishlist = $(".icon-remove");

}
