import DressUpOnlineShop.pageObject.RegisterPage;
import DressUpOnlineShop.stepsObjects.RegisterSteps;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DressUpOnlineShop.dataObject.RegisterData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


@Listeners(DressUpOnlineShop.utills.TestLister.class)
public class DressUpRegister extends ChromeRunner {

    @Test (retryAnalyzer = Retry.class)

    public void acountLogin(){
        RegisterSteps step = new RegisterSteps();


        step
             .Login();
              Assert.assertEquals(checkProfile, step.checkText.getText());

         step
                 .Emaile(emaile)
                 .creatProfileButton()
                 .genderWoman(chooseGender)
                 .firstName(firstName)
                 .lastName(lastName)
                 .idNumber(idNumber)
                 .password(password)
                 .birthdayDAy(birthdayDay)
                 .birthdayMonth(birthdayMonth)
                 .birthdayYear(birthdayYear)
                 .newsWithEmail()
                 .newsWithSms();

         sleep(500);






    }
}
