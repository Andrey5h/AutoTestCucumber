/**
 * @author Andrey Strelnikov
 * First AutoTest
 */

package steps;

import org.openqa.selenium.By;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class SendAppSteps {

    @Step("Поле {0} заполняется значенем {1}")
    public void stepFillField(String field, String value) {
        new SendAppPage().fillField(field, value);
    }

    @Step("Заполняются поля: ")
    public void stepFillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepFillField);
    }

    @Step("Поля заполнены!")
    public void stepCheckFields() {
        assertEquals("Ivanov", BaseSteps.getDriver().findElement(By.name("insured0_surname")).getAttribute("value"));
        assertEquals("Ivan", BaseSteps.getDriver().findElement(By.name("insured0_name")).getAttribute("value"));
        assertEquals("01.01.1990", BaseSteps.getDriver().findElement(By.name("insured0_birthDate")).getAttribute("value"));
        assertEquals("Иванов", BaseSteps.getDriver().findElement(By.name("surname")).getAttribute("value"));
        assertEquals("Иванович", BaseSteps.getDriver().findElement(By.name("middlename")).getAttribute("value"));
        assertEquals("Иван", BaseSteps.getDriver().findElement(By.name("name")).getAttribute("value"));
        assertEquals("01.01.1990", BaseSteps.getDriver().findElement(By.name("birthDate")).getAttribute("value"));
    }

    @Step ("Проверка появления текста Заполнены не все обязательные поля")
    public void stepCheckError() {
        assertEquals("Заполнены не все обязательные поля", BaseSteps.getDriver().findElement(By.xpath("//DIV[@ng-show='tryNext && myForm.$invalid'][text()='Заполнены не все обязательные поля']")).getText());
    }

    @Step ("Выполнено нажатие на кнопку - Продолжить")
    public void stepClickButton(){
        new SendAppPage().sendButton.click();
    }

}
