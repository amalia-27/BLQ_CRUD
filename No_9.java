import java.util.Scanner;

public class No_9 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int temp = 0;
        for (int i = 0; i < input; i++) {
            temp+=input;
            System.out.print(temp + " ");
        }
    }
}
