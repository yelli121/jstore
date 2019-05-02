package jstore;

import java.util.*;

/**
 * Mendefinisikan database dari item. Kelas menyimpan data dari semua
 * objek item sebagai produk yang dijual untuk basis data.
 *
 * @author Yelli Yulfita
 * @since 28-2-2019
 */

public class DatabaseItem
{
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<>();
	private static int LAST_ITEM_ID = 0;

    /**
     * Mengambil nilai dari listItem, yaitu daftar dari produk yang ada
     * pada basis data
     * 
     * @return listItem daftar dari produk atau item pada basis data
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
	public static int getLastItemId()
	{
		return LAST_ITEM_ID;
	}
	
	public static boolean addItem(Item item) throws ItemAlreadyExistsException
	{
		for(Item i : ITEM_DATABASE)
		{
			if(i.getName().equals(item.getName()) &&
				i.getSupplier().equals(item.getSupplier()) &&
				i.getCategory().equals(item.getCategory()) &&
				i.getStatus().equals(item.getStatus())
				)
			{				
				throw new ItemAlreadyExistsException(i);
			}
		}		
		
		ITEM_DATABASE.add(item);
		LAST_ITEM_ID = item.getId();		
		
		return true;
	}
	
	public static Item getItemFromId(int id)
	{
		for(Item i : ITEM_DATABASE)
		{
			if(i.getId() == id)
				return i;
		}
		
		return null;
	}
	
	public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
	{
		ArrayList<Item> sub = new ArrayList<>();
		
		for(Item i : ITEM_DATABASE)
		{
			if(i.getSupplier() == supplier)
				sub.add(i);
		}
	
		if(sub.size() == 0)
			return null;
		else
			return sub;
	}
	
	public static ArrayList<Item> getItemFromCategory(ItemCategory category)
	{
		ArrayList<Item> sub = new ArrayList<>();
		
		for(Item i : ITEM_DATABASE)
		{
			if(i.getCategory() == category)
				sub.add(i);
		}
	
		if(sub.size() == 0)
			return null;
		else
			return sub;
	}
	
	public static ArrayList<Item> getItemFromStatus(ItemStatus status)
	{
		ArrayList<Item> sub = new ArrayList<>();
		
		for(Item i : ITEM_DATABASE)
		{
			if(i.getStatus() == status)
				sub.add(i);
		}
	
		if(sub.size() == 0)
			return null;
		else
			return sub;
	}
	
    /**
     * Menghapus objek item yang telah ada pada basis data.
     * 
     * @param item objek item yang ingin dihapus dari basis data
     * @return false
     */
    public static boolean removeItem(int id) throws ItemNotFoundException
    {
		for(Item i : ITEM_DATABASE) {
			if (i.getId() == id) {
				ITEM_DATABASE.remove(i);
				return true;
			}
		}
		throw new ItemNotFoundException(id);
    }
}
