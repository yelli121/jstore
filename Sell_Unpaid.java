



/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/
import java.util.Calendar;
import java.util.*;


public class Sell_Unpaid extends Invoice



{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.UNPAID;
    private Calendar dueDate;
    private Customer customer;
    
    public Sell_Unpaid(int id, Item item, int totalItem, int totalPrice)
    {
        super(id, item, totalItem);
        this.customer = customer;
        this.dueDate= new GregorianCalendar();
        dueDate.add((GregorianCalendar.DATE),1);
        
    
    
       
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public Calendar getDueDate(){
        return dueDate;
    }
    
    
   
    
    public void setCustomer(Customer customer){
       
    }
    
    public void setDueDate(Calendar dueDate){
        this.dueDate=dueDate;
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