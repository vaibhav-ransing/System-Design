package DesignPatterhn.observer.Observer;

import DesignPatterhn.observer.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationObserverAlert {

    StocksObservable stocksObservable;
    String email;

    public EmailAlertObserverImpl(String email, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.email = email;
    }

    @Override
    public void notification(String str) {
        sendEmail();
        System.out.println("Email notify quantity added " + str);
    }


    private void sendEmail() {

        System.out.println("Email sent");
        // code to send email to thi.email
    }
}
