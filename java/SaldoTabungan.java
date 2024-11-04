/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class SaldoTabungan {
    

    public static void main(String[] args) {
        double saldoAwal = 2500000; // Saldo awal Rp. 2.500.000
        double bungaBulanan = 0.15; // Bunga per bulan 15%
        int lama = 6; // Lama (bulan) 6 bulan

        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bungaBulanan;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}
