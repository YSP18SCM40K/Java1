
package lambda;

public class Lambda {
    public static void main(String args[]) 
    { 
        // create anonymous inner class object 
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("Scenario 1");
                System.out.println("Square of 2 is 4");  
            } 
        }).start();
        
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("Scenario 2");
                System.out.println("1 + 2 is equals to 3."); 
            } 
        }).start();
        
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("Scenario 3");
                System.out.println("1 * 2 is equals to 2."); 
            } 
        }).start();
        
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("Scenario 4");
                System.out.println("1 / 2 is equals to 0.5");  
            } 
        }).start();
        
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("Scenario 5");
                System.out.println("1 - 2 is equals to -1.");  
            } 
        }).start();
        
        
    } 
} 
    