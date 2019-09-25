/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2.deklarasi.pengaksesan.variabel;

/**
 *
 * @author 
 * NAMA  : Guntur Maulana Ibrahim
 * Kelas : PBO1
 * NIM   : 10118032
 * Deskripsi Program : Program ini berisi untuk menampilkan nilai variabel  
 */
public class PBO110118032Latihan2DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi var
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke var
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi var nilai\t = " +nilaiInt);
        System.out.println("Isi var PHI\t = " +PHI);
        System.out.println("Isi var logika\t = " +nilaiLogika);
        System.out.println("Isi var karakter = " +nilaiKarakter);
        
    }
    
}
