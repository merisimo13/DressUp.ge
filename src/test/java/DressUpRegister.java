import DressUpOnlineShop.stepsObjects.RegisterSteps;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static DressUpOnlineShop.dataObject.RegisterData.*;


@Listeners(DressUpOnlineShop.utills.TestLister.class)
public class DressUpRegister extends ChromeRunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("check register positive case")

    public void acountLogin() {
        RegisterSteps step = new RegisterSteps();


        step
                .Login()
                .Emaile(emaile)
                .creatProfileButton()
                .genderWoman(chooseGender)
                .firstName(firstName)
                .lastName(lastName)
                .idNumber(idNumber)
                .password(password)
                .checkEmail()
                .birthdayDAy(birthdayDay)
                .birthdayMonth(birthdayMonth)
                .birthdayYear(birthdayYear)
                .newsWithEmail()
                .newsWithSms();

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("check register negative case")

    public void acountLoginNegativeCAse() {
        RegisterSteps step = new RegisterSteps();

        step
                .Login()
                .Emaile(emaile)
                .creatProfileButton()
                .checkAlert(false)
                .registeButton()
                .checkAlert(true);
    }
}
