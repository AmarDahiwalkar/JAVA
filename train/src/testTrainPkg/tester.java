package testTrainPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utilsPkg.utils.*;
import static validationPkg.validations.*;

import trainPkg.Train;

public class tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;

			Map<String, Train> mp = populateMap();

			try {
				while (!exit) {

					System.out.println(
							"1.Add: 2.Display: 3.Remove: 4:Specific City 5:sort 6:Change Destination 7:Serialisation 8:Deserialisatioin 9:Exit");
					int opt = sc.nextInt();

					switch (opt) {

					case 1:
						System.out.println(
								"String train_no, String train_name, String departure_time, String arrival_time, String source,\r\n"
										+ "String destination, LocalDate train_added_date, int no_of_bogies, TrainType type");

						Train tr = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.next());
						mp.put(sc.next(), tr);

						break;

					case 2:

						for (Train t : mp.values())
							System.out.println(t);
						break;

					case 3:
						for (Train t : mp.values()) {
							if (t.getNo_of_bogies() < 15)
								mp.remove(t);
						}
						break;

					case 4:
						System.out.println("Enter City Name");
						String cn = sc.next();
						mp.values().stream().filter(t -> t.getSource().equals(cn)).forEach(p -> System.out.println(p));
						break;

					case 5:
						mp.values().stream().sorted((p1, p2) -> p1.getNo_of_bogies() - p2.getNo_of_bogies())
								.forEach(p -> System.out.println(p));
						break;

					case 6:
						mp.values().stream().filter(p -> p.getSource().equals("Pune"))
								.forEach(p -> p.setDestination(sc.next()));
						break;

					case 7:
						ser(sc.next(), mp);
						break;

					case 8:
						dser(sc.next());
						break;

					case 9:
						exit = true;
						break;

					}

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
