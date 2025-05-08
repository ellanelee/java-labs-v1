package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 * 
 * Circle 클래스를 정의하세요.
 * 이 클래스는 Shape 클래스를 상속받아야 합니다.
 */
public class Circle extends Shape {
    // TODO: 원의 속성 정의 (예: 반지름)
    public int radius;
    
    // TODO: 생성자 정의
    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(String color, String name, int radius){
       super(color, name);
        this.radius = radius;
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 원의 면적을 계산하는 메소드 구현
    @Override
    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
    }
    // TODO: 부모 클래스의 메소드를 오버라이딩하여 원 정보를 출력하는 메소드 구현
    @Override
    public void getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
    }

    public void displayInfo(){
        System.out.println("Color는 "+color+", Name은 "+name+", Radius: "+radius);
    }
} 