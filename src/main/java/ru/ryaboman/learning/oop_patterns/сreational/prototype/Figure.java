package ru.ryaboman.learning.oop_patterns.сreational.prototype;

public interface Figure extends Cloneable {
    void draw();
    Figure clone();
}
