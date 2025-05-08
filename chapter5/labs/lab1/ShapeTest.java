package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 * 
 * 여러 도형 객체를 생성하고, 각 도형의 면적을 계산하고 출력하는 테스트 클래스입니다.
 */
public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Lab 1: 상속과 메소드 오버라이딩 실습");

        // TODO: Rectangle 객체 생성
        Rectangle firstRectangle = new Rectangle (3,4);
        Rectangle secondRectangle = new Rectangle ("red", "redReactanble", 5, 6);
        
        // TODO: Circle 객체 생성
        Circle firstCircle = new Circle(5);
        Circle secondCircle = new Circle("magenta", "magentaCircle", 4);

        // TODO: 각 도형의 정보 출력 및 면적 계산
       Shape[] shapes = new Shape[4];
       shapes[0] = firstRectangle;
       shapes[1] = secondRectangle;
       shapes[2] = firstCircle;
       shapes[3] = secondCircle;

       double totalArea = 0;
       for (Shape shape : shapes) {
           double area = shape.getArea();
           shape.displayInfo();
           System.out.println(shape.name+"의 면적은: "+area);
           totalArea += area;
           System.out.println(totalArea);
       }
       System.out.println("전체 도형의 면적은 "+totalArea+" 입니다.");

        // TODO: 배열을 사용하여 여러 Shape 객체 관리하기
        
        
        // TODO: 모든 도형의 면적 합계 계산하기
        
    }
} 