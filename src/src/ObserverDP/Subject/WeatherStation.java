package src.ObserverDP.Subject;

import ObserverDP.Observers.Display;
import ObserverDP.Observers.Observer;

import java.util.List;

public class WeatherStation {
    int temperature;
    int humidity;

    List<Observer> observers = new java.util.ArrayList<>();

    public void RegisterObserver(Observer observer) {
        observers.add(observer);
    }

    public void RemoveObserver(Observer observer) {
        observers.remove(observer);
    }

    public void update(int temperature, int humidity) {
        if(this.temperature == temperature && this.humidity == humidity){
            return;
        }
        this.temperature = temperature;
        this.humidity = humidity;

        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
