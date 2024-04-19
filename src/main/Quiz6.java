package main;

//아래그림은펜과볼펜,만년필클래스의상속관계를표현한것입니다.
//다음과같이클래스를만들고, 볼펜과만년필인스턴스를생성하세요."
// 펜클래스 : 펜의 굵기. 남은 양
// 볼펜클래스 : 볼펜의 색
// 만년필 클래스 : 브랜드
// 봂펜 :
// 펜의 굵기 : 2 
// 남은 양 : 100%
// 볼펜의 색 : 파랑색
// 만년필 :
// 펜의 굵기 : 3
// 남은 양 : 80%
// 브랜드 : 몽블랑



class Pen {
    int thickness;
    int nameunInk;

    public Pen(int thickness, int nameunInk) {
        this.thickness = thickness;
        this.nameunInk = nameunInk;
    }
}

class BallPen extends Pen {
    String color;

    public BallPen(int thickness, int nameunInk, String color) {
        super(thickness, nameunInk);
        this.color = color;
    }
}

class FountainPen extends Pen {
    String brand;

    public FountainPen(int thickness, int nameunInk, String brand) {
        super(thickness, nameunInk);
        this.brand = brand;
    }
}

public class Quiz6 {
    public static void main(String[] args) {
    	BallPen ballPen = new BallPen(2, 100, "파랑색");
        FountainPen fountainPen = new FountainPen(3, 80, "몽블랑");

        System.out.println("볼펜:");
        System.out.println("펜의 굵기: " + ballPen.thickness);
        System.out.println("남은 양: " + ballPen.nameunInk + "%");
        System.out.println("볼펜의 색: " + ballPen.color);

        System.out.println("\n만년필:");
        System.out.println("펜의 굵기: " + fountainPen.thickness);
        System.out.println("남은 양: " + fountainPen.nameunInk + "%");
        System.out.println("브랜드: " + fountainPen.brand);
    }
}