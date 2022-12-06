/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class readables extends multimedias{
    private String author;
    private String publisher;

    public readables(String name,String author,String publisher,String language,double price) {
        super(name,price);
        this.author=author;
        this.publisher=publisher;
        
    }
    
  

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
              +"author:" +this.author+"\n"
               +"publisher" +this.publisher+"\n";
    }
    
    
    
}
