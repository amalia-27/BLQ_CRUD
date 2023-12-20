public class No_20 {
    public static void main(String[] args) {
        // Contoh kombinasi jarak awal dan suit
        int[] jarakAwalList = {2, 3, 1, 4};
        String[] suitAList = {"G", "B", "K", "G"};
        String[] suitBList = {"K", "G", "B", "B"};

        // Menentukan pemenang game
        String pemenang = tentukanPemenang(jarakAwalList, suitAList, suitBList);

        System.out.println(pemenang);
    }

    // Fungsi untuk menentukan pemenang game suit
    private static String tentukanPemenang(int[] jarakAwalList, String[] suitAList, String[] suitBList) {
        for (int i = 0; i < jarakAwalList.length; i++) {
            // Menentukan jarak antara A dan B setelah suit
            int jarakAntaraAB = Math.abs(jarakAwalList[i]);

            // Menentukan hasil suit antara A dan B
            String hasilSuit = tentukanHasilSuit(suitAList[i], suitBList[i]);

            // Memperbarui jarak antara A dan B berdasarkan hasil suit
            if (hasilSuit.equals("A Menang")) {
                jarakAwalList[i] -= 2;
            } else if (hasilSuit.equals("B Menang")) {
                jarakAwalList[i] += 1;
            }

            // Memeriksa apakah jarak antara A dan B sudah menjadi nol
            if (jarakAntaraAB == 0) {
                return hasilSuit;
            }
        }

        // Jika sampai akhir suit jarak antara A dan B belum sama dengan nol, hasilnya "Draw"
        return "Draw";
    }

    // Fungsi untuk menentukan hasil suit antara A dan B
    private static String tentukanHasilSuit(String suitA, String suitB) {
        if (suitA.equals("G") && suitB.equals("B") ||
                suitA.equals("B") && suitB.equals("K") ||
                suitA.equals("K") && suitB.equals("G")) {
            return "A Menang";
        } else if (suitB.equals("G") && suitA.equals("B") ||
                suitB.equals("B") && suitA.equals("K") ||
                suitB.equals("K") && suitA.equals("G")) {
            return "B Menang";
        } else {
            return "Draw";
        }
    }
}
