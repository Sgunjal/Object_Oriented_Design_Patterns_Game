public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("Two_Legs")){
         return new Two_Legs_Factory();        
      }
	  else if(choice.equalsIgnoreCase("Four_Legs")){
         return new Four_Legs_Factory();        
      }      
      return null;
   }
}