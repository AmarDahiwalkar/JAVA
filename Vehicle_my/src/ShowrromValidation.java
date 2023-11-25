import java.time.LocalDate;
import java.util.List;

public class ShowrromValidation {
	public static color parseAndvalidatecolor(String clr) throws IllegalArgumentException {
		return color.valueOf(clr.toUpperCase());
	}

	public static LocalDate parseAndValidatedateDate(String manufactureDate) throws InvalidInputException {
		LocalDate manuDate = LocalDate.parse(manufactureDate);
		LocalDate checkDate = LocalDate.of(2022, 01, 01);
		if (manuDate.isBefore(checkDate))
			throw new InvalidInputException("date is before 1st jan");

		return manuDate;
	}
	
	public static void checkfordup(String chNo,List<Vehicle> list)throws InvalidInputException
	{
		Vehicle newvehicle=new Vehicle(chNo);
		if(list.contains(newvehicle))
			throw new InvalidInputException("duplicate entry");
	}
	public static Vehicle ValidateAllInputs(String chasisNo, String vehiclecolor, double price, String manufactureDate, String company, List<Vehicle> vList)
			throws IllegalArgumentException,InvalidInputException 
	{
		color color=parseAndvalidatecolor(vehiclecolor);
		LocalDate validatedate= parseAndValidatedateDate(manufactureDate);
		checkfordup(chasisNo,vList);
		return new Vehicle(chasisNo,color,price,validatedate,company);
	}
	
	

}
