package VidhinSanAssign;

public class TouristPlace {

	public static void main(String[] args) {
	System.out.println("happy journey");
	TouristPlace tp= new TouristPlace();
     Mahabalipuram mp= tp.new Mahabalipuram();
     mp.sculpture();
     tp.Chennai();
     tp.beautifulSculpures();
    
	
	}
	 public  void Chennai()
     {
    	 System.out.println("mahablipuram is situated near chennai");
    	 Mahabalipuram mp= new Mahabalipuram();
    	 mp.sculpture();
     }
	class Mahabalipuram//normal  inner  class method
	{
		public void sculpture()
		{
			System.out.println("Mahabalipuram sculptures are very beaultiful");
		}
	}
	public void beautifulSculpures()
	{
		
		class Elephant// method local inner class
		{
			public static void bigElephant()
			{
				System.out.println("the sculpure elephent is really big");
			}
		}
		Elephant elp= new  Elephant();
		elp.bigElephant();
		
	}
	

}
