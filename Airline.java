package AirlineReservation;

public class Airline {
	private int AirlineNo;
	private boolean ac;
	private int capacity;//get and set
	Airline (int no, boolean ac, int cap){
		this.AirlineNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	public int getAirlineNo() {//accessor
		return AirlineNo;
		
	}
	public boolean isac() {
		return ac;
		
	}
	public int getcapacity() {//accessor method
		return capacity;
	}
	public void setac (boolean val) {//mutator
		ac=val;
	}
	public void setcapacity(int cap) {//mutator
		capacity=cap;
	}
	public void displayAirlineinfo() {
		System.out.println("Airline no:"+AirlineNo +" ac:"+ac+"total capacity;"+capacity);
	}

	}

