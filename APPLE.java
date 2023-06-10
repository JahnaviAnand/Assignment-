

import java.util.*;
import java.lang.*;
import java.io.*;


class APPLE
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a+b<=x)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
