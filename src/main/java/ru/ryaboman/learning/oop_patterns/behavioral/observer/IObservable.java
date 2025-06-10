package ru.ryaboman.learning.oop_patterns.behavioral.observer;

public interface IObservable {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
