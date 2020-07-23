package com.ts;
import java.util.*;

public class AverageCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the List size :");
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			a.add(num);
			}
		
		a.stream().mapToInt(i->i).average().ifPresent(avg-> System.out.println("Average of the  Numbers is"+" "+ avg));

	}

}




