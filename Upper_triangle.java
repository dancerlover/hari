package Hari;

import java.util.Scanner;

public class Upper_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("row:");
        int rs=sc.nextInt();
        System.out.println("columns:");
        int cs=sc.nextInt();
        int i,j;
        int[][] a=new int[rs][cs];
        int[][] a1=new int[rs][cs];
        System.out.println("elements:");
        for(i=0;i<rs;i++)
        {
      	  for(j=0;j<cs;j++)
      	  {
      		  
      		  a[i][j]=sc.nextInt();
      	  }
      	 
        }
 System.out.println("A:");
        
        for(i=0;i<rs;i++)
        {
      	  for(j=0;j<cs;j++)
      	  {
      		  
      		  System.out.print(a[i][j]+"\t");
      	  }
      	  System.out.println();
        }
        System.out.println("lower triangle:");
        for(i=0;i<rs;i++)
        {
        	for(j=0;j<cs;j++)
        	{
        		if(j<=i)
        			System.out.print(a[i][j]);
        	}
        	System.out.println();
        }
        System.out.println("upper  triangle:");
        for(i=0;i<rs;i++)
        {
        	for(j=0;j<cs;j++)
        	{
        		if(i<=j)
        			System.out.print(a[i][j]);
        	}
        	System.out.println();
        }

	}

}
