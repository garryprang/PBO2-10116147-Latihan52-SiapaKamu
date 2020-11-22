/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM      `: 10116147
 * Deskripsi : Program untuk menampilkan identitas.
 */

package pbo2.pkg10116147.latihan52.siapakamu;

public class PBO210116147Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen;
        Mahasiswa mhs;
        
        dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 10116147");
        mhs.siapaKamu();
        mhs.kelasApa();
        
    }
    
}
