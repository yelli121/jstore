/**
 * @author Yelli Yulfita
 * @version 21-03-2019

**/
import java.util.ArrayList;
   public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;
    /**
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public DatabaseSupplier()
    {
        
    }
    
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
   
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if((temp.getName() == supplier.getName()) && 
            (temp.getEmail() == supplier.getEmail()) && 
            (temp.getPhoneNumber() == supplier.getPhoneNumber())) 
            {
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID++;
        return true;
    }
    public static Supplier getSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    public static boolean removeSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id)
            {
                DatabaseItem.getItemFromSupplier(temp).clear();
                return true;
            }
        }
        return false;
    }
}
