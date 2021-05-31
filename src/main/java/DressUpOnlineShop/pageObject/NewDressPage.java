package DressUpOnlineShop.pageObject;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class NewDressPage {
    public SelenideElement

            chooseGEnder_2 = $("#cbp-hrmenu").$(byText("ქალი")),
            chooseClose = $(byName("c[74][]")),
            chooseBrand = $("#m-52"),
            chooseSize = $("#a-2"),
            selectFirstProduct = $(".product-container"),
            addProduct = $(byName("Submit")),
            backproductpage = ($(".continue")),
            shoppingcart = $(".shopping_cart").$(byText("ჩანთა")),
            emptyCartWarning = $("#emptyCartWarning"),
            deleteProduct = $(".icon-trash"),
            backMainPaga = $("#header_logo");
}
