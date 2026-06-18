/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_RentalMobil;

/**
 *
 * @author Pongo
 */
public class RentalMobil {
    // Atribut
    String idSewa;
    String namaPenyewa;
    String jenisMobil;
    int lamaSewa;
    double hargaSewa;
    double biayaTambahan;
    double totalBayar;

    // Constructor
    public RentalMobil(String idSewa, String namaPenyewa, String jenisMobil, int lamaSewa) {
        this.idSewa = idSewa;
        this.namaPenyewa = namaPenyewa;
        this.jenisMobil = jenisMobil;
        this.lamaSewa = lamaSewa;
    }

    // Menentukan harga sewa
    public void hitungHargaSewa() {
        if (jenisMobil.equalsIgnoreCase("Avanza")) {
            hargaSewa = 300000;
        } else if (jenisMobil.equalsIgnoreCase("Innova")) {
            hargaSewa = 500000;
        } else if (jenisMobil.equalsIgnoreCase("Fortuner")) {
            hargaSewa = 800000;
        } else {
            hargaSewa = 0;
            System.out.println("Jenis mobil tidak tersedia!");
        }
    }

    // Hitung total bayar
    public void hitungTotalBayar() {
        double biayaSewa = hargaSewa * lamaSewa;

        if (lamaSewa > 5) {
            biayaTambahan = 0.1 * biayaSewa; // diskon
        } else {
            biayaTambahan = 0;
        }

        totalBayar = biayaSewa - biayaTambahan;
    }

    // Tampilkan data
    public void tampilData() {
        System.out.println("\n===== DATA RENTAL =====");
        System.out.println("ID Sewa        : " + idSewa);
        System.out.println("Nama Penyewa   : " + namaPenyewa);
        System.out.println("Jenis Mobil    : " + jenisMobil);
        System.out.println("Lama Sewa      : " + lamaSewa + " hari");
        System.out.println("Harga Sewa     : " + hargaSewa);
        System.out.println("Diskon         : " + biayaTambahan);
        System.out.println("Total Bayar    : " + totalBayar);
    }
}