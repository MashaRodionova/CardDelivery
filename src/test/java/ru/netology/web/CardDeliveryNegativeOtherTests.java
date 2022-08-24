package ru.netology.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class CardDeliveryNegativeOtherTests {

    public String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
    String planningDate = generateDate(3);

    @Test
    void TestCheckBox() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(planningDate);
        $("div [data-test-id='name'] input").setValue("Маша Родионова");
        $("div [data-test-id='phone'] input").setValue("+79996663355");
        $$(By.className("button__content")).last().click();
        $("[data-test-id='agreement'].input_invalid .checkbox__text")
                .shouldHave(Condition.text("Я соглашаюсь с условиями обработки и использования моих персональных данных"), Duration.ofSeconds(15))
                .shouldBe(Condition.visible);
    }

    @Test
    void TestEmptyFields() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        $("div [data-test-id='city'] input").setValue("");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue("");
        $("div [data-test-id='name'] input").setValue("");
        $("div [data-test-id='phone'] input").setValue("");
        $$(By.className("button__content")).last().click();
        $("[data-test-id='city'] span.input__sub").shouldHave(exactText("Поле обязательно для заполнения"), Duration.ofSeconds(15));
    }


}
