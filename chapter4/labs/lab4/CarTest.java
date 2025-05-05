package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Car, Engine, Driver 클래스 간의 관계를 테스트하는 메인 클래스
 */
public class CarTest {
    public static void main(String[] args) {
        System.out.println("객체 간 관계 테스트를 시작합니다.");
        
        // TODO: Car 객체를 생성하세요. (내부적으로 Engine 객체 포함)
        // 예: new Car("Sonata", "Black", "Gasoline", 180)
        Car newCar = new Car("Sonata","White", 220, "Gasoline");

        // TODO: Driver 객체를 생성하세요.
        // 예: new Driver("John", 5)
        Driver newDriver = new Driver("John",10);

        // TODO: Car 객체의 정보를 출력하세요.
        System.out.println(newCar);
        
        
        // TODO: Car 객체의 메소드를 호출하세요. (시동, 가속 등)
        newCar.startAcar();
        newCar.speedUp();
        newCar.stopAcar();
        
        // TODO: Driver 객체가 Car 객체를 사용하도록 메소드를 호출하세요.
        newDriver.maintain(newCar);
        
        
        // TODO: 추가적인 Car 객체를 생성하고 Driver 객체가 다른 차를 운전하도록 하세요.
        // 예: new Car("Tesla", "White", "Electric", 330)
        Car newCar2 = new Car("Tesla", "White", 330, "Electric");
        System.out.println("새로운 자동차의 사양은 " +newCar2);
        System.out.println("운전자가 새로운 자동차를 등록하여 운전합니다");
        newDriver.drive(newCar2);
    }
} 