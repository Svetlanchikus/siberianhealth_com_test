package siberianhealth.pages.ru;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CompanyNewsPage {
    public CompanyNewsPage openPage() {
        open("/ru/news");

        return this;
    }

    public CompanyNewsPage CheckingPageComposition(){
        $(".sw-bread-crumbs__item:nth-child(2)").shouldHave(text("Новости компании"));
        $(".news__title").shouldHave(text("Новости компании"));
        $(".our-socials__title").shouldHave(text("Мы в соцсетях:"));

        return this;
    }
}
