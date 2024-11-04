
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Pertemuan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input gaji pokok dan status pernikahan
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.6000000 ");
        double gajiPokok = input.nextDouble();
        input.nextLine(); // Membersihkan buffer
        System.out.print("Status Anda? (Menikah/Belum): Menikah");
        String status = input.nextLine().trim().toLowerCase();

        // Hitung tunjangan
        double tunjangan = 0;
        if (status.equals("menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Output hasil perhitungan
        System.out.println("\n======= Hasil Perhitungan Gaji Anda =======");
        System.out.println(gajiPokok + "Gaji Pokok       : Rp.6000000 ");
        System.out.println(tunjangan + "Tunjangan        : Rp.2100000");
        System.out.println(totalGaji + "Total Gaji       : Rp.8100000");
        System.out.println("\n(Developed by : [Herlambang])");
    }
}

