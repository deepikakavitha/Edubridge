package AirlineReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int AirlineNo;
	Date date;
	Booking(){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter name of passenger:");
		passengerName = scanner.next();
		System.out.println("Enter Airline No:");
		AirlineNo = scanner.nextInt();
		System.out.println("Email id:");
       String  Emailid = scanner.next();
		System.out.println("Enter date dd-mm-yyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateformat.parse(dateInput);
		}catch(ParseException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();

		}
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Airline> Airlines) {
		int capacity = 0;
		for(Airline Airline:Airlines){
			if(Airline.getAirlineNo() ==  AirlineNo)
				capacity = Airline.getcapacity();
		}
		int booked = 0;
		for(Booking b: bookings) {
			if (b.AirlineNo == AirlineNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}

		

