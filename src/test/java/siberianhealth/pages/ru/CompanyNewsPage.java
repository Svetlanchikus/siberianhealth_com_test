package siberianhealth.pages.ru;

import com.codeborne.selenide.SelenideElement;
import java.time.Year;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyNewsPage {
    public final SelenideElement companyNewsTitle = $(".news__title");
    public final String companyNewsTitleText = "Новости компании";
    public final SelenideElement calendar = $(".sw-date-picker__placeholder");
    public final String calendarText = "Выбрать по дате";
    public final SelenideElement calendarDateText = $(".sw-date-picker__input");
    public final SelenideElement yearAgoButton = $(".mx-icon-double-left");
    public final SelenideElement yearSelectedButton = $(".mx-calendar-header-label > .mx-btn");
    public final SelenideElement yearForwardButton = $(".mx-icon-double-right");
    public String dateSelectedText = null;
    public final Integer yearCurrentText = new Integer(Year.now().getValue());

    public final SelenideElement januaryButton = $("tr:nth-child(1) > .cell:nth-child(1) > div");
    public final String januaryButtonText = "январь";
    public final SelenideElement februaryButton = $("tr:nth-child(1) > .cell:nth-child(2) > div");
    public final String februaryButtonText = "февраль";
    public final SelenideElement marchButton = $("tr:nth-child(1) > .cell:nth-child(3) > div");
    public final String marchButtonText = "март";
    public final SelenideElement aprilButton = $("tr:nth-child(2) > .cell:nth-child(1) > div");
    public final String aprilButtonText = "апрель";
    public final SelenideElement mayButton = $("tr:nth-child(2) > .cell:nth-child(2) > div");
    public final String mayButtonText = "май";
    public final SelenideElement juneButton = $("tr:nth-child(2) > .cell:nth-child(3) > div");
    public final String juneButtonText = "июнь";
    public final SelenideElement julyButton = $("tr:nth-child(3) > .cell:nth-child(1) > div");
    public final String julyButtonText = "июль";
    public final SelenideElement augustButton = $("tr:nth-child(3) > .cell:nth-child(2) > div");
    public final String augustButtonText = "август";
    public final SelenideElement septemberButton = $("tr:nth-child(3) > .cell:nth-child(3) > div");
    public final String septemberButtonText = "сентябрь";
    public final SelenideElement octoberButton = $("tr:nth-child(4) > .cell:nth-child(1) > div");
    public final String octoberButtonText = "октябрь";
    public final SelenideElement novemberButton = $("tr:nth-child(4) > .cell:nth-child(2) > div");
    public final String novemberButtonText = "ноябрь";
    public final SelenideElement decemberButton = $("tr:nth-child(4) > .cell:nth-child(3) > div");
    public final String decemberButtonText = "декабрь";
    public final SelenideElement newsTopThemeButton = $(".news__top-theme-title");
    public String newsTopThemeButtonText = null;
    public final SelenideElement newsTopThemeButtonNextWindowButton = $(".news-detail__content-header-title");


    public CompanyNewsPage openPage() {
        open("/news");

        return this;
    }

    public CompanyNewsPage checkingPageComposition() {
        companyNewsTitle.shouldHave(text(companyNewsTitleText));
        return this;
    }

    public CompanyNewsPage checkingCalendar() {
        calendar.shouldHave(text(calendarText));
        calendar.click();
        yearSelectedButton.shouldHave(text(String.valueOf(yearCurrentText)));
        yearAgoButton.click();
        yearSelectedButton.shouldHave(text(String.valueOf(yearCurrentText - 1)));
        yearForwardButton.click();
        yearForwardButton.click();
        yearSelectedButton.shouldHave(text(String.valueOf(yearCurrentText + 1)));
        yearAgoButton.click();
        yearSelectedButton.shouldHave(text(String.valueOf(yearCurrentText)));
        checkingMonthsInCalendar(januaryButton, januaryButtonText);
        checkingMonthsInCalendar(februaryButton, februaryButtonText);
        checkingMonthsInCalendar(marchButton, marchButtonText);
        checkingMonthsInCalendar(aprilButton, aprilButtonText);
        checkingMonthsInCalendar(mayButton, mayButtonText);
        checkingMonthsInCalendar(juneButton, juneButtonText);
        checkingMonthsInCalendar(julyButton, julyButtonText);
        checkingMonthsInCalendar(augustButton, augustButtonText);
        checkingMonthsInCalendar(septemberButton, septemberButtonText);
        checkingMonthsInCalendar(octoberButton, octoberButtonText);
        checkingMonthsInCalendar(novemberButton, novemberButtonText);
        checkingMonthsInCalendar(decemberButton, decemberButtonText);
        return this;
    }

    public CompanyNewsPage checkingMonthsInCalendar(SelenideElement monthButton, String monthText) {
        calendar.click();
        monthButton.click();
        dateSelectedText = calendarDateText.getAttribute("value");
        assertEquals((monthText + " " + String.valueOf(yearCurrentText)), dateSelectedText);
        return this;
    }

    public CompanyNewsPage checkingNewsLinks() {
        newsTopThemeButtonText = newsTopThemeButton.text();
        newsTopThemeButton.click();
        newsTopThemeButtonNextWindowButton.shouldHave(text(newsTopThemeButtonText));
        sleep(5);
        back();
        return this;
    }
}