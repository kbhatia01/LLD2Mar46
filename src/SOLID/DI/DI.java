package SOLID.DI;

import SOLID.DI.Bank.AxisBank;
import SOLID.DI.BankInternal.AxisInternalBank;
import SOLID.DI.BankInternal.Bank;
import SOLID.DI.BankInternal.YesInternalBank;

public class DI {

    public static void main(){

        Bank a = new YesInternalBank();
        PhonePe p = new PhonePe(a);
        p.UPI();
    }
}
