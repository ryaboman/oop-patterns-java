package ru.ryaboman.learning.oop_patterns.сreational.factoryMethod;

import java.util.List;

public class TextReport implements Report {

    List<String> rows;

    String text;

    public TextReport(List<String> rows) {
        this.rows = rows;
    }

    @Override
    public void generateReport() {
        StringBuilder report = new StringBuilder();
        for (String row : rows) {
            report.append(row);
            report.append(System.lineSeparator());
        }
        text = report.toString();
    }

    @Override
    public void printReport() {
        System.out.println(text);
    }
}
