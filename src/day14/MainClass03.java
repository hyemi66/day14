package day14;

import java.util.ArrayList;
import java.util.Scanner;

class Member03 {
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
public class MainClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member03> list = new ArrayList<>();
		String name;
		int num;
		while(true) {
			System.out.println("1. 등록");
			System.out.println("2. 모든내용출력");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.println("이름입력");
				name = sc.next();
				
				Member03 m = new Member03();
				m.setName(name);
				
				list.add(m);
				System.out.println("저장완료");
				break;
			case 2 : 
				for(Member03 mm : list) {
					System.out.println(mm.getName());
					System.out.println("----");
				}
				break;
			}
		}
	}
}
