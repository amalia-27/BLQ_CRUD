import java.util.ArrayList;

public class No_16 {
    public static void main(String[] args) {
        // Menentukan menu makanan dan harganya
        ArrayList<MenuMakanan> menuMakanan = new ArrayList<>();
        menuMakanan.add(new MenuMakanan("Tuna Sandwich", 42000, true)); // Mengandung ikan
        menuMakanan.add(new MenuMakanan("Spaghetti Carbonara", 50000, false));
        menuMakanan.add(new MenuMakanan("Tea pitcher", 30000, false));
        menuMakanan.add(new MenuMakanan("Pizza", 70000, false));
        menuMakanan.add(new MenuMakanan("Salad", 30000, false));

        // Menghitung total biaya makanan
        double totalBiayaMakanan = hitungTotalBiaya(menuMakanan);

        // Menghitung total biaya setelah pajak dan service
        double totalBiayaSetelahPajakService = hitungTotalSetelahPajakService(totalBiayaMakanan);

        // Menghitung biaya yang harus dibayar oleh masing-masing teman
        hitungBiayaPembayaran(menuMakanan, totalBiayaSetelahPajakService);
    }

    // Kelas untuk merepresentasikan menu makanan
    static class MenuMakanan {
        String nama;
        double harga;
        boolean mengandungIkan;

        MenuMakanan(String nama, double harga, boolean mengandungIkan) {
            this.nama = nama;
            this.harga = harga;
            this.mengandungIkan = mengandungIkan;
        }
    }

    // Fungsi untuk menghitung total biaya makanan
    private static double hitungTotalBiaya(ArrayList<MenuMakanan> menuMakanan) {
        double totalBiaya = 0;
        for (MenuMakanan menu : menuMakanan) {
            totalBiaya += menu.harga;
        }
        return totalBiaya;
    }

    // Fungsi untuk menghitung total biaya setelah pajak dan service
    private static double hitungTotalSetelahPajakService(double totalBiaya) {
        double pajak = 0.1 * totalBiaya; // Pajak 10%
        double service = 0.05 * totalBiaya; // Service 5%
        return totalBiaya + pajak + service;
    }

    // Fungsi untuk menghitung biaya pembayaran masing-masing teman
    private static void hitungBiayaPembayaran(ArrayList<MenuMakanan> menuMakanan, double totalBiayaSetelahPajakService) {
        int jumlahTeman = 4;

        double biayaTemanalergi = 0.0;
        double biayaPerTeman = 0.0;

        for (MenuMakanan menu : menuMakanan) {
            if (menu.mengandungIkan) {
                biayaTemanalergi = (totalBiayaSetelahPajakService - menu.harga)/jumlahTeman;
            } else {
                biayaPerTeman = totalBiayaSetelahPajakService / jumlahTeman;
            }
        }
        System.out.println("Pembayaran teman yang alergi: Rp."+biayaTemanalergi);
        System.out.println("Pembayaran per teman: Rp."+biayaPerTeman);
    }
}
