
package car_race;


class MyClass extends Thread { 
    public void run() 
    { 
        try { 
            for (int i = 0; i < 5; i++) { 
                System.out.println("Player's car is running");
                System.out.println("Other car are running");
  
                // Here current threads goes to sleeping state 
                // Another thread gets the chance to execute 
                Thread.sleep(1000); 
            } 
        } 
        catch (InterruptedException e) { 
            System.out.println("InterruptedException occur"); 
        } 
    } 
}  
  
class Carrace2 { 
    public static void main(String[] args)  
              throws InterruptedException 
    { 
        MyClass thread = new MyClass(); 
        thread.start(); 
  
        // main thread calls interrupt() method on  
        // child thread 
        thread.interrupt(); 
  
        System.out.println("Everybody's postiion is updated"); 
    } 
}