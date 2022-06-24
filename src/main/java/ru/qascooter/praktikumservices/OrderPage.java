package ru.qascooter.praktikumservices;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;
import static org.openqa.selenium.Keys.ENTER;

public class OrderPage {

     final static String URL = "https://qa-scooter.praktikum-services.ru/order";

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = '* Имя']")
    private SelenideElement inputName;

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = '* Фамилия']")
    private SelenideElement inputSurName;

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = '* Адрес: куда привезти заказ']")
    private SelenideElement inputAdress;

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = '* Станция метро']")
    private SelenideElement inputStation;

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = '* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumber;

    @FindBy(how = How.XPATH, using = ".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement btnFurther;

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = '* Когда привезти самокат']")
    private SelenideElement data;

    @FindBy(how = How.XPATH, using = ".//div[@class = 'react-datepicker__day react-datepicker__day--023 react-datepicker__day--weekend']")
    private SelenideElement datePicker;

    @FindBy(how = How.XPATH, using = ".//div[@aria-haspopup = 'listbox']")
    private SelenideElement rentalPeriod;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]")
    private SelenideElement manyDays;

    @FindBy(how = How.XPATH, using = ".//input[@id = 'black']")
    private SelenideElement colorScooter;

    @FindBy(how = How.XPATH, using = ".//input[@placeholder = 'Комментарий для курьера']")
    private SelenideElement inputComment;

    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[text() = 'Заказать']")
    private SelenideElement buttonOrder;

    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[text() = 'Да']")
    private SelenideElement confirmOrder;

    @FindBy(how = How.CLASS_NAME, using = "Order_Modal__YZ-d3")
    private SelenideElement orderModal;




    public OrderPage clickInputName(String name) {
        inputName.sendKeys(name);
        return this;
    }

    public OrderPage clickSurName(String surName) {
        inputSurName.sendKeys(surName);
        return this;
    }

    public OrderPage clickAdress(String adress) {
        inputAdress.sendKeys(adress);
        return this;
    }

    public OrderPage clickStation() {
        inputStation.click();
        return this;
    }


    public OrderPage setMetro(String station) {
        inputStation.setValue(station).sendKeys(Keys.ARROW_DOWN,ENTER);
        return this;
    }

    public OrderPage clickPhoneNumber(String number) {
        phoneNumber.sendKeys(number);
        return this;
    }

    public OrderPage clickBtnFurther() {
        btnFurther.click();
        return page(OrderPage.class);
    }

    public OrderPage clicData() {
        data.click();
        return this;
    }

    public OrderPage clickCalendar() {
        datePicker.click();
        return this;
    }

    public OrderPage clickRentalPeriod() {
        rentalPeriod.click();
        return this;
    }

    public OrderPage clickThreDay() {
        manyDays.click();
        return this;
    }

    public OrderPage colorScooter() {
        colorScooter.click();
        return this;
    }

    public OrderPage sendComment(String comment) {
        inputComment.sendKeys(comment);
        return this;
    }

    public OrderPage clickButtonOrder() {
        buttonOrder.click();
        return this;
    }

    public OrderPage clickConfirmOrder() {
        confirmOrder.shouldBe(visible).click();
        return this;
    }


    public boolean isMessagePupupChekout() {
        return orderModal.isDisplayed();

    }
}
