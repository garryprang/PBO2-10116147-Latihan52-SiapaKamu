/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM      `: 10116147
 * Deskripsi : Program untuk menampilkan identitas.
 */
package pbo2.pkg10116147.latihan52.siapakamu;

public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Garry Prang, umur 22 tahun, sedang balajar dikelas PBO-2.");  
    } 
    
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }

}
