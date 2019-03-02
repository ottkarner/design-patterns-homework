package task2;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class RiigiTeatajaURIDemo {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();

        desktop.browse(
                new RiigiTeatajaURI.Builder("Kose+Vallavalitsus")
                        .status(Status.ALL)
                        .showAll(false)
                        .build()
        );

        desktop.browse(
                new RiigiTeatajaURI.Builder("Kose+Vallavolikogu")
                        .status(Status.IN_FORCE)
                        .sortBy(SortBy.ACT_NO)
                        .sortOrder(SortOrder.ASCENDING)
                        .build()
        );
    }

}
