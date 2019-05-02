package jstore;

import java.util.*;

/**
 * Mendefinisikan database dari supplier. Kelas menyimpan data dari semua
 * objek supplier sebagai penyedia produk atau penjual item 
 * untuk basis data.
 *
 * @author Yelli Yulfita
 * @version 28-04-2019
 */

public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
	private static int LAST_INVOICE_ID = 0;

	public static ArrayList<Invoice> getInvoiceDatabase()
	{
		return INVOICE_DATABASE;
	}
	
	public static int getLastInvoiceId()
	{
		return LAST_INVOICE_ID;
	}
    
    /**
     * Menambahkan objek supplier baru pada basis data.
     * 
     * objek supplier baru yang ingin dimasukan dalam basis data
     * @return false
     */    
    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {
		for(Invoice i : INVOICE_DATABASE)
		{
			if(i.getCustomer().equals(invoice.getCustomer()) &&
				i.getItem().equals(invoice.getItem())
				)
			{				
				throw new InvoiceAlreadyExistsException(i);
			}
		}		
		
		
		INVOICE_DATABASE.add(invoice);
		LAST_INVOICE_ID = invoice.getId();
		
        return true;
    }
	
    /**
     * Mengambil nilai dari variabel supplier, yaitu objek supplier yang
     * ada pada basis data
     * 
     * @return item supplier item yang ingin diambil nilainya
     */    
    public static Invoice getInvoice(int id)
    {
		for(Invoice i : INVOICE_DATABASE)
		{
			if(i.getId() == id)
				return i;
		}
		
        return null;
    }	
	
	public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
	{
		ArrayList<Invoice> out = new ArrayList<>();
		
		for(Invoice i : INVOICE_DATABASE)
		{
			if(i.getIsActive() == true &&
				i.getCustomer() == customer)
			{
					out.add(i);
			}
		}

		if(out.size() == 0)
			throw new CustomerDoesntHaveActiveException(customer);
		
		return out;
	}
	
    /**
     * Menghapus objek supplier yang telah ada pada basis data.
     * 
     * @param supplier objek supplier yang ingin dihapus dari basis data
     */    
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
		for(Invoice i : INVOICE_DATABASE)
		{
			if(i.getId() == id)
			{
				if(i.getIsActive() == true)
				{
					i.setIsActive(false);
				}				
				
				INVOICE_DATABASE.remove(i);
					
				return true;
			}
		}				
				
		throw new InvoiceNotFoundException(id);
    }	
}
