/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author egese
 */
public class BeybladeFabrikası {
    public Beyblade beybladeüret(String beyblade_türü){
        if (beyblade_türü.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal canavarla konuşma");
        }else if (beyblade_türü.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı anka kuşu");
        }else if (beyblade_türü.equals("Drayga")) {
            return new Drayga("Kai", 600, 400, "Beyaz Kaplan");
        }else if (beyblade_türü.equals("Draciel")) {
            return new  Draciel("Max", 400, 1000, "Kara kaplumbağa");
        }else{
            return null;
        }
    }
}
