package ru.ryaboman.learning.oop_patterns.сreational.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class TestFactoryMethod {

    public static void main(String[] args) {

        List<String> rowsReport = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            rowsReport.add("Row " + i);
        }

        CreatorReport creatorReport = new HTMLCreatorReport(rowsReport);
        Report report = creatorReport.getReport();
        report.generateReport();
        report.printReport();

        CreatorReport creatorReport2 = new TextCreatorReport(rowsReport);
        Report report2 = creatorReport2.getReport();
        report2.generateReport();
        report2.printReport();
    }

}
