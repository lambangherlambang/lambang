
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class latihan29_23176011 {
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan pilihan warna
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");

        // Minta input nama dan warna favorit
        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();
        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        // Tampilkan hasil tes kepribadian
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);

        // Logika untuk menampilkan karakteristik berdasarkan warna
        switch (warnaFavorit) {
            case "MERAH" -> {
                System.out.println("1. Berani dan penuh semangat,");
                System.out.println("2. Suka memimpin dan menjadi pusat perhatian,");
                System.out.println("3. Memiliki jiwa kepemimpinan yang kuat,");
                System.out.println("4. Terkadang impulsif dan agresif,");
                System.out.println("5. Seringkali memiliki sifat kompetitif.");
            }
            case "HIJAU" -> {
                System.out.println("1. Memiliki sifat penyayang dan peduli,");
                System.out.println("2. Suka membantu orang lain,");
                System.out.println("3. Mencintai alam dan lingkungan,");
                System.out.println("4. Terkadang terlalu sensitif dan mudah terpengaruh,");
                System.out.println("5. Memiliki jiwa sosial yang tinggi.");
            }
            case "KUNING" -> {
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                
            }
        }
    }
}
            
            
       
              

    