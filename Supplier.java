package jstore;

import java.util.*;
import java.text.*;
import java.util.regex.*;

/**
 * Mendefinisikan supplier sebagai penyedia produk atau penjual. Informasi 
 * yang disimpan yaitu nama, email, dan nomor telepon penjual, serta
 * objek lokasi.
 *
 * @author Yelli Yulfita
 * @since 28-2-2019
 */

public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Konstruktor Supplier membutuhkan nilai dari setiap instance
     * dalam parameter sebagai nilai awal instance.
     */
    public Supplier(String name,
                    String email, String phoneNumber,
                    Location location)
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
		
		id = DatabaseSupplier.getLastSupplierId() + 1;
    }

    /**
     * Mengambil nilai dari variabel id, yaitu nomor identitas
     * yang dimiliki tiap objek supplier.
     * 
     * @return nilai nomor identitas dari objek supplier
     */    
    public int getId()
    {
        return id;
    }
    
    /**
     * Mengambil nilai dari variabel name, yaitu nama dari penyedia atau
     * penjual produk item.
     * 
     * @return nama identitas dari penyedia
     */      
    public String getName()
    {
        return name;
    }
    
    /**
     * Mengambil nilai dari variabel email, yaitu alamat email dari 
     * penyedia atau penjual produk item untuk pihak luar dapat 
     * melakukan kontak.
     * 
     * @return alamat email yang dimiliki penyedia produk untuk kontak
     */          
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Mengambil nilai dari variabel phoneNumber, yaitu nomor telepon
     * yang dimiliki oleh penyedia atau penjual produk sebagai kontak
     * 
     * @return nomor telepon yang dimiliki penyedia produk sebagai kontak
     */         
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Mengambil nilai dari variabel location, yaitu objek location sebagai
     * alamat tempat tinggal atau kantor dari penyedia atau penjual produk
     * 
     * @return objek location sebagai alamat pribadi atau instansi dari penyedia produk
     */       
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Merubah nilai dari variabel id, yaitu nomor identitas
     * yang dimiliki tiap objek supplier.
     * 
     * @param id nilai baru dari nomor identitas sebagai pengganti
     */       
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Merubah nilai dari variabel name, yaitu nama dari penyedia atau
     * penjual produk item.
     * 
     * @param name nama baru dari penyedia produk sebagai pengganti
     */       
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Merubah nilai dari variabel email, yaitu alamat email dari 
     * penyedia atau penjual produk item untuk pihak luar dapat 
     * melakukan kontak.
     * 
     * @param email alamat email baru dari penyedia produk sebagai pengganti
     */        
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Merubah nilai dari variabel phoneNumber, yaitu nomor telepon
     * yang dimiliki oleh penyedia atau penjual produk sebagai kontak
     * 
     * @param phoneNumber nomor telepon baru sebagai pengganti
     */          
    public void setPhoneNumber(String phoneNumber)
    {
        String pattern = "(\\+62)(\\d){9,12}";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(phoneNumber);
        
        if(m.matches())
        {
            System.out.println("Format benar");
            this.phoneNumber = phoneNumber;
        }
        else
        {
            System.out.println("Format salah");
            this.phoneNumber = null;
        }		
    }
    
    /**
     * Merubah nilai dari variabel location, yaitu objek location sebagai
     * alamat tempat tinggal atau kantor dari penyedia atau penjual produk
     * 
     * @param location objek location baru untuk alamat penyedia sebagai pengganti
     */           
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    /**
     * Menampilkan nilai dari variabel name pada standard
     * output monitor
     */    

    public String toString()
    {
        return  "===========SUPPLIER===========" + "\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " +phoneNumber + "\n" +
                location.toString();
    }
   
}
