package DressUpOnlineShop.pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CloseForManPage {
    public SelenideElement
            chooseGEnder_3 = $("#cbp-hrmenu").$(byText("მამაკაცი")),
            chooseBrand_2 = $("#m-101"),
            selectProductSort = $("#selectProductSort"),
            price = $(".price");

    public ElementsCollection
            allProduct = $$(".ajax_block_product");
}