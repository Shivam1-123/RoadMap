package Bank;

import java.math.BigDecimal;

public class Bankingappwithdrawal {
	

    public void withdrawal() {
    	Account mydeposit = new Fixed_Deposit();
        mydeposit.deposit(new BigDecimal(10000.0));
        mydeposit.withdraw(new BigDecimal(100.0));
    }
    

}
