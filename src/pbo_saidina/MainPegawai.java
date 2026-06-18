/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_saidina;

/**
 *
 * @author Pongo
 */
import java.util.Scanner;

public class MainPegawai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input Data Pegawai");

        System.out.print("Masukkan NIP      : ");
        String nip = input.nextLine();

        System.out.print("Masukkan Nama     : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine();

        System.out.print("Masukkan Potongan : ");
        double potongan = input.nextDouble();

        Pegawai pgw = new Pegawai(nip, nama, golongan, potongan);

        System.out.println();
        pgw.tampilData();
    }
}