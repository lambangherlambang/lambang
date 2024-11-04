
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class latihan25_23176011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String namaDepan = scanner.nextLine();

        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah :");

        for (int i = 0; i < namaDepan.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + namaDepan.charAt(i));
        }

        System.out.println("BUILD SUCCESSFUL (total time: 14 seconds)");
    }
}
