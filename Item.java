package jstore;


/**
 *Write a description of class Item here.
 *
 * @author Yelli Yulfita
 * @version 27-02-2019
 */
public class Item 
{
    
    private int id; //variabel yang dipakai
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    
    private ItemStatus status;
    private Supplier supplier;
    
    
    
    
    
     public Item (int id,String name,int stock, int price,
                 ItemCategory category,
                 Supplier supplier,
                 ItemStatus status) /constructor
    {
        
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;
    }
    
    enum ItemCategory{  Electronics,Furniture,Stationery;}
    enum ItemStatus {New,Second,Refurbished,Sold;}
    enum InvoiceStatus{Paid,Unpaid,Installment;}
    
    
      
     
        
    
   
   
    
    
        
    
    
        
    
    public int getId() //Menampilkan id
    {
        return id;
    }
    
    /**
     * Metode getId()
     * @return id
     */
        
    
        
        
    public String getName()//Menampilkan nama item
    {
        return name;
    }
    
    public ItemCategory getCategory()
    {
        return category ;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
  public Supplier getSupplier(){
             
  return supplier;
}






    
    
    
    
    /**
     * Metode getName()
     * @return name
     */
        
    public int getStock()//Menampilkan stock Item
    {
        return stock;
    }
    
    /**
     * Metode getStock()
     * @return stock
     */ 
    
    public int getPrice()//Menampilkan harga Item
    {
        return price;
    }
    
    /**
     * Metode getPrice()
     * @return price
     */
    
    
    
        
    
    
    /**
     * Metode getSupplier()
     * @return supplier
     */
    public void setId(int id)//Mengganti id
    {
        this.id=id;
    }
    
    /**
     * Metode setId()
     * @param id
     */
        
    public void setName(String name)//Mengganti nama Item
    {
        this.name=name;
    }
    
    /**
     * Metode setName()
     * @param name
     */  
    
    public void setStock(int stock)//Mengganti stock Item
    {
        this.stock=stock;
    }
    
    /**
     * Metode setStock()
     * @param stock
     */
        
    public void setPrice(int price)//Mengganti harga item
    {
        this.price=price;
    }

        
        
    /**
     * Metode setPrice()
     * @param price
     */
        
    
    
    public void printData()//Mencetak nama Item
    {
         System.out.println(name);
    }
    /**
     * Metode printData()
     */
    }


        
        
            
        
      
    
        
        
        
    
        
        


       
   
    

