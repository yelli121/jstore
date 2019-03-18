package jstore;


/**
 * Write a description of class Anggota here.
 *
 * @author Yelli Yulfita
 * @version 18-03-2019
 */
public class Anggota
{
    private String nama;
    private StatusAnggota status;
    private String role;
    
    public Anggota (String nama,StatusAnggota status,String role){
        
        this.nama=nama;
        this.status=status;
        this.role=role;
    }
    
    public String toString(){
     return (nama+"adalah seorang "+role+"yang berstatus"+status);
        
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public StatusAnggota getStatus(){
    return status;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    public void setStatus (StatusAnggota status)
    {
        this.status=status;
    }
    
    public void setRole(String role)
    {
        this.role=role;
    }
    
    
}

