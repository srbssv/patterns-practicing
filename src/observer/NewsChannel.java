package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private List<NamedObserver> observers = new ArrayList<>();

    public void receiveNews(String news) {
        for (NamedObserver observer : observers) {
            observer.update(news);
        }
    }

    public void subscribeObserver(NamedObserver observer) {
        observers.add(observer);
    }

    public void unsubscribeObserver(String name) {
        observers.removeIf(observer -> observer.getObserverName().equals(name));
    }

}
