public class No_19 {
    public static void main(String[] args) {
        String kalimat1 = "Sphinx of black quartz, judge my vow";
        String kalimat2 = "Brawny gods just flocked up to quiz and vex him";
        String kalimat3 = "Check back tomorrow; I will see if the book has arrived";

        System.out.println("Kalimat 1 adalah pangram: " + isPangram(kalimat1));
        System.out.println("Kalimat 2 adalah pangram: " + isPangram(kalimat2));
        System.out.println("Kalimat 3 adalah pangram: " + isPangram(kalimat3));
    }

    // Fungsi untuk mengecek apakah sebuah kalimat adalah pangram atau bukan
    private static boolean isPangram(String kalimat) {
        // Mengubah kalimat menjadi lowercase untuk memudahkan pengecekan
        kalimat = kalimat.toLowerCase();

        // Membuat array untuk menandai keberadaan setiap abjad
        boolean[] abjad = new boolean[26];

        // Menandai keberadaan setiap abjad dalam kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            if (Character.isLetter(karakter)) {
                int indeks = karakter - 'a';
                abjad[indeks] = true;
            }
        }

        // Memeriksa apakah setiap abjad muncul dalam kalimat
        for (boolean hadir : abjad) {
            if (!hadir) {
                return false;
            }
        }

        return true;
    }
}
