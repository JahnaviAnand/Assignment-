

import java.util.*;
import java.lang.*;
import java.io.*;


class AREA
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int breath = s.nextInt();
		int area = length*breath;
		int perimeter = 2*(length+breath);
		if(area>perimeter){
		System.out.println("Area");
		System.out.println(area);
		}
		else if(perimeter>area){
		System.out.println("Peri");
		System.out.println(perimeter);
		}
		else{
		System.out.println("Equal");
		System.out.println(area);
		}
	}
}
