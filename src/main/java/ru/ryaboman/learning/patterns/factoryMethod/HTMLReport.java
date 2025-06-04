package ru.ryaboman.learning.patterns.factoryMethod;

import java.util.List;

public class HTMLReport implements Report {
    List<String> rows;

    String html;

    public HTMLReport(List<String> rows) {
        this.rows = rows;
    }

    @Override
    public void generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("<html>\n");
        report.append("\t<head>\n");
        report.append("\t\t<style>\n");
        report.append("\t\tbody {\n");
        report.append("\t\t}\n");
        report.append("\t\t</style>\n");
        report.append("\t</head>\n");
        report.append("\t<body>\n");
        for (String row : rows) {
            report.append("\t\t<h1>");
            report.append(row);
            report.append("</h1>\n");
        }
        report.append("\t</body>\n");
        report.append("</html>\n");
        html = report.toString();
    }

    @Override
    public void printReport() {
        System.out.println(html);
    }
}
