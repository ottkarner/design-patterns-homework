package task3;

public class LinksRetrieverFactory {


    public LinksRetriever getLinksRetriever(String linksRetrieverType) {
        if (linksRetrieverType.equalsIgnoreCase("RIIGI_TEATAJA_EE_JSOUP")) {
            return new RiigiTeatajaEeQueryLinksRetrieverByJSOUP();
        }
        if (linksRetrieverType.equalsIgnoreCase("RIIGI_TEATAJA_EE_SELENIDE")) {
            return new RiigiTeatajaEeQueryLinksRetrieverBySelenide();
        }
        return null;
    }

}
