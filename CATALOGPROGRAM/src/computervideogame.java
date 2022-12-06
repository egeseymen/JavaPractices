/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class computervideogame extends games {
    private String language;
    private  String OPsystem;
    static  int id=0;
    public computervideogame( String name, String producer, String genre,String language,String OPsystem,int price) {
        super(name, producer, genre,price);
        this.language = language;
        this.OPsystem=OPsystem;
               id++;
        super.setCode( "PC-"+id);
            
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOPsystem() {
        return OPsystem;
    }

    public void setOPsystem(String OPsystem) {
        this.OPsystem = OPsystem;
    }

    @Override
    public String toString() {
        return "type:"+"computergames"+"\n"+super.toString()+"\n" + "language=" + language+"\n" + "OPsystem=" + OPsystem +"\n";
    }
    
    

  
}
