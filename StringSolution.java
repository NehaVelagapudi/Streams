package com.ts;
import java.util.*;
import java.util.stream.Collectors;

public class StringSolution {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Blue");
		l.add("Black");
		l.add("Purple");
		l.add("Grey");
		l.add("Violet");
		List<String> res=l.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.print(res);

	}

}
