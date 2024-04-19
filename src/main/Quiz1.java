package main;

// 수학, 영어, 국어 과목의 점수가 각각90점, 70점, 100점 입니다.
// 모든과목의총점과평균을구하세요
// 결과 :
// 총점 : 260
// 평균 : 86.66666666666667

public class Quiz1 {
	
	public static void main(String[] args) {
        int mathScore = 90;
        int englishScore = 70;
        int koreanScore = 100;


        int totalScore = mathScore + englishScore + koreanScore;


        double averageScore = (double) totalScore / 3;

        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + averageScore);
    }

	
	
}
	




