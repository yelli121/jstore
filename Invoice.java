package jstore;



/**
 * kelas yang memberikan informasi Invoice barang dengan itemnya.
 *
 * @author Yelli Yulfita
 * @version 27-02-2019
 */
public class Invoice 
{
  
    private int id; //variabel yang dipakai
    private Item item;
    private String date;
    private int totalPrice;
    
    
   
    
  public Invoice (int id,Item item,String date,int totalPrice) //constructor
  {
      this.id=id;
      this.item=item;
      this.date=date;
      this.totalPrice = totalPrice;
    }
    
    public int getId()//Menampilkan id invoice
    {
        return id;
    }
    
    /**
     * Metode getId()
     * @return id
     */
    
    public Item getItem() //Menampilkan nama item
    {
        return item;
    }
    
    /**
     * Metode getItem()
     * @return item
     */
    
    public String getDate()
    {
        return date;
    }
    
    /**
     * Metode getDate()
     * @return date
     */
    
    
    public int getTotalPrice()//Menampilkan total harga
    {
        return totalPrice;
    }
    
    /**
     * Metode getTotalPrice()
     * @return totalPrice
     */
    
    public void setId(int id)//Mengubah id item
    {
        this.id=id;
    }
    
    /**
     * Metode setId()
     * @param id
     */
    
    public void setItem(Item item)//Mengubah nama item
    {
        this.item=item;
    }
    
    /**
     * Metode setItem()
     * @param item
     */
    
    public void setDate(String date)//Mengubah tanggal
    {
        this.date=date;
    }
    
    /**
     * Metode setDate()
     * @param date
     */
            
    public void setTotalPrice(int totalPrice)//Mengubah total harga
    {
        this.totalPrice=totalPrice;
    }
    
    /**
     * Metode setTotalPrice()
     * @param totalPrice
     */
    
    
    
    public void printData()
    {
        System.out.println(totalPrice);
    }
    /**
     * Metode printData()
     */
    
}

    
  