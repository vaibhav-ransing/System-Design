package DesignPatterhn.observer.Observable;

import DesignPatterhn.observer.Observer.NotificationObserverAlert;

public interface StocksObservable {

    void add(NotificationObserverAlert notificationObserverAlert);

    void remove(NotificationObserverAlert notificationObserverAlert);

    void notifyMsg();

    public void setCount(int newStock);

    public  int getStockCount();

}
