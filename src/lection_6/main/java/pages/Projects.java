package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;

public class Projects {
    final String PROJECTS = "//*[@class='subscription-block__wrapper']//*[@class='subscription-block__right-block']";

    @FindBy(xpath = PROJECTS)
    private SelenideElement subscription;

    @FindBy(xpath = PROJECTS + "//input[@name='SubscriptionForm[name]']")
    private SelenideElement textNameInput;

    @FindBy(xpath = PROJECTS + "//input[@name='SubscriptionForm[email]']")
    private SelenideElement textEmailInput;

    @Step("Проверить, что рассылка отобразилась на странице")
    public Projects checkSubscriptionVisible() {
        subscription.shouldBe(visible);
        return this;
    }

    @Step("Проверить, что текстовые поля принимают значения")
    public Projects checkTextInput() {
        textNameInput.setValue("Анна");
        textEmailInput.setValue("tsybizova.anya@mail.ru");
        return this;
    }
}
