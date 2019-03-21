
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Yelli Yulfita
 * @version 28-03-2019
 */
public class Buy_Paid extends Invoice
{
    private InvoiceType INVOICE_TYPE =  InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS =  InvoiceStatus.PAID;
    
    
    public Buy_Paid(int id, Item item, String date, int totalItem, int totalPrice)
    {
       super(id, item, date, totalItem, totalPrice);        
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void printData()
    {
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item yang terdapat :" + getItem().getName());
        
        System.out.println("Total harga :" + totalPrice);
        System.out.println("Status :" + getInvoiceStatus());
        
    }
    
}