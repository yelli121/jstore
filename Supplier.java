package jstore;



/**
 * Kelas yang berisi informasi supplier beserta lokasi.
 *
 * @author Yelli Yulfita
 * @version 27-02-2019
 */
public class Supplier  
{
    private int id; //variabel yang dipakai
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    public Supplier(int id,String name,String email,String phoneNumber,Location
    location) //Constructor
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    
    public int getId() //Menampilkan id supplier
    {
        return id;
    }
    
    /**
     * Metode getId()
     * @param return id
     */
    
    public String getName()//Menampilkan nama supplier
    {
        return name;
    }
    
    /**
     * Metode getName()
     * @return name
     */
    
    public String getEmail()//Menampilkan email supplier
    {
        return email;
    }
    
    /**
     * Metode getEmail()
     * @return email
     */
    
    public String getPhoneNumber()//Menampilkan nomor telepon supplier
    {
        return phoneNumber;
    }
    
    /**
     * Metode getPhoneNumber()
     * @return phoneNumber
     */
     
    public Location getLocation()//Menampilkan lokasi supplier
    {
        return location;
    }
    
    /**
     * Metode getLocation()
     * @return location
     */
    
    public void setIde(int id)// Mengubah id supplier
    {
        this.id=id;
    }
    
    /**
     * Metode setId()
     * @param id
     */
    
    public void setName(String name)//Mengubah nama supplier
    {
        this.name=name;
    }
    
    /**
     * Metode setName()
     * @param name
     */
    
    public void setEmail(String email)//Mengubah email supplier
    {
        this.email=email;
    }
    
    /**
     * Metode setEmail()
     * @param name
     */
    
     public void setPhoneNumber(String phoneNumber)//Mengubah nomor telepon 
    {
        this.phoneNumber=phoneNumber;
    }
    
    /**
     * Metode setPhoneNumber
     * @param phoneNumber
     */
    
    public void setLocation(Location location)//Mengubah lokasi supplier
    {
        this.location=location;
    }
   
    /**
     * Metode setLocation()
     * @param location
     */
    
    public void printData()//Mencetak nama supplier
    {
        System.out.println(name);
    }
    /**
     * Metode printData()
     */
    
}