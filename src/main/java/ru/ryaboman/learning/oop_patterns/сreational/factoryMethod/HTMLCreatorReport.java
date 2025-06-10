package ru.ryaboman.learning.oop_patterns.сreational.factoryMethod;

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
