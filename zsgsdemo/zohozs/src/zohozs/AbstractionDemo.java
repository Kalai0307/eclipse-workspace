package zohozs;

interface Scientist
{
	public void kalai();
}
 abstract class  Solarsystem implements Scientist
{
	public abstract void moon();
	public abstract void stars();
	public static void pluto()
	{
		System.out.println("we can see  pluto only in solar system");
	}
	
	
	 
}
 abstract class Earth extends Solarsystem implements Scientist
 {

//	public void moon() {
//		System.out.println("we can see the moon from the earth");
//		
//	}
//
//	public void stars() {
//		System.out.println("we can see the stars from the earth");
//		
//		
//	}
		/*
		 * public void pluto() {
		 * 
		 * System.out.println("we cannot  see  pluto only from earth"); }
		 */
	public abstract void asteroid();
	
	 
 }
public class AbstractionDemo  extends Earth{

	public static void main(String[] args) {
		AbstractionDemo earth=new AbstractionDemo();
		
		earth.moon();
		pluto();
		earth.stars();
		earth.kalai();
	//	earth.asteroid();

	}

	@Override
	public void kalai() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asteroid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stars() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void asteroid() {
//		System.out.println("asteroids");
//		
//	}


}
