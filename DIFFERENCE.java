

import java.util.*;
import java.lang.*;
import java.io.*;


class DIFFERENCE
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		
		int N1=s.nextInt();
		int N2=s.nextInt();
		
		if(N1>N2){
		    System.out.print(N1-N2);
		}
		else{
		    System.out.print(N1+N2);
		}
	}
}
