import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byText;

public class CatalogPage {

    public CatalogPage removeAutoChoisePosition(){
        $(byXpath("//*[@title='Производитель']")).click();
        return this;
    }

    public CatalogPage smartphonesBtn(){
        $("span.project-navigation__sign").click();
        return this;
    }
}
