import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

    @BeforeAll
    static void beforeAll () {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Vasili");
        $("#lastName").setValue("Volishevskii");
        $("#userEmail").setValue("Volishevskii@mail.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("7877987897");
        //$("#dateOfBirthInput").click();
        //$(".react-datepicker__month-select").click();

        $(".css-2b097c-container").click();
        // Доделать $(".css-2b097c-container").val("English").pressEnter();
        $(".form-file .form-control-file").uploadFile(new File("C:/Users/volis/Desktop/test.jpg"));




        $(byText("Reading")).click();
        $("#currentAddress").setValue("Krasnodar street gorkogo 53");
        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Merrut")).click();
        $("#submit").click();


}
}

