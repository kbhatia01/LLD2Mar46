package src.ObserverDP.Observers;

public class Webapp implements Observer{

    @Override
    public void update(int temperature, int humidity) {
        System.out.println("Webapp Updated with new temperature " + temperature + "Webapp Updated with new humidity " + humidity);
    }
}
