import java.util.Scanner;

public class No_6 {
    public static boolean Palindrome(String input) {
		//palindrome = kata yg di balik sama dengan kata awal
		//katak = katak -> true
		//kasur rusak = kasur rusak -> true
		//bola=alob -> false
		boolean hasil=false;
		char balik=' ';
		char tetap=' ';
		for(int i=input.length()-1; i>=0 ;i--) {
			balik = input.charAt(i);
		}
		for(int i=0; i<input.length() ;i++) {
			tetap = input.charAt(i);
		}
		if(balik==tetap) {
			hasil=true;
		}
		return hasil;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan kalimat: ");
		String input= scan.nextLine();

		System.out.println("Nilai Palindrome "+input+" = "+Palindrome(input.toLowerCase()));
    }
}
