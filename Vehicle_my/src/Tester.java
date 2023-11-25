import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Vehicle> showroom = Utils.populateList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1 . Add a Vehicle\n" + "2. Display all \n" + "3. Get Vehicle Details\n "
						+ "4. Apply discount\n " + "5. Apply discount on old vehicles\n "
						+ "6. Remove specific vehicle \n 7. Remove vehicles by color \n 8. Sort vehicles as per ch no 9. Sort vehicle details as per price\n"
						+ "	+ \" 10. Sort vehicle details as per Date n price\\n0.Exit");
				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter vehicle details : chasisNo,  vehicleColor,  price,  manufactureDate,	company");

						Vehicle vehicle = ShowrromValidation.ValidateAllInputs(sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), showroom);
						showroom.add(vehicle);
						System.out.println("vehicle added");
						break;
					case 2:
						System.out.println("showrrom details");
//						for (Vehicle v : showroom)
//							System.out.println(v);
						showroom.stream().forEach(c->System.out.println(c));
						break;
					case 3:
						System.out.println("enter chasis no");
						System.out.println(Utils.findByChasisNo(sc.next(), showroom));

						break;
					case 4:
						System.out.println("enter chasis no and discount:");
						vehicle = Utils.findByChasisNo(sc.next(), showroom);
						vehicle.setPrice(vehicle.getPrice() - sc.nextDouble());
						System.out.println("discount applied");
						break;
					case 5:
						System.out.println("enter date and discount");
						LocalDate date = ShowrromValidation.parseAndValidatedateDate(sc.next());
						double discount = sc.nextDouble();
						for (Vehicle v : showroom) {
							if (v.getManufactureDate().isBefore(date))
								v.setPrice(v.getPrice() - discount);
						}
						break;
					case 6:
						System.out.println("remove vehicle");
						boolean removed = showroom.remove(new Vehicle(sc.next()));
						if (removed)
							System.out.println("vehicle removed");
						else
							throw new InvalidInputException("vehicle not found");
						break;
					case 7:
						System.out.println("enter vehicle color");
						color c = ShowrromValidation.parseAndvalidatecolor(sc.next());
						for (Vehicle v : showroom)
							if (v.getVehicleColor() == c)
								showroom.remove(v);
						System.out.println("deleted vehicle details");
						break;
					case 8:
						Collections.sort(showroom);
						break;
					case 9:
						Collections.sort(showroom, new VehiclePriceComparator());
						break;
					case 10:
						Collections.sort(showroom, new VehiclePriceComparator() {
							@Override
							public int compare(Vehicle o1, Vehicle o2) {
								int ret = o1.getManufactureDate().compareTo(o2.getManufactureDate());
								if (ret == 0) {
									if (o1.getPrice() < o2.getPrice())
										return -1;
									if (o1.getPrice() == o2.getPrice())
										return 0;
									return 1;

								}
								return ret;
							}
						});
						break;
					case 0:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}

}
