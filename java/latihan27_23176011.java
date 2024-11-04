

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar: " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil: " + kalimat.toLowerCase());

        System.out.println("BUILD SUCCESSFUL (total time: 2 minutes)");
    }
