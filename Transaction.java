package jstore;


/**
 * Write a description of class Transaction here.
 *
 * @author Yelli Yulfita
 * @version 14-03-2019
 */
public class Transaction
{
    public void orderNewItem(Supplier supplier)
    {
        Item barang = new Item(1, "Flashdisk", 10, 5000, ItemCategory.Electronics, ItemStatus.New, supplier);
        DatabaseItem.addItem(barang);
        Invoice invoice1 = new Invoice(2, barang, "04-Mar-19", barang.getPrice(), 5, InvoiceStatus.Paid);
        barang.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        barang.printData();
        invoice1.printData();
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        // put your code here
        Item barang = new Item (1, "Flashdisk", 5, 5000, ItemCategory.Electronics, ItemStatus.Second, supplier);
        DatabaseItem.addItem(barang);
        Invoice invoice1 = new Invoice(2, barang, "4-Mar-19", barang.getPrice(), 5, InvoiceStatus.Paid);
        barang.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        barang.printData();
        invoice1.printData();
    }
    
      public void orderRefurbishedItem(Supplier supplier)
    {
        // put your code here
        Item barang = new Item(3, "Flashdisk", 12, 5000, ItemCategory.Electronics, ItemStatus.Refurbished, supplier);
        DatabaseItem.addItem(barang);
        Invoice invoice1 = new Invoice(2, barang, "4-Mar-19", barang.getPrice(), 5, InvoiceStatus.Paid);
        barang.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        barang.printData();
        invoice1.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice invoice1 = new Invoice(2, item, "4-Mar-19", item.getPrice(), 5, InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Invoice invoice1 = new Invoice(2, item, "4-Mar-19", item.getPrice(), 5, InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();
    }
    public static void sellItemInstallment(Item item)
    {
        Invoice invoice1 = new Invoice(2, item, "4-Mar-19", item.getPrice(), 5, InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();
    }
    
}
    
    