
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class latihan23_23176011 {

    public static void main(String[] args) {
        // Input nama petugas
        try (Scanner scanner = new Scanner(System.in)) {
            // Input nama petugas
            System.out.print("Masukkan Nama Petugas: ");
            String namaPetugas = scanner.nextLine();
            
            // Input jumlah mahasiswa
            System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
            int jumlahMahasiswa = scanner.nextInt();
            
            // Input nilai mahasiswa
            int[] nilaiMahasiswa = new int[jumlahMahasiswa];
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + ": ");
                nilaiMahasiswa[i] = scanner.nextInt();
            }
            
            // Mencari nilai terbesar dan terkecil
            int nilaiTerbesar = nilaiMahasiswa[0];
            int nilaiTerkecil = nilaiMahasiswa[0];
            for (int i = 1; i < jumlahMahasiswa; i++) {
                if (nilaiMahasiswa[i] > nilaiTerbesar) {
                    nilaiTerbesar = nilaiMahasiswa[i];
                }
                if (nilaiMahasiswa[i] < nilaiTerkecil) {
                    nilaiTerkecil = nilaiMahasiswa[i];
                }
            }
            
            // Output hasil
            System.out.println("=====Hasil Nilai Mahasiswa=====");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
            }
            System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
            System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
            System.out.println("Petugas: " + namaPetugas);
        }
    }
}
