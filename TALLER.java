

import java.util.*;
import java.lang.*;
import java.io.*;


class TALLER
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner inp=new Scanner(System.in);
          int t=inp.nextInt();int a,b;
          while(t-->0){
              a=inp.nextInt(); 
              b=inp.nextInt();
              if(a>b)System.out.println("A");
              else System.out.println("B");
              
          }
	}
}
