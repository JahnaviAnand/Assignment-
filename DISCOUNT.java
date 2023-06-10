

import java.util.*;
import java.lang.*;
import java.io.*;


class DISCOUNT
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    if((a-c)<(b-d))
		    {
		        System.out.println("First");
		    }
		    else if((a-c)>(b-d))
		    {
		        System.out.println("Second");
		    }
		    else
		    {
		         System.out.println("Any");
		    }
		
	}
}
