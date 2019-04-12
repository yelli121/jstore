/**
 * @author Yelli Yulfita
 * @version 21-03-2019

**/
import java.util.ArrayList;
public class DatabaseSupplier
{
    //variabel yang dipakai
    private static ArrayList<Supplier> SUPPLIER_DATABASE=new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID=0;

    //Menambah supplier
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static boolean addSupplier(Supplier supplier)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName()!=supplierDB.getName()&&supplier.getEmail()!=supplierDB.getEmail()&&supplier.getPhoneNumber()!=supplierDB.getPhoneNumber())
            {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID=supplier.getId();
            value=true;
            }
        }
        return value;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier(int id)
    {
        Supplier value=null;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                value=supplierDB;
            }
        }
        return value;
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public static boolean removeSupplier(int id)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
}
