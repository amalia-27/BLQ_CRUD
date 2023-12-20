public class No_17 {
    public static void main(String[] args) {
        String catatanPerjalanan = "NNTNNNTTTTNTTTNTN";

        int jumlahGunung = hitungGunungLembah(catatanPerjalanan, 'N');
        int jumlahLembah = hitungGunungLembah(catatanPerjalanan, 'T');

        System.out.println("Jumlah Gunung: " + jumlahGunung);
        System.out.println("Jumlah Lembah: " + jumlahLembah);
    }

    // Fungsi untuk menghitung jumlah gunung atau lembah
    private static int hitungGunungLembah(String catatanPerjalanan, char jenis) {
        int jumlah = 0;
        int level = 0;

        for (char langkah : catatanPerjalanan.toCharArray()) {
            if (langkah == jenis) {
                level++;
            } else {
                level--;

                // Jika telah kembali ke ketinggian awal, artinya telah selesai melewati gunung atau lembah
                if (level == 0) {
                    jumlah++;
                }
            }
        }

        return jumlah;
    }
}
