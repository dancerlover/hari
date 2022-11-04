package Hari;
import java.util.Scanner;
public class Ones_tens {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              System.out.println("input1:");
              int n1=sc.nextInt();
              System.out.println("input2:");
              int n2=sc.nextInt();
              System.out.println("input3:");
              int n3=sc.nextInt();
              System.out.println("input4:");
              int n4=sc.nextInt();
              int i,i1,i2,ones=0,tens=0,hun=0;
              if(n4==0)
              {
            	  i=n1%10;
            	  i1=n2%10;
            	  i2=n3%10;
            	  ones=i+i1+i2;
              System.out.println("sum of ones value:"+i+"+"+i1+"+"+i2+"="+ones);
              }
              else if(n4==1)
              {
                  if(n1<10)
              {
                    i=1;
              }
                  else {
              
            	  i=n1%100;
                  i/=10;
                  }
                  if(n2<10)
                  {
                	  i1=1;
                  }
                  else {
                  i1=n2%100;
                  i1/=10;
                  }
                  if(n3<10)
                  {
                	  i2=1;
                  }
                  else {
                  i2=n3%100;
                  i2/=10;
                  }
              tens=i+i1+i2;
              System.out.println("sum of ones value:"+i+"+"+i1+"+"+i2+"="+tens);
              }
              else
              {
            	  if(n1<100)
            	  {
            		  i=2;
            	  }
            	  else {
            	  i=n1/10%100;
            	  i/=10;
            	  }
            	  if(n2<100)
            	  {
            		  i1=2;
            	  }
            	  else
            	  {
            	  i1=n2/10%100;
            	  i1/=10;
            	  }if(n3<100)
            	  {
            		  i2=2;
            	  }
            	  else {
            	  i2=n3/10%100;
            	  i2/=10;
            	  }
              hun=i+i1+i2;
              System.out.println("sum of ones value:"+i+"+"+i1+"+"+i2+"="+hun);
              }
            
              
            
              
	}

}
