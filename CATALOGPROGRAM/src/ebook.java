/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class ebook extends books {
    private int filesize;
    private int fileformat;
    static  int id=0;
    public ebook(String name, String author, String publisher, String language, String Publishdate,int filesize,int fileformat,double price) {
        super(name, author, publisher, language, Publishdate,price);
        this.filesize=filesize;
        this.fileformat=fileformat;
        id++;
        super.setCode("EB-"+id);
    }

   

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public int getFileformat() {
        return fileformat;
    }

    public void setFileformat(int fileformat) {
        this.fileformat = fileformat;
    }

    @Override
    public String toString() {
        return "type:"+"ebook"+"\n"+super.toString()+"\n"+
               "filesize:" +this.filesize+"\n"+
                "fileformat:"+this.fileformat+"\n";
              
    }
    
}
