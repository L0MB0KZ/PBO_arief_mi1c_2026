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
public class Latihan_6_5_2_sewitch {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Masukkan angka (1-10): ");
            int angka = Integer.parseInt(dataIn.readLine());

            switch (angka) {
                case 1: System.out.println("Satu"); break;
                case 2: System.out.println("Dua"); break;
                case 3: System.out.println("Tiga"); break;
                case 4: System.out.println("Empat"); break;
                case 5: System.out.println("Lima"); break;
                case 6: System.out.println("Enam"); break;
                case 7: System.out.println("Tujuh"); break;
                case 8: System.out.println("Delapan"); break;
                case 9: System.out.println("Sembilan"); break;
                case 10: System.out.println("Sepuluh"); break;
                default:
                    System.out.println("Invalid number");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Input tidak valid!");
        }
    }
    
}
