package siberianhealth.pages.ru;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BusinessWithUsPage {
    public BusinessWithUsPage openPage() {
        open("/business");

        return this;
    }

    public BusinessWithUsPage CheckingPageComposition(){
        $(".business-banner__title").shouldHave(text("Начни бизнес в индустрии Wellness"));
        $(".business-banner__button > span").shouldHave(text("Начни бизнес сейчас"));
        $(".how-to-start__title").shouldHave(text("В чем суть нашего бизнеса?"));
        $("a:nth-child(3) > .button").shouldHave(text("Смотреть Маркетинг-план"));

        return this;
    }
}
