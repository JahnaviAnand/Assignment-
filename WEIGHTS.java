

import java.util.*;
import java.lang.*;
import java.io.*;

class WEIGHTS
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){

int w=sc.nextInt();
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();

if(w==x+y+z || w==x+y || w==y+z || w==x+z || w==x|| w==y || w==z){


System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
	}	
	    
	
}
