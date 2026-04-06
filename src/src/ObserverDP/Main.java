package src.ObserverDP;

import ObserverDP.Observers.Display;
import ObserverDP.Observers.MobileApp;
import ObserverDP.Observers.Webapp;
import ObserverDP.Subject.WeatherStation;

public class Main {
    public static void main() {

        WeatherStation weatherStation = new WeatherStation();
        Display d = new Display();
        Webapp w = new Webapp();

        weatherStation.RegisterObserver(d);
        weatherStation.RegisterObserver(w);
        weatherStation.RegisterObserver(new MobileApp());

        weatherStation.update(25, 60);
        weatherStation.update(25, 60);
        weatherStation.update(25, 60);
        weatherStation.update(25, 60);
        weatherStation.update(25, 60);

        weatherStation.update(20, 50);

        weatherStation.RemoveObserver(d);
        weatherStation.update(25, 60);

        weatherStation.RemoveObserver(w);
        weatherStation.update(25, 60);



    }
}
