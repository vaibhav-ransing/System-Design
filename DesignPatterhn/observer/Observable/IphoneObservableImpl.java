package DesignPatterhn.observer.Observable;

import DesignPatterhn.observer.Observer.NotificationObserverAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    List<NotificationObserverAlert> list;
    public IphoneObservableImpl(){
        list = new ArrayList<>();
    }
    private int qty;

    @Override
    public void add(NotificationObserverAlert notificationObserverAlert) {
        list.add(notificationObserverAlert);
    }

    @Override
    public void remove(NotificationObserverAlert notificationObserverAlert) {
        list.remove(notificationObserverAlert);
    }

    @Override
    public void notifyMsg() {
        for (NotificationObserverAlert observer : list) {
            observer.notification("Iphonne");
        }
    }

    @Override
    public void setCount(int qty) {
        if(this.qty == 0){
            notifyMsg();
        }
        this.qty = qty;

    }

    @Override
    public int getStockCount() {
        return this.qty;
    }

}
