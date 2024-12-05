package DesignPatterhn.observer.Observer;

import DesignPatterhn.observer.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationObserverAlert {


    StocksObservable stocksObservable;
    int number;

    public MobileAlertObserverImpl(int number, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.number = number;
    }

    @Override
    public void notification(String str) {
        mobileMsg();
        System.out.println("Mobile alert qt available" + str);
    }

    private void mobileMsg() {

        System.out.println("Mobile alert qt available");
        // code to sent mobile message
    }
}
