package multidesignpatterns.chapter01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

    private final List<Observer> observers = new ArrayList<>();
    private final QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
