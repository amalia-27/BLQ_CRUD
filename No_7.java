import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No_7 {
    public static void main(String[] args) {
        int[] deretAngka = {8, 7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3};

        double mean = hitungMean(deretAngka);
        int median = hitungMedian(deretAngka);
        int modus = hitungModus(deretAngka);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Modus: " + modus);
    }

    // Fungsi untuk menghitung mean
    public static double hitungMean(int[] deretAngka) {
        int jumlah = 0;

        for (int angka : deretAngka) {
            jumlah += angka;
        }

        return (double) jumlah / deretAngka.length;
    }

    // Fungsi untuk menghitung median
    public static int hitungMedian(int[] deretAngka) {
        Arrays.sort(deretAngka);

        int tengah = deretAngka.length / 2;

        if (deretAngka.length % 2 == 0) {
            // Jika jumlah elemen genap, ambil rata-rata dari dua nilai tengah
            return (deretAngka[tengah - 1] + deretAngka[tengah]) / 2;
        } else {
            // Jika jumlah elemen ganjil, ambil nilai tengah
            return deretAngka[tengah];
        }
    }

    // Fungsi untuk menghitung modus
    public static int hitungModus(int[] deretAngka) {
        int maxValue = 0;
        int maxCount = 0;

    for (int i = 0; i < deretAngka.length; ++i) {
        int count = 0;
        for (int j = 0; j < deretAngka.length; ++j) {
            if (deretAngka[j] == deretAngka[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = deretAngka[i];
        }
    }
    return maxValue;

    }
}
