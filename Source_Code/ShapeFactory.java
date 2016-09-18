import java.io.Serializable;
public class Two_Legs_Factory extends AbstractFactory  implements Cloneable
{
		static Oval oval=null;
		static Rectangle rectangle=null;
		static Turtle turtle=null;
		static Pentagon pentagon=null;
		static Hexagon hexagon=null;


   public Shape getShape(String shapeType){
   
      if(shapeType == null){
         return null;
      }		
      
      if(shapeType.equalsIgnoreCase("Oval")){
         if(oval==null)
		 {
			oval=new Oval();
		}
		 return oval;
         
      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
        if(rectangle==null)
		{
			rectangle=new Rectangle();			
		}
		 return rectangle;		          
      }else if(shapeType.equalsIgnoreCase("Turtle")){
         if(turtle==null)
		 {
			turtle=new Turtle();
		}
		 return turtle;
      }
	  else if(shapeType.equalsIgnoreCase("Pentagon")){
         if(pentagon==null)
		 {
			pentagon=new Pentagon();
		}
		 return pentagon;
         
      }else if(shapeType.equalsIgnoreCase("Hexagon")){
         if(hexagon==null)
		 {
			hexagon=new Hexagon();
		}
		 return hexagon;
      }  
		  
      return null;
   }
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}