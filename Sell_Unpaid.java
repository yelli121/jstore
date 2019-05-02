package jstore;

import java.util.*;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
	private Customer customer;
	private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)   
    {
        // initialise instance variables        
        super(item);
        this.customer = customer;
		
		dueDate = new GregorianCalendar();
		dueDate.add(Calendar.DATE, 1);
		
		isActive = true;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }    
	
	public Customer getCustomer()
	{
		return customer;
	}
    
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public void setDueDate(Calendar dueDate)
	{
		this.customer = customer;
	}
	
	public void setInvoiceStatus(InvoiceStatus status)
	{
		INVOICE_STATUS = status;
	}		

	public String toString()
	{
		String output = "============Sell Unpaid============\n";	
	
		for(int i : super.getItem())
		{
			Item j = DatabaseItem.getItemFromId(i);
			
			String itemIteration =  "Id			: " + j.getId() + "\n" +
									"Name		: " + j.getName() + "\n" +

									"Price		: " + j.getPrice() +  "\n" +
									"Category 	: " + j.getCategory() + "\n" +
									"Status		: " + j.getStatus() + "\n\n";
									
			output += itemIteration;
		}
		
		output += "\n";
				
		return output;
	}
}
