import java.text.SimpleDateFormat;
import java.util.Scanner;

public class No_15 {
    public static String formatTime(String jam) {
		String totaljam=" ";
        String code = jam.substring(jam.length()-2, jam.length());
		try {
            // konversi dari 24H  -> 12H
			SimpleDateFormat date24Format = new SimpleDateFormat("hh:mm");
        	SimpleDateFormat date12Format = new SimpleDateFormat("KK:mm a");
            if(code.equals("AM")){
        	    totaljam=date12Format.format(date24Format.parse(jam));
            }else if(code.equals("PM")){
                totaljam=date24Format.format(date12Format.parse(jam));
            }
		} catch (Exception e) {
			//TODO: handle exception
		}
		return totaljam;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		System.out.println("Masukan waktu dalam format 24h atau 12h\n(00:00 atau 00:00 PM/AM): ");
		String input = scan.nextLine().toUpperCase();
		
		String codeMalam = "PM";
		String code = (String) input.subSequence(input.length()-2, input.length());
		code.toUpperCase();
		String duaAwal = (String) input.subSequence(0, 2);
		int angkaAwal = Integer.parseInt(duaAwal);//String to integer
		int penampung = 0;
		String penampungStr = "";
		String hasil = "";

		if (input.length() > 5) {
			if (code.equals(codeMalam)) {
				penampung = angkaAwal + 12;
				penampungStr = String.valueOf(penampung);// Integer to String
				hasil = penampungStr.concat((String) input.subSequence(2, input.length()-2));
				System.out.println(hasil);	
			}
			else {
				penampung = angkaAwal;
				penampungStr = String.valueOf(penampung);// Integer to String
				hasil = penampungStr.concat((String) input.subSequence(2, input.length()-2));
				System.out.println(hasil);	
			}
		}
		else {
			if(angkaAwal < 12) {
				penampung = angkaAwal;
				penampungStr = String.valueOf(penampung);// Integer to String
				hasil = penampungStr.concat((String) input.subSequence(2, input.length())+" AM");
				System.out.println(hasil);
				
			}else {
				penampung = angkaAwal - 12;
				penampungStr = String.valueOf(penampung);// Integer to String
				hasil = penampungStr.concat((String) input.subSequence(2, input.length())+" PM");
				System.out.println(hasil);
			}
			
		}
    }


}
