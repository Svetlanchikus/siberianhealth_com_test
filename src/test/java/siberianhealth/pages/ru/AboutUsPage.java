package siberianhealth.pages.ru;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverConditions.url;

public class AboutUsPage {
    public final SelenideElement generationTitle = $(".about_wellness-generation__title");
    public final String generationText = "Siberian Wellness – для тех, кто хочет жить ярко!";
    public final SelenideElement courseTitle = $(".about-our-course__title");
    public final String courseText = "Курс на устойчивое развитие!";
    public final SelenideElement productionTitle = $(".about-our-course-production__title");
    public final String productionText = "Прогрессивное производство рядом с Клиентом";
    public final SelenideElement healthyFoodsTitle = $(".about-our-course-healthy-foods__title");
    public final String healthyFoodsText = "Здоровые продукты в любой точке мира";
    public final SelenideElement bestComponentsTitle = $(".about-our-course-best-components__title");
    public final String bestComponentsText = "Компоненты — лучшие со всего мира";
    public final SelenideElement sportTitle = $(".about-our-course-sport__title");
    public final String sportText = "Нас вдохновляет спорт!";
    public final SelenideElement aboutOuCourseButton = $(".about-our-course__principle > .about-our-course-production__more-link");
    public final String aboutOuCourseButtonText = "План устойчивого развития";
    public final String aboutOuCourseButtonLink = "https://worldaroundyou.org/sustainability";
    public final SelenideElement aboutOuProductionButton = $(".about-our-course-production > .about-our-course-production__more-link");
    public final String aboutOuProductionButtonText = "Еще о производстве";
    public final String aboutOuProductionButtonLink = "https://valeolab.com/";

    public AboutUsPage openPage() {
        open("/about");

        return this;
    }

    public AboutUsPage checkingPageComposition() {
        generationTitle.shouldHave(text(generationText));
        courseTitle.shouldHave(text(courseText));
        productionTitle.shouldHave(text(productionText));
        healthyFoodsTitle.shouldHave(text(healthyFoodsText));
        bestComponentsTitle.shouldHave(text(bestComponentsText));
        sportTitle.shouldHave(text(sportText));

        return this;
    }

    public AboutUsPage checkingButtons() {
        aboutOuCourseButton.shouldHave(text(aboutOuCourseButtonText));
        aboutOuCourseButton.click();
        checkingTheOpenTabAndThenClosing(aboutOuCourseButtonLink);
        aboutOuProductionButton.shouldHave(text(aboutOuProductionButtonText));
        aboutOuProductionButton.click();
        checkingTheOpenTabAndThenClosing(aboutOuProductionButtonLink);

        return this;
    }

    public AboutUsPage checkingTheOpenTabAndThenClosing(String urlWindow) {
        switchTo().window(1);
        webdriver().shouldHave(url(urlWindow));
        switchTo().window(1).close();
        switchTo().window(0);

        return this;
    }

}
