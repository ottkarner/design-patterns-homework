package task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RiigiTeatajaEeQueryLinksRetrieverByJSOUP implements LinksRetriever {
    @Override
    public List<String> retrieveLinks(String url) {
        List<String> riigiTeatajaLinks = new ArrayList<>();

        try {
            Document document = Jsoup.connect(url).get();
            for (Element element : document.select(".data > tbody > tr > td:nth-child(1)")) {
                riigiTeatajaLinks.add(element.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return riigiTeatajaLinks;
    }
}
