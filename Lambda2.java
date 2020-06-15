/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

interface Square 
{ 
    int calculate(int x); 
} 
interface Add 
{ 
    int calculate(int y); 
} 
interface Subtract
{ 
    int calculate(int z); 
} 
interface Multiply 
{ 
    int calculate(int p); 
} 
interface Divide 
{ 
    int calculate(int q); 
} 
  
class Lambda2 
{ 
    public static void main(String args[]) 
    { 
        int a = 5; 
        // lambda expression to define the calculate method 
        Square s = (int x)->x*x; 
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.calculate(a); 
        System.out.println(ans); 
        
        
        int b = 5; 
        Add s1 = (int y)->y+y; 
        int ans2 = s1.calculate(b); 
        System.out.println(ans2); 
        
        int c = 5; 
        Subtract s2 = (int z)->z-z; 
        int ans3 = s2.calculate(c); 
        System.out.println(ans3); 
        
        
        int d = 5; 
        Multiply s3 = (int p)->p*p; 
        int ans4 = s3.calculate(d); 
        System.out.println(ans4); 
        
        
        int e = 5; 
        Divide s4 = (int q)->q/q; 
        int ans5 = s4.calculate(e); 
        System.out.println(ans5); 
    } 
} 