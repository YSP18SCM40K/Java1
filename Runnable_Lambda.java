/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
public class Runnable_Lambda {
   
    public static void main(String[] args) {
        
        new Runnable_Lambda().startThreads(); 
        
        System.out.println(Thread.currentThread().getName() + ": RunnableTest");
 
        // Anonymous Runnable
 
        Runnable task1 = new Runnable(){
 
          @Override
          public void run(){
            System.out.println(Thread.currentThread().getName() + " is running");
          }
        };
 
 
        // Passing a Runnable when creating a new thread
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
 
 
        // Lambda Runnable
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };
 
        Thread thread1 = new Thread(task1);
 
        thread1.start();
        thread2.start();
 
        new Thread(task3).start();
 
    }
    private void startThreads() 
    { 
        ExecutorService taskList 
            = Executors.newFixedThreadPool(2); 
  
        for (int i = 0; i < 5; i++) { 
  
            int finalI = i + 1; 
  
            // Prints thread name and value 
            // of the counter variable 
            taskList.execute(() -> { 
  
                for (int j = 0; j < finalI; j++) { 
  
                    System.out.println( 
                        Thread 
                            .currentThread() 
                            .getName() 
                        + " Counter:" + j); 
                    pause(Math.random()); 
                } 
            }); 
        } 
        taskList.shutdown(); 
    } 
     private void pause(double seconds) 
    { 
        try { 
            Thread.sleep( 
                Math.round(1000.0 * seconds)); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
    
}
