package Hari;

import java.util.Scanner;

public class Transpose {

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
        int[][] trans=new int[rs][cs];
        for(i=0;i<rs;i++)
        {
        	for(j=0;j<cs;j++)
        	{
        		trans[i][j]=a[j][i];
        	}
        }
        System.out.println("transpose of matrix");
        for(i=0;i<rs;i++)
        {
        	for(j=0;j<cs;j++)
        	{
        		System.out.print(trans[i][j]+"\t");
        	}
        	System.out.println();
        }
	}

}
