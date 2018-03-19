package com.javaex.ex02;

import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		
		List<Point> list = new LinkedList<Point>();
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(3,3);
		Point p3 = new Point(4,4);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list.size());
		
		System.out.println(list.get(2));  //Array[2]의 값 출력(toString 메소드가 Point 클래스에 적혀잇어야함, 안적혀있으면 주소값이 나온다.)
		
		Point p = list.get(1);
		System.out.println(p);  // p.toString과 같다.
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		System.out.println("==================");
		
		for (Point pp : list) {						//개꿀팁!!! Point pp : list(출력 원하는 어레이 이름) --> Array를 첨부터 끝까지 출력 할때 씀! (향상된 for문)
			System.out.println(pp.toString());
		}
		
		list.remove(1);   //해당 어레이 [1] 방의 주소값 삭제, 인스턴스의 데이터는 지우지 못함. [1] 주소값이 사라지면 [0]뒤에 [2]의 주소값이 [1]로 앞당겨 옮겨짐. 다닥다닥  
		
		System.out.println("=====");
		Point h = list.get(1);
		for (Point pp : list) {					
			System.out.println(pp.toString());
		}
		System.out.println(h.toString());
		System.out.println("=====");
		
		list.add(1, p1);  // [1] 
		for (Point pp : list) {					
			System.out.println(pp.toString());
		}
	}

}
