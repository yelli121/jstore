/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/
    // instance variables - replace the example below with your own
import java.util.*;
public class Jstore
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class jstore
     */
    public Jstore()
    {
        // initialise instance variables
       
    }

    
    public static void main(String[] args)
    {
        
        
        Location lokasi=new Location("Serang","Banten","Debus");
        
        
        DatabaseSupplier.addSupplier(new Supplier("yelli","yelli.yulfita@ui.ac.id","087774170558",lokasi));
        DatabaseSupplier.addSupplier(new Supplier("yulfi","yelli.yulfita@ui.ac.id","087774170558",lokasi));
        DatabaseSupplier.addSupplier(new Supplier("fita","yelli.yulfita@ui.ac.id","087774170558",lokasi));

        for(Supplier temp : DatabaseSupplier.getSupplierDatabase())
        {
            System.out.println(temp);
        }
        
        DatabaseCostumer.addCustomer(new Costumer("yelli","yelli.yulfita@ui.ac.id","yulfitayelly","yelli12345",1998, 07, 25));
        DatabaseCostumer.addCustomer(new Costumer("yulfi","yelli.yulfita@ui.ac.id","yulfitayelly","yelli12345",1998, 07, 25));
        DatabaseCostumer.addCustomer(new Costumer("fita","yelli.yulfita@ui.ac.id","yulfitayelly","yelli12345",1998, 07, 25));
        
        ArrayList<Costumer> temCostumer=DatabaseCostumer.getCustomerDatabase();
        for(Costumer temp : temCostumer)
        {
            System.out.println(temp);
        }
        
        DatabaseItem.addItem(new Item("yelli",23,5000,ItemStatus.New,ItemCategory.Electronic,DatabaseSupplier.getSupplier(1)));
        DatabaseItem.addItem(new Item("yulfi",23,5000,ItemStatus.New,ItemCategory.Electronic,DatabaseSupplier.getSupplier(2)));
        DatabaseItem.addItem(new Item("fita",23,5000,ItemStatus.New,ItemCategory.Electronic,DatabaseSupplier.getSupplier(3)));
        ArrayList<Item> arrInt= new ArrayList<Item>(100);
        for(Item temp:arrInt)
        {
            System.out.println(temp);
        }
        
        ArrayList<Integer> arr_integer1 =new ArrayList<Integer>(100);
        arr_integer1.add(1);
        arr_integer1.add(2);
        
        ArrayList<Integer> arr_integer2 =new ArrayList<Integer>(100);
        arr_integer2.add(2);
        arr_integer2.add(3);
        
        ArrayList<Integer> arr_integer3 =new ArrayList<Integer>(100);
        arr_integer3.add(3);
        arr_integer3.add(3);
        
        DatabaseInvoice.addInvoice(new Sell_Paid(arr_integer1,DatabaseCostumer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Installment(arr_integer2,1,DatabaseCostumer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Paid(arr_integer3,DatabaseCostumer.getCustomer(3)));
        
        ArrayList<Invoice> arr_invoice= DatabaseInvoice.getInvoiceDatabase();
        for(Invoice temp:arr_invoice)
        {
            System.out.println(temp);
        }
        
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(1)))
        System.out.println("finish");
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(2)))
        System.out.println("finish");
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(3)))
        System.out.println("finish");
        System.out.println();
        
        if(!Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1)));
        for(Invoice temp:arr_invoice)
        {
            System.out.println(temp);
        }
        
    }
    
   
    
    
}
