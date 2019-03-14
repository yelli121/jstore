package jstore;


/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction

{
  
    enum OrderNewItem{New;}
    enum OrderSecondItem{Second;}
    enum orderRefurbishedItem{Refurbished;}
    
    
    
        
    public void orderNewItem(Supplier supplier)
    {
        Item item = new Item (1,"Yelli",10,12,ItemCategory,ItemStatus,Supplier);
        
        
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        Item second = new Item (2,"Yulfita",23,40,item,item,item);
        
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
        Item Refurbished = new Item(3,"Yulfi",56,80,ItemCategory,ItemStatus,Supplier);
        
    }
    
    public void sellItemPaid (Item item)
    {
        
        
    }
    
    public void sellItemUnpaid(Item item)
    {
        
    }
    public void sellItemInstallment(Item item)
    {
        
    }
}

    
   