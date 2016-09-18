import java.io.Serializable;
public class Two_Legs_Factory extends AbstractFactory  implements Cloneable
{
		static Human human=null;
		static Kangaroo kangaroo=null;
		static Penguin penguin=null;		
		
   public Two_Legs getTwoLegs(String AnimalType){
   
      if(AnimalType == null){
         return null;
      }		
      
      if(AnimalType.equalsIgnoreCase("Human")){
         if(human==null)
		 {
			human=new Human();
		}
		 return human;
         
      }else if(AnimalType.equalsIgnoreCase("Kangaroo")){
        if(kangaroo==null)
		{
			kangaroo=new Kangaroo();			
		}
		 return kangaroo;		          
      }else if(AnimalType.equalsIgnoreCase("Penguin")){
         if(penguin==null)
		 {
			penguin=new Penguin();
		}
		 return penguin;
      }	  
		else
		{		
			return null;
		}
   }
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	public Four_Legs getFourLegs(String AnimanType){
		return null;
	}
}