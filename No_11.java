import java.util.Scanner;

public class No_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String in = input.nextLine();
        reverseLetters(in);
    }

    // Fungsi untuk reverse
    private static void reverseLetters(String kata) {
        for (int i = kata.length() - 1; i >= 0; i--) {
            char huruf = kata.charAt(i);
            System.out.println("**" + huruf + "**");
           
        }
    }
}
