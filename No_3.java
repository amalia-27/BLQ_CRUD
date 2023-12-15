import java.time.LocalDateTime;
import java.time.Duration;
public class No_3 {
    public static void main(String[] args) {
        // Contoh penggunaan fungsi untuk menghitung tarif parkir
        LocalDateTime masuk1 = LocalDateTime.of(2019, 1, 27, 5, 0, 1);
        LocalDateTime keluar1 = LocalDateTime.of(2019, 1, 27, 17, 45, 3);

        System.out.println("Tarif Parkir 1: " + hitungTarifParkir(masuk1, keluar1));

        LocalDateTime masuk2 = LocalDateTime.of(2019, 1, 27, 7, 3, 59);
        LocalDateTime keluar2 = LocalDateTime.of(2019, 1, 27, 15, 30, 6);

        System.out.println("Tarif Parkir 2: " + hitungTarifParkir(masuk2, keluar2));

        LocalDateTime masuk3 = LocalDateTime.of(2019, 1, 27, 7, 5, 0);
        LocalDateTime keluar3 = LocalDateTime.of(2019, 1, 28, 0, 20, 21);

        System.out.println("Tarif Parkir 3: " + hitungTarifParkir(masuk3, keluar3));

        LocalDateTime masuk4 = LocalDateTime.of(2019, 1, 27, 11, 14, 23);
        LocalDateTime keluar4 = LocalDateTime.of(2019, 1, 27, 13, 20, 0);

        System.out.println("Tarif Parkir 4: " + hitungTarifParkir(masuk4, keluar4));
    }

    // Fungsi untuk menghitung tarif parkir
    public static int hitungTarifParkir(LocalDateTime masuk, LocalDateTime keluar) {
        Duration durasiParkir = Duration.between(masuk, keluar);
        long jamParkir = durasiParkir.toHours();
        
        if (jamParkir <= 8) {
            // Tarif untuk 8 jam pertama
            return (int) jamParkir * 1000;
        } else if (jamParkir <= 24) {
            // Tarif flat untuk 8 jam 1 detik - 24 jam
            return 8000;
        } else {
            // Tarif untuk 24 jam 1 detik - 8 jam kemudian
            return 15000 + (int) (jamParkir - 24) * 1000;
        }
    }
}
