package ru.qascooter.praktikumservices;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class OrderTest {

    @Before
    public void beforeTests() {

        //Configuration.browser = "firefox";
    }
    @After
    public void afterTests() {}

     @Test
    public void checkout() {
       boolean isMessagePupupChekout = open(MainPageObjects.URL, MainPageObjects.class)
                .clickOrderButton()
                .clickInputName("Наиля")
                .clickSurName("Якупова")
                .clickAdress("Богданова 15")
                .clickStation()
                .setMetro("Сокольники")
                .clickPhoneNumber("70000000006")
                .clickBtnFurther()
                .clicData()
                .clickCalendar()
                .clickRentalPeriod()
                .clickThreDay()
                .colorScooter()
                .sendComment("Комментарий")
                .clickButtonOrder()
                .clickConfirmOrder()
               .isMessagePupupChekout();

                assertTrue(isMessagePupupChekout);
    }
    @Test
    public void checkout2() {
        boolean isMessagePupupChekout = open(MainPageObjects.URL, MainPageObjects.class)
                .clickOrderButton()// кликает на кнопке Заказать
                .clickInputName("Оля")
                .clickSurName("Согрина")
                .clickAdress("Мельникова 20")
                .clickStation()
                .setMetro("Красносельская")
                .clickPhoneNumber("70000000005")
                .clickBtnFurther()
                .clicData()
                .clickCalendar()
                .clickRentalPeriod()
                .clickThreDay()
                .colorScooter()
                .sendComment("Тест")
                .clickButtonOrder()
                .clickConfirmOrder()
                .isMessagePupupChekout();

                 assertTrue(isMessagePupupChekout);


    }

}
