/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class multimedias {
    private String name;
    private String code;
    private double price;
    private String type;
    public multimedias(String name,double price) {
        this.name = name;
        this.price=price;

    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
      /*  public void showinf(ebook m1){
        m1.showinfo();
    }
            public void showinf(musicCd m1){
        m1.showinfo();
    }
                public void showinf(musicCd m1){
        m1.showinfo();
    }
                    public void showinf(musicCd m1){
        m1.showinfo();
    }*/

    @Override
    public String toString() {
        return "name:" +this.name+"\n"+"code:"+"\n"+this.code+"\n"+"price:"+this.price;
    }
    
    
    
}
