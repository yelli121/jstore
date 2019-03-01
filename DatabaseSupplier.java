package jstore;


/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseSupplier
{
    private String listSupplier;
    private Supplier supplier;
    
    public void addSupplier(Supplier supplier){
        this.supplier =supplier;
        
}
public void removeSupplier (Supplier supplier){
    this.supplier=supplier;
}
public String getSupplier(){
    return "0";
}
public String getListSupplier(){
return "0";
}
public void printData(){
    System.out.println ("DatabaseSupplier");
}
}



