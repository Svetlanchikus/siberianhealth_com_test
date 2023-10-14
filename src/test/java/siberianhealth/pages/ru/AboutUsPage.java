package siberianhealth.pages.ru;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AboutUsPage {
    public AboutUsPage openPage() {
        open("/ru/about");

        return this;
    }

    public AboutUsPage CheckingPageComposition(){
        $(".about_wellness-generation__title").shouldHave(text("Siberian Wellness – для тех, кто хочет жить ярко!"));
        $(".about-our-course__title").shouldHave(text("Курс на устойчивое развитие!"));
        $(".about-our-course-production__title").shouldHave(text("Прогрессивное производство рядом с Клиентом"));
        $(".about-our-course-healthy-foods__title").shouldHave(text("Здоровые продукты в любой точке мира"));

        return this;
    }

}
