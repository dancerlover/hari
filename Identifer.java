package Hari;

import java.util.Scanner;

public class Identifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("string:");
		String n=sc.nextLine();
		String r=" ";
		char s[]=n.toCharArray();
		int i;
		for(i=0;i<s.length;i++)
		{
			if(Character.isAlphabetic(s[i]))
			{
				r+=String.valueOf(n.charAt(i));
				System.out.println("alphas:"+r);
			}
			else if(Character.isDigit(s[i]))
			{
			     System.out.println(" digits:"+s[i]);	
			}
			else
			{
				System.out.println("special chars:"+s[i]);
			}
		

	}


	}

}
