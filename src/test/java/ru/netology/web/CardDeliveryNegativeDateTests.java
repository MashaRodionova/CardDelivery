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

public class CardDeliveryNegativeDateTests {
    @Test
    void Test1() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;

        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 0);
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
        $("[data-test-id='date'] span.input__sub").shouldHave(exactText("Заказ на выбранную дату невозможен"), Duration.ofSeconds(40));
    }

    @Test
    void Test2() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;

        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 1);
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
        $("[data-test-id='date'] span.input__sub").shouldHave(exactText("Заказ на выбранную дату невозможен"), Duration.ofSeconds(40));
    }

    @Test
    void Test3() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;

        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 5);
        SimpleDateFormat formatForCurrentDate = new SimpleDateFormat("y.DD.mm");
        String newCurrentDate = formatForCurrentDate.format(c.getTime());

        //заполняем форму, проверяем
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='date'] span.input__sub").shouldHave(exactText("Неверно введена дата"), Duration.ofSeconds(40));
    }
}
