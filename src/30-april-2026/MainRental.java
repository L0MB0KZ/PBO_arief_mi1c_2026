/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_RentalMobil;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
import java.util.Scanner;

public class MainRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan ID Sewa       : ");
        String id = input.nextLine();

        System.out.print("Masukkan Nama Penyewa  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jenis Mobil (Avanza/Innova/Fortuner): ");
        String jenis = input.nextLine();

        System.out.print("Masukkan Lama Sewa (hari): ");
        int lama = input.nextInt();

        // Buat objek
        RentalMobil sewa = new RentalMobil(id, nama, jenis, lama);

        // Proses
        sewa.hitungHargaSewa();
        sewa.hitungTotalBayar();

        // Output awal
        sewa.tampilData();

        // 🔥 Fitur edit (yang kamu minta)
        input.nextLine(); // buang enter
        System.out.print("\nIngin edit data? (y/n): ");
        String jawab = input.nextLine();

        if (jawab.equalsIgnoreCase("y")) {
            System.out.print("Edit Nama Penyewa: ");
            sewa.namaPenyewa = input.nextLine();

            System.out.print("Edit Jenis Mobil: ");
            sewa.jenisMobil = input.nextLine();

            System.out.print("Edit Lama Sewa: ");
            sewa.lamaSewa = input.nextInt();

            // Hitung ulang
            sewa.hitungHargaSewa();
            sewa.hitungTotalBayar();

            // Output setelah edit
            sewa.tampilData();
        }

        input.close();
    }
}