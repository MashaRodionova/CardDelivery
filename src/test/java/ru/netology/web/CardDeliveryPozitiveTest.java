package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.Duration;
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

}

