/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class movieBlueray extends multimedias {
    private String studio;
    private String director;
    private String genre;
    private String language;
  
    static  int id=0;
    public movieBlueray( String name,String studio, String director, String genre, String language,int price) {
        super(name,price);
        this.studio = studio;
        this.director = director;
        this.genre = genre;
        this.language = language;
        id++;
        super.setCode("MB-"+id);
    
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "type:"+"moviebluray"+"\n"+super.toString()+"\n" + "studio=" + studio +"\n" +" director=" + director + "\n"+" genre=" + genre + "\n"+" language=" + language+"\n" ;
    }
    
}
