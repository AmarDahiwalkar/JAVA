package validation;

import java.util.Map;

import CustomExceptionMess.CustomExceptionMess;
import code.Customer;
import code.MonthlyPlan;

public class MessCustomerValidation {
	public static String validateEmail(String email) throws CustomExceptionMess {
		if (email.matches("[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)")) {
			return email;
		} else {
			throw new CustomExceptionMess("Invalid email,please enter in valid format..!");
		}
	}

	public static boolean validateDuplication(int id, Map<Integer, Customer> MessMap) throws CustomExceptionMess {
		if (MessMap.containsKey(id)) {
			throw new CustomExceptionMess("Customer Already Exist..!");
		} else {
			return true;
		}
	}

	public static boolean validatePhone(String phoneNo) throws CustomExceptionMess {
		if (phoneNo.matches("((\\+*)((0[ -]*)*|((91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}")) {
			return true;
		} else {
			throw new CustomExceptionMess("Sorry,please enter PhoneNo in valid format..!");
		}
	}

	public static MonthlyPlan validatePlan(String plan) {
		return MonthlyPlan.valueOf(plan.toUpperCase());
	}

	public static Customer validateAll(int cusId, String fName, String lName, String email, String pass, String address,
			String phoneNo, String plan, Map<Integer, Customer> MessMap) throws CustomExceptionMess {
		validateDuplication(cusId, MessMap);
		String mail = validateEmail(email);
		validatePhone(phoneNo);
		MonthlyPlan pl = validatePlan(plan);
		return new Customer(cusId, fName, lName, mail, pass, address, phoneNo, pl);
	}
}
