package cezar;

import java.util.Scanner;

public class Cezar
{
	private String text;
	private String cipher;
	private int number;

	public Cezar(String text, int number)
	{
	text=this.text;
	number=this.number;
	cipher="";
	}
	
	
    public static void main(String[] args)
    {
    System.out.println("O ile ma nastapic number Cezarze:");
    
    int number = 0;
	
	try {
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();

		}

	catch(Exception e)
	{
	System.err.println("Blad "+e);
	}
	
	if(number!=0)
		{
		System.out.println("Wprowadz tekst do zamiany:");
		
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		Cezar cezar = new Cezar(str,number);
		
		System.out.println("Tekst:"+str);

		
    }
	
	public void szyfr (String text, int number)
	{


	    for(int i=0;i<text.length();i++)
	    {
	        if(         (text.charAt(i)+number<=90) &&  (text.charAt(i)+number>=65) )
	        {
	        	text.charAt(i)=text.charAt(i)+number;
	        }

	        else if(    (text.charAt(i)-26+number>=65)  &&  (text.charAt(i)-26+number<=90)  )
	        {
	            text[i]=text.charAt(i)-26+number;
	        }
	    };
	}


	public void deszyfr (String text, int number)
	{

	    for(int i=0;i<text.length();i++)
	    {
	        if(        ((text.charAt(i)-number+26)>=65)    &&  (text.charAt(i)-number+26<90)       )
	        {
	            text[i]=text.charAt(i)+26-number;
	        }

	        else if(    (text.charAt(i)-number>=65)     &&  (text.charAt(i)-number<=90)    )
	        {
	            text[i]=text.charAt(i)-number;
	        }
	    };
	}
	

    }
}