/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author egese
 */
public class Arrays {


    public static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element: "+(i+1)+":"+arr[i]);
        }
    }
    public static double findmean(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];            
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[] a=new int[5];
        int[] b={10,20,30};
        
        printarray(b);
        System.out.println("The mean of array is "+findmean(b)+".");
        Scanner scanner=new Scanner(System.in);
      /*  for (int i = 0; i < 5; i++) {
            a[i]=scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]); 
        }
        double[] b;
       int[] c={1,2,3,4,5,6,7,8,9,10};
        System.out.println(c[0]);
        */
      
      
    }
    
}
