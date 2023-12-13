package validationPkg;

import java.time.LocalDate;

import trainExceptionPkg.trainException;
import trainPkg.Train;
import trainPkg.TrainType;

public class validations {

	
	public static String validateNumber(String tn) throws trainException {
		
		if(!(tn.matches("[A-Z0-9]")))
			throw new trainException("Invalid Name");
		return tn;
	}
	
	
	public static LocalDate validateDate(String date) throws trainException {
		
		if(LocalDate.parse(date).isBefore(LocalDate.now()))
			throw new trainException("Invalid Date");
		return LocalDate.parse(date);
	}
	
	public static TrainType validateType(String tp ) throws IllegalArgumentException {
		
		return TrainType.valueOf(tp.toUpperCase());
	}
	
	public static Train validateAll(String train_no, String train_name, String departure_time, String arrival_time, String source,
			String destination, String train_added_date, int no_of_bogies, String type) throws trainException {
		
		String tn=validateNumber(train_no);
		LocalDate d=validateDate( train_added_date);
		TrainType t =validateType(type);
		
		Train tr = new Train(		
				tn,  train_name,  departure_time, arrival_time, source,
			    destination, d, no_of_bogies, t);
		
		return tr;
	}
}
