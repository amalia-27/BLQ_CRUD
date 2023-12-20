public class No_21 {
    public static void main(String[] args) {
        int distance = 2; // Jumlah langkah lintasan

        String hasil = tentukanUrutanWalkJump(distance);

        System.out.println("Hasil: " + hasil);
    }

    // Fungsi untuk menentukan urutan Walk & Jump minimal
    private static String tentukanUrutanWalkJump(int distance) {
        String urutan = "";
        int stamina = 0; // Stamina awal

        while (distance > 0) {
            if (stamina <= 0) {
                // Jika stamina habis atau negatif, lakukan Jump
                urutan += "J ";
                stamina -= 2;
                distance += 3;
            } else {
                // Jika stamina cukup, lakukan Walk
                urutan += "W ";
                stamina += 1;
                distance -= 1;
            }

            // Jika player tidak dapat maju lebih lanjut, nyatakan sebagai "FAILED"
            if (distance < 0) {
                return "FAILED";
            }
        }

        return urutan.trim();
    }
}
