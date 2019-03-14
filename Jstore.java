package jstore;


/**
 * Write a description of class Jstore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jstore 
{
    public static void main(String[] args)
    {
     Location locationme =new Location("Serang","Banten","Pulau Jawa");
     Supplier supplierme = new Supplier(1,"Yelli","yelli.yulfita@ui.ac.id",
     "087774170558",locationme);
     Item itemme = new Item (1,"Yelli",50,51,"Tersedia",supplierme);
     Invoice voice = new Invoice(2,itemme,"coba",20);
     supplierme.printData();
     supplierme.setName("Nanda");
     itemme.printData();
     
    
     
     
     
     
    }
}
   
    

            

