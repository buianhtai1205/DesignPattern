package Base;

import java.util.ArrayList;
import java.util.Objects;

public class Subject {
    private final ArrayList<NotifyObserver> notifyObserverList = new ArrayList<>();

    public void attachObserver(NotifyObserver notifyObserver) {
        notifyObserverList.add(notifyObserver);
    }

    public void detachObserver(NotifyObserver notifyObserver) {
        notifyObserverList.remove(notifyObserver);
    }

    public void notifyObserver(Objects arg) {
        notifyObserverList.forEach((observer) -> observer.notify(arg));
    }
}
