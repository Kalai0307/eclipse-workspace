import java.util.Scanner;
import java.util.TreeMap;

public class BusApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bus bus =new Bus();
		Passenger passenger = new Passenger();
		System.out.println("Press 1: for booking and check bus details and driver details");
		System.out.println("press 2: seats for booking ");
		
		while(true)
		{
			byte choice = sc.nextByte();
			System.out.println("enter choice :"+choice);
			switch(choice)
			{
			case 1:
			{   
				busDetails(bus);
				System.out.println("number of seats to be booked");
				int NoOfSeats=sc.nextInt();
				int TotalSeats=bus.getSeatCount();
				passengerDetail(passenger,NoOfSeats,TotalSeats);
				break;
			}
			case 2:
			{
				
				break;
			}
		}
		
		}
		
				
		
		
		

	}

	private static void passengerDetail(Passenger passenger, int noOfSeats, int totalSeats) {
		TreeMap<Integer, Passenger> tm= new TreeMap<>();
		{
			while(noOfSeats!=0)
			{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name :");
		passenger.setName(sc.next());
		System.out.println("enter your age");
		passenger.setAge(sc.nextInt());
		System.out.println("enter your gender");
		String gender=sc.next();
		passenger.genderIsPresent(gender);
		System.out.println(gender);
		System.out.println("eneter your phno");
		passenger.setPhno(sc.nextLong());
		System.out.println("eneter your boarding point");
		passenger.setBoardingPoint(sc.nextLine());
		int seatNo=sc.nextInt();
		if(seatNo>totalSeats)
		{
		tm.put(seatNo, passenger);
		}
		else
		{
			System.out.println("you are exceeding the seat Limits");
			break;
		}
		noOfSeats--;
			}
		
		}
		
	}

	private static void busDetails(Bus bus) {
		bus.setBusId("TK004");
		bus.setBusType("Semi-Sleeper");
		bus.setSeatCount(5);
		bus.setDriverName("SAI SABARI JEYANTH");
		bus.setPhno(9488034538l);
		System.out.println(bus.toString());
		
		
	}

}
