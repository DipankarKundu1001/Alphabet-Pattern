package org.patern.Alphabet;

import java.util.Scanner;
/*
			A
			AB
			ABC
			ABCD
			ABCDE

 */
public class RightTrag 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}
	
	private static void printPattern(int n)
	{
		for(int i = 0; i < n; i++)
		{
			int alpha=65;
			for(int j = 0; j <= i; j++)
			{	
				System.out.print((char)alpha);
				alpha++;
			}	
			System.out.println();
		}
	}

}
