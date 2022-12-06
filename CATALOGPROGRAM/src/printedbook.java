/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class printedbook extends books {
    private int numberofpages;

    static  int id=0;

    /**
     *
     * @param name
     * @param author
     * @param publisher
     * @param language
     * @param Publishdate
     * @param numberofpages
     * @param price
     */
    public printedbook(String name, String author, String publisher, String language, String Publishdate,int numberofpages,double price) {
        super(name, author, publisher, language, Publishdate,price);
        this.numberofpages=numberofpages;
        id++;
        super.setCode("PB-"+id);
           
    }

 
    public int getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }

    @Override
    public String toString() {
        return "type:"+"printedbook"+"\n"+super.toString()+"\n"+ "numberofpages=" + numberofpages +"\n";
    }
    
 
     
}
