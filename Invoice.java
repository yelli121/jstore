package jstore;

/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/



public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalItem, int totalPrice)
    {
        // initialise instance variables
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
        this.totalItem = totalItem;
    }

    /**
     * getId getter method
     * a method to get value of id of invoice
     * @return   the value of id variables as integer
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * getItem getter method
     * a method to get value of item of invoice
     * @return   the value of item variables as Item types
     */
    public Item getItem()
    {
        
        return item;
    }
    
    /**
     * getDate getter method
     * a method to get value of date of invoice
     * @return   the value of date variables as String types
     */
    public String getDate()
    {
        
        return date;
    }
    
    /**
     * getTotalPrice getter method
     * a method to get value of total price of invoice
     * @return   the value of totalPrice variables as int types
     */
    public int getTotalPrice()
    {
        
        return totalPrice;
    }
    
    public int getTotalItem()
    {
        return totalItem;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    /**
     * setId setter method
     * a method to set value of id of invoice
     * @param id as integer for replacing id number
     */
    public void setId(int id)
    {
        
        this.id = id; // use this as the variables name is same
    }
    
    /**
     * setItem setter method
     * a method to set value of item of invoice
     * @param item as Item types for replacing the item
     */
    public void setItem(Item item)
    {
        
        this.item = item; // use this as the variables name is same
    }
    
    /**
     * setDate setter method
     * a method to set value of date of invoice
     * @param date as String for replacing date of invoice
     */
    public void setDate(String date)
    {
        
        this.date = date; // use this as the variables name is same
    }
    
    /**
     * setTotalPrice setter method
     * a method to set value of totalPrice variable of invoice
     * @param id as integer for replacing totalPrice number
     */
    public void setTotalPrice(int totalPrice)
    {
        
        this.totalPrice= totalPrice; // use this as the variables name is same
   
    }
    
    public void setTotalItem(int totalItem)
    {
        
        this.totalItem= totalItem; // use this as the variables name is same
   
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
        this.status= status; // use this as the variables name is same
   
    }
    
    /**
     * printData method
     * a method to print totalPrice to terminal
     */
    public abstract void printData();
    
    
    
}