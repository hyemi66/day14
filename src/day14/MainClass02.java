package day14;

import java.util.ArrayList;

class Member {
	private String name, addr;

	public String getName() { return name; } 
	public void setName(String name) { this.name = name; }

	public String getAddr() { return addr; } 
	public void setAddr(String addr) { this.addr = addr; }
	
}
public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		Member m1 = new Member();
		m1.setAddr("산골짜기");
		m1.setName("홍길동");
		list.add(m1);
		Member m01 = list.get(0);
		System.out.println(m01.getName());
		System.out.println(m01.getAddr());
		
		Member m2 = new Member();
		m2.setAddr("산골짜기2");
		m2.setName("홍길동2");
		list.add(m2);
		System.out.println("============");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println(m.getName());
			System.out.println(m.getAddr());
			//System.out.println(list.get(i).getName());
			//System.out.println(list.get(i).getAddr());
			System.out.println("-------");
		}
		ArrayList<String> str = new ArrayList<>();
		str.add("aaa");
		str.add("bbb");
		for(String s : str) { //for이치문
			System.out.println(s);
		}
		
		for(Member mm : list) {
			System.out.println(mm.getName());
			System.out.println(mm.getAddr());
		}
	}
}
