package Hari;
import java.util.Scanner;
public class Method_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc=new Scanner(System.in);
             System.out.println("string:");
             String s=sc.nextLine();
             int i;
             for(i=0;i<s.length();i++)
             {
            	 char c=s.charAt(i);
            	 if(c=='o')
            	 System.out.print(c);
             }
            System.out.println(" contains method:"+s.contains("o"));
	}

}
