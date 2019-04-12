



/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/
import java.util.Calendar;
import java.util.ArrayList;
public class Sell_Unpaid extends Invoice
{
    static final private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    static final private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive=true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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
        this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
    public String toString()
    {
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nDue date: " + getDueDate();
        string += "\nIf payment is not received by dueDate, transaction will be cancelled.";
        return string;
    }
}
