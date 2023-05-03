package day14;

import java.util.ArrayList;

/*
 wrapper class
 - 일반 8대 기본 자료형을 클래스 타입으로 변경한 것
 - int, char, double...
 - Integer, Character, Double... 
*/
class A01<E> {
	public void sumFunc(E n1, E n2) {
		System.out.println(n1 + ", " + n2);
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		A01<Integer> a = new A01<>();
		a.sumFunc(10, 20);
		
		A01<String> a1 = new A01<>();
		a1.sumFunc("aaa", "bbb");
	}
}
