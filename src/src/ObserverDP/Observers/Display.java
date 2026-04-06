package src.ObserverDP.Observers;

public class Display implements Observer{
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("Display Updated with new temperature " + temperature + "Display Updated with new humidity " + humidity);
    }
}
