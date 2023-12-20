public class No_22 {
    public static void main(String[] args) {
        int[] panjangLilin = {3, 3, 9, 6, 7, 8, 23};

        int lilinTerakhirHabisMeleleh = tentukanLilinTerakhirHabisMeleleh(panjangLilin);

        if (lilinTerakhirHabisMeleleh != -1) {
            System.out.println("Lilin terakhir habis meleleh: Lilin ke-" + (lilinTerakhirHabisMeleleh + 1));
        } else {
            System.out.println("Semua lilin sudah habis meleleh.");
        }
    }

    // Fungsi untuk menentukan lilin terakhir yang habis meleleh
    private static int tentukanLilinTerakhirHabisMeleleh(int[] panjangLilin) {
        int n = panjangLilin.length;
        int[] lajuMeleleh = new int[n];

        for (int i = 0; i < n; i++) {
            // Menghitung laju meleleh sesuai deret Fibonacci
            lajuMeleleh[i] = hitungLajuMeleleh(i + 1);
        }

        int waktu = 0;
        int[] sisaPanjang = new int[n];

        while (true) {
            for (int i = 0; i < n; i++) {
                if (panjangLilin[i] > 0) {
                    panjangLilin[i] -= lajuMeleleh[i];
                    sisaPanjang[i] = panjangLilin[i];
                }
            }

            waktu++;

            // Memeriksa apakah semua lilin sudah habis meleleh
            if (jumlahLilinHabisMeleleh(sisaPanjang) == n) {
                return n;
            }
        }
    }

    // Fungsi untuk menghitung laju meleleh sesuai deret Fibonacci
    private static int hitungLajuMeleleh(int n) {
        if (n <= 2) {
            return 1;
        }

        int fib1 = 1, fib2 = 1, fib = 0;

        for (int i = 3; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }

    // Fungsi untuk menghitung jumlah lilin yang habis meleleh
    private static int jumlahLilinHabisMeleleh(int[] sisaPanjang) {
        int jumlah = 0;

        for (int panjang : sisaPanjang) {
            if (panjang <= 0) {
                jumlah++;
            }
        }

        return jumlah;
    }
}
