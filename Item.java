package jstore;

/**
 * Mendefinisikan item sebagai produk yang dijual. Informasi yang disimpan
 * yaitu nama produk, jumlah stok, harga, kategori, dan penjual. Produk 
 * yang tidak dapat dijual karena stok kosong tetap termasuk dalam kelas ini,
 * karena jumlah stok dapat bernilai nol.
 *
 * @author Yelli Yulfita
 * @since 28-2-2019
 */
public class Item
{
    private int id;
    private String name;
    private int price;
    private Supplier supplier;  
    private ItemStatus status;
    private ItemCategory category;
  

    /**
     * Konstruktor Item membutuhkan nilai dari setiap instance
     * dalam parameter sebagai nilai awal instance.
     */
    public Item(String name, 
                int price,
                Supplier supplier,
                ItemStatus status, ItemCategory category)
    {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.status = status;
        this.category = category;
		
		id = DatabaseItem.getLastItemId() + 1;		
    }

    /**
     * Mengambil nilai dari variabel id, yaitu nomor identitas
     * yang dimiliki tiap objek item.
     * 
     * @return nilai nomor identitas dari objek item
     */    
    public int getId()
    {
        return id;
    }
    
    /**
     * Mengambil nilai dari variabel name, yaitu nama dari produk
     * yang dijual.
     * 
     * @return nama identitas dari produk
     */    
    public String getName()
    {
        return name;
    }
    
    /**
     * Mengambil nilai dari variabel price, yaitu nilai harga dari barang
     * yang dijual.
     * 
     * @return nilai harga dari produk
     */    
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Mengambil nilai dari variabel category, yaitu jenis dari produk
     * yang dijual. Tiap produk akan digolongkan dalam suatu kategori
     * berdasarkan identitas atau sifatnya.
     * 
     * @return kategori dari suatu produk untuk klasifikasi berdasarkan identitas atau sifatnya
     */        
    public ItemCategory getCategory()
    {
        return category;
    }
    
    /**
     * Mengambil nilai dari variabel supplier, yaitu objek supplier
     * sebagai penyedia atau penjual dari produk
     * 
     * @return nilai objek dari penyedia atau penjual produk
     */        
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
     * Merubah nilai dari variabel id, yaitu nomor identitas
     * yang dimiliki tiap objek item.
     * 
     * @param id nilai baru dari nomor identitas sebagai pengganti
     */    
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Merubah nilai dari variabel name, yaitu nama dari produk
     * yang dijual.
     * 
     * @param name nama baru dari produk sebagai pengganti
     */        
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Merubah nilai dari variabel price, yaitu nilai harga dari barang
     * yang dijual.
     * 
     * @param price nilai harga baru dari produk sebagai pengganti
     */       
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    /**
     * Merubah nilai dari variabel category, yaitu jenis dari produk
     * yang dijual. Tiap produk akan digolongkan dalam suatu kategori
     * berdasarkan identitas atau sifatnya.
     * 
     * @param category jenis kategori baru dari produk sebagai pengganti
     */       
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }
    
    /**
     * Merubah nilai dari variabel supplier, yaitu objek supplier
     * sebagai penyedia atau penjual dari produk
     * 
     * @param supplier nilai objek baru dari penyedia atau penjual produk
     */            
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }    
    
    /**
     * Menampilkan nilai dari variabel name pada standard
     * output monitor
     */        
    public String toString()
    {
        return  "===========ITEM===========" + "\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Category: " + category + "\n" +
                "Status: " + status + "\n" +                
                "Supplier: " + supplier.getName() + "\n";
    }
   
}
