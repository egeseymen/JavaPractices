/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

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
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6};
        
        int[][] array2=new int[2][2];
        
        array2[0][0]=10;
        array2[0][1]=20;
        array2[1][0]=30;
        array2[1][1]=40;
        
        int[][] array3={{10,20},
                        {30,40}};
        int[][] array4=new int[2][2];
        Scanner scanner=new Scanner(System.in);
        
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                array4[i][j]=scanner.nextInt();
            }
        }
        
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
