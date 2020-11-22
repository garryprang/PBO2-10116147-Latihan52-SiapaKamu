/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM      `: 10116147
 * Deskripsi : Program untuk menampilkan identitas.
 */
package pbo2.pkg10116147.latihan52.siapakamu;

public class Dosen extends Manusia{
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan, umur 27 tahun, sedang mengajar mata kuliah PBO.");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
        
    }
    
    
}
