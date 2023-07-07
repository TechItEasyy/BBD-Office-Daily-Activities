package com.assesment;

public class assesment2 {
	
	 public static void main(String args[]) {
   int i = 0, j = 0,count=0;
		 for(i=1; i<=100; i++)
		 {
			 int nfactor = 0;
			 for(j=1; j<=i; j++)
			 {
				 if(i%j==0)
				 nfactor += 1;
			 }
			 if(nfactor == 2) {
				 
				 System.out.println(i + " Is a prime number");
				 count++;
			 }	 
		 }
		       System.out.println(count);
	 }
}
