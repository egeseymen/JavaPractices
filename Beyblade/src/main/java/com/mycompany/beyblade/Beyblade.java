/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author egese
 */
public class Beyblade {
    private String beybladesahibi;
    private int donusHızı;
    private int saldiriGucu;

    public Beyblade(String beybladesahibi, int donusHızı, int saldiriGucu) {
        this.beybladesahibi = beybladesahibi;
        this.donusHızı = donusHızı;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladesahibi() {
        return beybladesahibi;
    }

    public void setBeybladesahibi(String beybladesahibi) {
        this.beybladesahibi = beybladesahibi;
    }

    public int getDonusHızı() {
        return donusHızı;
    }

    public void setDonusHızı(int donusHızı) {
        this.donusHızı = donusHızı;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldır(){
        System.out.println(beybladesahibi+" "+saldiriGucu+" ve "+donusHızı+" ile saldırıyor.");
    }
    public void kutsalcanavarortayaçıkar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }
    public void bilgilerigöster(){
        System.out.println("Beybladeçi ismi: "+beybladesahibi);
        System.out.println("Donus hızı: "+donusHızı);
        System.out.println("Saldiri gücü: "+saldiriGucu);   
    }
}
