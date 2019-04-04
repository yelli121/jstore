
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Yelli Yulfita
 * @version 28-03-2019
 */
public  class Sell_Paid extends Invoice
{
    private InvoiceType INVOICE_TYPE =  InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS =  InvoiceStatus.PAID;
    private Customer customer;
    
    
    public Sell_Paid(int id, Item item, int totalItem, int totalPrice,Customer customer)
    {
       super(id, item, totalItem, totalPrice);   
       
    }
    
    public Customer getCustomer(){
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
    
    public void setCustomer(Customer customer){
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
    
     public String toString()
    {
        return "";
    }
}