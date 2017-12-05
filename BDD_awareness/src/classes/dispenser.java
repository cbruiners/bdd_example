package classes;

public class dispenser {
		public static boolean cashAvailable(int amountRequested) {
			int dispenserCashAmount = 300;
			
			if (amountRequested >= dispenserCashAmount) {
				 return false;
			} else {
				return true;
			}
		}
		
		public static boolean cashDispensed(int cashDispensed) {
			if (cashDispensed == 1) {
				 return true;
			} else {
				return false;
			}
		}
	}
