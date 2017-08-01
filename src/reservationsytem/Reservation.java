package reservationsytem;

public class Reservation {
static int availableSeats=15;   //seats available
	
	//synchronized method to reserve seats.
	public synchronized void reserveSeat(int requestedSeats)
	{
		
		System.out.println(Thread.currentThread().getName()+" entered");
		System.out.println("Available seats : " + availableSeats + " Requested seats : " + requestedSeats);
		
		//Checking that seats are available
		//if seats are available
		if(availableSeats >= requestedSeats)
		{
			System.out.println("Seat Available.");
			//try-catch block to sleep the Thread.
			try
			{
				Thread.sleep(100);   // LINE E
			}
			catch (InterruptedException e)
			{
			    System.out.println("Thread interrupted");
			}
			//Printing details.
			System.out.println(requestedSeats + " seats reserved by "+Thread.currentThread().getName());
		    availableSeats = availableSeats - requestedSeats;    //Reducing number of seats which are booked.
		    System.out.println(availableSeats +" seats are still available");  
		}
		//if seats are not available.
		else
		{
			System.out.println("Seats not available"); 
		}
		
	}

}
