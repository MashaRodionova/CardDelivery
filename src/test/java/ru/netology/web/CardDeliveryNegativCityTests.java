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

class CardDeliveryNegativeCityTests {


    // проверка валидности поля ГОРОД
    @Test
    void TestCity1() {
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
        $("div [data-test-id='city'] input").setValue("Щелково");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity2() {
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
        $("div [data-test-id='city'] input").setValue("Хабаровск1");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity3() {
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
        $("div [data-test-id='city'] input").setValue(" ");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Поле обязательно для заполнения"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity4() {
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
        $("div [data-test-id='city'] input").setValue("Moscow");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity5() {
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
        $("div [data-test-id='city'] input").setValue("856243");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity6() {
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
        $("div [data-test-id='city'] input").setValue(" Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity7() {
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
        $("div [data-test-id='city'] input").setValue("Москва ");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity8() {
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
        $("div [data-test-id='city'] input").setValue("Москва ");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity9() {
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
        $("div [data-test-id='city'] input").setValue("жжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity10() {
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
        $("div [data-test-id='city'] input").setValue("♣☺♂");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }

    @Test
    void TestCity11() {
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
        $("div [data-test-id='city'] input").setValue("<script>alert(\"I hacked this!\")</script>");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(newCurrentDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"), Duration.ofSeconds(40));
    }
}
