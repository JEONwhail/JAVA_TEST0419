package main;

// 다음과같이함수를만드세요.
// 정수형배열을입력받아합계를구하고반환하세요.
// 단, 배열의 크기가3보다작으면, -999을 반환하고 함수를 종료하세요.
// 메인함수에서5개크기의정수형배열을생성하세요.
// 값의목록을다음과같이초기화하세요{2, 4, 6, 8, 10}
// 배열을전달하여함수를호출하고결과를출력하세요.
// 그리고2개크기의정수형배열을생성하세요.
// 값의목록을다음과같이초기화하세요{2, 4}
// 배열을전달하여함수를호출하고결과를출력하세요.

// 결과 : 
// 첫번째 배열의 합계 : 30
// 두번째 배열의 합계 : -999

public class Quiz4 {
	public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int sum1 = calculateSum(array1);
        System.out.println("첫번째 배열의 합계: " + sum1);
        
        int[] array2 = {2, 4};
        int sum2 = calculateSum(array2);
        System.out.println("두번째 배열의 합계: " + sum2);
    }
    
    public static int calculateSum(int[] array) {
        if (array.length < 3) {
            return -999;
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}


