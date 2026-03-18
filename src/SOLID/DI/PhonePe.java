package SOLID.DI;

import SOLID.DI.Bank.AxisBank;
import SOLID.DI.Bank.YesBank;
import SOLID.DI.BankInternal.AxisInternalBank;
import SOLID.DI.BankInternal.Bank;

public class PhonePe {

    Bank y;

    PhonePe(Bank ya){
        y = ya;

    }

    void UPI(){
        y.sendMoney();
    }
}
