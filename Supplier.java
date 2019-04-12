
/**
 * Kelas digunakan sebagai informasi supplier dengan lokasinya
 *
 * @author Yelli Yulfita
 * @version 28/2/2019
 */

import java.util.regex.*;
public class Supplier
{
    //variabel yang dipakai
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    //Konstruktor dari kelas Supplier
    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        id=DatabaseSupplier.getLastSupplierID()+1;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }

    //Menampilkan nomor id supplier
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    //Menampilkan nama supplier
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    //Menampilkan email supplier
    /**
     * Method getEmail()
     * @return email
     */
    public String getEmail()
    {
        return email;
    }
    
    //Menampilkan nomor telepon supplier
    /**
     * Method getPhoneNumber()
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    //Menampilkan lokasi supplier
    /**
     * Method getLccation()
     * @return location
     */
    public Location getLocation()
    {
        return location;
    }
    
    //Mengubah id supplier
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    //Mengubah nama supplier
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    //Mengubah email supplier
    /**
     * Method setEmail()
     * @param email
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    //Mengubah nomor telepon supplier
    /**
     * Method setPhoneNumber()
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        {
            
         String pattern = "\\+62\\ [0-9]{9,16}$";
        if (Pattern.matches(pattern,phoneNumber)){
            System.out.println("phoneNumber benar");
            this.phoneNumber=phoneNumber;}
        else{
            System.out.println("phoneNumber salah");
            this.phoneNumber ="NULL";}
        }
        
    }
    
    


    
    //Mengubah lokasi supplier
    /**
     * Method setLocation()
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    
    //Mencetak nama supplier
    /**
     * Method printData()
     */
    public String toString()
    {
        return "SUPPLIER"+
        "\nID: " + id+
        "\nName: " + name+
        "\nEmail: " + email+
        "\nPhone Number: " + phoneNumber+
        "\nLocation: " + location.getCity();
    }
}
