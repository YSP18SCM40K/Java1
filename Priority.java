
package car_race;
import java.lang.*; 
  
class Priority extends Thread 
{ 
    public void run() 
    { 
        System.out.println("Inside run method"); 
    } 
  
    public static void main(String[]args) 
    { 
        Priority t1 = new Priority(); 
        Priority t2 = new Priority(); 
        Priority t3 = new Priority(); 
  
        System.out.println("Player's car is running " + 
                              t1.getPriority()); // Default 1 
        System.out.println("Other cars are running " + 
                              t2.getPriority()); // Default 1 
        System.out.println("Everybody's position is updated." + 
                              t3.getPriority()); // Default 1 
 
        t1.setPriority(1); 
        t2.setPriority(2); 
        t3.setPriority(3); 
  
        // t3.setPriority(21); will throw IllegalArgumentException 
        System.out.println("t1 thread priority : " + 
                              t1.getPriority());  //1 
        System.out.println("t2 thread priority : " + 
                              t2.getPriority()); //2 
        System.out.println("t3 thread priority : " + 
                              t3.getPriority());//3
  
        // Main thread 
        System.out.print(Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
  
        // Main thread priority is set to 10 
        Thread.currentThread().setPriority(10); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
    } 
} 
