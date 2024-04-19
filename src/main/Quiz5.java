package main;
import java.util.ArrayList;


// 다음과같이학생클래스(Student)를 만드세요.
// 속성: 학번, 이름
// 모든멤버변수를초기화하는생성자
// 학생의정보를반환하는메소드
// Student형 리스트를 생성하고 학생 3명을 추가하세요
// 그리고리스트에저장된모든학생정보를출력하세요
// 결과 :
//Student [studentID = 1001, studentName=둘리]
//Student [studentID = 1002, studentName=또치]
//Student [studentID = 1003, studentName=도우너]


	class Student {
	 int studentID;
	 String studentName;
	
	 public Student(int studentID, String studentName) {
	     this.studentID = studentID;
	     this.studentName = studentName;
	 }
	
	
	 public String getStudentInfo() {
	     return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	 }
	}
	
	
	public class Quiz5 {
	 public static void main(String[] args) {
	     ArrayList<Student> studentList = new ArrayList<>();
	
	     studentList.add(new Student(1001, "둘리"));
	     studentList.add(new Student(1002, "또치"));
	     studentList.add(new Student(1003, "도우너"));
	
	     for (Student student : studentList) {
	         System.out.println(student.getStudentInfo());
	     }
	 }
	}