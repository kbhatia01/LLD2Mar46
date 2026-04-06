package src.ObserverDP.Observers;

public class MobileApp  implements Observer{
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("MobileApp Updated with new temperature " + temperature + "MobileApp Updated with new humidity " + humidity);
    }
}
