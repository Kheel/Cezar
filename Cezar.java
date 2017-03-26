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
			
			String str = scanner.nextLine();	
			System.out.println(str);
			
			System.out.println(str.length());
			
			str = Encode(str,number);
			System.out.println(str);
			
			str = Decode(str,number);
			System.out.println(str);

		
			}

		

	}
	
	private static String Encode(String str, int number)
	{
		str=str.toUpperCase();
		StringBuilder builder = new StringBuilder();
		
	for (int i = 0; i < str.length(); i++) {
		
		if(str.charAt(i)==32)
		{
			builder.append(" ");
		}
		
		if ((str.charAt(i) + number <= 90) && (str.charAt(i) + number >= 65)) {
		
		
			builder.append((char)(str.charAt(i)+number));
			//System.out.println(i+" "+builder);
		
		}

		else if ((str.charAt(i) - 26 + number >= 65) && (str.charAt(i) - 26 + number <= 90)) {
		
			builder.append((char)(str.charAt(i)+number-26));
			//System.out.println(i+" "+builder);
		
		}
	}
	
	return builder.toString();
	}
	
	private static String Decode(String str, int number)
	{
		str=str.toUpperCase();
		StringBuilder builder2 = new StringBuilder();
		
	
	for (int i = 0; i < str.length(); i++) {
		
		if(str.charAt(i)==32)
		{
			builder2.append(" ");
		}
		
		if (((str.charAt(i) - number + 26) >= 65) && (str.charAt(i) - number + 26 <= 90)) {
			
			builder2.append((char)(str.charAt(i)-number+26));
			//System.out.println(i+" "+builder2);
			

		}

		else if ((str.charAt(i) - number >= 65) && (str.charAt(i) - number <= 90)) {

			builder2.append((char)(str.charAt(i)-number));
			//System.out.println(i+" "+builder2);
			
		}
	}
	return builder2.toString();
	}
}