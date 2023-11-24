package Utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static Utils.BankingValidation.*;
import com.banking.AcType;
import com.banking.BankAccount;

import CustomException.InsufficientFundsException;

public class Banking_Utils {
	public static Map<Integer, BankAccount> populateAccountMap() {
		Map<Integer, BankAccount> accts = new HashMap<>();
//int acctNo, String customerName, AcType acctType, double balance, LocalDate creationDate

		accts.put(101, new BankAccount(101, "amar", AcType.CURRENT, 550000, LocalDate.parse("2023-01-01")));
		accts.put(100, new BankAccount(100, "xxx", AcType.FD, 543000, LocalDate.parse("2023-01-01")));
		accts.put(199, new BankAccount(199, "yyy", AcType.CURRENT, 523000, LocalDate.parse("2023-01-01")));
		accts.put(141, new BankAccount(141, "zzz", AcType.CURRENT, 554000, LocalDate.parse("2023-01-01")));
		accts.put(131, new BankAccount(131, "aaa", AcType.CURRENT, 534000, LocalDate.parse("2023-01-01")));

		return accts;
	}

}
