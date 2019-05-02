package jstore;

import java.util.*;

/**
 * Mendefinisikan database dari supplier. Kelas menyimpan data dari semua
 * objek supplier sebagai penyedia produk atau penjual item 
 * untuk basis data.
 *
 * @author Yelli Yulfita
 * @version 25-03-2019
 */

public class DatabaseCustomer
{
	private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
	private static int LAST_CUSTOMER_ID = 0;    
    
	public static ArrayList<Customer> getCustomerDatabase()
	{
		return CUSTOMER_DATABASE;
	}
	
	public static int getLastCustomerId()
	{
		return LAST_CUSTOMER_ID;
	}
	
	public static boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException
	{
		for(Customer i : CUSTOMER_DATABASE)
		{
			if(i.getName().equals(customer.getName()) ||
				i.getEmail().equals(customer.getEmail())
				)	
			{
				throw new CustomerAlreadyExistsException(customer);
			}
		}
		
		CUSTOMER_DATABASE.add(customer);
		LAST_CUSTOMER_ID = customer.getId();
		
		return true;
	}
	
	public static Customer getCustomer(int id)
	{
		for(Customer i : CUSTOMER_DATABASE)
		{
			if(i.getId() == id)
				return i;
		}
		
		return null;
	}
	
	public static boolean removeCustomer(int id) throws CustomerNotFoundException
	{
		for(Customer i : CUSTOMER_DATABASE)
		{
			if(i.getId() == id)
			{
				CUSTOMER_DATABASE.remove(i);
				return true;				
			}
		}		
		
		throw new CustomerNotFoundException(id);
	}
	
	public static Customer getCustomerLogin(String email, String password)
	{
		for(Customer i : CUSTOMER_DATABASE)
		{
			if(i.getEmail().equals(email) &&
				i.getPassword().equals(password)
				)	
			{
				return i;
			}
		}		
		
		return null;
	}    
}
