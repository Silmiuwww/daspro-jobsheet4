import java.util.Scanner;
public class Usia12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia Anda: ");
        usia = scanner.nextInt();

        if (usia >= 0) 
            
            if (usia >= 0 && usia <= 12) {
                System.out.println("Kategori: Anak");
            } else if (usia >= 13 && usia <= 19) {
                System.out.println("Kategori: Remaja");
            } else if (usia >= 20 && usia <= 64) {
                System.out.println("Kategori: Dewasa");
            } else {
                System.out.println("Kategori: Lansia");
            }
            
    }

}