public class No_10 {
    public static void main(String[] args) {
        String nama = "Susilo Bambang Yudhoyono";
        String namaTerkasih = maskNama(nama);

        System.out.println(namaTerkasih);
    }

    // Fungsi untuk mengganti karakter pada nama
    private static String maskNama(String nama) {
        // Memisahkan nama menjadi kata-kata
        String[] kataKata = nama.split(" ");

        StringBuilder hasil = new StringBuilder();
        for (String kata : kataKata) {
            // // Menambahkan karakter pertama
            hasil.append(kata.charAt(0));
            // Menambahkan bintang untuk setiap karakter selain karakter pertama
            for (int i = 1; i < 3; i++) {
                hasil.append('*');
            }
            for (int i = 1; i < 2; i++) {
                hasil.append(kata.charAt(kata.length()-1));
            }
            //Menambahkan spasi jika bukan kata terakhir
            if (!kata.equals(kataKata[kataKata.length - 1])) {
                hasil.append(' ');
            }
        }

        return hasil.toString();
    }
}
