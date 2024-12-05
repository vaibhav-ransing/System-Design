package DesignPatterhn.observer;

import DesignPatterhn.observer.Observable.IphoneObservableImpl;
import DesignPatterhn.observer.Observable.StocksObservable;
import DesignPatterhn.observer.Observer.EmailAlertObserverImpl;
import DesignPatterhn.observer.Observer.MobileAlertObserverImpl;
import DesignPatterhn.observer.Observer.NotificationObserverAlert;

public class Main {

    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();


        NotificationObserverAlert observer = new EmailAlertObserverImpl("vaibhavransing@gmail.com", iphoneObservable);

        NotificationObserverAlert observer2 = new MobileAlertObserverImpl(952495831, iphoneObservable);

        iphoneObservable.add(observer);

        iphoneObservable.add(observer2);
        iphoneObservable.setCount(5);

    }
}
