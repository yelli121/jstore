package jstore;

/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Transaction
{
    public static void orderNewItem(ArrayList<Integer> item_list)
    {
        Invoice buyPaid = new Buy_Paid(item_list);

		try
		{
			DatabaseInvoice.addInvoice(buyPaid);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
	}
    
    public static void orderSecondItem(ArrayList<Integer> item_list)
	{
        Invoice buyPaid = new Buy_Paid(item_list);

		try
		{
			DatabaseInvoice.addInvoice(buyPaid);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
    }
    
    public static void orderRefurbishedItem(ArrayList<Integer> item_list)
    {
        Invoice buyPaid = new Buy_Paid(item_list);

		try
		{
			DatabaseInvoice.addInvoice(buyPaid);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
	}
    
    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer)
    {
        Invoice sellPaid = new Sell_Paid(item_list, customer);

		try
		{
			DatabaseInvoice.addInvoice(sellPaid);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
    }
    
    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer)
    {
        Invoice sellUnpaid = new Sell_Unpaid(item_list, customer);
		
		try
		{
			DatabaseInvoice.addInvoice(sellUnpaid);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}

    }
    
    public static void sellItemInstallment(ArrayList<Integer> item_list,
                Customer customer, int installmentPeriod)
    {
        Invoice sellInstallment = new Sell_Installment(item_list,
									installmentPeriod, customer);


		try
		{
			DatabaseInvoice.addInvoice(sellInstallment);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}
    }    
        
	public static boolean finishTransaction(Invoice invoice)
	{
		if(invoice.getIsActive() == false)
		{
			return false;
		}		
		
		Invoice finish = DatabaseInvoice.getInvoice(invoice.getId());
		
		if(finish == null)
			return false;
				
		System.out.println("Status aktif invoice: " + finish.getIsActive());
		
		return true;
	}
	
	public static boolean cancelTransaction(Invoice invoice)
	{
		if(invoice.getIsActive() == false)
		{
			return false;
		}		
		
		Invoice cancel = DatabaseInvoice.getInvoice(invoice.getId());

		boolean out = false;

		try
		{
			out = DatabaseInvoice.addInvoice(cancel);
		}
		catch(InvoiceAlreadyExistsException e)
		{
			System.out.println(e.getExMessage());
		}

		if(out)
			return true;
		else
			return false;		
	}
}
