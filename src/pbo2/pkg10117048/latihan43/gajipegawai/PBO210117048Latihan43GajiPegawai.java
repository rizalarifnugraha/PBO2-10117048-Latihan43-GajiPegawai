/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan43.gajipegawai;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini tentang menghitung data gaji pegawai dengan OO.
 */
public class PBO210117048Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        GajiPegawai pegwai = new GajiPegawai();
        pegwai.setNama("Rizki Adam Kurniawan");
        pegwai.setAlamat("Jalan Semar dlm 4 No 72/66");
        pegwai.setUangTranspot(250000);
        pegwai.setUangTunjangan(300000);
        pegwai.setGajiPokok(4500000);
        pegwai.setTotalGaji(pegwai.getTotalGaji());
        pegwai.tampilData(pegwai.getNama(), pegwai.getAlamat(), 
            pegwai.getUangTranspot(), pegwai.getUangTunjangan(),
            pegwai.getGajiPokok(), pegwai.getTotalGaji());
        
    }
    
}
