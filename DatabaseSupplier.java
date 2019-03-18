package jstore;


/**
 * Write a description of class Location here.
 *
 * @author Yelli Yulifta
 * @version 14-03-2019
 */
public class DatabaseSupplier
{
    // variabel yang dipakai
    private String[] listSupplier;
    private Supplier supplier;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    public static boolean addSupplier(Supplier supplier)
    {
        return true;
    }

    public static boolean removeSupplier(Supplier supplier)
    {
        return true;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    public String[] getListSupplier()
    {
        return listSupplier;
    }
}
