

import java.util.*;
import java.lang.*;
import java.io.*;


class VOWEL
{
	public static void main (String[] args) 
	{
	Scanner input = new Scanner(System.in);
		char a =input.next().charAt(0);
		if(a=='A' || a =='E'|| a == 'I' || a== 'O' || a == 'U')
		{
		    System.out.println("Vowel");
		}
		else
		{
		    System.out.println("Consonant");
		}
		
	}
}
