import java.awt.*;
import java.applet.*;
import java.util.*;


public class Flyweight_Animal {   
	Two_Legs two_legs;
	Four_Legs four_legs;
	
	 //get shape factory
      AbstractFactory Two_Legs_Factory = FactoryProducer.getFactory("Two_Legs");
	  
	//call draw method of Shape Square      
	   AbstractFactory Four_Legs_Factory = FactoryProducer.getFactory("Four_Legs");	 
	
   public void two_legs_animal(String animalname)                                         // Init method where we can initialize all obejcts and set background color.
	{
	 //get an object of Two_Legs Human
	  two_legs = Two_Legs_Factory.getTwoLegs(animalname);
      two_legs.draw();  
	}		
	public void four_legs_animal(String animalname)
	{
	   //get an object of Four_Legs Dog
	   four_legs = Four_Legs_Factory.getFourLegs(animalname);
	   four_legs.draw();
	}
	public static void main(String args[])
	{
		String []two_leg_animalnames= {"Human","Kangaroo","Penguin"};
		String []four_leg_animalnames= {"Dog","Cat","Tiger"};
		
		Flyweight_Animal animal=new Flyweight_Animal();
		
		System.out.println("");
		System.out.println("Animal Names who has two legs !!!!");
		
		for(int i=0;i<=2;i++)
		{
			animal.two_legs_animal(two_leg_animalnames[i]);
		}
		
		System.out.println("");
		System.out.println("Animal Names who has four legs !!!!");
		
		for(int i=0;i<=2;i++)
		{
			animal.four_legs_animal(four_leg_animalnames[i]);
		}		
	}
}