package main;
import java.util.ArrayList;

// 아래그림은동물추상클래스와사람, 호랑이클래스의상속관계를표현한것입니다.
// 상속관계와결과를참고하여클래스를정의하세요.
// Animal형으로 리스트를 생성하고 사람객체와호랑이객체를저장하세요.
// 그리고리스트에저장된사람과호랑이를꺼내서모든기능을호출하세요
// 테스트 코드
//ArrayList<Animal> list = new ArrayList<>();
//list.add(new Human());
//list.add(new Tiger());
//생략
// 결과 :
// 밤에는 잠을 잡니다.
// 사람이 두 발로 걷습니다.
// 사람이 책을 읽습니다

// 밤에는 잠을 잡니다.
// 호랑이가 네 발로 뜁니다.
// 호랑이가 사냥을 합니다.

	abstract class Animal {
	 abstract void sleep();
	}
	
	class Human extends Animal {
	 @Override
	 void sleep() {
	     System.out.println("밤에는 잠을 잡니다.");
	 }
	 
	 void walk() {
	     System.out.println("사람이 두 발로 걷습니다.");
	 }
	 
	 void readBook() {
	     System.out.println("사람이 책을 읽습니다.");
	 }
	}
	
	class Tiger extends Animal {
	 @Override
	 void sleep() {
	     System.out.println("밤에는 잠을 잡니다.");
	 }
	 
	 void run() {
	     System.out.println("호랑이가 네 발로 뜁니다.");
	 }
	 
	 void hunt() {
	     System.out.println("호랑이가 사냥을 합니다.");
	 }
	}
	

	
	public class Quiz7 {
	 public static void main(String[] args) {
	     ArrayList<Animal> list = new ArrayList<>();
	     list.add(new Human());
	     list.add(new Tiger());
	     
	     for (Animal animal : list) {
	         animal.sleep();
	         if (animal instanceof Human) {
	             ((Human) animal).walk();
	             ((Human) animal).readBook();
	         } else if (animal instanceof Tiger) {
	             ((Tiger) animal).run();
	             ((Tiger) animal).hunt();
	         }
	         System.out.println();
	     }
	 }
	}