/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latiham;

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class latihan_6_5_1_buffered {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double nilai1, nilai2, nilai3, rataRata;

        try {
            // Meminta input dari user
            System.out.print("Masukkan nilai ujian 1: ");
            nilai1 = Double.parseDouble(dataIn.readLine());
            
            System.out.print("Masukkan nilai ujian 2: ");
            nilai2 = Double.parseDouble(dataIn.readLine());
            
            System.out.print("Masukkan nilai ujian 3: ");
            nilai3 = Double.parseDouble(dataIn.readLine());

            // Menghitung rata-rata
            rataRata = (nilai1 + nilai2 + nilai3) / 3;

            // Output hasil
            System.out.println("\n--- Hasil ---");
            System.out.println("Rata-rata nilai: " + rataRata);

            // Logika Smiley
            if (rataRata >= 60) {
                System.out.println("Status: :-)");
            } else {
                System.out.println("Status: :-(");
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}
    
