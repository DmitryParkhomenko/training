package ua.com.google;


import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestGoogleSearch {
    @Test
    public void testGoogleSearch() {
        testUserCanOpenGooglePage();
        testUserCanInputTextIntoSearchField();
        testSizeOfResultSearchIsTen();
        testResultHaveText();
    }

    public static void testUserCanOpenGooglePage() {
        open("https://www.google.com.ua");
    }

    public static void  testUserCanInputTextIntoSearchField() {
        $(By.name("q")).setValue("Selenide").pressEnter();
    }

    public static void testSizeOfResultSearchIsTen() {
        $$("#ires .g").shouldHaveSize(10);
    }

    public static void testResultHaveText() {
        $("#ires .g").shouldHave(text("Selenide: лаконичные"));
    }
}
