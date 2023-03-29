/*
현업 개발
한개의 클래스로 설계 경우 (x)

설계도 1장 모든 업무를 구현 현실적으로 불가능
설계도를 여러개로 나눈다 .. 문제 발생 (기준, 논리)

쇼핑몰 
결제관리, 배송관리, 재고관리, 회원관리, 상품관리, 판매처 관리, 카드 관리 ... >> 각각의 업무별로 설계도

******* 기준 *******
여러개의 설계도가 있을 때 관계 ... 만들어주는 기준 

1. 상속 : is ~ a :은(는) ~ 이다 >> 상속의 관계 (부모를 뒤에) 
2. 포함 : has ~ a : 은(는) ~ 가지고 있다  >> 

원은 도형이다
경찰은 권총이다 (x)
경찰은 권총을 가지고 있다 

원은 도형이다
원 extends 도형 
삼각형은 도형이다 
삼각형 extends 도형 


원   ,   점  관계
원은 점이다 (x)

원은 점을 가지고 있다 (0)
has ~ a (부품정보) 
>> class 원 { 점이라는 부품이 member field 구현 점 원의 점; }
>> class 점 { x, y } 

경찰 권총
경찰은 권총이다 (x)
경찰은 권총을 가지고 있다(0)
class 권총 {}
class 경찰 { 권총 member field }

원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형 분모 (공통적) 자원 : 추상화, 일반화 >> 그리다, 색상
원은 구체화, 특수화(자신만이 가지는 특징) ex) 야구 선수(공 던지기) 수영 선수(수영) >> 반지름 , 한점 


점 : 좌표값 (X,Y)
원은 점을 가지고 있다 
삼각형은 점을 가지고 있다
사각형은 점을 가지고 있다

----------------------------
class Shape {그리다, 색상} >> 상속관계 부모 >> 원, 삼각형, 사각형
class Point {좌표값} >> 포함관계 >> (부품)

구체화, 특수화 : Circle, Triangle

 */
class Shape {
	String color="gold";
	
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(1,1);
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape { // 상속 
	int radius; // 구체화, 특수
	Point point; // 포함 > 부품 
	
	Circle() {
//		this.radius =10;
//		this.point = new Point(10, 15);
		this(10, new Point(10,15));
	}
	
	Circle(int r, Point point) { // point는 Point 객체의 주소값을 받는다 
		this.radius =r;
		this.point = point; // 주소가 넘어가게 된다 
	}
}


//문제)
/*
원을 만드세요 (원의 정의 : 원은 한점과 반지름을 가지고 있다)
1. 원은 도형이다 (is ~ a) : Shape
2. 원은 점을 가지고 있다 (has ~ a) : Point
3. 원은 특수화되고 구체화된 내용은 : 반지름 

원의 반지름은 초기값 10을 가진다 
점의 좌표는 초기값 (10,15) 가진다
초기값을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다.

 */

//문제2)
/*
삼각형 클래스를 만드세요
삼각형은 3개의 점과 색상과 그리고 그리다 기능을 가지고 있다 
hint) (x,y), (x,y) (x,y)
defalut) 삼각형 만들 수 있음 
 */

class Triangle extends Shape {
	Point[] point;
	
	Triangle() {
		this("red", new Point[] { new Point(10, 10), new Point(20, 20), new Point(30, 30) });
	}
	
	Triangle(String color, Point[] point) {
		this.color = color;
		this.point = point;
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.radius);
		System.out.println(circle.color);
		System.out.println(circle.point.x); // 주소값.주소값.주소값.field 
		System.out.println(circle.point.y); // 주소값.주소값.주소값.field 
		circle.draw();
		
		// 반지름, 점의 값을 자유롭게
		// 둘다 맞음 
//		Point point = new Point(10,20); 
//		Circle circle2 = new Circle(100, point);
		
		Circle circle2 = new Circle(100, new Point(10,20)); // 이런 식의 코드가 많다...
		Triangle triangle = new Triangle("blue", new Point[] { new Point(10, 10), new Point(20, 20), new Point(30, 30) });
		System.out.println(triangle.color);
		System.out.println(triangle.point[0].x);
	}
}
