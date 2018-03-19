package com.javaex.ex01;

public class MyList<T> {
			 	// <T> 임의의 변수 T.. <> 꺽쇠 안에 들어가는 클래스명만 받아들이게된다.
				// App 클래스에서 new MyList<Circle>();를 생성해주면 Circle 변수만 Array에 들어갈 수 있게 제한한다. 
			    // List 클래스 - Array 만들고 [i]에 하나씩 add해주는 기능.
	
	protected T[] pArray;
	private int crtPos;
	
	public MyList() {
		this.pArray = (T[])new Object[3];
		this.crtPos = 0;
	}

	public void add(T o) {
		pArray[crtPos]=o;
		crtPos++;
		
	}


	public int size() {
		return crtPos;
		
	}


}
