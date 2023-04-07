package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

//        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneObservable);
//        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com", iphoneObservable);
//        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("ghi@gmail.com", iphoneObservable);
//
//        iphoneObservable.add(observer1);
//        iphoneObservable.add(observer2);
//        iphoneObservable.add(observer3);

        new EmailAlertObserverImpl("abc@gmail.com", iphoneObservable);
        new EmailAlertObserverImpl("def@gmail.com", iphoneObservable);
        new EmailAlertObserverImpl("ghi@gmail.com", iphoneObservable);
        iphoneObservable.setStockCount(10);
    }
}
