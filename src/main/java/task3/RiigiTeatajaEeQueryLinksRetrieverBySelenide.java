package task3;

import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class RiigiTeatajaEeQueryLinksRetrieverBySelenide implements LinksRetriever {

    public List<String> retrieveLinks(String URL) {
        List<String> riigiTeatajaLinks = new ArrayList<>();

        open(URL);
        for (SelenideElement element : $$(".data tbody a")) {
            riigiTeatajaLinks.add(element.text());
        }

        return riigiTeatajaLinks;
    }

}
