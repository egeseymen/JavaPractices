/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author egese
 */
public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliyetenek;

    public Dragon(String beybladesahibi, int donusHızı, int saldiriGucu,String kutsalCanvar,String gizliyetenek) {
        super(beybladesahibi, donusHızı, saldiriGucu);
        this.kutsalCanavar=kutsalCanvar;
        this.gizliyetenek=gizliyetenek;
    }

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster(); 
        System.out.println("Kutsal canavar adı:"+kutsalCanavar);
        System.out.println("Gizli yetenek:"+gizliyetenek);
    }

    @Override
    public void kutsalcanavarortayaçıkar(){
        System.out.println(getBeybladesahibi()+" "+kutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getBeybladesahibi()+" in Saldırısı: Hayalet Kasırgası");
    }
    
    
}
