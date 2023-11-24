import static Utils.BankingValidation.disableaccount;
import static Utils.BankingValidation.validateAllInputs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.banking.BankAccount;

import CustomException.InvalidInputException;
import Utils.Banking_Utils;

public class BankingTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, BankAccount> accountMap = Banking_Utils.populateAccountMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2. Display all accts 3. Show a/c summary \n"
						+ "4. Transfer Funds 5. Close A/c 6. Disable unused accts \n"
						+ "7. Sort accts as per acct no \n"
						+ "8. Sort accts as per  balance 9.sort as per DOB and cust name0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter accno,customerName,  acctType,  balance,  creationDate");
						BankAccount acct = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), accountMap);
						accountMap.put(acct.getAcctNo(), acct);
						System.out.println("new account created");
						break;
					case 2:
						accountMap.values().stream().forEach(System.out::println);
						break;
					case 3:
						acct = accountMap.get(sc.nextInt());
						if (acct == null)
							throw new InvalidInputException("account not exists");
						System.out.println("a/c summary" + acct);
						break;
					case 4:
						BankAccount src = accountMap.get(sc.nextInt());
						if (src == null)
							throw new InvalidInputException("invalid account");
						BankAccount dest = accountMap.get(sc.nextInt());
						if (dest == null)
							throw new InvalidInputException("invalid account");
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("amount transfered");
						break;
					case 5:
						System.out.println("enter account number to close acc");
						acct = accountMap.remove(sc.nextInt());
						if (acct == null)
							throw new InvalidInputException("account not exists");
						System.out.println("acc remove:" + acct.getCustomerName());
						break;
					case 6:
						disableaccount(accountMap);
						break;
					case 7:
						TreeMap<Integer, BankAccount> tm = new TreeMap<>(accountMap);
						for (BankAccount a : tm.values())
							System.out.println(a);

						break;
					case 8:
						accountMap.values().stream()
								.sorted((c1, c2) -> ((Double) c1.getBalance()).compareTo(c2.getBalance()))
								.forEach(c -> System.out.println(c));
						break;
					case 9:

						accountMap.values().stream()
								.sorted((s1, s2) -> s1.getCustomerName().compareTo(s2.getCustomerName()))
								.sorted((s1, s2) -> s1.getCreationDate().compareTo(s2.getCreationDate()))
								.forEach(s -> System.out.println(s));
						break;
					case 10:
						break;
					case 0:
						exit = true;

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
