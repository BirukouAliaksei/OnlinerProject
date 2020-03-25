import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;


public class MainPage {
    public static String homeUrl = "https://www.onliner.by/";

    public MainPage searchField(String value){
        $(byName("query")).setValue(value);
        return new MainPage();
    }

    public MainPage catalogBtn(){
        $("ul.b-main-navigation")
                .$(byText("Каталог")).click();
        return this;
    }

    public MainPage newsBtn(){
        $("ul.b-main-navigation")
                .$(byText("Новости")).click();
        return this;
    }

    public MainPage autoBtn(){
        $("ul.b-main-navigation")
                .$(byText("Автобарахолка")).click();
        return this;
    }

    public MainPage servisesBtn(){
        $("ul.b-main-navigation")
                .$(byText("Услуги")).click();
        return this;
    }

    public MainPage houseBtn(){
        $("ul.b-main-navigation")
                .$(byText("Дома и квартиры")).click();
        return this;
    }

    public MainPage usedBtn(){
        $("ul.b-main-navigation")
                .$(byText("Барахолка")).click();
        return this;
    }

    public MainPage forumBtn(){
        $("ul.b-main-navigation")
                .$(byText("Форум")).click();
        return this;
    }

    public MainPage smartphonesBtn(){
        $("span.project-navigation__sign").click();
        return this;
    }
}
