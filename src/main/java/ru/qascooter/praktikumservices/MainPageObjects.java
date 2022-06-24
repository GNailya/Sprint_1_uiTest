package ru.qascooter.praktikumservices;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static com.codeborne.selenide.Condition.exactText;


public class MainPageObjects {


    public final static String URL = "https://qa-scooter.praktikum-services.ru";

    // описание элементов на главной странице

    @FindBy(how = How.CLASS_NAME, using = "header_LogoYandex__3TSOI") //Логотип "Яндекс"
    private SelenideElement logoYandex;
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR") //Логотип "Scooter"
    private SelenideElement logoScooter;
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7") //кнопка "Статус заказа"
    private SelenideElement statusOrder;
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g") //копка "Заказать"
    private SelenideElement hederOrderButton;


    @FindBy(how = How.CLASS_NAME, using = "Home_ArrowDown__fnDme Home_Animated__17o7s Home_Bounce__O19_v")
    // стрелочка вниз
    private SelenideElement downArrow;
    @FindBy(how = How.XPATH, using = ".//div[@class ='Home_Scooter__3YdJy']/img")//Изображение самоката
    private SelenideElement imgScooter;

    @FindBy(how = How.XPATH, using = ".//div[@class ='Home_Header__iJKdX']") //Заголовок услуги "Самокат на пару дней"
    private SelenideElement titleScooterForTwoDays;
    @FindBy(how = How.CLASS_NAME, using = ".//div[@class ='Home_Header__iJKdX']/div[1]")
    //Текст "Привезем к вашей двери..."
    private SelenideElement textScooterForTwoDays;

    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Table__2kPxP']/div[1]")//модель
    private SelenideElement modelScooter;
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Table__2kPxP']/div[3]") //Максимальная скорость
    private SelenideElement maxSpeed;
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Table__2kPxP']/div[4]") //Расстояное без подзарядки
    private SelenideElement сhargingDistance;
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Table__2kPxP']/div[5]") //Вес
    private SelenideElement weight;


    @FindBy(how = How.XPATH, using = ".//div[text()='Заказываете самокат']") //текст
    private SelenideElement orderScooterText;
    @FindBy(how = How.XPATH, using = ".//div[text()='Выбираете, когда и куда привезти']") //Описание
    private SelenideElement chooseAdress;
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер привозит самокат']") //текст
    private SelenideElement courierDeliverScooter;
    @FindBy(how = How.XPATH, using = ".//div[text()='А вы-оплачиваете самокат']") //Описание
    private SelenideElement youPaymentScooter;
    @FindBy(how = How.XPATH, using = ".//div[text()='Катаетесь']") //Текст
    private SelenideElement ride;
    @FindBy(how = How.XPATH, using = ".//div[text()='Сколько часов аренды осталось-видно на сайте']") //Описание
    private SelenideElement howTimeSeenCite;
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер забирает самокат']") //Текст
    private SelenideElement courierPicksUp;
    @FindBy(how = How.XPATH, using = ".//div[text()='Когда аренда заканчивается']") //Описание
    private SelenideElement whenRentEnds;
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g Button_Middle__1CSJM") //кнопка заказа
    private SelenideElement btnMainOrder;


    @FindBy(how = How.CLASS_NAME, using = "Home_FAQ__3uVm4") //Блок с вопросами
    private SelenideElement blokQuestions;

    @FindBy(how = How.CLASS_NAME, using = "accordion__item")//список вопросов
    private List<SelenideElement> faq;
    @FindBy(how = How.CLASS_NAME, using = "accordion__panel")//список ответов
    private List<SelenideElement> respond;


    // действия на главной странице

    public OrderPage clickOrderButton() {
        hederOrderButton.click();
        return Selenide.page(OrderPage.class);
    }


    public MainPageObjects scrolBlokQuestions() {
        blokQuestions.scrollTo();
        return this;
    }

    //получаем вопрос,клик на него
    public MainPageObjects clickquestions1(int numberQuestion) {
        faq.get(numberQuestion).click();
        return this;
    }
    //получаем ответ и проверяем имеет ли он текст(1 способ)
     public SelenideElement getTextRespond(int numberRespond, String text) {
        return  respond.get(numberRespond).shouldHave(exactText(text));
      }

      // Получаем строку элемента, текст проверяем в тесте (2 способ)
      public String getText(int numRespond) {
          return respond.get(numRespond).getText();
      }
}

















