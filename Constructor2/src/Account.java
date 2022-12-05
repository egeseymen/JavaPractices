/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egese
 */
public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    
    
    public Account(){
        this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");
        
    }
    public Account(String isim,String email,String telefonNo){
        this("Bilgi Yok",0.0,isim,email,telefonNo);
    }
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    
    public void bilgilerigoster(){

        System.out.println("HesapNo:"+hesapNo);
        System.out.println("Bakiye:"+bakiye);
        System.out.println("isim:"+isim);
        System.out.println("email:"+email);
        System.out.println("telefonNo:"+telefonNo);
        System.out.println("------------------------");
    }
    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni bakiye:"+bakiye);
        
    }
    public void paraCekme(double miktar){
        if(miktar>1500){
            System.out.println("Bir günde 1500 TLden fazla para çekemezsiniz");
        }
        if (bakiye-miktar<0) {
            System.out.println("Yeterli bakiye yok, Bakiye:"+bakiye);
        }else{
            bakiye-=miktar;
        }
    }
    
    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
    
    
}
