
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class latihan22_23176011 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        double diameter = scanner.nextDouble();

        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luas + " cm");
        System.out.println("Keliling Lingkaran = " + keliling + " cm");
    }
}
