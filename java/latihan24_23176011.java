
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class latihan24_23176011 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("Tidak")) {
                lanjut = false;
            }
        }

        System.out.println("BUILD SUCCESSFUL");
    }
}