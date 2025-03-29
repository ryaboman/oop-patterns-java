package ru.ryaboman.learning.patterns.proxy;

public class XMLDocument implements Document {
    private String content;
    public XMLDocument(String content) {
        this.content = content;
    }
    @Override
    public void read() {
        System.out.println("Read XMLDocument");
    }

    @Override
    public void write() {
        System.out.println("Write XMLDocument");
    }

    @Override
    public void clear() {
        System.out.println("Clear XMLDocument");
    }
}
