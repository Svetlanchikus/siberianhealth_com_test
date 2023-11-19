package siberianhealth.pages.ru.Component;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {

    public HeaderPage openProductsMenu() {
        $(".sw21-header-nav__item > span").click();

        return this;
    }
    public HeaderPage checkingMenuOnSite() {
        $(".sw21-header-nav__item > span").shouldHave(text("Продукты"));
        $(".sw21-header-nav__item:nth-child(2) span").shouldHave(text("О компании"));
        $(".sw21-header-nav__item:nth-child(2) span").shouldHave(text("О компании"));
        $(".sw21-header-nav__item:nth-child(3) span").shouldHave(text("Бизнес"));
        $(".sw21-header-nav__item:nth-child(4) a").shouldHave(text("Купить выгодно"));

        return this;
    }

    public HeaderPage checkingMenuButtons() {
        $(".sw21-snippet-icon-button__text > span").shouldHave(text("Магазин"));
        $(".sw21-snippet-icon-button__text > span").click();
        $(".modal-country").shouldHave(text("Выберите страну:"));
        $(".modal__close > .icon").click();
        $(".sw21-main-button").shouldHave(text("Зарегистрироваться"));
        $(".modal-country").shouldHave(text("Выберите страну:"));
        $(".modal__close > .icon").click();

        return this;
    }

    public HeaderPage checkingProductsMenu() {
        $(".menu-desktop__list-item:nth-child(1)").shouldHave(text("Здоровье"));
        $(".menu-desktop__list-item:nth-child(2)").shouldHave(text("Спорт"));
        $(".menu-desktop__list-item:nth-child(3)").shouldHave(text("Питание"));
        $(".menu-desktop__list-item:nth-child(4)").shouldHave(text("Красота"));

        return this;
    }
}
