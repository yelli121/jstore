
/**
 * Write a description of class JStore here.
 *
 * @author Yelli Yulfita
 * @version 14-03-2019
 */
public class JStore
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    Location city = new Location("Serang", "Banten", "Debus");
    Supplier supplier = new Supplier(1, "Yelli", "yelli.yulfita@ui.ac.id", "087774170558", city);
    city.printData();
    supplier.printData();
    Transaction transaksi = new Transaction();
      transaksi.orderNewItem(supplier);
      transaksi.orderSecondItem(supplier);
      transaksi.orderRefurbishedItem(supplier);
      transaksi.sellItemPaid(DatabaseItem.getItem());
      transaksi.sellItemUnpaid(DatabaseItem.getItem());
      transaksi.sellItemInstallment(DatabaseItem.getItem());
    
    }

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
         
    }
    
   
    
   
}

   
