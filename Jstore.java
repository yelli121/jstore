/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/
    // instance variables - replace the example below with your own
import java.util.*;
 public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        // initialise instance variables
    }

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
    {
        Location lokasi = new Location("Banten", "Serang", "Universitas Indonesia");
        Supplier sup1 = new Supplier("Yelli", "yelli.yulfita@ui.ac.id", "087774170558", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup1);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup2 = new Supplier("Yulfi", "Yulfi@ui.ac.id", "087773", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup2);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup3 = new Supplier("Fadel", "fadel@ui.ac.id", "087774", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup3);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup4 = new Supplier("Aben", "aben@ui.ac.id", "0823453", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup1);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        
        try{
            DatabaseCustomer.addCustomer(new Customer("Yelli", "yelli.yulfita@ui.ac.id", "yulfitayelly", "yelli12345", 1998, 7, 25));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseCustomer.addCustomer(new Customer("Yulfi", "yelli.yulfita@ui.ac.id", "yulfitayelly", "yelli12345", 1998, 7, 25));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseCustomer.addCustomer(new Customer("fita", "yelli.yulfita@ui.ac.id", "yulfitayelly", "yelli12345", 1998, 7, 25));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseCustomer.addCustomer(new Customer("yulyul", "yelli.yulfita@ui.ac.id", "yulfitayelly", "yelli12345", 1998, 7, 25));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }
        
        
        try{
            DatabaseItem.addItem(new Item("Buku",5000, ItemStatus.New,ItemCategory.Stationery,DatabaseSupplier.getSupplier(1)));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Laptop",5000, ItemStatus.New,ItemCategory.Electronic, DatabaseSupplier.getSupplier(2)));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Flashdisk",5000, ItemStatus.New,ItemCategory.Furniture, DatabaseSupplier.getSupplier(3)));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseItem.addItem(new Item("Mouse",5000, ItemStatus.New,ItemCategory.Furniture, DatabaseSupplier.getSupplier(3)));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        ArrayList<Integer> items1 = new ArrayList<>();
        items1.add(3);
        ArrayList<Integer> items2 = new ArrayList<>();
        items.add(3);
        items.add(2);
        try{
            DatabaseInvoice.addInvoice(new Sell_Paid(items, DatabaseCustomer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseInvoice.addInvoice(new Sell_Unpaid(items1, DatabaseCustomer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException e){
            System.out.println(e);
        }
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice);
        }
        
        
        
    }
}