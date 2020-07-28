package factory_pattern;
public class Factory_Pattern 
{
        public interface Shape 
        {
            void corners();
        }
        public class Rectangle implements Shape 
        {
            
        @Override
        public void corners() 
        {
            System.out.println("Inside Rectangle::corners() method.");
        }
        }
        public class Square implements Shape 
        {
            @Override
            public void corners() 
            {
                System.out.println("Inside Square::corners() method.");
            }
        }

        public class Circle implements Shape 
        {
            @Override
            public void corners() 
            {
                System.out.println("Inside Circle::corners() method.");
            }
        }

    public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}

    public static void main(String[] args) 
    {
     ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its corners method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call corners method of Circle
      shape1.corners();

      //get an object of Rectangle and call its corners method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call corners method of Rectangle
      shape2.corners();

      //get an object of Square and call its corners method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call corners method of square
      shape3.corners();   
    }
    
}
