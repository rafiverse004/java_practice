/*
PROBLEM 21:
Implement Observer pattern:
- Subject maintains observers
- Observers get notified of changes
*/

// WHAT YOU ARE LEARNING:
// Observer Pattern, Event-driven OOP, Loose Coupling, Interfaces

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject class
class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

// Concrete observer
class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Main class comes last
public class EventSystemMain {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer obs1 = new ConcreteObserver("Observer1");
        Observer obs2 = new ConcreteObserver("Observer2");

        subject.addObserver(obs1);
        subject.addObserver(obs2);

        subject.notifyObservers("Event triggered!");
    }
}
