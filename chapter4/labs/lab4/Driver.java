package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Driver 클래스 정의하기 (Car를 사용하는 관계)
 */
public class Driver {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (이름, 운전 경력 등)
    private final String name;
    private final int yearsOfDriving;
    
    // TODO: 생성자를 정의하세요.
    Driver(String name, int yearsOfDriving){
        this.name = name;
        this.yearsOfDriving = yearsOfDriving;
    }
    
    
    // TODO: 자동차를 운전하는 메소드를 정의하세요.
    // (Car 객체를 매개변수로 받아 사용 관계 구현)
    public void drive(Car aCar){
           aCar.startAcar();
           aCar.speedUp();
           aCar.speedDown();
           aCar.stopAcar();
           System.out.println();
    }
    
    
    // TODO: 자동차를 점검하는 메소드를 정의하세요.
    // (Car 객체를 매개변수로 받아 사용 관계 구현)
    public void maintain(Car aCar){
       aCar.engine.checkEngineStatus();

    }

    
    
    // TODO: 운전자의 정보를 출력하는 메소드를 정의하세요.
    public void getName() {
        System.out.println("운전자 이름은 "+name+"운전자는 "+yearsOfDriving+" 년의 운전경력이 있습니다");
    }
    
} 