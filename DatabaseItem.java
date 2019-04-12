/**
 * Kelas digunakan sebagai informasi database dari item
 *
 * @author Yelli Yulfita
 * @version 28/2/2019
 */
import java.util.ArrayList;
public class DatabaseItem
{
    //variabel yang dipakai
    private static ArrayList<Item> ITEM_DATABASE=new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;

    //Menambah item
    /**
     * Method addItem()
     * @param item
     * @return true
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    //Mengapus item
    /**
     * Method removeItem()
     * @param item
     * @return true
     */
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    //Menampilkan item
    /**
     * Method getItem()
     * @return item
     */
    public static boolean addItem(Item item)
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()!=itemDB.getName()&&item.getStatus()!=itemDB.getStatus()&&item.getSupplier()!=itemDB.getSupplier())
            {
            ITEM_DATABASE.add(item);
            //tambahan
            LAST_ITEM_ID=item.getId();
            value=true;
            }
        }
        return value;
    }
    
    //Menampilkan list item
    /**
     * Method getItemDatabase()
     * @return listItem
     */
    public static Item getItemFromID(int id)
    {
        Item value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                value=itemDB;
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier()==supplier)
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status.getStatus())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static boolean removeItem(int id)
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
}