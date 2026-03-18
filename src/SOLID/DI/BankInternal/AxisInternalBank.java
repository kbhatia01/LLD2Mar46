package SOLID.DI.BankInternal;

import SOLID.DI.Bank.AxisBank;

public class AxisInternalBank implements Bank{

    AxisBank a;
    public AxisInternalBank(){
        a = new AxisBank();
    }

    @Override
    public void sendMoney() {
        a.makeTransfer();
    }
}
