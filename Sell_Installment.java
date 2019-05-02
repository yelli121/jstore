package jstore;

import java.util.*;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
	private Customer customer;
	private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
        isActive = true;
    }

    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }

    public int getInstallmentPrice()
    {
        return installmentPrice;
    }

	public Customer getCustomer()
	{
		return customer;
	}

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }

    public void setInstallmentPrice()
    {
        this.installmentPrice = (((getTotalPrice()/installmentPeriod)*102)/100);
    }

    public void setTotalPrice()
    {
        //totalPrice = installmentPrice * installmentPeriod;
    }

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public void setInvoiceStatus(InvoiceStatus status)
	{
		INVOICE_STATUS = status;
	}

	public String toString()
	{
		String output = "============Sell Installment============\n";

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
