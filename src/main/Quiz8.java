package main;

// 아래그림은계산기인터페이스와구현클래스의상속관계를표현한것입니다.
// 상속관계와결과를참고하여인터페이스와클래스를만드세요.
// 곱하기함수에서곱하는수가0 또는음수라면,에러코드를반환하고
// 나누기함수에서첫번째숫자가두번째숫자보다더작다면,에러코드를반환하세요"
// 테스트 코드
//Calc calc = new Calculator();
//System.out.println(calc.add(10, 5));
//System.out.println(calc.substract(10, 5));
//System.out.println(calc.times(10, 5));
//System.out.println(calc.divide(10, 5));
//System.out.println(calc.times(10, 0));
//System.out.println(calc.divide(10, 20))

// 결과 :
//15
//5
//50
//2

//-9999
//-9999

interface Calc {
 int add(int x, int y);
 int subtract(int x, int y);
 int times(int x, int y);
 int divide(int x, int y);
}

class Calculator implements Calc {
 @Override
 public int add(int x, int y) {
     return x + y;
 }

 @Override
 public int subtract(int x, int y) {
     return x - y;
 }

 @Override
 public int times(int x, int y) {
     if (x <= 0 || y <= 0) {
         return -9999; 
     }
     return x * y;
 }

 @Override
 public int divide(int x, int y) {
     if (x < y) {
         return -9999;
     }
     return x / y;
 }
}

public class Quiz8 {
 public static void main(String[] args) {
     Calc calc = new Calculator();
     System.out.println(calc.add(10, 5));
     System.out.println(calc.subtract(10, 5));
     System.out.println(calc.times(10, 5));
     System.out.println(calc.divide(10, 5));
     
     System.out.println(calc.times(10, 0));
     System.out.println(calc.divide(10, 20));
 }
}