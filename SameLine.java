package org.patern.Alphabet;

import java.util.Scanner;
/*
			A
			BB
			CCC
			DDDD
			EEEEE

 */
public class SameLine 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}

	private static void printPattern(int n)
	{
		int alpha = 65;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
				System.out.print((char)alpha);
			alpha++;
			System.out.println();
		}
	}
}
