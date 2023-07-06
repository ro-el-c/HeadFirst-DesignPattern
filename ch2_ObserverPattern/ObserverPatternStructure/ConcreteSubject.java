package ObserverPatternStructure;

import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private String state;

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
