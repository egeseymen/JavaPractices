/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class magazine extends readables {
   private String issue;
   private String language;
    static String code;
    static  int id=0;
    public magazine(String name,String author, String publisher,String issue, String language,double price) {
        super(name,author, publisher,language,price);
        this.issue = issue;
        this.language = language;
       id++;
        super.setCode("MA-"+id);
            
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "type:"+"magazine"+"\n"+super.toString() + "issue=" + issue +"\n"+ "language=" + language+"\n"+"";
    }
    
    
}
