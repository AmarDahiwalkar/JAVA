import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;

public class Utils {
	public static Vehicle findByChasisNo(String chNo, List<Vehicle> list) throws InvalidInputException {
		Vehicle vehicle=new Vehicle(chNo);
		int index = list.indexOf(chNo);
		if (index == -1)
			throw new InvalidInputException("Invalid chasis no");
		System.out.println(list.get(index));
		return vehicle;
	}
	public static List<Vehicle> populateList(){
		List<Vehicle> vehicles=new ArrayList<>();
		//chasisNo,  vehicleColor,  price,  manufactureDate,	company
		vehicles.add(new Vehicle("120",color.RED,50000,parse("2024-01-01"),"HONDA"));
		vehicles.add(new Vehicle("116",color.BLACK,50000,parse("2024-01-01"),"BMW"));
		vehicles.add(new Vehicle("113",color.BLUE,50000,parse("2024-01-01"),"MDEZ"));
		vehicles.add(new Vehicle("112",color.WHITE,50000,parse("2024-01-01"),"MARUUTI"));
		vehicles.add(new Vehicle("111",color.SILVER,50000,parse("2024-01-01"),"TOYOTA"));
		
		return vehicles;
		
	}
}