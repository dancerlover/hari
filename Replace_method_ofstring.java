package Hari;
import java.util.Scanner;
public class Replace_method_ofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("String:");
		String s=sc.nextLine();
		int i;
		char c[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
            
            if(c[i]=='a'||c[i]=='e'|c[i]=='i'||c[i]=='o'||c[i]=='u')
            {
		      c[i]='*';
            }
            System.out.print(c[i]);
		}
		System.out.println("String:");
		String s1=sc.nextLine();
		String s2=s1.replaceAll("[aAeEiIoOuU]", "*");
		System.out.println(":"+s2);
		
	}
	
	

}
