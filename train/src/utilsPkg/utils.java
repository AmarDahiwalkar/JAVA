package utilsPkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import trainPkg.Train;
import trainPkg.TrainType;

public class utils {

	
	public static Map<String,Train> populateMap(){
		
		Map<String, Train> mp = new HashMap<>();
		
//String train_no, String train_name, String departure_time, String arrival_time, String source,
//		String destination, LocalDate train_added_date, int no_of_bogies, TrainType type
		
mp.put("TRE123", new Train("TRE123","abc","8:00 AM","8:00 PM","Pune","MP",LocalDate.parse("2023-11-20"),
		20,TrainType.EXPRESS));
mp.put("XYZ456", new Train("XYZ456","xyz","9:00 AM","9:00 PM","MP","Pune",LocalDate.parse("2023-11-21"),
		10,TrainType.SUPERFAST));
mp.put("PQR789", new Train("PQR789","pqr","10:00 AM","10:00 PM","Pune","Rj",LocalDate.parse("2023-11-22"),
		20,TrainType.PASSENGER));
return mp;


	}
	
	public static void ser(String fname,Map<String,Train> tr) throws FileNotFoundException, IOException {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fname))){
			
			out.writeObject(tr);
			
		}
	}
	
public static void dser(String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fname))){
			
			System.out.println(in.readObject());
			
			
		}
	}
}
