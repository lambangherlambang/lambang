/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * nama : herlambang
 * Nim  : 23176011
 * @author dell
 */

    import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class latihan26_23176011 {

    public static void main(String[] args) {
        // Tanggal dan waktu
        LocalDateTime now = LocalDateTime.now();
        LocalDate date = now.toLocalDate();
        LocalTime time = now.toLocalTime();

        // Format tanggal dan waktu
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.forLanguageTag("id"));
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Nama hari
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("id"));

        // Output
        System.out.println("run:");
        System.out.println("Hari ini adalah hari : " + dayOfWeek + ", " + date.format(dateFormat) + " " + time.format(timeFormat));
        System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
    }
}

