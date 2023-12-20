import java.util.Arrays;

public class No_8 {
    public static void main(String[] args) {
        int[] deret = {1, 2, 4, 7, 8, 6, 9};
        int n = 4; // Jumlah komponen yang akan dijumlahkan

        int minValue = cariNilaiMin(deret, n);
        int maxValue = cariNilaiMax(deret, n);

        System.out.println("Nilai minimal dari penjumlahan " + n + " komponen deret: " + minValue);
        System.out.println("Nilai maksimal dari penjumlahan " + n + " komponen deret: " + maxValue);
    }

    // Fungsi untuk mencari nilai minimal dari penjumlahan n komponen deret
    private static int cariNilaiMin(int[] deret, int n) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i <= deret.length - n; i++) {
            int[] subArray = Arrays.copyOfRange(deret, i, i + n);
            int total = Arrays.stream(subArray).sum();
            minValue = Math.min(minValue, total);
        }

        return minValue;
    }

    // Fungsi untuk mencari nilai maksimal dari penjumlahan n komponen deret
    private static int cariNilaiMax(int[] deret, int n) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i <= deret.length - n; i++) {
            int[] subArray = Arrays.copyOfRange(deret, i, i + n);
            int total = Arrays.stream(subArray).sum();
            maxValue = Math.max(maxValue, total);
        }

        return maxValue;
    }
}
