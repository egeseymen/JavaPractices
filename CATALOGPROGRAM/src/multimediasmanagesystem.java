/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ege
 */
public class multimediasmanagesystem {
    multimedias[] m1;
    public multimediasmanagesystem(){
        m1=new multimedias[7];
    }
    public void simulate(){
        magazine mag2=new magazine("populerscience", "john", "----", "---", "egnlish",123);
        printedbook pb1=new printedbook("the martian", "Dostoyevski ", "---", "ege", "16/07/1",213, 432);
        ebook e1=new  ebook("algorithms", "cormen", "----", "english", "16/07/---", 22, 33,123);
        musicCd mus1=new musicCd("müzik","hadise", "netd", 10, 4,123);
         musicCd mus2=new musicCd("müzik","hadise", "netd", 10, 4,123);
        movieBlueray mb1=new movieBlueray("wqewq", "qweqw", "qweqw", "wqewqe", "wqeqwe",123);
        computervideogame cp1=new computervideogame("assasincreed", "ubisoft", "-----", "english", "windows",123);
        consolevideogame cs1=new consolevideogame("qwewq", "qwewqe", "wqewqewqe","wqewqe", "wqewqewq",123);
        System.out.println(mag2);
        System.out.println(e1);
        System.out.println(pb1);
        System.out.println(mus1);
        System.out.println(mus2);
        System.out.println(mb1);
        System.out.println(cp1);
        System.out.println(cs1);
        
    }
    public void showinfos(){
        
    }
}
