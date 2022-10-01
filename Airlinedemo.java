package AirlineReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Airlinedemo{
	


	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		ArrayList <Airline>Airlines=new ArrayList<Airline>();//---Airline
		Airlines.add(new Airline (1,true,45));
		Airlines.add(new Airline (2,true,50));
		Airlines.add(new Airline (3,true,48));
		ArrayList<Booking> bookings=new ArrayList<Booking>();//--Booking
		
		
		
		int userOpt=1;
	   Scanner scanner=new Scanner(System.in);
	    for(Airline b:Airlines) {
	    	b.displayAirlineinfo();
	    }
	    
		while (userOpt==1) {
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt= scanner.nextInt();
			if(userOpt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings, Airlines)) {
					
					bookings.add(booking);
				System.out.println("Your Booking is Confirmed");
			}else
				System.out.println("Sorry Airline is full.try another airline or date.");
		}

		
	}
}
}

