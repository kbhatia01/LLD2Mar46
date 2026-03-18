package SOLID;

public class TaxCalculateEU implements Taxcalculation{

    @Override
    public void taxCalculate(int amount, int x) {
        System.out.println("tax EU");
    }
}
