import java.util.Arrays;
import java.util.Scanner;

public class No_5 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan panjang deret : ");
		int input = scan.nextInt();

		int n = input;
		int pass = 1;
		int current = 1;
		int [] fibonacci = new int [n];
		
		for(int i = 0; i < 2; i++) {
			fibonacci [i] = i;
		}
		
		for (int i = 2; i < n; i++) {
			fibonacci[i] = pass + current;
			pass = current;
			current = fibonacci[i];
		}
        System.out.println("N bilangan fibonacci pertama: ");
		System.out.print(Arrays.toString(fibonacci));
    }
}
