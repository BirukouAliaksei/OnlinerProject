import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatalogTest extends Fixture{

    CatalogPage catalogPage;
    MainPage mainPage;

    @BeforeEach
    public void preCondition(){
        mainPage = new MainPage();
        catalogPage = new CatalogPage();
        Selenide.open("https://www.onliner.by/");
    }

    @Test
    public void clearSearch(){
        mainPage.smartphonesBtn();
        catalogPage.removeAutoChoisePosition();
    }

}
