/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class consolevideogame extends games {
    private String language;
    private String platform;
   
    static  int id=0;
    public consolevideogame( String name, String producer, String genre,String language,String platform,double price){
        super(name, producer, genre,price);
        this.language = language;
        this.platform=platform;
               id++;
        super.setCode("CS-"+id);
            
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "type:"+"videogames"+"\n"+super.toString() +"\n"+"language=" + language +"\n"+ " platform=" + platform ;
    }

        

}
