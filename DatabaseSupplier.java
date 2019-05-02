package jstore;

import java.util.*;

/**
 * Mendefinisikan database dari supplier. Kelas menyimpan data dari semua
 * objek supplier sebagai penyedia produk atau penjual item 
 * untuk basis data.
 *
 * @author Yelli Yulfita
 * @since 28-2-2019
 */

public class DatabaseSupplier
{
	private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<>();
	private static int LAST_SUPPLIER_ID = 0;

	public static ArrayList<Supplier> getSupplierDatabase()
	{
		return SUPPLIER_DATABASE;
	}
	
	public static int getLastSupplierId()
	{
		return LAST_SUPPLIER_ID;
	}
	
	public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException
	{
		for(Supplier i : SUPPLIER_DATABASE)
		{
			if(i.getEmail().equals(supplier.getEmail()) ||
				i.getPhoneNumber().equals(supplier.getPhoneNumber())
				)
			{
				throw new SupplierAlreadyExistsException(i);
			}		
		}
		
		SUPPLIER_DATABASE.add(supplier);
		LAST_SUPPLIER_ID = supplier.getId();		
		
		return true;					
	}

    /**
     * Mengambil nilai dari variabel supplier, yaitu objek supplier yang
     * ada pada basis data
     * 
     * @return item supplier item yang ingin diambil nilainya
     */    
    public static Supplier getSupplier(int id)
    {
		for(Supplier i : SUPPLIER_DATABASE)
		{
			if(i.getId() == id)
				return i;
		}
		
		return null;
    }
    
    /**
     * Menghapus objek supplier yang telah ada pada basis data.
     * 
     * @param supplier objek supplier yang ingin dihapus dari basis data
     */    
    public static boolean removeSupplier(int id) throws SupplierNotFoundException
    {
		for(Supplier i : SUPPLIER_DATABASE)
		{
			if(i.getId() == id)
			{
				ArrayList<Item> sub = DatabaseItem.getItemFromSupplier(i);
				
				for(Item j : sub)
				{
					try
					{
						DatabaseItem.removeItem(j.getId());
					}
					catch(ItemNotFoundException e)
					{
						System.out.println(e.getExMessage());
					}
				}
				
				SUPPLIER_DATABASE.remove(i);
				
				return true;				
			}
		}		
		
		throw new SupplierNotFoundException(id);
    }
}
