package utils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import CustomExceptionMess.CustomExceptionMess;
import code.Customer;
import code.MonthlyPlan;

public class customerUtils {
//	int cusId, String fName, String lName, String email, String pass, String address,
//	 LocalDate endDate, String phoneNo, MonthlyPlan plan
	public static Map<Integer, Customer> populateMap() {
		Map<Integer, Customer> cusmap = new HashMap<Integer, Customer>();
		cusmap.put(101, new Customer(101, "Pratik", "Lanke", "pratiklanke@gmail.com", "King@123", "sangamner",
				"9403600341", MonthlyPlan.YEARLY));
		cusmap.put(102, new Customer(102, "iPratik", "rLanke", "vpratiklanke@gmail.com", "bKing@123", "isangamner",
				"3940600341", MonthlyPlan.MONTHLY));
		cusmap.put(103, new Customer(103, "jPratik", "qLanke", "upratiklanke@gmail.com", "dKing@123", "Akurdi",
				"9400341360", MonthlyPlan.QUARTERLY));
		cusmap.put(104, new Customer(104, "hPratik", "oLanke", "tpratiklanke@gmail.com", "cKing@123", "gsangamner",
				"9400303641", MonthlyPlan.HALFYEAR));
		cusmap.put(105, new Customer(105, "gPratik", "pLanke", "xpratiklanke@gmail.com", "King@123", "fsangamner",
				"3600940341", MonthlyPlan.MONTHLY));
		cusmap.put(106, new Customer(106, "bPratik", "nLanke", "wpratiklanke@gmail.com", "fKing@123", "esangamner",
				"9403403601", MonthlyPlan.QUARTERLY));
		cusmap.put(107, new Customer(107, "fPratik", "mLanke", "rpratiklanke@gmail.com", "eKing@123", "dsangamner",
				"9404136003", MonthlyPlan.YEARLY));
		cusmap.put(108, new Customer(108, "cPratik", "kLanke", "spratiklanke@gmail.com", "hKing@123", "csangamner",
				"9403600341", MonthlyPlan.HALFYEAR));
		cusmap.put(109, new Customer(109, "ePratik", "lLanke", "ppratiklanke@gmail.com", "gKing@123", "bsangamner",
				"9403034160", MonthlyPlan.QUARTERLY));
		cusmap.put(110, new Customer(110, "dPratik", "jLanke", "qpratiklanke@gmail.com", "iKing@123", "asangamner",
				"9460030341", MonthlyPlan.YEARLY));
		return cusmap;
	}

	public static ArrayList<Customer> populateList(Map<Integer, Customer> cMap) {
		ArrayList<Customer> cList = new ArrayList<Customer>();
		cMap.values().stream().forEach(c -> cList.add(c));
		return cList;
	}

	@SuppressWarnings("unlikely-arg-type")
	public static Customer findByEmail(String email, ArrayList<Customer> cList) throws CustomExceptionMess {
		Customer customer = new Customer(email);
		if (cList.indexOf(customer.getEmail()) == -1)
			throw new CustomExceptionMess("Invalid email , customer not found..!");
		return cList.get(cList.indexOf(customer.getEmail()));

	}
}
