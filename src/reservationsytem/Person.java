package reservationsytem;

public class Person implements Runnable {
	Reservation reserveTickets;  
	int bookingSeats; //variable to check the number of seats requested for reservation
	
	
	public Person(Reservation reserve, int bookingSeats) 
	{	
		reserveTickets=reserve;
		this.bookingSeats=bookingSeats;
	}

	@Override
	//overriding run method of Runnable interface. 
	public void run()
	{
		//reservation class method for booking seat
	    reserveTickets.reserveSeat(bookingSeats);
	}

}
