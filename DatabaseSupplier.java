/**
 * @author Yelli Yulfita
 * @version 21-03-2019

**/

/**
 * Kelas digunakan sebagai informasi database dari supplier
 *
 * @author Jihad Rafsanjani
 * @version 28/2/2019
 */
public class DatabaseSupplier
{
    //variabel yang dipakai
    private String[] listSupplier;
    private static Supplier supplier;

    //Menambah supplier
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static boolean addSupplier(Supplier supplier)
    {
        return false;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public static void removeSupplier(Supplier supplier)
    {
        
    }
    
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public String[] getListSupllier()
    {
        return listSupplier;
    }
}
