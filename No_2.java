import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class No_2 {
    public static void main(String[] args) {
        // Menentukan rentang waktu
        LocalDate startDate1 = LocalDate.of(2016, 2, 28);
        LocalDate endDate1 = LocalDate.of(2016, 3, 7);

        LocalDate startDate2 = LocalDate.of(2018, 4, 29);
        LocalDate endDate2 = LocalDate.of(2018, 5, 30);

        // Menghitung denda untuk setiap rentang waktu
        int denda1 = hitungDenda(startDate1, endDate1);
        int denda2 = hitungDenda(startDate2, endDate2);

        // Menampilkan hasil
        System.out.println("Denda untuk rentang waktu 1: " + denda1);
        System.out.println("Denda untuk rentang waktu 2: " + denda2);
    }

    // Metode untuk menghitung denda
    private static int hitungDenda(LocalDate startDate, LocalDate endDate) {
        // Data buku yang dipinjam
        String[] namaBuku = {"A", "B", "C", "D"};
        int[] durasiPeminjaman = {14, 3, 7, 7};

        int totalDenda = 0;

        for (int i = 0; i < namaBuku.length; i++) {
            LocalDate dueDate = startDate.plusDays(durasiPeminjaman[i]);
            long daysOverdue = ChronoUnit.DAYS.between(dueDate, endDate);

            // Jika terlambat mengembalikan, tambahkan denda
            if (daysOverdue > 0) {
                int denda = (int) daysOverdue * 100;
                totalDenda += denda;
                // System.out.println("Denda untuk buku " + namaBuku[i] + ": " + denda);
            }
        }
        return totalDenda;
    }
}