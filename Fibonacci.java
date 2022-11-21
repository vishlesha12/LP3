/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Program to calculate fibonacci by iterative approach
package fibonacci;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author student
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int prenumber=0;
        int nextnumber=1;
        int sum=0;
        
        System.out.println("Enter numbers you want to display in fibonacci");
        Scanner sin=new Scanner(System.in);
        int n=sin.nextInt();
        System.out.println("Fibonaci("+n+") is:");
         
                long start1 = System.nanoTime();
        for(int i=1;i<=n;i++)
        {
           System.out.print(prenumber+"  ");
           sum=prenumber+nextnumber;
           prenumber=nextnumber;
           nextnumber=sum;
              
            
        }
           long end1 = System.nanoTime();
         
        System.out.println();
        
       
        System.out.println("Total time required   "+(end1-start1));
        
        
                
        // TODO code application logic here
    }
    
}
