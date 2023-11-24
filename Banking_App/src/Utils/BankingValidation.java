package Utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.banking.AcType;
import com.banking.BankAccount;

import CustomException.InsufficientFundsException;
import CustomException.InvalidInputException;

public class BankingValidation {
	// add a method to validate min balance
	public static void validateBalance(AcType type, double balance) throws InsufficientFundsException {
		if (balance <= type.getMinbalance())
			throw new InsufficientFundsException("low balance");
	}

	public static AcType parseAndValidateType(String type) {
		return AcType.valueOf(type.toUpperCase());
	}

	// validate a/c type
	// In case of no txs (withdraw , deposit, funds transfer) ,
	// in 1 year , disable a/c status
	public static void disableaccount(Map<Integer, BankAccount> acctsMap) {
		for (BankAccount a : acctsMap.values()) {
			long periodInMonth = Period.between(a.getCreationDate(), LocalDate.now()).toTotalMonths();
			if (periodInMonth > 12)
				a.setActive(false);
		}
		System.out.println("account status update");
	}

	public static BankAccount validateAllInputs(int acctNo, String customerName, String acctType, double balance,
			String creationDate, Map<Integer, BankAccount> Map)
			throws InsufficientFundsException, InvalidInputException {
		if (Map.containsKey(acctNo))
			throw new InvalidInputException("dup accts");
		AcType type = parseAndValidateType(acctType);
		validateBalance(type, balance);
		LocalDate date = LocalDate.parse(creationDate);
		return new BankAccount(acctNo, customerName, type, balance, date);
	}

}
