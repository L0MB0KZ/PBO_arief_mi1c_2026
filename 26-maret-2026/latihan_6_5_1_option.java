package latiham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saidina
 */
import javax.swing.JOptionPane;
public class latihan_6_5_1_option {


    public static void main(String[] args) {
        try {
            // Mengambil input dan langsung parsing ke int
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Ujian 1:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Ujian 2:"));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Ujian 3:"));
            
            // Menghitung rata-rata (pembagian integer)
            double rataRata = (n1 + n2 + n3) / 3;
            
            // Menyusun pesan output
            String hasil = "Rata-rata: " + rataRata;
            
            // Menambahkan smiley berdasarkan kondisi
            if (rataRata >= 60) {
                hasil += " :)";
            } else {
                hasil += " :-(";
            }
            
            // Menampilkan hasil akhir
            JOptionPane.showMessageDialog(null, hasil);
            
        } catch (NumberFormatException e) {
            // Jika user memasukkan huruf atau mengosongkan input
            JOptionPane.showMessageDialog(null, "Input harus berupa angka bulat!");
        } catch (Exception e) {
            // Jika user menekan tombol 'Cancel'
            JOptionPane.showMessageDialog(null, "Operasi dibatalkan.");
        }
    }
}

    
