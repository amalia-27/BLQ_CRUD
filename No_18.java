import java.util.ArrayList;
import java.util.List;

public class No_18 {
    public static void main(String[] args) {
        // Menentukan jam makan dan kalori dari kue yang dimakan Donna
        List<JamMakan> jamMakanList = new ArrayList<>();
        jamMakanList.add(new JamMakan(9, 30));
        jamMakanList.add(new JamMakan(13, 20));
        jamMakanList.add(new JamMakan(15, 50));
        jamMakanList.add(new JamMakan(17, 80));

        // Menghitung total kalori dan waktu olahraga
        int totalKalori = hitungTotalKalori(jamMakanList);
        double waktuOlahraga = hitungWaktuOlahraga(totalKalori);

        // Menghitung jumlah air yang akan diminum Donna selama berolahraga
        double jumlahAir = hitungJumlahAir(waktuOlahraga);

        System.out.println("Donna akan minum " + jumlahAir + " cc air selama berolahraga.");
    }

    // Kelas untuk merepresentasikan jam makan dan kalori
    static class JamMakan {
        int jam;
        int kalori;

        JamMakan(int jam, int kalori) {
            this.jam = jam;
            this.kalori = kalori;
        }
    }

    // Fungsi untuk menghitung total kalori dari kue yang dimakan Donna
    private static int hitungTotalKalori(List<JamMakan> jamMakanList) {
        int totalKalori = 0;
        for (JamMakan jamMakan : jamMakanList) {
            totalKalori += jamMakan.kalori;
        }
        return totalKalori;
    }

    // Fungsi untuk menghitung waktu olahraga berdasarkan total kalori
    private static double hitungWaktuOlahraga(int totalKalori) {
        int totaljam = 0;
        return 0.1 * totalKalori;
    }

    // Fungsi untuk menghitung jumlah air yang akan diminum Donna selama berolahraga
    private static double hitungJumlahAir(double waktuOlahraga) {
        double jumlahAir = 0;

        // Menghitung jumlah air untuk setiap 30 menit berolahraga
        while (waktuOlahraga >= 0.5) {
            jumlahAir += 100;
            waktuOlahraga -= 0.5;
        }

        // Menghitung jumlah air di akhir olahraga
        jumlahAir += 500;

        return jumlahAir;
    }
}
