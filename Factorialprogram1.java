package com.practiseprograms;

public class Factorialprogram1 {
	//program using without loop
	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return(n*fact(n-1));
	}

public static void main(String args[]) {
	int f=fact(5);
	System.out.println("5 factorial result is"  + f);
}

}
