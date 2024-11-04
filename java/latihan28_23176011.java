
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class latihan28_23176011 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        String gantiKata = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        String menjadiKata = scanner.nextLine();

        String kalimatBaru = kalimat.replaceAll(gantiKata, menjadiKata);

        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
}