/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class games extends multimedias{
    private String producer;
    private String genre;

    public games(String name,String producer, String genre,double price) {
        super(name,price);
        this.producer = producer;
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+"producer=" + producer + "\n"+ "genre=" + genre;
    }
    
}
