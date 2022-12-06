/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class musicCd extends multimedias {
    private String artist;
    private String recordscompany;
    private  int numberofsongs;
    private  int numberofdiscs;
   
    static  int id=0;
 

    public musicCd(String name,String artist, String recordscompany, int numberofsongs,int numberofdiscs,int price) {
        super(name,price);
        this.artist = artist;
        this.recordscompany = recordscompany;
        this.numberofsongs = numberofsongs;
        this.numberofdiscs = numberofdiscs;
       
        id++;
        super.setCode("MC-"+id);
           
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordscompany() {
        return recordscompany;
    }

    public void setRecordscompany(String recordscompany) {
        this.recordscompany = recordscompany;
    }

    public int getNumberofsongs() {
        return numberofsongs;
    }

    public void setNumberofsongs(int numberofsongs) {
        this.numberofsongs = numberofsongs;
    }

    public int getNumberofdiscs() {
        return numberofdiscs;
    }

    public void setNumberofdiscs(int numberofdiscs) {
        this.numberofdiscs = numberofdiscs;
    }

    @Override
    public String toString() {
               return 
                "type:"+"musicCd"+"\n"+super.toString()+"\n"+"artists:"+this.artist+"\n"+
                "recordscompany:"+this.recordscompany+"\n"+
                "numberofsongs:"+this.numberofsongs+"\n"+
                  "numberofdiscs:"+this.numberofdiscs+"\n";
    }

   
   
}
