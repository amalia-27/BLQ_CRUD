import java.util.Scanner;

public class No_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jam: (ex: 5:30) ");
        String in = input.nextLine();
        String[] waktu = in.split(":");
        int jam = Integer.valueOf(waktu[0]);
        int menit = Integer.valueOf(waktu[1]);
        int sudut1 = hitungDerajatSudut(jam, menit);
        System.out.println("Jam " + jam + ":" + menit + " -> " + sudut1 + " derajat");
    }
    private static int hitungDerajatSudut(int jam, int menit) {
        // rumus derajat sudut = 30 x jam - (11/2 x menit)
        int derajatSudut = Math.abs((30 * jam) - (int) (5.5 * menit));
        return Math.min(360 - derajatSudut, derajatSudut);
    }
}
