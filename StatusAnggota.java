package jstore;


/**
 * Enumeration class StatusAnggota - write a description of the enum class here
 *
 * @author Yelli Yulfita
 * @version 18-03-2019
 */
public enum StatusAnggota
{
    Active("Aktif"),Inactive("Hiatus"),Out("Keluar");
    
    private String anggota;
    StatusAnggota(String anggota){
        this.anggota=anggota;
    }
    
    public String toString(){
        return anggota;
    }
}
    
            


