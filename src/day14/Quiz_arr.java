package day14;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name, grade;
	private int stuNum, kor, eng, math;
	private double ave;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getGrade() { return grade; }
	public void setGrade(String grade) { this.grade = grade; }
	
	public int getStuNum() { return stuNum; }
	public void setStuNum(int stuNum) { this.stuNum = stuNum; }
	
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	
	public double getAve() { return ave; }
	public void setAve(double ave) { this.ave = ave; }
	
}
public class Quiz_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		String name, grade;
		int num, stuNum, kor, eng, math;
		int index = 0;
		double ave = 0;
		while(true) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 검색");
			System.out.println("3. 모든 학생 보기");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.println("=== 학생등록 ===");
				System.out.print("학번 : ");
				stuNum = sc.nextInt();
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("국어 점수 : ");
				kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				eng = sc.nextInt();
				System.out.print("수학 점수 : ");
				math = sc.nextInt();
				
				Student stu = new Student();
				stu.setStuNum(stuNum);
				stu.setName(name);
				stu.setKor(kor);
				stu.setEng(eng);
				stu.setMath(math);
				ave = (kor+eng+math) / 3.0;
				stu.setAve(ave);
				list.add(stu);
				if(ave>=90) { grade = "A"; }
				else if(ave>=80) { grade = "B"; }
				else if(ave>=70) { grade = "C"; }
				else { grade = "D"; }
				stu.setGrade(grade);
				
				System.out.println(">>> 등록완료 >>>");
				break;
			case 2 : 
				System.out.println("=== 학생검색 ===");
				System.out.print("이름 : ");
				name = sc.next();
				Student stu1 = new Student();
				if(list.contains(stu1)) {
					index = list.indexOf(stu1.getName().equals(name));
					System.out.println("=== 학생정보 ===");
					System.out.println("학번 : " + list.get(index).getStuNum());
					System.out.println("이름 : " + list.get(index).getName());
					System.out.println("국어점수 : " + list.get(index).getKor());
					System.out.println("영어점수 : " + list.get(index).getEng());
					System.out.println("수학점수 : " + list.get(index).getMath());
					System.out.println("평균 : " + list.get(index).getAve());
					System.out.println("등급 : " + list.get(index).getGrade());
				} else { System.out.println("찾는 학생이 없습니다"); }
				break;
			case 3 : 
				for(int i=0; i<list.size(); i++) {
					Student ss = list.get(i);
					System.out.println((i+1) + "번째 학생 ===");
					System.out.println("학번 : " + ss.getStuNum());
					System.out.println("이름 : " + ss.getName());
					System.out.println("국어점수 : " + ss.getKor());
					System.out.println("영어점수 : " + ss.getEng());
					System.out.println("수학점수 : " + ss.getMath());
					System.out.println("평균 : " + ss.getAve());
					System.out.println("등급 : " + ss.getGrade());
				}
				break;
			case 4 : 
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}
		
	}
}
