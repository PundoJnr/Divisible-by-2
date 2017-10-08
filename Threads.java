/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Scanner;

 
/* 
Java is a multithreaded programming language, this means that our program can make optimal use of available resources by 
running two or more components concurrently, with each component handling a different task.
you can subdivide specific operations within a  single application into individual threads that all run in parallel.
Creating a thread:
1.Extend the thread class //inheritance
        inherit from the thread class, override its run()method and write a functionality of the thread in the run().
           Then create a new object of your class and call it start method to run the thread.

2. Implementing the Runnable interface
        implement the run() then create a new thread object, pass the runnable class to its constructor and start 
\the thread by calling start()
thread.sleep() method pauses the thread for the specified number of time
threa.sleep(1000) pauses the thread for 1 second, the sleep() method throws an interruptedException hence must be surrounded with try/catch block.
*/
/**
 *
 * @author Pundo
 */
 /*    
        
    class Loader extends Thread{
        public void run(){
            System.out.println("Pundis");
        }
    }
    class MyClass {
       public static void main(String[] args){
            Loader obj = new Loader();
            obj.start();
        }

 
     }*/

class Clare {
    public static void main (String[] args){
        System.out.println("Enter any number");
     Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();
   int y = x%2;
     System.out.println(y);
     if( y == 0){
         System.out.println("This is divisible by 2");
     }else{
         System.out.println("This isnt divisible by 2");
     }
    }
}
