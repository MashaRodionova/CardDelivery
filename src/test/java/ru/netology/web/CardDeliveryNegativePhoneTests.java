package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryNegativePhoneTests {

    public String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
    String planningDate = generateDate(3);
    @Test
    void Test1() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue("79996663355+");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='phone'] span.input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."), Duration.ofSeconds(40));
    }

    @Test
    void Test2() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue("799966");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='phone'] span.input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."), Duration.ofSeconds(40));
    }

    @Test
    void Test3() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue(" ");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='phone'] span.input__sub").shouldHave(exactText("Поле обязательно для заполнения"), Duration.ofSeconds(40));
    }

    @Test
    void Test4() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue("masha");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='phone'] span.input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."), Duration.ofSeconds(40));
    }

    @Test
    void Test5() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue("<script>alert(\"I hacked this!\")</script>");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='phone'] span.input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."), Duration.ofSeconds(40));
    }

    @Test
    void Test6() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='phone'] span.input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."), Duration.ofSeconds(40));
    }


}
