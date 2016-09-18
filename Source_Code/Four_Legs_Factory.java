import java.io.Serializable;
public class Four_Legs_Factory extends AbstractFactory  implements Cloneable
{		
		static Dog dog=null;
		static Cat cat=null;
		static Tiger tiger=null;


   public Four_Legs getFourLegs(String AnimanType){
   
      if(AnimanType == null){
         return null;
      }		
      
      if(AnimanType.equalsIgnoreCase("Dog")){
         if(dog==null)
		 {
			dog=new Dog();
		}
		 return dog;
         
      }else if(AnimanType.equalsIgnoreCase("Cat")){
        if(cat==null)
		{
			cat=new Cat();			
		}
		 return cat;		          
      }else if(AnimanType.equalsIgnoreCase("Tiger")){
         if(tiger==null)
		 {
			tiger=new Tiger();
		}
		 return tiger;
      }
	 
      return null;
   }
    public Two_Legs getTwoLegs(String AnimalType){
		return null;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}