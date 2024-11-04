import java.util.Scanner;

public class MenggantiKata {

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