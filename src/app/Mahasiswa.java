package app;
public class Mahasiswa {
    private int nim;
    private String nama;
    
    public int getNim(){
        return nim;
    }
    public void setNim(int nim){
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    @Override
    public String toString(){
        return "NIM\t: "+getNim()+" \n"
                + "Nama\t: "+getNama()+" \n";
    }
    
}
