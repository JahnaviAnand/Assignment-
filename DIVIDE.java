

import java.util.*;
import java.lang.*;
import java.io.*;


class DIVIDE
{
	public static void main (String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		if((n%4)==0){
		    n = n + 1;
		}
		else{
		    n = n - 1;
		}
		System.out.println(n);
	}
}
