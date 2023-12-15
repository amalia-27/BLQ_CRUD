import java.util.Scanner;

public class No_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = in.nextInt(); // Ganti dengan jumlah bilangan prima yang ingin ditampilkan
        tampilkanBilanganPrima(n);
    }

    // Fungsi untuk mengecek apakah suatu bilangan adalah bilangan prima
    public static boolean adalahPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fungsi untuk menampilkan n bilangan prima pertama
    public static void tampilkanBilanganPrima(int n) {
        if (n <= 0) {
            System.out.println("Masukkan n yang lebih besar dari 0.");
            return;
        }

        System.out.println("N bilangan prima pertama:");

        int angka = 2; // Dimulai dari bilangan prima pertama
        int jumlahPrima = 0;

        while (jumlahPrima < n) {
            if (adalahPrima(angka)) {
                System.out.print(angka + " ");
                jumlahPrima++;
            }
            angka++;
        }
    }
}
