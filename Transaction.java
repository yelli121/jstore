package jstore;





/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/



public class Transaction
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
        
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
     public static void sellItemPaid(Item item)
    {
        Invoice invoice4 = new Sell_Paid(4, item, "21 Mar 2019", 4, item.getPrice());
        InvoiceStatus invoicestatus4 = InvoiceStatus.PAID;
        ItemStatus itemstatus4 = ItemStatus.SOLD;

        invoice4.setInvoiceStatus(invoicestatus4);
        item.setStatus(itemstatus4);
        
        item.printData();
        invoice4.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item)
    {
        Invoice invoice5 = new Sell_Paid(5, item, "21 Mar 2019", 5, item.getPrice());
        InvoiceStatus invoicestatus5 = InvoiceStatus.UNPAID;
        ItemStatus itemstatus5 = ItemStatus.SOLD;

        item.setStatus(itemstatus5);

        item.printData();
        invoice5.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item)
    {
        Invoice invoice6 = new Sell_Paid(6, item, "21 Mar 2019", 6, item.getPrice());
        InvoiceStatus invoicestatus6 = InvoiceStatus.INSTALLMENT;
        ItemStatus itemstatus6 = ItemStatus.SOLD;

        item.setStatus(itemstatus6);

        item.printData();
        invoice6.printData();
    }
    
}