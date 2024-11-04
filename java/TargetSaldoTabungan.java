/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class TargetSaldoTabungan {
    
    public static void main(String[] args) {
        double saldoAwal = 3500000; // Saldo awal Rp. 3.500.000
        double bungaBulanan = 0.08; // Bunga per bulan 8%
        double saldoTarget = 6000000; // Saldo target Rp. 6.000.000
        int bulan = 0;

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bungaBulanan;
            bulan++;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldoAwal);
        }
    }
}
