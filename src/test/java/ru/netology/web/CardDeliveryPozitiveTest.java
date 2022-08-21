package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

class CardDeliveryPozitiveTest {

    /*@Test
    void shouldRegisterByAccountNumberDOMModification() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        $x("//*[contains(text(),'номеру счёта')]").click();
        $$("[type='text']").filter(visible).first().setValue("4055 0100 0123 4613 8564");
        $$("[name='phone']").exclude(hidden).get(0).setValue("+7 999 999 99 99");
        $$(By.className("button__content")).last().click();
        $x("//*[contains(text(),'Успешная авторизация')]").shouldBe(visible, Duration.ofSeconds(10));
        $(By.tagName("h2")).shouldHave(exactText("Личный кабинет"), Duration.ofMillis(8000));
    }*/

    @Test
    void shouldRegisterTest1() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").setValue("21.08.2022");
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

    @Test
    void shouldRegisterTest2() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;

        // задаем текущую дату ПЛЮС 3 дня
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 3);
        SimpleDateFormat formatForCurrentDate = new SimpleDateFormat("dd.MM.y");
        String newCurrentDate = formatForCurrentDate.format(c.getTime());

        //заполняем форму, проверяем
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

}

