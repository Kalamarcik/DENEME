import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ismi alıyoruz
        System.out.print("İsminizi girin: ");
        String isim = scanner.nextLine();

        // Kullanıcıya selam veriyoruz
        System.out.println("Merhaba, " + isim + "! Hoş geldiniz.");
    }
}
