import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yaşını alıyoruz
        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        // Kullanıcıya yaşını ekrana yazdırıyoruz
        System.out.println("Yaşınız: " + yas);
    }
}