/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trainingprogram;

import java.util.Scanner;

/**
 *
 * @author egese
 */
public class TrainingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Welcome to training program");
        
        String trainings="Valid sports moves\n"
                        +"Burpee\n"
                        +"Pushup\n"
                        +"Situp\n"
                        +"Squat\n";
        System.out.println(trainings);
        System.out.println("Please create a training program");
        
        System.out.println("number of Burpee");
        int burpee=scanner.nextInt();
        
        System.out.println("number of Pushup");
        int pushup=scanner.nextInt();
        
        System.out.println("number of situp");
        int situp=scanner.nextInt();
        
        System.out.println("number of squat");
        int squat=scanner.nextInt();
        scanner.nextLine();
        
        Training training=new Training(burpee, pushup, situp, squat);
        System.out.println("Training is starting...");
        
        while (training.istrainingfinished()) {            
            System.out.println("Move Type(Burpee,Pushup,Situp,Squat)");
            String type=scanner.nextLine();
            System.out.println("How many move will you do that move type?");
            int num=scanner.nextInt();
            scanner.nextLine();
            training.Dosport(type, num);
        }
    }
    
}
