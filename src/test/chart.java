package test;

import java.util.Scanner;


public class chart {

	public static void main(String[] args, Object String) 
	{   
		System.out.println("请输入一个参数n：");
		Scanner s=new Scanner(System.in);
		Integer n;
	    n=s.nextInt();
	    System.out.println(n);
	   char a[][]=new char[100][100];
	   for(int i=1;i<n;i++)
	   {
		   for(int j=1;j<2*n-1;j++)
		   {
			   if((i+j>n)&&(i+j)<n+2*i)
			   {
				   a[i][j]='*';
			   }
			   
		   }
	   }
            for(int i=1;i<n;i++)
            {
            	for(int j=1;j<2*n-1;j++)
            	{
            		System.out.print(a[i][j]);
            	}
            	System.out.print("\n");
            }
	}

}
