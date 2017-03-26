package cezar;

import java.util.Scanner;

public class Cezar {
	
	public static void main(String[] args) {
		System.out.println("O ile ma nastapic number Cezarze:");

		int number = 0;

		try {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();

		}

		catch (Exception e) {
			System.err.println("Blad " + e);
		}
		
		number= Math.abs(number);
		number = number %26;
		

		if (number != 0) {

			System.out.println("Wprowadz tekst do zamiany:");

			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			
			str = Encode(str,number);
			System.out.println(str);
			
			str = Decode(str,number);
			System.out.println(str);

		
			}

		

	}
	
	private static String Encode(String str, int number)
	{
	char[] text = str.toUpperCase().toCharArray();
		
	for (int i = 0; i < str.length(); i++) {
		if ((text[i] + number <= 90) && (text[i] + number >= 65)) {
		
			text[i]=(char)(text[i]+number);
		
		}

		else if ((text[i] - 26 + number >= 65) && (text[i] - 26 + number <= 90)) {
		
			text[i]=(char)(text[i]+number-26);
		
		}
	}
	return new String(text);
	}
	
	private static String Decode(String str, int number)
	{
	char[] text =str.toUpperCase().toCharArray();
	
	for (int i = 0; i < str.length(); i++) {
		if (((text[i] - number + 26) >= 65) && (text[i] - number + 26 <= 90)) {
			
			text[i]=(char)(text[i]-number+26);

		}

		else if ((text[i] - number >= 65) && (text[i] - number <= 90)) {

			text[i]=(char)(text[i]-number);
		}
	}
	return new String(text);
	}
}