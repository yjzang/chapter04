package com.javaex.ex02;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {

	public static void main(String[] args) {


		Map<String, Point> map = new HashMap<String, Point>();
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point p4 = new Point(4,4);
		
		
		map.put("권상우", p1);
		map.put("정우성", p2);
		map.put("손예진", p3);   // Map은 값을 넣어주는 문법이 add가 아니라 put이다.
		map.put("김태희", p4);   // Map은 키와 값을 같이 넣어주어야한다.
		
		
		System.out.println(map.get("김태희"));
		System.out.println(map.size());
		
		map.put("이효리", p1);  // "이효리"는 방의 태그(이름)이다. 이효리 방에 p1값을 넣는다는 뜻이다.
								// Map은 방의 순서가 없다. 그저 태그(키)만 보고 방을 찾아간다.
		
		
	
	}

}
