package jstore;

/**
 * Mendefinisikan location sebagai alamat lokasi. Kelas ini digunakan oleh
 * Supplier dalam identitasnya. Informasi yang disimpan yaitu provinsi, 
 * kota, dan deskripsi singkat.
 *
 * @author Yelli Yulfita
 * @since 28-2-2019
 */

public class Location
{
    private String province;
    private String description;
    private String city;    

    /**
     * Konstruktor Location membutuhkan nilai dari setiap instance
     * dalam parameter sebagai nilai awal instance.
     */
    public Location(String city, String province, 
                    String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * Mengambil nilai dari variabel province, yaitu tempat provinsi
     * dalam alamat.
     * 
     * @return bagian provinsi dari lokasi atau alamat
     */    
    public String getProvince()
    {
        return province;
    }
    
    /**
     * Mengambil nilai dari variabel city, yaitu tempat kota
     * dalam alamat.
     * 
     * @return bagian kota dari lokasi atau alamat
     */      
    public String getCity()
    {
        return city;
    }
    
    /**
     * Mengambil nilai dari variabel description, yaitu penjelasan
     * singkat dari detail informasi lokasi atau alamat, seperti
     * nama jalan atau nomor gedung.
     * 
     * @return informasi detail dari lokasi atau alamat
     */      
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Merubah nilai dari variabel province, yaitu tempat provinsi
     * dalam alamat.
     * 
     * @param province nama provinsi baru dari lokasi atau alamat sebagai pengganti
     */      
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Merubah nilai dari variabel city, yaitu tempat kota
     * dalam alamat.
     * 
     * @param city nama kota baru dari lokasi atau alamat sebagai pengganti
     */          
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Merubah nilai dari variabel description, yaitu penjelasan
     * singkat dari detail informasi lokasi atau alamat, seperti
     * nama jalan atau nomor gedung.
     * 
     * @param description string informasi detail baru sebagai pengganti
     */        
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * Menampilkan nilai dari variabel province pada standard
     * output monitor
     */    
    public String toString()
    {
         return "===========LOCATION===========" + "\n" +
                "Kota: " + city + "\n" +
                "Provinsi: " +province + "\n" +
                "Deskripsi: " + description + "\n";
    }
}
