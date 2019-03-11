
/**
 * Kelas Database dari Item.
 *
 * @author Yelli Yulfita
 * @version 27-02-2019
 */
public class DatabaseItem 
{
    private static String[] listItem; //variabel yang dipakai
    private static Item item;
    public boolean addItem (Item item) {//Menambah Item
      return false;
    }
    /**metode addItem()
     * @param item
     * @return false
     */
    public boolean removeItem (Item item){ //Menghapus item
        return false;
    }
    
    /**metode removeItem()
     * @param item
     * @return false
     */
    
    public Item getItem(){ //Menampilkan item
        return item;
    }
    /** Metode getItem()
     * @return item
     */
    
    public String[] getItemDatabase(){ //Menampilkan list Item
        return listItem;
        
    }
    /** Metode getItemDatabase()
     * @return listItem 
     */
    
}

