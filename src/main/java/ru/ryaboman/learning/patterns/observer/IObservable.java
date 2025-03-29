package ru.ryaboman.learning.patterns.observer;

public interface IObservable {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
