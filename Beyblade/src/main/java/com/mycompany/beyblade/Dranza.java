/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author egese
 */
public class Dranza extends Beyblade{
    private String kutsalCanavar;

    public Dranza(String beybladesahibi, int donusHızı, int saldiriGucu,String kutsalCanavar) {
        super(beybladesahibi, donusHızı, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster(); 
        System.out.println("Kutsal canavar adı:"+kutsalCanavar);
    }

    @Override
    public void kutsalcanavarortayaçıkar() {
        System.out.println(getBeybladesahibi()+" "+kutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getBeybladesahibi()+" in Saldırısı: Alev kılıcı");
    }
    

    
    
}
