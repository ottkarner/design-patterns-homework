package task2;

import java.net.URI;
import java.net.URISyntaxException;

public class RiigiTeatajaURI {

    /*private String localGovernmentBodyName;
    private boolean localGovernment;
    private boolean preciseSearch;
    private boolean showAll;
    private Status status;
    private SortBy sortBy;
    private SortOrder sortOrder;*/

    public static class Builder {

        private final String localGovernmentBodyName;

        public Builder(String localGovernmentBodyName) {
            this.localGovernmentBodyName = localGovernmentBodyName;
        }

        private boolean localGovernment = true;
        private boolean preciseSearch = true;
        private boolean showAll = true;
        private Status status = Status.IN_FORCE;
        private SortBy sortBy = SortBy.NO_SORT;
        private SortOrder sortOrder = SortOrder.ASCENDING;

        public Builder showAll(boolean value) {
            showAll = value;
            return this;
        }

        public Builder status(Status value) {
            status = value;
            return this;
        }

        public Builder sortBy(SortBy value) {
            sortBy = value;
            return this;
        }

        public Builder sortOrder(SortOrder value) {
            sortOrder = value;
            return this;
        }

        public URI build() throws URISyntaxException {
            StringBuilder stringBuilder = new StringBuilder("https://www.riigiteataja.ee/tervikteksti_tulemused.html?");

            if (localGovernment) stringBuilder.append("kov=true&");
            if (preciseSearch) stringBuilder.append("nrOtsing=tapne&");
            if (showAll) stringBuilder.append("kuvaKoik=true&");

            switch (sortBy) {
                case TITLE:
                    stringBuilder.append("sorteeri=pealkiri&");
                    break;
                case ACT_NO:
                    stringBuilder.append("sorteeri=number&");
                    break;
                case IN_FORCE_TIME:
                    stringBuilder.append("sorteeri=kehtivuseAlgus&");
            }

            switch (sortOrder) {
                case ASCENDING:
                    stringBuilder.append("kasvav=true&");
                    break;
                case DESCENDING:
                    stringBuilder.append("kasvav=false&");
                    break;
            }

            switch (status) {
                case IN_FORCE:
                    stringBuilder.append("sakk=kehtivad_kehtetuteta&");
                    break;
                case NOT_IN_FORCE_YET:
                    stringBuilder.append("sakk=joustuvad&");
                    break;
                case NOT_IN_FORCE_ANYMORE:
                    stringBuilder.append("sakk=kehtetud&");
                case ALL:
                    stringBuilder.append("sakk=koik_otsitavad&");
            }

            stringBuilder.append("valj1=" + localGovernmentBodyName);

            return new URI(stringBuilder.toString());
        }

    }

}

