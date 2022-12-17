/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_operations;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author egese
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static int[] fillthearray(int length){
        Scanner scanner=new Scanner(System.in);
        int[] output=new int[length];
        
        for (int i = 0; i < length; i++) {
            output[i]=scanner.nextInt();
        }
        
        return output;
        
    }
    public static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+". element of array:"+arr[i]);
        }
    }
    public static void array_sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("---Sorted array---");
        printarray(arr);
    }
    public static void main(String[] args) {
        int[] a=fillthearray(4);
        System.out.println("Unsorted array");
        printarray(a);
        array_sort(a);
        
        int[] a1={1,2,3,4,5,6};
        int[] a2={1,2,3,4,5,6};
        
        if (a1==a2) {
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        
        if (Arrays.equals(a1, a2)) {
            System.out.println("is equal as content");
        }else{
            System.out.println("is not equal as content");
        }
    }
    
}
