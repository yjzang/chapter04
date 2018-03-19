package com.javaex.ex02;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			int num = (int)(Math.random()*45)+1;    // set 중복인 값이 뜨면 알아서 거른다.
			set.add(num);
		}

		for(int lottoNo : set) {
			System.out.print(lottoNo + " " );
			
		}
	}
}
