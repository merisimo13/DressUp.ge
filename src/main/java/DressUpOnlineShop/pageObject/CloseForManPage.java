package DressUpOnlineShop.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CloseForManPage {
    public SelenideElement
            chooseGEnder_3 = $("#cbp-hrmenu").$(byText("მამაკაცი")),
            chooseBrand_2 = $("#m-101");
}
