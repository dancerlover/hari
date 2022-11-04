package Hari;
import java.util.Scanner;
public class Add_matrix {

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
             System.out.println("second array:");
              for(i=0;i<rs;i++)
              {
            	  for(j=0;j<cs;j++)
            	  {
            		  
            		  a1[i][j]=sc.nextInt();
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
              
              System.out.println("B:");
              
              for(i=0;i<rs;i++)
              {
            	  for(j=0;j<cs;j++)
            	  {
            		  
            		  System.out.print(a1[i][j]+"\t");
            	  }
            	  System.out.println();
              }
              System.out.println("sum of arrays:");
              int[][] sum=new int[rs][cs];
              for(i=0;i<rs;i++)
              {
            	  for(j=0;j<cs;j++)
            	  {
            		  sum[i][j]=a[i][j]+a1[i][j];
            	  }
              }
              for(i=0;i<rs;i++)
              {
            	  for(j=0;j<cs;j++)
            	  {
            		  System.out.print(sum[i][j]+"\t");
            	  }
            	  System.out.println();
              }
	}

}
