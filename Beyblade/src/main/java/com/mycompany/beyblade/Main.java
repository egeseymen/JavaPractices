/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

import java.util.Scanner;

/**
 *
 * @author egese
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade programına hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basınız...");
        
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Hangi beyblade'i üretmek istiyorsunuz");
            String islem=scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }else{
                BeybladeFabrikası fabrika=new BeybladeFabrikası();
                Beyblade beyblade=fabrika.beybladeüret(islem);
                if (beyblade==null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                }else{
                    beyblade.bilgilerigöster();
                    beyblade.saldır();
                    beyblade.kutsalcanavarortayaçıkar();
                }
            }
        }
    }
}
