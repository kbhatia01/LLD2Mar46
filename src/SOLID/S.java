package SOLID;

public class S {
//    Invoice class to generate invoice..
    public void GenerateInvoice(int id, int amount){
//        System.out.println("Calculate tax logic.");
//        System.out.println("Save to db..");
//        System.out.println("Print invoice");

        Taxcalculation t = new TaxCalculateEU();
        t.taxCalculate(10, 20);
    }
}


