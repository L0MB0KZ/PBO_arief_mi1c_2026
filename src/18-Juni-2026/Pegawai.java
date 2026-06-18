/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_saidina;

/**
 *
 * @author Pongo
 */
public class Pegawai {
    // Atribut
    String nip, nama, golongan;
    double gajiPokok, tunjangan, potongan, gajiBersih;

    // Constructor
    public Pegawai(String nip, String nama, String golongan, double potongan) {
        this.nip = nip;
        this.nama = nama;
        this.golongan = golongan;
        this.potongan = potongan;

        hitungGaji();
    }

    // Method proses perhitungan
    public void hitungGaji() {

        // Gaji pokok berdasarkan golongan
        if(golongan.equalsIgnoreCase("A")){
            gajiPokok = 3000000;
        } else if(golongan.equalsIgnoreCase("B")){
            gajiPokok = 4000000;    
        } else if(golongan.equalsIgnoreCase("C")){
            gajiPokok = 5000000;
        } else {
            gajiPokok = 0;
        }

        // Tunjangan 10% dari gaji pokok
        tunjangan = 0.10 * gajiPokok;

        // Gaji bersih
        gajiBersih = gajiPokok + tunjangan - potongan;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("===== DATA PEGAWAI =====");
        System.out.println("NIP          : " + nip);
        System.out.println("Nama         : " + nama);
        System.out.println("Golongan     : " + golongan);
        System.out.println("Gaji Pokok   : " + gajiPokok);
        System.out.println("Tunjangan    : " + tunjangan);
        System.out.println("Potongan     : " + potongan);
        System.out.println("Gaji Bersih  : " + gajiBersih);
    }
}