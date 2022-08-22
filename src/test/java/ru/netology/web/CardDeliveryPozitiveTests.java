package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

class CardDeliveryPozitiveTests {

    @Test
    void shouldRegisterTest1() {
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
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
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
        $("div [data-test-id='city'] input").setValue("Магас");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

    @Test
    void shouldRegisterTest3() {
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
        $("div [data-test-id='city'] input").setValue("Магас");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша-Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

    @Test
    void shouldRegisterTest4() {
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
        $("div [data-test-id='city'] input").setValue("Магас");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Родионова-Маша-Владимировна");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

    @Test
    void shouldRegisterTest5() {
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
        $("div [data-test-id='city'] input").setValue("Магас");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Родионова Маша Владимировна");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

    @Test
    void shouldRegisterTest6() {
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
        $("div [data-test-id='city'] input").setValue("Магас");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }

    @Test
    void shouldRegisterTest7() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;

        // задаем текущую дату ПЛЮС 5 дней
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 5);
        SimpleDateFormat formatForCurrentDate = new SimpleDateFormat("dd.MM.y");
        String newCurrentDate = formatForCurrentDate.format(c.getTime());

        //заполняем форму, проверяем
        $("div [data-test-id='city'] input").setValue("Благовещенск");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("div.notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(40));
    }


}

