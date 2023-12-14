import java.util.Arrays;
import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Uang: ");
        int uang = in.nextInt();
        int total = 0 ;
        int count = 0;
        String messagekacamata = " ";
        String messagebaju = " ";
        String messagesepatu = " ";
        String messagebuku = " ";
        String message = "";
        int[] hargaBarang = {500,200,400,100};
        Arrays.sort(hargaBarang);
        for (int i = 0; i < hargaBarang.length && uang >= hargaBarang[i]; i++) {
            uang -= hargaBarang[i];
            count++;
            // if (hargaBarang[i]=500) {
            //     messagekacamata = "kacamata 500";
            // }else if (hargaBarang[i]=200) {
            //     messagebaju = "baju 200";
            // } else if (hargaBarang[i]=400) {
            //     messagesepatu = "sepatu 400";
            // }else if (hargaBarang[i]=100) {
            //     messagebuku = "buku 100";
            // }
        }
        System.out.println(count);
        if (messagekacamata != null && !messagekacamata.isEmpty()) {
            message += messagekacamata + ", ";
        }

        // Memeriksa dan menggabungkan kalimat2
        if (messagebaju != null && !messagebaju.isEmpty()) {
            message += messagebaju+ ", ";
        }

        // Memeriksa dan menggabungkan kalimat3
        if (messagesepatu != null && !messagesepatu.isEmpty()) {
            message += messagesepatu + ", ";
        }

        // Memeriksa dan menggabungkan kalimat4
        if (messagebuku != null && !messagebuku.isEmpty()) {
            message += messagebuku;
        }
        System.out.println(message);
    }
}
