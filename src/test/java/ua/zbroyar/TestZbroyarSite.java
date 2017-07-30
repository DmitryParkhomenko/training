package ua.zbroyar;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestZbroyarSite {

    @Test
    public void testSearch() {
        open("http://zbroyar.ua/");
        $(By.name("search")).hover().setValue("Z-15").pressEnter();
        $("li .product__name").shouldHave(Condition.text("Z-15"));
    }
}
