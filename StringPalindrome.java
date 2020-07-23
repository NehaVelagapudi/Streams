package com.ts;
import java.util.*;
interface Palindrome
{
	List PalindromeList(List a);
}

class StringParser
{
	public static List findPalindrome(List l)
	{
		List<String> a=l;
		List<String> resList=new ArrayList<String>();
		for(int i=0;i<a.size();i++)
		{
			String s=a.get(i);
			String reverse=new StringBuilder(s).reverse().toString();
			if(s.equals(reverse))
			{
				resList.add(s);
			}
			else
			{
				a.remove(i);
			}
		}
		return resList;
	}
}

class Solution {
	public void print(List al,Palindrome p)
	{
		al = p.PalindromeList(al);
		System.out.println("Palindromes in given List are :"+al);
	}
}

class StringPalindrome
{
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<String>();
		al.add("neha");
		al.add("virat");
		al.add("Robert");
		al.add("Brandon");
		al.add("Taylor");
		Solution sol=new Solution();
		sol.print(al,(StringParser::findPalindrome));
	}


}





