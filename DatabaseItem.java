package jstore;


/**
 * Write a description of class Location here.
 *
 * @author Yelli Yulfita
 * @version 14-03-2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private String[] listItem;
    private static Item itemDB;
    

    /**
     * Constructor for objects of class DatabaseItem
     */
    public static boolean addItem(Item item)
    {
        itemDB = item;
        return true;
    }

    public static boolean removeItem(Item item)
    {
        return true;
    }
    
    public static Item getItem()
    {
        return itemDB;
    }
    
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
