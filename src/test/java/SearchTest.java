import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SearchTest extends Fixture{

    MainPage mainPage;

    @BeforeEach
    public void preCondition(){
        mainPage = new MainPage();
        Selenide.open("https://www.onliner.by/");
    }

    @Test
    public void search(){
        mainPage.searchField("Xiaomi");
    }

    @Test
    public void catalogBtn(){
        mainPage.catalogBtn();
        $(byXpath("//*[@class='catalog-navigation__title']"))
                .shouldHave(Condition.text("Каталог"));
        url().equals(MainPage.homeUrl);
    }

    @Test
    public void autoBtnTest(){
        mainPage.autoBtn();
        $(byXpath("//*[@class='vehicle-form__title vehicle-form__title_big-alter']"))
                .shouldHave(Condition.text("Автобарахолка"));
    }

    @Test
    public void forumBtnTest(){
        mainPage.forumBtn();
        $(byXpath("//*[@class='m-title']"))
                .shouldHave(Condition.text("Форум"));
    }

    @Test
    public void houseBtnTest(){
        mainPage.houseBtn();
        url().equals("https://r.onliner.by/pk/");
    }

    @Test
    public void servisesBtnTest(){
        mainPage.servisesBtn();
        $(byXpath("//*[@class='service-header__title service-header__title_huge']"))
                .shouldHave(Condition.text("Заказы"));
    }

    @Test
    public void newsBtnTest(){
        mainPage.newsBtn();
    }






}
