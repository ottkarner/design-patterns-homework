package task3;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        LinksRetrieverFactory linksRetrieverFactory = new LinksRetrieverFactory();

        LinksRetriever linksRetriever1 = linksRetrieverFactory.getLinksRetriever("RIIGI_TEATAJA_EE_JSOUP");
        for (String link : linksRetriever1.retrieveLinks("https://www.riigiteataja.ee/" +
                "tervikteksti_tulemused.html?sakk=kehtivad_kehtetuteta&kov=true&nrOtsing=tapne&valj1=Kose+Vallavolikogu")) {
            System.out.println(link);
        }

        LinksRetriever linksRetriever2 = linksRetrieverFactory.getLinksRetriever("RIIGI_TEATAJA_EE_SELENIDE");
        for (String link : linksRetriever2.retrieveLinks("https://www.riigiteataja.ee/" +
                "tervikteksti_tulemused.html?sakk=kehtivad_kehtetuteta&kov=true&nrOtsing=tapne&valj1=Kose+Vallavolikogu")) {
            System.out.println(link);
        }
    }

}
