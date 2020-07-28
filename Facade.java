/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs_factory_pattern;

public class Facade {
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
    
   public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}
    public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
    }

