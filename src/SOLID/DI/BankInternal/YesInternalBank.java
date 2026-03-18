package SOLID.DI.BankInternal;

import SOLID.DI.Bank.YesBank;

public class YesInternalBank  implements Bank{
    YesBank y;

    public YesInternalBank(){
        y = new YesBank();
    }


    @Override
    public void sendMoney() {
        y.sendMoney();
    }
}
