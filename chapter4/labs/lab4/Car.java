package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Car 클래스 정의하기 (Engine을 포함하는 관계)
 */
public class Car {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (모델명, 색상, 속도, Engine 타입의 필드 등)
    public String model ;
    public String color;
    public int speed = 80;
    public Engine engine ;
    public String engineType;
    
    // TODO: 생성자를 정의하세요.
    // (Engine 객체를 생성하여 포함관계 구현)
    Car(String model, String color, int speed, String engineType){
        this. model = model;
        this. color = color;
        this. speed = speed;
        this. engine = new Engine(engineType);
    }
    
    
    // TODO: 자동차를 시동하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 메소드 호출)
    public void startAcar(){
        System.out.println("자동차 운전을 시작합니다");
       this.engine.startEngine();
    }
    
    
    // TODO: 자동차를 정지하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 메소드 호출)
    public void stopAcar(){
        this.engine.stopEngine();
        System.out.println("자동차 운전을 종료합니다");
        System.out.println();
    }
    
    // TODO: 자동차의 속도를 증가시키는 메소드를 정의하세요.
    public int speedUp(){
        System.out.println("속도를 높입니다");
        speed += 10;
        return speed;
    }
    
    
    // TODO: 자동차의 속도를 감소시키는 메소드를 정의하세요.
    public int speedDown(){
        System.out.println("속도를 줄입니다");
        speed -= 10;
        return speed;
    }


    // TODO: 자동차의 정보를 출력하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 정보도 출력)
    @Override
    public String toString(){
        System.out.println("자동차의 정보를 출력합니다");
        StringBuilder sb = new StringBuilder();
       sb.append("모델명은 ").append(model).append(", 색상은 ").append(color).
              append(" ,최고속력은 ").append(speed).append("입니다.");
       return sb.toString();
    }
    
    
    // TODO: 필요한 getter/setter 메소드를 정의하세요.


} 