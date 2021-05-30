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
           // checkText = $(".layer_cart_title"),
            backproductpage = ($(".continue")),
            shoppingcart = $(".shopping_cart").$(byText("ჩანთა")),
            productNumber = $("#summary_products_quantity"),
            deleteProduct = $(".icon-trash"),
            backMainPaga = $("#header_logo");
}
