package com.madusha.spring.romeo.intermediate;

public class Intermediate {
	
	public static long main(String[] args) {
		
		System.out.println(fact(5));
		return "hi";
		
}		

		public static long fact(long n) {
			if (n <= 1)
				return 1;
			else
				return n*fact(n-1);
		}
	}


