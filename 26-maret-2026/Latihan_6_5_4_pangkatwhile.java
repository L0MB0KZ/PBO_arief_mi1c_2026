/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author Saidina
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Latihan_6_5_4_pangkatwhile {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan angka: ");
            int angka = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan pangkat: ");
            int pangkat = Integer.parseInt(dataIn.readLine());

            long hasil = 1;
            int i = 0;
            while (i < pangkat) {
                hasil *= angka;
                i++;
            }

            System.out.println("Hasil: " + hasil);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error!");
        }
    }
    
}
