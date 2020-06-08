
package car_race;
import java.util.ArrayList;
import java.util.List;
public class Sum {

    static volatile int numberOfValues = 17;
    static double processedArray[];
    static Thread threadsArray[];
    static volatile int sum;
    static Object lock1 = new Object();
    static Object lock2 = new Object();
//Adding values to the array, each index in the array gets a thread to initialize that value:

    private static void initializeArray() {
        threadsArray = new Thread[numberOfValues];
        processedArray = new double[numberOfValues];

        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new Thread(new Runnable() {
                public void run() {
                    synchronize(lock1) {    
                        processedArray[numberOfValues - 1] = numberOfValues;
                        numberOfValues--;
                    }

                }   
            });
            threadsArray[i].start();
        }
//Here is the first for loop joining all threads after the initialization of the array:

        for (int i = 0; i < threadsArray.length; i++) {
            try {
                threadsArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//Summing the values in the array:

        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new Thread(new Runnable() {
                public void run() {
                    synchronize(lock2) {
                        sum += processedArray[numberOfValues];
                        numberOfValues++;
                    }       

                }   
            });
            threadsArray[i].start();
        }
//Here is the second for loop joining all the threads after summing:

        for (int i = 0; i < threadsArray.length; i++) {
            try {
                threadsArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
//Main:

    public static void main(String args[]) {
        initializeArray();
        for (int i = 0; i < threadsArray.length; i++) {
            System.out.println(processedArray[i]);
        }

        System.out.println("Sum: " + sum);
        
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i, String.valueOf(i));
        }
 
        // using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String s : numbers)
            sb.append(s);
        System.out.println(sb.toString());
 
        // using StringBuffer
        StringBuffer sb1 = new StringBuffer();
        for (String s : numbers)
            sb1.append(s);
        System.out.println(sb1.toString());
 
        
    }
}
