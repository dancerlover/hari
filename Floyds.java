package Hari;
import java.util.Scanner;
public class Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("rows:");
		int n=sc.nextInt();
		int i,j,s=1;
		for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(s+++"\t");
				
			}
			System.out.println();
		}
	}

}
