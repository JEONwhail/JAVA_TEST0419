package main;

//월에따라계절을출력하는프로그램을구현하세요.
//3~5월 "현재 계절을봄입니다."
//6~8월 "현재 계절은여름입니다."
//9~11월 "현재 계절은 가을입니다."
//12월~2월 "현재 계절은 겨울입니다."
//이외는“잘못된값입니다. "

public class Quiz2 {
	public static void main(String[] args) {
        int month = 15; 

        String season;
        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 값";
        }
        System.out.println("현재 계절은 " + season + "입니다.");
    }


}