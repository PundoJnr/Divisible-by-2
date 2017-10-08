/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import java.util.Scanner;
/**
 *
 * @author Pundo
 */
public class Types {
    /*There are two types of exceptions
    1.Checked 
    2. unchecked
    
    difference is that the checked exceptions are checked while compiled and the unchecked are checked at runtime.
    
    an example of a checked exception is the thread.sleep() that throws an interruptedException.
    the other exceptions that are cheked at runtime such as divide by zero are unchecked.
    */
   public static void main(String[] args){
       System.out.println("Enter a number");
       
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       if(x%2==0){
           System.out.println(x+" is an even number ");
       }else{
           System.out.println(x+" is an odd number");
       }
   }
}
