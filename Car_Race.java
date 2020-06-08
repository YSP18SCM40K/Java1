
package car_race;

public class Car_Race {
  public static void main(String[] args)throws InterruptedException {

  //  Counter c = new Counter();
    Thread t1 = new Thread(new Runnable(){
      public void run(){
        System.out.println("Player's car is running");
      }
    });

    Thread t2 = new Thread(new Runnable(){
      public void run(){
        System.out.println("Other cars are running");
      }
    });
    
    Thread t3 = new Thread(new Runnable(){
      public void run(){
       System.out.println("Everybody's position is updated");
      }
    });

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();
    
    System.out.println("This was a simple example of Join ");
  }
}