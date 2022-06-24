package ru.qascooter.praktikumservices;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class QuestionsTest {

    final String[] ANSWERS = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };


    @Before // выполняется до всех тестов
    public void beforeTests() {
        //Configuration.browser = "firefox";

    }

    @After // выполняется после всех тестов
    public void afterTests() {

    }

    @Test // 1й способ проверки 1го вопроса
    public void showQuestions1() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(0)
                .getTextRespond(0, ANSWERS[0]);
    }

    @Test // 2й способ проверки 1го вопроса
    public void showQuestions() {
        MainPageObjects page = open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(0);

       //Assert.assertTrue(Objects.equals(page.getText(0), ANSWERS[0]));
       // Assert.assertEquals(page.getText(0).equals(ANSWERS[0]));
        Assert.assertEquals(page.getText(0), ANSWERS[0]);
    }

    @Test
    public void showQuestions2() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(1)
                .getTextRespond(1, ANSWERS[1]);
    }

    @Test
    public void showQuestions3() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(2)
                .getTextRespond(2, ANSWERS[2]);
    }

    @Test
    public void showQuestions4() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(3)
                .getTextRespond(3, ANSWERS[3]);
    }

    @Test
    public void showQuestions5() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(4)
                .getTextRespond(4, ANSWERS[4]);
    }

    @Test
    public void showQuestions6() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(5)
                .getTextRespond(5, ANSWERS[5]);
    }

    @Test
    public void showQuestions7() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(6)
                .getTextRespond(6, ANSWERS[6]);
    }
    @Test
    public void showQuestions8() {
        open(MainPageObjects.URL, MainPageObjects.class)
                .scrolBlokQuestions()
                .clickquestions1(7)
                .getTextRespond(7, ANSWERS[7]);
    }
}




