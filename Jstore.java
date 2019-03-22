/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/
    // instance variables - replace the example below with your own

    public class JStore
{
    
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        //put code in here
    }

    
    public static void main(String args[])
    {
        // put your code here
        Location location = new Location("Serang", "Banten", "Debus");
        Supplier supplier = new Supplier(1, "Flashdisk", "yelli.yulfita@ui.ac.id", "087774170558", location);
        Item item = new Item(1, "Mouse", 145, ItemStatus.NEW, 2390, supplier , ItemCategory.ELECTRONICS);
        DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item);
        
    }
}