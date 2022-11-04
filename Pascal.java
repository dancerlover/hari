package Hari;
import java.util.Scanner;
public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("rows:");
           int r=sc.nextInt();
           int a[][]=new int[r][r];
           int i,j,k;
           a[0][0]=1;
           for(i=1;i<r;i++)
           {
        	   a[i][0]=1;
        	   
        	   for(j=1;j<=i;j++)
        	   {
        		   a[i][j]=a[i-1][j-1]+a[i-1][j];
        	   }
        	 
           }
           
           for(i=0;i<r;i++)
           {
        	   for(k=0;k<r-1;k++)
        	   {
        		   System.out.print(" ");
        	   }
        	   for(j=0;j<=i;j++) {
        		   System.out.print(" "+a[i][j]+" ");
        	   }
        	   System.out.println(" ");
           }
	}

}
