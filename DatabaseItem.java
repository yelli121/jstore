package jstore;

/**
 * Kelas digunakan sebagai informasi database dari item
 *
 * @author Yelli Yulfita
 * @version 28/2/2019
 */
public class DatabaseItem
{
    //variabel yang digunakan
    private String[] listItem;
    private Item item;
    public static Item itemDB;

    //Menambah item
    /**
     * Method addItem()
     * @param item
     * @return false
     */
    
    public DatabaseItem()
    {
        
    }
    
    
    public static boolean addItem(Item item)
    {
        item=item;
        return true;
    }
    
    //Mengapus item
    /**
     * Method removeItem()
     * @param item
     * @return false
     */
    
    public static boolean removeItem(Item item)
    {
        return false;
    }
    
    //Menampilkan item
    /**
     * Method getItem()
     * @return item
     */
    public Item getItem()
    {
        return itemDB;
    }
    
    //Menampilkan list item
    /**
     * Method getItemDatabase()
     * @return listItem
     */
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
