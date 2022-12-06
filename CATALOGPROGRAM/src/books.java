/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class  books extends readables {
    private String language;
    private String Publishdate;

    public books(String name, String author, String publisher,String language,String Publishdate,double price) {
        super(name, author, publisher,language,price);
        this.language=language;
        this.Publishdate=Publishdate;
    }

 


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublishdate() {
        return Publishdate;
    }

    public void setPublishdate(String Publishdate) {
        this.Publishdate = Publishdate;
    }

    @Override
    public String toString() {
        return super.toString()
                +"language:"+this.language+"\n"
                +"publishdate: "+this.Publishdate;
    }
    
    
}
