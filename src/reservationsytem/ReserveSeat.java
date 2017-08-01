package reservationsytem;
/*
 * Synchronization keyword places a lock (a monitor) on an important 
 * object or piece of code to make sure that only 
 * one thread at a time will have access.
 * */
public class ReserveSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation reserve = new Reservation();
		
		//Creating objects of Person class 
		Person firstPerson = new Person(reserve,10);
		Person secondPerson = new Person(reserve,8);
		
		
		Thread firstThread = new Thread(firstPerson,"Harshada");
		Thread secondThread = new Thread(secondPerson,"Rishi");
		
		//Starting all Threads.
		firstThread.start();
		secondThread.start();

	}

}
