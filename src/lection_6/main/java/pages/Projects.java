package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
/**
 * Класс проверки страницы проекты
 * @autor Солянникова Анна
 * @version 1
 */
public class Projects {
    /**
     * Неизменяемая переменная корневого элемента рассылки
     */
    final String PROJECTS = "//*[@class='subscription-block__wrapper']//*[@class='subscription-block__right-block']";

    @FindBy(xpath = PROJECTS)
    private SelenideElement subscription;
    /**
     * Переменная элемента name
     */
    @FindBy(xpath = PROJECTS + "//input[@name='SubscriptionForm[name]']")
    private SelenideElement textNameInput;
    /**
     * Переменная элемента email
     */
    @FindBy(xpath = PROJECTS + "//input[@name='SubscriptionForm[email]']")
    private SelenideElement textEmailInput;
    /**
     * Проверка отобращения рассылки
     * @return экземпляр текущего класса
     */
    @Step("Проверить, что рассылка отобразилась на странице")
    public Projects checkSubscriptionVisible() {
        subscription.shouldBe(visible);
        return this;
    }
    /**
     * Функция заполнения текстовых полей данными emal и имя
     */
    @Step("Проверить, что текстовые поля принимают значения")
    public Projects checkTextInput() {
        textNameInput.setValue("Анна");
        textEmailInput.setValue("tsybizova.anya@mail.ru");
        return this;
    }
}
