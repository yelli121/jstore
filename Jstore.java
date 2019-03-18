package jstore;


/**
 * Write a description of class JStore here.
 *
 * @author Yelli Yulfita
 * @version 14 Maret 2019
 */
public class JStore
{
    public static void main(String[] args){
    Anggota anggota1 = new Anggota ("Yelli",StatusAnggota.Active,"ya");
    Anggota anggota2 = new Anggota ("Yelli",StatusAnggota.Inactive,"ya");
    Anggota anggota3 = new Anggota("Yelli",StatusAnggota.Out,"ya");
    
    System.out.println(anggota1.toString());
    System.out.println(anggota2.toString());
    System.out.println(anggota3.toString());
    
    
    
    }

   
    
   
    
   
}

   
