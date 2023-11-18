package tester;

import static validation.MessCustomerValidation.validateAll;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

import CustomExceptionMess.CustomExceptionMess;

import static utils.customerUtils.*;
import code.Customer;
import code.MonthlyPlan;

public class TestCust {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Customer> MessMap = populateMap();// new HashMap<>();
			ArrayList<Customer> cList = populateList(MessMap);
			System.out.println("1) Sign up Customer\\n\r\n" + "2) If already register then sign in\\n\r\n"
					+ "3) Change Password  \\n\r\n" + "4) Sort Customer as per \\n\r\n"
					+ "5) Unsubscribe customer according plan duration (month wise (1, 3, 6, 12))\\n\r\n"
					+ "6) Display all Customers\\n\r\n"
					+ "7) Modify all customers first name (make first Letter capital of customers first name)\\n\r\n"
					+ "8) Display email addresses of the customers who did registration in month of January\\n\r\n"
					+ "10) Display count of the Customers who have register for plan: Monthly\\n\r\n"
					+ "11) Search the Customer who lived in Akurdi.\\n\r\n"
					+ "12) Give the 20% discount to the customers who have selected plan for 1 year.\\n");
			int choice;
			do {

				System.out.print("Enter choice : ");
				choice = sc.nextInt();
				switch (choice) {

				case 0:
					choice = 0;
					break;
				case 1:
					System.out
							.println("Enter Customer Details (cusId, fName, lName, mail, pass, address, phoneNo, pl)");
					Customer cu = validateAll(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
							sc.next(), sc.next(), MessMap);
					MessMap.put(cu.getCusId(), cu);
					System.out.println("Customer Added Successfully..!");

					break;

				case 2:
					System.out.println("Enter email to sign in : ");
					Customer cus = findByEmail(sc.next(), cList);
					System.out.println("Enter Password : ");
					if (cus.getPass().equals(sc.next())) {
						System.out.println("Login Succesful..!");
					} else {
						throw new CustomExceptionMess("Invalid Password,unable to Login..!");
					}

					break;
				case 3:
					System.out.println("Enter Email to Change Password : ");
					Customer cs = findByEmail(sc.next(), cList);
					System.out.println("Enter password : ");
					if (cs.getPass().equals(sc.next())) {
						System.out.println("Enter New Password : ");
						cs.setPass(sc.next());
						System.out.println("Password Changed Successfully..!");
					} else {
						throw new CustomExceptionMess("Invalid password,unable to change..!");
					}

					break;
				case 4:
					System.out.println();
					System.out.print("sort according to ,\n1) First name \r\n" + "2) According to plan\r\n"
							+ "3) According to EndDate\r\n" + "");
					System.out.println("Enter Choice : ");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						Collections.sort(cList, (c1, c2) -> c1.getfName().compareTo(c2.getfName()));
						System.out.println("Sorted according to First Name..!");
						break;

					case 2:
						Collections.sort(cList, (c1, c2) -> c1.getPlan().compareTo(c2.getPlan()));
						System.out.println("Sorted according to Plan..!");

						break;
					case 3:
						Collections.sort(cList, (c1, c2) -> c1.getEndDate().compareTo(c2.getEndDate()));
						System.out.println("Sorted According to RgistrationDate..!");

						break;

					default:
						System.out.println("Plese Enter valid Choice..!");
						break;
					}

					break;
				case 5:
					System.out.println();
					System.out.print(
							"Unsubscribe ,\n1) 1 Month \r\n" + "2) 2 Month\r\n" + "3) 6 Month\r\n" + "4)1 year\n");
					System.out.println("Enter Choice : ");
					int cho = sc.nextInt();
					switch (cho) {
					case 1:
//						cList.stream().filter(c -> c.getPlan().equals(MonthlyPlan.MONTHLY)).forEach(c -> System.out.println(c));
						for (Customer c : cList) {
							if (MonthlyPlan.MONTHLY.equals(c.getPlan())) {
								cList.remove(c);
							}
						}
						break;

					case 2:
						for (Customer c : cList) {
							if (MonthlyPlan.QUARTERLY.equals(c.getPlan())) {
								cList.remove(c);
							}
						}

						break;
					case 3:
						for (Customer c : cList) {
							if (MonthlyPlan.HALFYEAR.equals(c.getPlan())) {
								cList.remove(c);
							}
						}
						break;
					case 4:
						for (Customer c : cList) {
							if (MonthlyPlan.YEARLY.equals(c.getPlan())) {
								cList.remove(c);
							}
						}

						break;

					default:
						System.out.println("Plese Enter valid Choice..!");
						break;
					}
					break;
				case 6:
					// MessMap.values().stream().forEach(c -> System.out.println(c));
					cList.stream().forEach(c -> System.out.println(c));
					break;
				case 7:// Modify all customers first name (make first Letter capital of customers first
						// name)\\n\r\n"
						// cList.stream().map(c -> c.getfName().toUpperCase().charAt(0)).forEach(c ->
						// System.out.println(c));
					for (Customer c : cList) {
						c.setfName((c.getfName().toUpperCase()));
						System.out.println(c);
					}
					break;
				case 8:// 8) Display email addresses of the customers who did registration in month of
						// January\\n\r\n"
					cList.stream().filter(c -> c.getEndDate().getMonth().equals(Month.FEBRUARY))
							.forEach(c -> System.out.println(c.getEmail()));

					break;
				case 10:// + "10) Display count of the Customers who have register for plan:
						// Monthly\\n\r\n"
					long count = cList.stream().filter(c -> c.getPlan().equals(MonthlyPlan.MONTHLY)).count();
					System.out.println(count);

					break;
//				
//					
//					
//					
				case 11:// + "11) Search the Customer who lived in Akurdi.\\n\r\n"
					cList.stream().filter(c -> c.getAddress().equals("Akurdi")).forEach(c -> System.out.println(c));
					break;
				case 12:// + "12) Give the 20% discount to the customers who have selected plan for 1
						// year.\\n");
					cList.stream().filter(c -> c.getPlan().equals(MonthlyPlan.YEARLY)).forEach(c -> {
						c.getPlan().setCharges(32000 * 0.8);
						System.out.println(c);
					});
					break;

				default:
					System.out.println("Plese Enter valid Choice..!");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
