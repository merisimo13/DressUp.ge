package DressUpOnlineShop.pageObject;

import DressUpOnlineShop.dataObject.RegisterData;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    protected SelenideElement

    loginButton = $(".login"),
    emeilinput = $(byName("email_create")),
    creatProfile = $(byName("SubmitCreate")),
    gender = $(byName("id_gender")),
    //checkText= $("h3");
    firstNameInput =$(byName("customer_firstname")),
    lastNameInput = $(byName("customer_lastname")),
    idNumberInput =$(byName("customer_prdNum"));




}
