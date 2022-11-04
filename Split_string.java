package Hari;
import java.util.Scanner;
public class Split_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("String:");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		for(i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}

}
