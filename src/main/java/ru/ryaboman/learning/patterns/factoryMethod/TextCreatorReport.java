package ru.ryaboman.learning.patterns.factoryMethod;

import java.util.List;

public class TextCreatorReport implements CreatorReport {

    List<String> rowsReport;

    public TextCreatorReport(List<String> rowsReport) {
        this.rowsReport = rowsReport;
    }

    @Override
    public Report getReport() {
        return new TextReport(rowsReport);
    }
}
