

import java.util.Scanner;
import java.lang.*;
import java.io.*;


class GRADE
{
	public static void main (String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0){

		int Am = sc.nextInt();
		int Bm = sc.nextInt();
		int Cm = sc.nextInt();
		int Tm = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = A + B + C;
		
		if ((sum >= Tm) && (A>=Am) && (B>=Bm) && (C>=Cm)){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
		
		T--;
		}
	}
}
