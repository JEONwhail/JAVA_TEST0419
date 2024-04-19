package main;

//1부터 100까지 더하다가 합이 300이 넘어가면중단하세요.
//마지막으로더한수와합을출력하세요
//결과 
//i : 24, sum: 300

public class Quiz3 {
	public static void main(String[] args) {
	    int sum = 0;
	    int lastNumber = 0;
	    
	    for (int i = 1; i <= 100; i++) {
	        sum += i;
	        lastNumber = i;
	        if (sum >= 300) {
	            break; 
	        }
	    }
	    
	    System.out.println("i: " + lastNumber + ", sum: " + sum);
	}
}
