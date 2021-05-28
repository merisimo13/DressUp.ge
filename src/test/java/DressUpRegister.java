import DressUpOnlineShop.stepsObjects.RegisterSteps;
import DressUpOnlineShop.utills.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DressUpOnlineShop.dataObject.RegisterData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class DressUpRegister extends ChromeRunner {
    @Test
    public void acountLogin(){
        RegisterSteps step = new RegisterSteps();

        step
             .Login();
              Assert.assertEquals(checkProfile,$("h3").getText());

         step
                 .Emaile(emaile)
                 .creatProfileButton()
                 .genderWoman(chooseGender)
                 .firstName(firstName)
                 .lastName(lastName);




        sleep (4000);

    }
}
