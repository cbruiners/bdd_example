package classes;

public class account {
	public static boolean accountInCredit(int accNo) {
		int accountBalance = 0;
		
		if (accNo == 123456) {
			 accountBalance = 1000;
		} else {
			accountBalance = 0;
		}

	    if (accountBalance >= 1) {
	    		return true;
	    } else {
	        return false;
	    }
	}
	
	public static boolean customerRequestType(String typeofreq)
	{
		
		if (typeofreq == "BalanceChk") {
			 return false;
		} else {
			return true;
		}
	}
	
	public static boolean customerDebitAccount(int requestedAmount) {
		int amountInAcc = 1000;
		if ((amountInAcc - requestedAmount) == 800) {
			return true;
		} else {
			return false;
	}
	}
	
}