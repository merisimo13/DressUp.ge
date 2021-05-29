package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.NewDressPage;

public class NewDressStep extends NewDressPage {


    public NewDressStep chooseGenderButton () {
        chooseGEnder_2.click();
        return this;
    }
}
