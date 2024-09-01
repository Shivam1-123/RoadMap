package Solution;

import java.math.BigDecimal;

import Limitation_liskov.Account;
import Limitation_liskov.Fixed_Deposit;

public class Bankingappwithdrawl {

	public void withdrawal() {
    	withdraw mydeposit = new Current();
        mydeposit.deposit(new BigDecimal(10000.0));
        mydeposit.withdraw(new BigDecimal(100.0));
    }
}
