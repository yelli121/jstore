package jstore;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JStore
{
    
        
    public JStore()
    {
		
    }
    
    public static void main(String[] args)
    {
		SpringApplication.run(JStore.class, args);	
		
		Location location  = new Location("serang", "banten", "debus");

		try
		{
			DatabaseSupplier.addSupplier(new Supplier("yelli", "yulfitayelli@gmail", "087774170558", location));
		}
		catch (SupplierAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
	      
		try
		{
			DatabaseSupplier.addSupplier(new Supplier("yulfi", "yulfitayelli@gmail", "087774170558", location));
		}
		catch (SupplierAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}		   
	   
		try
		{
			DatabaseSupplier.addSupplier(new Supplier("fita", "yulfitayelli@gmail", "087774170558", location));
		}
		catch (SupplierAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}		   	   
		   try {
			   DatabaseCustomer.addCustomer(new Customer("yeye", "yulfitayelli@gmail.com", "yelli12345", "1", 10, 10, 1999));
		   }
		   catch (CustomerAlreadyExistsException e)
		   {
		   	System.out.println (e.getExMessage());

		   }


		try
		{
			DatabaseItem.addItem(new Item("yelli", 10, DatabaseSupplier.getSupplier(1), ItemStatus.New, ItemCategory.Funiture));
		}
		catch (ItemAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
		
		try
		{
			DatabaseItem.addItem(new Item("yulfi", 10, DatabaseSupplier.getSupplier(2), ItemStatus.New, ItemCategory.Electronics));
		}
		catch (ItemAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}		
		
		try
		{
			DatabaseItem.addItem(new Item("fita", 10, DatabaseSupplier.getSupplier(3), ItemStatus.New, ItemCategory.Stationery));
		}
		catch (ItemAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}			
		
		try
		{
			DatabaseItem.addItem(new Item("yel", 10, DatabaseSupplier.getSupplier(1), ItemStatus.New, ItemCategory.Stationery));
		}
		catch (ItemAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}		
    }
}
