/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class latihan21_23176011 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Banyaknya Mahasiswa: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next(); // Menghapus input yang tidak valid
            }   int jumlahMahasiswa = scanner.nextInt();
            if (jumlahMahasiswa <= 0) {
                System.out.println("Jumlah mahasiswa harus lebih dari 0.");
                scanner.close(); // Menutup scanner
                return; // Keluar dari program
            }   int[] nilaiMahasiswa = new int[jumlahMahasiswa];
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    scanner.next(); // Menghapus input yang tidak valid
                }
                nilaiMahasiswa[i] = scanner.nextInt();
            }   double totalNilai = 0;
            for (int nilai : nilaiMahasiswa) {
                totalNilai += nilai;
            }   double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
            // Menutup scanner
        }
    }
}


    