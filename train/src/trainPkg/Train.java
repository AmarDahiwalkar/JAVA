package trainPkg;

import java.io.Serializable;
import java.time.LocalDate;

public class Train implements Serializable {
	
	private String train_no,train_name,departure_time,arrival_time,source,destination;
	private LocalDate train_added_date;
	private int no_of_bogies;
	private TrainType type;
	@Override
	public String toString() {
		return "Train [train_no=" + train_no + ", train_name=" + train_name + ", departure_time=" + departure_time
				+ ", arrival_time=" + arrival_time + ", source=" + source + ", destination=" + destination
				+ ", train_added_date=" + train_added_date + ", no_of_bogies=" + no_of_bogies + ", type=" + type + "]";
	}
	public Train(String train_no, String train_name, String departure_time, String arrival_time, String source,
			String destination, LocalDate train_added_date, int no_of_bogies, TrainType type2) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.source = source;
		this.destination = destination;
		this.train_added_date = train_added_date;
		this.no_of_bogies = no_of_bogies;
		this.type = type2;
	}
	public String getTrain_no() {
		return train_no;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getTrain_added_date() {
		return train_added_date;
	}
	public void setTrain_added_date(LocalDate train_added_date) {
		this.train_added_date = train_added_date;
	}
	public int getNo_of_bogies() {
		return no_of_bogies;
	}
	public void setNo_of_bogies(int no_of_bogies) {
		this.no_of_bogies = no_of_bogies;
	}
	public TrainType getType() {
		return type;
	}
	public void setType(TrainType type) {
		this.type = type;
	}
	

}
