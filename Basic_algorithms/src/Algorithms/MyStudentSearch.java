/**/

package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

class StudentSearch{
	String name; //이름 
	String no;//학번 
	
	public StudentSearch(String name, String no) {
		this.name = name;
		this.no=no;
	}
	
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setNo(String no) {
		this.no=no;
	}
}


public class MyStudentSearch {
	public static void StudentSearch() {
		ArrayList <StudentSearch> list = new ArrayList<StudentSearch>();
		list.add(new StudentSearch("뽀로로", "3097"));
		list.add(new StudentSearch("루피", "3098"));
		list.add(new StudentSearch("크롱", "3099"));
		
		for(StudentSearch stu : list) {
		System.out.println(stu.getName());
		System.out.println(stu.no);
	}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("계속 검색하시겠습니까 ?(y or Y)");
			String choice = sc.nextLine();
			if(choice.equals("y") || choice.equals("Y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.nextLine();
				
				boolean found = false;
				for(StudentSearch stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 :" +stu.no);
						found = true; break;
					}
				}
				if(!found) {
					System.out.println("해당하는 학생이 없습니다.");
				}
				
			}else if(choice.equals("n") || choice.equals("N")){
				break;
			}else {
				System.out.println("다시 입력 해주세요.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}
	public static void main(String[] args) {
		StudentSearch();
	}
}
