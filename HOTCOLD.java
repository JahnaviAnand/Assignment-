

import java.util.*;
import java.lang.*;
import java.io.*;

class HOTCOLD
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i= 0; i<t; i++){
	        int C = sc.nextInt();
	        if(C>20){
	            System.out.println("HOT");
	        }else{
	            System.out.println("COLD");
	        }
	    }// your code goes here
	}
}
