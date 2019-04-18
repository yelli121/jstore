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
        Location lokasi = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        Supplier sup1 = new Supplier("Yelli", "yelli.yulfita@ui.ac.id", "087774170558", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup1);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup2 = new Supplier("Bayu", "bayu@ui.ac.id", "08256", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup2);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup3 = new Supplier("Fadel", "fadel@ui.ac.id", "08278", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup3);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup4 = new Supplier("Dhio", "dhio@ui.ac.id", "08234", lokasi);
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
            DatabaseItem.addItem(new Item("Buku", ItemStatus.New, 5000,ItemCategory.Stationery,DatabaseSupplier.getSupplier(1)));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Laptop", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(2),ItemCategory.Electronic));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Flashdisk", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(3),ItemCategory.Furniture));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseItem.addItem(new Item("Mouse", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(3),ItemCategory.Furniture));
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