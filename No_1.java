import java.util.Arrays;
import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Uang: ");
        int uang = in.nextInt();
        int count = 0;
        String messagekacamata = " ";
        String messagebaju = " ";
        String messagesepatu = " ";
        String messagebuku = " ";
        String message = " ";
        int[] hargaKacamata = {500,600,700,800};
        int[] hargaBaju = {200,400,350};
        int[] hargaSepatu = {400,350,200,300};
        int[] hargaBuku = {100,50,150};
        Arrays.sort(hargaKacamata);
        Arrays.sort(hargaBaju);
        Arrays.sort(hargaSepatu);
        Arrays.sort(hargaBuku);
        int iKacamata = 0;
        int iBaju = 0;
        int iSepatu = 0;
        int iBuku = 0;
        // while (iKacamata < hargaKacamata.length && uang >= hargaKacamata[iKacamata]) {
        //     uang -= hargaKacamata[iKacamata];
        //     count++;
        //     messagekacamata = "kaca_mata " + hargaKacamata[iKacamata];
        //     if (messagekacamata != null && !messagekacamata.isEmpty()) {
        //         message += messagekacamata + " ";
        //     }
        //     while (iBaju < hargaBaju.length && uang >= hargaBaju[iBaju]) {
        //         uang -= hargaBaju[iBaju];
        //         count++;
        //         messagebaju += "baju "+hargaBaju[iBaju];
        //         if (messagebaju != null && !messagebaju.isEmpty()) {
        //             message += messagebaju+ " ";
        //         }

        //         while (iSepatu < hargaSepatu.length && uang >= hargaSepatu[iSepatu]) {
        //             uang -= hargaSepatu[iSepatu];
        //             count++;
        //             messagesepatu = "sepatu "+hargaSepatu[iSepatu];
        //             if (messagesepatu != null && !messagesepatu.isEmpty()) {
        //                 message += messagesepatu + " ";
        //             }
        //             while (iBuku < hargaBuku.length && uang >= hargaBuku[iBuku]) {
        //                 uang -= hargaBuku[iBuku];
        //                 count++;
        //                 messagebuku = "buku "+hargaBuku[iBuku];
        //                 iBuku++;
        //                 if (messagebuku != null && !messagebuku.isEmpty()) {
        //                     message += messagebuku + " ";
        //                 }
        //             }
        //             iSepatu++;
        //         }
        //         iBaju++;
        //     }
        //     iKacamata++;
        // }
        for (iKacamata = 0; iKacamata < hargaKacamata.length && uang >= hargaKacamata[iKacamata]; iKacamata++) {
            uang -= hargaKacamata[iKacamata];
            count++;
            messagekacamata = "kaca_mata " + hargaKacamata[iKacamata];
            if (messagekacamata != null && !messagekacamata.isEmpty()) {
                message += messagekacamata + " ";
            }
            for (iBaju = 0;iBaju < hargaBaju.length && uang >= hargaBaju[iBaju]; iBaju++) {
                uang -= hargaBaju[iBaju];
                count++;
                messagebaju += "baju "+hargaBaju[iBaju];
                if (messagebaju != null && !messagebaju.isEmpty()) {
                    message += messagebaju+ " ";
                }

                for (iSepatu = 0; iSepatu < hargaSepatu.length && uang >= hargaSepatu[iSepatu]; iSepatu++) {
                    uang -= hargaSepatu[iSepatu];
                    count++;
                    messagesepatu = "sepatu "+hargaSepatu[iSepatu];
                    if (messagesepatu != null && !messagesepatu.isEmpty()) {
                        message += messagesepatu + " ";
                    }
                    for (iBuku=0; iBuku < hargaBuku.length && uang >= hargaBuku[iBuku]; iBuku++) {
                        uang -= hargaBuku[iBuku];
                        count++;
                        messagebuku = "buku "+hargaBuku[iBuku];
                        // iBuku++;
                        if (messagebuku != null && !messagebuku.isEmpty()) {
                            message += messagebuku + " ";
                        }
                    }
                    // iSepatu++;
                }
                // iBaju++;
            }
            // iKacamata++;
        }
        System.out.println("Jumlah item yang dibeli: "+count);
        System.out.print("("+message+")");
    }
}
