package ru.ryaboman.learning.patterns.factoryMethod;

import java.util.List;

public class HTMLCreatorReport implements CreatorReport {

    List<String> rowsReports;

    public HTMLCreatorReport(List<String> rowsReports) {
        this.rowsReports = rowsReports;
    }

    @Override
    public Report getReport() {
        return new HTMLReport(rowsReports);
    }
}
