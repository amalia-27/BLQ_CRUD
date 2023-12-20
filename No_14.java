public class No_14 {
    public static void main(String[] args) {
        int[] deret = {3, 9, 0, 7, 1, 2, 4};
        int N1 = 3;
        int N2 = 1;

        rotasiDeret(deret, N1);
        System.out.print("N = " + N1 + " -> ");
        tampilkanDeret(deret);

        rotasiDeret(deret, N2);
        System.out.print("N = " + N2 + " -> ");
        tampilkanDeret(deret);
    }

    // Fungsi untuk merotasi deret sebanyak N langkah
    private static void rotasiDeret(int[] deret, int N) {
        int panjangDeret = deret.length;
        N = N % panjangDeret;  // Menghindari rotasi lebih dari panjang deret

        // Membuat array sementara untuk menyimpan hasil rotasi
        int[] hasilRotasi = new int[panjangDeret];

        // Melakukan rotasi pada array
        for (int i = 0; i < panjangDeret; i++) {
            hasilRotasi[(i + N) % panjangDeret] = deret[i];
        }

        // Menyalin hasil rotasi kembali ke deret asli
        System.arraycopy(hasilRotasi, 0, deret, 0, panjangDeret);
    }

    // Fungsi untuk menampilkan deret
    private static void tampilkanDeret(int[] deret) {
        for (int angka : deret) {
            System.out.print(angka + " ");
        }
        System.out.println();
    }
}
